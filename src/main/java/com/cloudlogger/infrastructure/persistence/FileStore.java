package com.cloudlogger.infrastructure.persistence;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cloudlogger.domain.Entry;
import com.cloudlogger.infrastructure.config.Config;
import com.cloudlogger.repository.Store;

/**
 * Sample File Store implementation
 *
 * @author Leon Misakyan
 */
@Repository
public class FileStore implements Store {
	private static final List<String> suitableApplications = getSuitableApplications();

	private static List<String> getSuitableApplications() {
		try {
			return Arrays.asList(Config.getProperty("store.file.source").split(
					","));
		} catch (IOException e) {
			return Collections.emptyList();
		}
	}

	@Override
	public void write(Entry entry) throws IOException {
		File log = new File(Config.getProperty("store.file.root")
				+ File.separator + entry.getSource() + File.separator
				+ entry.getCategory() + File.separator
				+ entry.getSeverityLevel() + File.separator + "log.log");
		if (!log.exists()) {
			log.getParentFile().mkdirs();
			log.createNewFile();
		}
		FileOutputStream outFile = new FileOutputStream(log, true);
		try {
			outFile.write(entry.toString().getBytes());
		} finally {
			if (outFile != null)
				outFile.close();
		}
	}

	@Override
	public boolean isSuitableFor(Entry entry) {
		return suitableApplications.contains(entry.getSource());
	}
}
