package entrenador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pokemon.Pokemon;

class EntrenamientoFuncional {

	public static void entrenamientoFuncional(Pokemon pokemon) {

		int costoEntrenamiento;
		int aumentoEstadisticas;

		costoEntrenamiento = 40 * pokemon.getNivel();
		pokemon.ataque = pokemon.ataque + 5;
		pokemon.defensa = pokemon.defensa + 5;
		pokemon.vitalidad = pokemon.vitalidad + 5;
	}

	@Test
	void test() {
		Pokemon pokemon = new Pokemon();
		pokemon.setNivel(10);
		pokemon.ataque = 5;
		pokemon.defensa = 5;
		pokemon.vitalidad = 5;

		int costoEsperado = 400;

		// Act
		entrenamientoFuncional(pokemon);

		// Assert

		assertTrue(5 < pokemon.ataque);
		assertTrue(5 < pokemon.defensa);
		assertTrue(5 < pokemon.vitalidad);
	}
}
