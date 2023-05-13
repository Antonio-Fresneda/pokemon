package pokemon;

import java.util.Random;
 

public class Combate {
	
	private Entrenador ganador;
	private Entrenador jugador;
	private Entrenador rival;
	private int turno;
	private int pokemonJugadorKO;
	private int pokemonRivalKO;
	
	public Combate(Entrenador jugador, Entrenador rival, Turno turno, Pokemon pokemonJugadorKO,
			Pokemon pokemonRivalKO) {
		super();
		this.jugador = jugador;
		this.rival = rival;
		this.turno = 1;
		this.pokemonJugadorKO = 0;
		this.pokemonRivalKO = 0;
	
	
	}
	
	
	public Entrenador getGanador() {
		return ganador;
	}



	public void setGanador(Entrenador ganador) {
		this.ganador = ganador;
	}



	public Entrenador getJugador() {
		return jugador;
	}



	public void setJugador(Entrenador jugador) {
		this.jugador = jugador;
	}


	public Entrenador getRival() {
		return rival;
	}



	public void setRival(Entrenador rival) {
		this.rival = rival;
	}


	public int getTurno() {
		return turno;
	}


	public void setTurno(int turno) {
		this.turno = turno;
	}


	public int getPokemonJugadorKO() {
		return pokemonJugadorKO;
	}


	public void setPokemonJugadorKO(int pokemonJugadorKO) {
		this.pokemonJugadorKO = pokemonJugadorKO;
	}


	public int getPokemonRivalKO() {
		return pokemonRivalKO;
	}


	public void setPokemonRivalKO(int pokemonRivalKO) {
		this.pokemonRivalKO = pokemonRivalKO;
	}


	@Override
	public String toString() {
		return "Combate [jugador=" + jugador + ", rival=" + rival + ", turno=" + turno + ", pokemonJugadorKO="
				+ pokemonJugadorKO + ", pokemonRivalKO=" + pokemonRivalKO + "]";
	}

	 public void comenzarCombate() {
	        Random random = new Random();
	        int maxNivelRival = rival.obtenerMaxNivelPokemon();
	        jugador.establecerNivelMaximoEquipo(maxNivelRival);

	        while (pokemonJugadorKO < 6 && pokemonRivalKO < 6) {
	            System.out.println("Turno " + turno);
	            System.out.println("Jugador: " + jugador.getNombre());
	            System.out.println("Rival: " + rival.getNombre());

	            Pokemon pokemonJugador = jugador.elegirPokemon();
	            Pokemon pokemonRival = rival.elegirPokemon();

	            System.out.println("Jugador envía a " + pokemonJugador.getNombre());
	            System.out.println("Rival envía a " + pokemonRival.getNombre());

	            // Realizar la batalla entre los Pokémon
	            realizarBatalla(pokemonJugador, pokemonRival);

	            turno ++;
	        }
	 
	        if (pokemonJugadorKO == 6) {
	            ganador = rival;
	             jugador.entregarPokédollars(ganador);
	            jugador.ganarExperiencia(calcularExperiencia());
	        } else {
	            ganador = jugador;
	            rival.entregarPokédollars(ganador);
	            rival.ganarExperiencia(calcularExperiencia());
	        }

	        System.out.println("El ganador del combate es: " + ganador.getNombre());
	    }
	 
	 
	 private void realizarBatalla(Pokemon pokemonJugador, Pokemon pokemonRival) {
	        
	    }
	 
	 private double calcularExperiencia() {
	        Pokemon pokemonRival = rival.obtenerPokemonActivo();
         return (jugador.obtenerNivelPokemonActivo() + pokemonRival.getNivel() * 10) / 4.0;
	    }
}
