package entrenador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pokemon.Entrenador;

class EntregarPokedollarTest {

	@Test
	void test() {
		// Arrange
        Entrenador entrenador1 = new Entrenador();
        Entrenador entrenador2 = new Entrenador();
        int pokedollarsInicial = 100;
        int pokedollarsEsperados = (int) Math.floor(pokedollarsInicial / 3.0);

        entrenador1.setPokedollars(pokedollarsInicial);
        entrenador2.setPokedollars(0);

        // Act
        entrenador1.entregarPokedollars(entrenador2);

        // Assert
        assertEquals(pokedollarsEsperados, entrenador2.getPokedollars());
        assertEquals(pokedollarsInicial - pokedollarsEsperados, entrenador1.getPokedollars());
    }

	}


