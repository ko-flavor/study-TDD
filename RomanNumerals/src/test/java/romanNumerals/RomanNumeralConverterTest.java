package romanNumerals;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class RomanNumeralConverterTest {

	RomanNumeralConverter converter = new RomanNumeralConverter();

	@Test
	public void test_one_is_converted_to_I() {
		assertThat(this.converter.convert(1)).isEqualTo("I");
	}

	@Test
	public void test_two_is_converted_to_II() {
		assertThat(this.converter.convert(2)).isEqualTo("II");
	}

	@Test
	public void test_three_is_converted_to_III() {
		assertThat(this.converter.convert(3)).isEqualTo("III");
	}
}
