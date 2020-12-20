package romanNumerals;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class RomanNumeralConverterTest {

	RomanNumeralConverter converter;

	@BeforeEach
	public void setup() {
		this.converter = new RomanNumeralConverter();
	}

	@Nested
	class Can_convert_numbers_between_1_and_3999 {

		@Nested
		class One_is_expressed_as_I {
			@Test
			public void test_1_is_converted_to_I() {
				assertThat(converter.convert(1)).isEqualTo("I");
			}

			@Test
			public void test_2_is_converted_to_II() {
				assertThat(converter.convert(2)).isEqualTo("II");
			}

			@Test
			public void test_3_is_converted_to_III() {
				assertThat(converter.convert(3)).isEqualTo("III");
			}
		}

		@Nested
		class Five_is_expressed_as_V {
			@Test
			public void test_4_is_converted_to_IV() {
				assertThat(converter.convert(4)).isEqualTo("IV");
			}

			@Test
			public void test_5_is_converted_to_V() {
				assertThat(converter.convert(5)).isEqualTo("V");
			}

			@Test
			public void test_6_is_converted_to_VI() {
				assertThat(converter.convert(6)).isEqualTo("VI");
			}
		}

		@Nested
		class Ten_is_expressed_as_X {
			@Test
			public void test_9_is_converted_to_IX() {
				assertThat(converter.convert(9)).isEqualTo("IX");
			}

			@Test
			public void test_10_is_converted_to_X() {
				assertThat(converter.convert(10)).isEqualTo("X");
			}

			@Test
			public void test_11_is_converted_to_XI() {
				assertThat(converter.convert(11)).isEqualTo("XI");
			}
		}

		@Nested
		class Fifty_is_expressed_as_L {
			@Test
			public void test_40_is_converted_to_XL() {
				assertThat(converter.convert(40)).isEqualTo("XL");
			}

			@Test
			public void test_50_is_converted_to_L() {
				assertThat(converter.convert(50)).isEqualTo("L");
			}
		}

		@Nested
		class Hundered_is_expressed_as_L {
			@Test
			public void test_90_is_converted_to_XC() {
				assertThat(converter.convert(90)).isEqualTo("XC");
			}

			@Test
			public void test_100_is_converted_to_C() {
				assertThat(converter.convert(100)).isEqualTo("C");
			}
		}

		@Nested
		class FiveHundered_is_expressed_as_D {
			@Test
			public void test_400_is_converted_to_CD() {
				assertThat(converter.convert(400)).isEqualTo("CD");
			}

			@Test
			public void test_500_is_converted_to_D() {
				assertThat(converter.convert(500)).isEqualTo("D");
			}
		}

		@Nested
		class Thousand_is_expressed_as_M {
			@Test
			public void test_900_is_converted_to_CM() {
				assertThat(converter.convert(900)).isEqualTo("CM");
			}

			@Test
			public void test_1000_is_converted_to_M() {
				assertThat(converter.convert(1000)).isEqualTo("M");
			}

			@Test
			public void test_3999_is_converted_to_MMMCMXCIX() {
				assertThat(converter.convert(3999)).isEqualTo("MMMCMXCIX");
			}
		}

	}

	@Nested
	class Cannot_convert_numbers_outside_1_and_3999 {
		@Test
		public void test_0_cannot_be_converted() {
			assertThrows(IllegalArgumentException.class, () -> converter.convert(0));
		}

		@Test
		public void test_4000_cannot_be_converted() {
			assertThrows(IllegalArgumentException.class, () -> converter.convert(4000));
		}
	}

}
