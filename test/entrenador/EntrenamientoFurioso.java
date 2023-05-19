package entrenador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pokemon.Pokemon;

class EntrenamientoFurioso {

	public static void entrenamientoFurioso(Pokemon pokemon) {

		int costoEntrenamiento;

		costoEntrenamiento = 30 * pokemon.getNivel();
		pokemon.ataque = pokemon.ataque + 5;
		pokemon.ataqueEspecial = pokemon.ataqueEspecial + 5;
		pokemon.velocidad = pokemon.velocidad + 5;

	}

	@Test
	void test() {
		Pokemon pokemon = new Pokemon();
		pokemon.setNivel(10);
		pokemon.ataque=5;
		pokemon.ataqueEspecial=5;
		pokemon.velocidad=5;
		
		int costoEsperado = 300; 

		// Act
		entrenamientoFurioso(pokemon);

		// Assert
		
		assertTrue(5<pokemon.ataque);
		assertTrue(5<pokemon.ataqueEspecial);
		assertTrue(5<pokemon.velocidad);
	}

}
