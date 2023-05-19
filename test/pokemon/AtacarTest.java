package pokemon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AtacarTest {

	@Test
	void test() {
		Pokemon pokemon = new Pokemon();
        Pokemon pokemonRival = new Pokemon();
        pokemon.ataque = 10;
        pokemon.potencia = 5;
        pokemon.ventaja = 2;
        pokemonRival.vitalidad = 50;
        int vitalidadfinal=20;

        pokemon.atacarPokemon();

        int expectedVitalidad = pokemonRival.vitalidad - ((pokemon.ataque + pokemon.potencia) * pokemon.ventaja);
        assertEquals(expectedVitalidad, vitalidadfinal);
	}

}
