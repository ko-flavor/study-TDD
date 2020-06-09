package BowlingGame;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.stream.IntStream;

import org.junit.Before;
import org.junit.Test;

public class GameTest {

	private Game game;

	@Before
	public void setUp() {
		this.game = new Game();
	}

	private void rollMany(int n, int pins) {
		IntStream.rangeClosed(1, n).forEach(i -> game.roll(pins));
	}

	@Test
	public void testGutterGame() {
		rollMany(20, 0);
		assertThat(game.score(), is(0));
	}

	@Test
	public void testAllOnes() {
		rollMany(20, 1);
		assertThat(game.score(), is(20));
	}
}
