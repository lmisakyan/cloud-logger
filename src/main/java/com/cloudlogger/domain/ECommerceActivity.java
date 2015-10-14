package com.cloudlogger.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Special attributes for e-commerce site log enries.
 * 
 * @author Leon Misakyan
 */
public class ECommerceActivity {
	String startPageId;
	String sessionId;
	String visitorId;
	String dateId;
	Date stratSessionDateTime;
	long sessionSeconds;
	int pagesVisited;
	int ordersPlaced;
	BigDecimal ordersAmount;

	public String getStartPageId() {
		return startPageId;
	}

	public void setStartPageId(String startPageId) {
		this.startPageId = startPageId;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getVisitorId() {
		return visitorId;
	}

	public void setVisitorId(String visitorId) {
		this.visitorId = visitorId;
	}

	public String getDateId() {
		return dateId;
	}

	public void setDateId(String dateId) {
		this.dateId = dateId;
	}

	public Date getStratSessionDateTime() {
		return stratSessionDateTime;
	}

	public void setStratSessionDateTime(Date stratSessionDateTime) {
		this.stratSessionDateTime = stratSessionDateTime;
	}

	public long getSessionSeconds() {
		return sessionSeconds;
	}

	public void setSessionSeconds(long sessionSeconds) {
		this.sessionSeconds = sessionSeconds;
	}

	public int getPagesVisited() {
		return pagesVisited;
	}

	public void setPagesVisited(int pagesVisited) {
		this.pagesVisited = pagesVisited;
	}

	public int getOrdersPlaced() {
		return ordersPlaced;
	}

	public void setOrdersPlaced(int ordersPlaced) {
		this.ordersPlaced = ordersPlaced;
	}

	public BigDecimal getOrdersAmount() {
		return ordersAmount;
	}

	public void setOrdersAmount(BigDecimal ordersAmount) {
		this.ordersAmount = ordersAmount;
	}

	@Override
	public String toString() {
		return "ECommerceActivity [startPageId=" + startPageId + ", sessionId="
				+ sessionId + ", visitorId=" + visitorId + ", dateId=" + dateId
				+ ", stratSessionDateTime=" + stratSessionDateTime
				+ ", sessionSeconds=" + sessionSeconds + ", pagesVisited="
				+ pagesVisited + ", ordersPlaced=" + ordersPlaced
				+ ", ordersAmount=" + ordersAmount + "]";
	}

}
