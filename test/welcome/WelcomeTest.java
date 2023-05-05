package welcome;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void EX1_test() {
		assertEquals("Hello, Bob",Welcome.welcome("bob"));
		assertEquals("Hello, Bob",Welcome.welcome("Bob"));
	}
	@Test
	void EX2_test() {
		assertEquals("Hello, my friend",Welcome.welcome(null));
		assertEquals("Hello, my friend",Welcome.welcome(""));
		assertEquals("Hello, my friend",Welcome.welcome(" "));
	}
	@Test
	void EX3_test() {
		assertEquals("HELLO, BOB !",Welcome.welcome("BOB"));
		
	}
	@Test
	void EX4_test() {
		assertEquals("Hello, Amy, Bob",Welcome.welcome("amy,bob"));
		assertEquals("Hello, Amy, Bob",Welcome.welcome("Amy,Bob"));
	}

}
