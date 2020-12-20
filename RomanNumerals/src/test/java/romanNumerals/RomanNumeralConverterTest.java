package romanNumerals;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class RomanNumeralConverterTest {

	RomanNumeralConverter converter = new RomanNumeralConverter();

	@Test
	public void test_one_is_converted_to_I() {
		String result = this.converter.convert(1);
		assertThat(result).isEqualTo("I");
	}

	@Test
	public void test_two_is_converted_to_II() {
		String result = this.converter.convert(2);
		assertThat(result).isEqualTo("II");
	}

}
