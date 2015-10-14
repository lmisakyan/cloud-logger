package com.cloudlogger.infrastructure.persistence;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.cloudlogger.domain.Entry;
import com.cloudlogger.infrastructure.config.Config;
import com.cloudlogger.repository.Store;

/**
 * Sample DB Store implementation
 * 
 * @author misakyanls
 *
 */
@Repository
public class DbStore implements Store {
	private static final Logger logger = LoggerFactory.getLogger(DbStore.class);
	private String suitableApplication;

	@Override
	public void write(Entry entry) {
		logger.debug("Do some DB specific staff:" + entry.geteCommerceActivity().getStartPageId());
	}

	@Override
	public boolean isSuitableFor(Entry entry) {
		if (suitableApplication == null)
			try {
				suitableApplication = Config.getProperty("store.db.source");
			} catch (IOException e) {
				e.printStackTrace();
			}
		return suitableApplication.equals(entry.getSource());
	}
}
