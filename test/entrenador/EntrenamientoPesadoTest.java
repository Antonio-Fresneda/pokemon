package entrenador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pokemon.Entrenador;
import pokemon.Pokemon;

class EntrenamientoPesadoTest {

	public static void entrenamientoPesado(Pokemon pokemon) {

		int costoEntrenamiento;
		int aumentoEstadisticas;

		costoEntrenamiento = 20 * pokemon.getNivel();
		pokemon.defensa = pokemon.defensa + 5;
		pokemon.defensaEspecial = pokemon.defensaEspecial + 5;
		pokemon.vitalidad = pokemon.vitalidad + 5;

	}

	@Test
	void test() {
		// Arrange
		Pokemon pokemon = new Pokemon();
		pokemon.setNivel(10);
		pokemon.defensa=5;
		pokemon.defensaEspecial=5;
		pokemon.vitalidad=5;
		
		int costoEsperado = 200; 

		// Act
		entrenamientoPesado(pokemon);

		// Assert
		
		assertTrue(5<pokemon.defensa);
		assertTrue(5<pokemon.defensaEspecial);
		assertTrue(5<pokemon.vitalidad);
	}
}
