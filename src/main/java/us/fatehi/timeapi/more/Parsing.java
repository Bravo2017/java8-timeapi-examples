/**
 * Copyright 2014 Sualeh Fatehi
 * This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License. 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en_US.
 */
package us.fatehi.timeapi.more;

import org.threeten.bp.LocalDate;
import org.threeten.bp.format.DateTimeFormatter;
import org.threeten.bp.format.FormatStyle;
import org.threeten.bp.temporal.TemporalAccessor;

public class Parsing {

	public static void main(String[] args) {
		DateTimeFormatter dateFormatter = DateTimeFormatter
				.ofLocalizedDate(FormatStyle.MEDIUM);
		TemporalAccessor parse = dateFormatter.parse("Jan 19, 2014");
		System.out.println(parse);

		System.out.println(LocalDate.from(parse));
	}

}
