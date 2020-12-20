package romanNumerals;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class RomanNumeralConverterTest {

	@Test
	public void test_one_is_converted_to_I() {
		RomanNumeralConverter converter = new RomanNumeralConverter();
		String result = converter.convert(1);
		assertThat(result).isEqualTo("I");
	}
}
