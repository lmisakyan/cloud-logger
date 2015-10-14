package com.cloudlogger.repository;

import java.io.IOException;

import com.cloudlogger.domain.Entry;

/**
 * Some storage for Log Entries
 * 
 * @author misakyanls
 */
public interface Store {
	/**
	 * Persists list of log entries to some storage.
	 * 
	 * @param entry
	 *            {@code List<Entry>} of log entries to save
	 * @throws IOException 
	 */
	void write(Entry entry) throws IOException;
	
	boolean isSuitableFor(Entry entry);

}
