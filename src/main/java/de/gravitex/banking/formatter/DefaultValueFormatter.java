package de.gravitex.banking.formatter;

import de.gravitex.banking.formatter.base.ValueFormatter;

public class DefaultValueFormatter extends ValueFormatter {

	@Override
	public String format(Object aValue) {
		if (aValue == null) {
			return EMPTY_VALUE;
		}
		return aValue.toString();
	}
}