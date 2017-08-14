import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RockPaperScissorTest {
	RockPaperScissorGame rockPaperScissor;

	@Before
	public void setUp() {
		rockPaperScissor = new RockPaperScissorGame();
	}

	@Test
	public void whenRockBeatsScissor() {
		assertEquals(true, rockPaperScissor.rockBeatsScissor());
	}
}