package com.cloudlogger.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloudlogger.domain.Entry;
import com.cloudlogger.repository.Store;

@Service
public class LogServiceImpl implements LogService {
	@Autowired
	List<Store> stores;

	private Store storeForEntry(Entry entry) {
		for (Store s : stores)
			if (s.isSuitableFor(entry))
				return s;

		throw new UnsupportedOperationException("Unsupported Log entry");
	}

	@Override
	public void log(Entry entry) throws IOException {
		storeForEntry(entry).write(entry);
	}

	@Override
	public void log(List<Entry> entries) throws IOException {
		for (Entry e : entries)
			log(e);
	}
}
