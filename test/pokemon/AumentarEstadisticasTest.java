package pokemon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class AumentarEstadisticasTest {
	@Test
	public void testAumentarEstadisticas() {
		Pokemon p = new Pokemon();

        int vitalidadInicial = p.vitalidad;
        int ataqueInicial = p.ataque;
        int defensaInicial = p.defensa;
        int ataqueEspecialInicial = p.ataqueEspecial;
        int defensaEspecialInicial = p.defensaEspecial;
        int velocidadInicial = p.velocidad;
        int estaminaInicial = p.estamina;

        p.aumentarEstadisticas();

        // Verificar que todas las estadísticas se hayan aumentado correctamente
        Assert.assertTrue(p.vitalidad > vitalidadInicial);
        Assert.assertTrue(p.ataque > ataqueInicial);
        Assert.assertTrue(p.defensa > defensaInicial);
        Assert.assertTrue(p.ataqueEspecial > ataqueEspecialInicial);
        Assert.assertTrue(p.defensaEspecial > defensaEspecialInicial);
        Assert.assertTrue(p.velocidad > velocidadInicial);
        Assert.assertTrue(p.estamina > estaminaInicial);
    }
}
