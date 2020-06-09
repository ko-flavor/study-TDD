package bowlingGame;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.stream.IntStream;

import org.junit.Before;
import org.junit.Test;

import bowlingGame.Game;

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

	@Test
	public void testOneSpare() {
		rollSpare();
		game.roll(3);
		rollMany(17, 0);
		assertThat(game.score(), is(16));
	}

	@Test
	public void testOneStrike() {
		rollStrike();
		game.roll(3);
		game.roll(4);
		rollMany(17, 0);
		assertThat(game.score(), is(24));
	}

	@Test
	public void testPerfectGame() {
		rollMany(12, 10);
		assertThat(game.score(), is(300));
	}

	private void rollStrike() {
		game.roll(10);
	}

	private void rollSpare() {
		game.roll(5);
		game.roll(5);
	}
}
