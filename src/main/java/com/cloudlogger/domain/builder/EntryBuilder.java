package com.cloudlogger.domain.builder;

import java.util.Date;

import com.cloudlogger.domain.Entry;
import com.cloudlogger.domain.Entry.SeverityLevel;

/**
 * @author Leon Misakyan Log entry builder.
 */
public class EntryBuilder {
	String category;

	String source;

	SeverityLevel severityLevel;

	Date timestamp;

	String payload;

	private EntryBuilder() {
		super();
	}

	public static EntryBuilder newEntry() {
		return new EntryBuilder();
	}

	public Entry build() {
		Entry entry = new Entry();
		entry.setCategory(category);
		entry.setPayload(payload);
		entry.setSeverityLevel(severityLevel);
		entry.setSource(source);
		entry.setTimestamp(timestamp);
		return entry;
	}

	public EntryBuilder withCategory(String category) {
		this.category = category;
		return this;
	}

	public EntryBuilder withSource(String source) {
		this.source = source;
		return this;
	}

	public EntryBuilder withSeverityLevel(SeverityLevel severityLevel) {
		this.severityLevel = severityLevel;
		return this;
	}

	public EntryBuilder withTimestamp(Date timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	public EntryBuilder withPayload(String payload) {
		this.payload = payload;
		return this;
	}

}
