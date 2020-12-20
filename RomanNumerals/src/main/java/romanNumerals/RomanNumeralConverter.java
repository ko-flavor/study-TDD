package romanNumerals;

import java.util.function.BiConsumer;

public class RomanNumeralConverter {

	StringBuilder builder;
	int number;

	public String convert(int numberToConvert) {
		checkArgument(numberToConvert);
		initVariables(numberToConvert);
		appendRoman.accept(1000, "M");
		appendRoman.accept(900, "CM");
		appendRoman.accept(500, "D");
		appendRoman.accept(400, "CD");
		appendRoman.accept(100, "C");
		appendRoman.accept(90, "XC");
		appendRoman.accept(50, "L");
		appendRoman.accept(40, "XL");
		appendRoman.accept(10, "X");
		appendRoman.accept(9, "IX");
		appendRoman.accept(5, "V");
		appendRoman.accept(4, "IV");
		appendRoman.accept(1, "I");
		return this.builder.toString();
	}

	private void checkArgument(int numberToConvert) {
		if (!(0 < numberToConvert && numberToConvert < 4000)) {
			throw new IllegalArgumentException("Argument must be between 1 and 3999.");
		}
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
