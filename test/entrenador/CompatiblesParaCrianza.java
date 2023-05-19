package entrenador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pokemon.Pokemon;

class CompatiblesParaCrianza {

	@Test
	void test() {
		// Arrange
        Pokemon pokemon1 = new Pokemon("Pikachu", "Hembra");
        Pokemon pokemon2 = new Pokemon("Pikachu", "Macho");
        Pokemon pokemon3 = new Pokemon("Charmander", "Hembra");
        Pokemon pokemon4 = new Pokemon("Squirtle", "Hembra");
        Pokemon pokemon5 = new Pokemon("Pikachu", "Hembra");
        Pokemon pokemon6 = new Pokemon("Pikachu", "Hembra");

        // Act
        boolean resultado1 = sonCompatiblesParaCrianza(pokemon1, pokemon2);
        boolean resultado2 = sonCompatiblesParaCrianza(pokemon1, pokemon3);
        boolean resultado3 = sonCompatiblesParaCrianza(pokemon1, pokemon4);
        boolean resultado4 = sonCompatiblesParaCrianza(pokemon5, pokemon6);

        // Assert
        System.out.println(resultado1);
       
    }

    private boolean sonCompatiblesParaCrianza(Pokemon madre, Pokemon padre) {
        if (madre.getSexo().equals(padre.getSexo())) {
            return false;
        } else if (!madre.getEspecie().equals(padre.getEspecie())) {
            return false;
        } else {
            return true;
        }
    }

}
