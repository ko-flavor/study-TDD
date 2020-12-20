package romanNumerals;

import java.util.stream.IntStream;

public class RomanNumeralConverter {

	StringBuilder builder;
	int number;

	public String convert(int numberToConvert) {
		initVariables(numberToConvert);
		appendX();
		appendV();
		appendI();
		return this.builder.toString();
	}

	private void initVariables(int numberToConvert) {
		this.builder = new StringBuilder();
		this.number = numberToConvert;
	}

	private void appendX() {
		if (number >= 10) {
			builder.append("X");
			number = number - 10;
		}
	}

	private void appendV() {
		if (number >= 5) {
			builder.append("V");
			number = number - 5;
		}
	}

	private void appendI() {
		IntStream.rangeClosed(1, number).forEach(i -> builder.append("I"));
	}

}
