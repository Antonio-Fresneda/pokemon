package pokemon;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Combate {

	private Entrenador ganador;
	private Entrenador jugador;
	private Entrenador rival;
	private int turno;
	private int pokemonJugadorKO;
	private int pokemonRivalKO;
	private int pokedollars;
	private List<Turno> listaTurnos;

	public Combate(Entrenador jugador, Entrenador rival, Turno turno, Pokemon pokemonJugadorKO,
			Pokemon pokemonRivalKO) {
		super();
		this.jugador = jugador;
		this.rival = rival;
		this.turno = 1;
		this.pokemonJugadorKO = 0;
		this.pokemonRivalKO = 0;

	}

	public int getPokedollars() {
		return pokedollars;
	}

	public void setPokedollars(int pokedollars) {
		this.pokedollars = pokedollars;
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

			realizarBatalla(pokemonJugador, pokemonRival);

			turno++;
		}

		if (pokemonJugadorKO == 6) {
			ganador = rival;
			jugador.entregarPokedollars(ganador);
			jugador.ganarExperiencia(calcularExperiencia());
		} else {
			ganador = jugador;
			rival.entregarPokedollars(ganador);
			rival.ganarExperiencia(calcularExperiencia());
		}

		System.out.println("El ganador del combate es: " + ganador.getNombre());
	}

	private void realizarBatalla(Pokemon pokemonJugador, Pokemon pokemonRival) {
		int pokedollarsEntregados = (int) Math.floor(ganador.getPokedollars() / 3.0);
		ganador.setPokedollars(ganador.getPokedollars() + pokedollarsEntregados);
		this.setPokedollars(this.getPokedollars() - pokedollarsEntregados);
		System.out.println("Se han entregado " + pokedollarsEntregados + " Pokédollars al ganador.");

	}

	private double calcularExperiencia() {
		Pokemon pokemonRival = rival.obtenerPokemonActivo();
		return (jugador.obtenerNivelPokemonActivo() + pokemonRival.getNivel() * 10) / 4.0;
	}
	
	public Combate() {
        this.listaTurnos = new ArrayList<>();
	}
	
	public void agregarTurno(Turno turno) {
        listaTurnos.add(turno);
    }
	
	public void retirarse() {
	    if (jugador == ganador) {
	        ganador.setPokedollars(ganador.getPokedollars() + rival.getPokedollars() / 3);
	        System.out.println("El entrenador " + jugador.getNombre() + " se ha retirado del combate.");
	        System.out.println("El entrenador " + rival.getNombre() + " ha ganado el combate.");
	        System.out.println("Se le han entregado " + (rival.getPokedollars() / 3) + " Pokedólares al entrenador " + rival.getNombre());
	    } else if (rival == ganador) {
	        ganador.setPokedollars(ganador.getPokedollars() + jugador.getPokedollars() / 3);
	        System.out.println("El entrenador " + rival.getNombre() + " se ha retirado del combate.");
	        System.out.println("El entrenador " + jugador.getNombre() + " ha ganado el combate.");
	        System.out.println("Se le han entregado " + (jugador.getPokedollars() / 3) + " Pokedólares al entrenador " + jugador.getNombre());
	    }
	}

	 public void exportarTurnosAFichero(String nombreFichero) {
	        try {
	            FileWriter fileWriter = new FileWriter(nombreFichero);
	            PrintWriter printWriter = new PrintWriter(fileWriter);

	            for (Turno turno : listaTurnos) {
	                printWriter.println(turno);
	            }

	            printWriter.close();
	            System.out.println("Los turnos se han exportado correctamente al fichero: " + nombreFichero);
	        } catch (IOException e) {
	            System.out.println("Error al exportar los turnos al fichero: " + nombreFichero);
	            e.printStackTrace();
	        }
	    }
}
