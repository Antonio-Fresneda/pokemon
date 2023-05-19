package pokemon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class AumentarEstadisticasTest {
	
	public void aumentarEstadisticas(Pokemon p) {

		p.vitalidad = p.vitalidad + (int) Math.floor(Math.random() * (1 - 5) + 5);
		p.ataque = p.ataque + (int) Math.floor(Math.random() * (1 - 5) + 5);
		p.defensa = p.defensa + (int) Math.floor(Math.random() * (1 - 5) + 5);
		p.ataqueEspecial = p.ataqueEspecial + (int) Math.floor(Math.random() * (1 - 5) + 5);
		p.defensaEspecial = p.defensaEspecial + (int) Math.floor(Math.random() * (1 - 5) + 5);
		p.velocidad = p.velocidad + (int) Math.floor(Math.random() * (1 - 5) + 5);
		p.estamina = p.estamina + (int) Math.floor(Math.random() * (1 - 5) + 5);

	}

	@Test
	public void testAumentarEstadisticas() {
		Pokemon p = new Pokemon();

		p.vitalidad = 10;
		p.ataque = 5;
		p.defensa = 5;
		p.ataqueEspecial = 3;
		p.defensaEspecial = 3;
		p.velocidad = 5;
		p.estamina = 20;
		
		//Act
		aumentarEstadisticas(p);

		// Comprobamos que las estadísticas han aumentado correctamente
		
		assertTrue(p.vitalidad > 10);
		assertTrue(p.ataque > 5);
		assertTrue(p.defensa > 5);
		assertTrue(p.ataqueEspecial > 3);
		assertTrue(p.defensaEspecial > 3);
		assertTrue(p.velocidad > 5);
		assertTrue(p.estamina > 20);
	}

}
