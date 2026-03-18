package de.gravitex.banking.enumerated;

public enum RecurringInterval {

	DAILY(0), WEEKLY(0), MONTHLY(20), QUARTERLY(0), HALF_YEARLY(0), YEARLY(0);

	private int shortestIntervalAccepted;

	private RecurringInterval(int aShortestIntervalAccepted) {
		this.shortestIntervalAccepted = aShortestIntervalAccepted;
	}
	
	public int getShortestIntervalAccepted() {
		return shortestIntervalAccepted;
	}
}