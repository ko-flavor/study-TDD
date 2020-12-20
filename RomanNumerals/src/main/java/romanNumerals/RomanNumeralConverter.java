package romanNumerals;

import java.util.stream.IntStream;

public class RomanNumeralConverter {
	public String convert(int number) {
		StringBuilder builder = new StringBuilder();
		if (number >= 5) {
			builder.append("V");
			number = number - 5;
		}
		IntStream.rangeClosed(1, number).forEach(i -> builder.append("I"));
		return builder.toString();
	}
}
