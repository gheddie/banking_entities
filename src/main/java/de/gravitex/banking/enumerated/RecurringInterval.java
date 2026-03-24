package de.gravitex.banking.enumerated;

public enum RecurringInterval {

	MONTHLY(20, 1),
	QUARTERLY(0, 3),
	HALF_YEARLY(0, 6),
	YEARLY(0, 12);

	private int shortestIntervalAccepted;
	private int monthSpan;

	private RecurringInterval(int aShortestIntervalAccepted, int aMonthSpan) {
		this.shortestIntervalAccepted = aShortestIntervalAccepted;
		this.monthSpan = aMonthSpan;
	}

	public int getShortestIntervalAccepted() {
		return shortestIntervalAccepted;
	}

	public int getMonthSpan() {
		return monthSpan;
	}
}