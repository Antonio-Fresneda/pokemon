package pokemon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DescansarTest {

	@Test
	void test() {
		// Arrange
		Pokemon p = new Pokemon();
		p.estamina = 100;

		// Act
		descansar(p);

		// Assert
		assertEquals(150, p.estamina);
	}

	private void descansar(Pokemon p) {
		p.estamina = p.estamina + 50;
	}
}
