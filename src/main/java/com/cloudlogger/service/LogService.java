package com.cloudlogger.service;

import java.io.IOException;
import java.util.List;

import com.cloudlogger.domain.Entry;

/**
 * Canonical interface for logging service
 * 
 * @author misakyanls
 */
public interface LogService {
	/**
	 * Insert log entry to some place.
	 * 
	 * @param entry
	 *            Log entry to insert
	 * @throws IOException 
	 */
	void log(Entry entry) throws IOException;

	/**
	 * Insert list of log entries to some place.
	 * 
	 * @param entries
	 *            {@code List<Entry>} of log entries to insert
	 * @throws IOException 
	 */
	void log(List<Entry> entries) throws IOException;
}
