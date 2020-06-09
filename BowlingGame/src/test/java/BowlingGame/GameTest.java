package BowlingGame;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.stream.IntStream;

import org.junit.Test;

public class GameTest {

	@Test
	public void testGutterGame() {
		Game game = new Game();
		IntStream.rangeClosed(1, 20).forEach(i -> game.roll(0));
		int actual = game.score();
		int expected = 0;
		assertThat(actual, is(expected));
	}
}
