package pokemon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComprobarVentajaTest {

	@Test
	void test() {
		double[][] efectividadesPokemon = {
	            { 0.5, 0.5, 1, 1, 0.5, 1, 0.5, 2, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1 }, // ACERO
	            { 1, 0.5, 1, 0.5, 1, 1, 2, 1, 1, 1, 1, 0.5, 1, 2, 1, 2, 1, 1 }, // AGUA
	            { 0.5, 1, 1, 1, 1, 0.5, 0.5, 0.5, 1, 0.5, 1, 2, 2, 1, 2, 1, 0.5, 0.5 }, // BICHO
	            { 0.5, 1, 1, 2, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, // DRAGON
	            { 1, 2, 1, 0.5, 0.5, 1, 1, 1, 1, 1, 1, 0.5, 1, 1, 1, 0, 1, 2 }, // ELECTRICO
	            { 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 0, 1, 2, 1, 0.5, 1, 1, 1 }, // FANTASMA
	            { 2, 0.5, 2, 0.5, 1, 1, 0.5, 1, 2, 1, 1, 2, 1, 0.5, 1, 1, 1, 1 }, // FUEGO
	            { 0.5, 1, 1, 2, 1, 1, 0.5, 1, 1, 2, 1, 1, 1, 1, 2, 1, 0.5, 1 }, // HADA
	            { 0.5, 0.5, 1, 2, 1, 1, 0.5, 1, 0.5, 1, 1, 2, 1, 1, 1, 2, 1, 2 }, // HIELO
	            { 2, 1, 0.5, 1, 1, 0, 1, 0.5, 2, 1, 2, 1, 0.5, 2, 2, 1, 0.5, 0.5 }, // LUCHA
	            { 0.5, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0.5, 1, 1, 1, 1 }, // NORMAL
	            { 0.5, 2, 0.5, 0.5, 1, 1, 0.5, 1, 1, 1, 1, 0.5, 1, 2, 1, 2, 0.5, 0.5 }, // PLANTA
	            { 0.5, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 0.5, 1, 0, 1, 2, 1 }, // PSIQUICO
	            { 0.5, 1, 2, 1, 1, 1, 2, 1, 2, 0.5, 1, 1, 1, 1, 1, 0.5, 1, 2 }, // ROCA
	            { 1, 1, 1, 1, 1, 2, 1, 0.5, 1, 0.5, 1, 1, 2, 1, 0.5, 1, 1, 1 }, // SINIESTRO
	            { 2, 1, 0.5, 1, 2, 1, 2, 1, 1, 1, 1, 0.5, 1, 2, 1, 1, 2, 0 }, // TIERRA
	            { 0, 1, 1, 1, 1, 0.5, 1, 2, 1, 1, 1, 2, 1, 0.5, 1, 0.5, 0.5, 1 }, // VENENO
	            { 0.5, 1, 2, 1, 0.5, 1, 1, 1, 1, 2, 1, 2, 1, 0.5, 1, 1, 1, 1 } // VOLADOR
	        };

	        assertEquals("Es poco eficaz", calcularEfectividad(efectividadesPokemon, 0.5));
	        assertEquals("Neutro", calcularEfectividad(efectividadesPokemon, 1));
	        assertEquals("Es muy poco eficaz", calcularEfectividad(efectividadesPokemon, 0.25));
	        assertEquals("Es eficaz", calcularEfectividad(efectividadesPokemon, 2));
	        assertEquals("Es muy eficaz", calcularEfectividad(efectividadesPokemon, 4));
	    }

	    private String calcularEfectividad(double[][] efectividadesPokemon, double ventaja) {
	        if (ventaja == 0.5) {
	            return "Es poco eficaz";
	        } else if (ventaja == 1) {
	            return "Neutro";
	        } else if (ventaja == 0.25) {
	            return "Es muy poco eficaz";
	        } else if (ventaja == 2) {
	            return "Es eficaz";
	        } else if (ventaja == 4) {
	            return "Es muy eficaz";
	        }
	        return "";
	    }
	}


