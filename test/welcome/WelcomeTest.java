package welcome;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void EX1_test() {
		assertEquals("Hello, Bob",Welcome.welcome("bob"));
		assertEquals("Hello, Bob",Welcome.welcome("Bob"));
	}

}
