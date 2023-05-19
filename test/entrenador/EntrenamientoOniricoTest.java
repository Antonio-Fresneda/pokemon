package entrenador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pokemon.Pokemon;

class EntrenamientoOniricoTest {

	public static void entrenamientoOnirico(Pokemon pokemon) {

		int costoEntrenamiento;
		int aumentoEstadisticas;

		costoEntrenamiento = 40 * pokemon.getNivel();
		pokemon.ataqueEspecial = pokemon.ataqueEspecial + 5;
		pokemon.defensaEspecial = pokemon.defensaEspecial + 5;
		pokemon.velocidad = pokemon.velocidad + 5;

	}

	@Test
	void test() {
		Pokemon pokemon = new Pokemon();
		pokemon.setNivel(10);
		pokemon.ataqueEspecial = 5;
		pokemon.defensaEspecial = 5;
		pokemon.velocidad = 5;

		int costoEsperado = 400;

		// Act
		entrenamientoOnirico(pokemon);

		// Assert

		assertTrue(5 < pokemon.ataqueEspecial);
		assertTrue(5 < pokemon.defensaEspecial);
		assertTrue(5 < pokemon.velocidad);
	}
}
