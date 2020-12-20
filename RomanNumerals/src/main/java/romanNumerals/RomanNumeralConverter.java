package romanNumerals;

import java.util.function.BiConsumer;

public class RomanNumeralConverter {

	StringBuilder builder;
	int number;

	public String convert(int numberToConvert) {
		initVariables(numberToConvert);
		appendRoman.accept(10, "X");
		appendRoman.accept(9, "IX");
		appendRoman.accept(5, "V");
		appendRoman.accept(4, "IV");
		appendRoman.accept(1, "I");
		return this.builder.toString();
	}

	private void initVariables(int numberToConvert) {
		this.builder = new StringBuilder();
		this.number = numberToConvert;
	}

	private BiConsumer<Integer, String> appendRoman = (i, str) -> {
		while (number >= i) {
			builder.append(str);
			number = number - i;
		}
	};

}
