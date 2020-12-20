package romanNumerals;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralConverterTest {

	RomanNumeralConverter converter;

	@BeforeEach
	public void setup() {
		this.converter = new RomanNumeralConverter();
	}

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

	@Test
	public void test_four_is_converted_to_IV() {
		assertThat(this.converter.convert(4)).isEqualTo("IV");
	}

	@Test
	public void test_five_is_converted_to_V() {
		assertThat(this.converter.convert(5)).isEqualTo("V");
	}

	@Test
	public void test_six_is_converted_to_VI() {
		assertThat(this.converter.convert(6)).isEqualTo("VI");
	}

	@Test
	public void test_nine_is_converted_to_IX() {
		assertThat(this.converter.convert(9)).isEqualTo("IX");
	}

	@Test
	public void test_ten_is_converted_to_X() {
		assertThat(this.converter.convert(10)).isEqualTo("X");
	}

	@Test
	public void test_eleven_is_converted_to_XI() {
		assertThat(this.converter.convert(11)).isEqualTo("XI");
	}

	@Test
	public void test_forty_is_converted_to_XL() {
		assertThat(this.converter.convert(40)).isEqualTo("XL");
	}

	@Test
	public void test_fifty_is_converted_to_L() {
		assertThat(this.converter.convert(50)).isEqualTo("L");
	}

	@Test
	public void test_ninty_is_converted_to_XC() {
		assertThat(this.converter.convert(90)).isEqualTo("XC");
	}

	@Test
	public void test_hundred_is_converted_to_C() {
		assertThat(this.converter.convert(100)).isEqualTo("C");
	}

	@Test
	public void test_fourhundred_is_converted_to_CD() {
		assertThat(this.converter.convert(400)).isEqualTo("CD");
	}

	@Test
	public void test_fivehundred_is_converted_to_D() {
		assertThat(this.converter.convert(500)).isEqualTo("D");
	}

	@Test
	public void test_ninehundred_is_converted_to_CM() {
		assertThat(this.converter.convert(900)).isEqualTo("CM");
	}

	@Test
	public void test_thousand_is_converted_to_M() {
		assertThat(this.converter.convert(1000)).isEqualTo("M");
	}

	@Test
	public void test_maxRoman_is_converted_to_MMMCMXCIX() {
		assertThat(this.converter.convert(3999)).isEqualTo("MMMCMXCIX");
	}

}
