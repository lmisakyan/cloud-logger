package com.cloudlogger.domain;

import java.util.Date;

/**
 * Log entry - event record inside a log.
 * 
 * @author Leon Misakyan
 */
public class Entry {
	/**
	 * Severity levels of log entries.
	 */
	public static enum SeverityLevel {
		DEBUG, INFO, NOTICE, WARNING, ERROR, CRITICAL, ALERT, EMERGENCY
	}

	/** Category of this entry. */
	String category;
	/** Application or service, created entry. */
	String source;
	/** Severity level of this entry. */
	SeverityLevel severityLevel;
	/** Systen time when entry was created. */
	Date timestamp;
	/** Event record. */
	String payload;
	/** Some complex record. */
	Object complexPayload;
	/** e-commerce site activity record. */
	ECommerceActivity eCommerceActivity;

	public ECommerceActivity geteCommerceActivity() {
		return eCommerceActivity;
	}

	public void seteCommerceActivity(ECommerceActivity eCommerceActivity) {
		this.eCommerceActivity = eCommerceActivity;
	}

	public Object getComplexPayload() {
		return complexPayload;
	}

	public void setComplexPayload(Object complexPayload) {
		this.complexPayload = complexPayload;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public SeverityLevel getSeverityLevel() {
		return severityLevel;
	}

	public void setSeverityLevel(SeverityLevel severityLevel) {
		this.severityLevel = severityLevel;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	@Override
	public String toString() {
		return "Entry [category=" + category + ", source=" + source
				+ ", severityLevel=" + severityLevel + ", timestamp="
				+ timestamp + ", payload=" + payload + ", complexPayload="
				+ complexPayload + "]";
	}

}
