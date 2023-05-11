package pokemon;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;

import java.util.Scanner;
import java.util.List;

public class Entrenador {

	private String nombre;
	private int pokedollars;
	private ArrayList<Pokemon> equipoPrincipal;
	private ArrayList<Pokemon> cajaPokemon;
	private ArrayList<Objeto> mochila;
	private Random rand;
	private int idEntrenador;
	private int Password;

	public Entrenador(String nombre) {
		this.nombre = nombre;
		this.pokedollars = new Random().nextInt(201) + 800;
		this.equipoPrincipal = new ArrayList<>();
		this.cajaPokemon = new ArrayList<>();
		this.mochila = new ArrayList<>();
		this.rand = new Random();
	}

	public Entrenador() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPokedollars() {
		return pokedollars;
	}

	public void setPokedollars(int pokedollars) {
		this.pokedollars = pokedollars;
	}

	public ArrayList<Pokemon> getEquipoPrincipal() {
		return equipoPrincipal;
	}

	public void setEquipoPrincipal(ArrayList<Pokemon> equipoPrincipal) {
		this.equipoPrincipal = equipoPrincipal;
	}

	public ArrayList<Pokemon> getCajaPokemon() {
		return cajaPokemon;
	}

	public void setCajaPokemon(ArrayList<Pokemon> cajaPokemon) {
		this.cajaPokemon = cajaPokemon;
	}

	public ArrayList<Objeto> getMochila() {
		return mochila;
	}

	public void setMochila(ArrayList<Objeto> mochila) {
		this.mochila = mochila;
	}

	public Random getRand() {
		return rand;
	}

	public void setRand(Random rand) {
		this.rand = rand;
	}

	public int getIdEntrenador() {
		return idEntrenador;
	}

	public void setIdEntrenador(int idEntrenador) {
		this.idEntrenador = idEntrenador;
	}

	public int getPassword() {
		return Password;
	}

	public void setPassword(int password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "Entrenador [nombre=" + nombre + ", pokedollars=" + pokedollars + ", equipoPrincipal=" + equipoPrincipal
				+ ", cajaPokemon=" + cajaPokemon + ", mochila=" + mochila + ", rand=" + rand + ", idEntrenador="
				+ idEntrenador + ", Password=" + Password + "]";
	}

	public void moverAEquipoSecundario(Pokemon pokemon) {
		if (equipoPrincipal.size() > 1) {
			equipoPrincipal.remove(pokemon);
		} else {
			System.out.println("No puedes mover al último Pokémon de tu equipo principal a la caja.");
		}
	}

	public void moverAEquipoPrincipal(Pokemon pokemon) {
		if (equipoPrincipal.size() <= 6) {
			cajaPokemon.remove(pokemon);
			equipoPrincipal.add(pokemon);
		} else {
			System.out.println("tu equipo principal esta lleno, debe de sacar un pokemon antes de meter otro");
		}
	}

	public void entrenarPokemon(Pokemon pokemon, String tipoEntrenamiento) {
		int costoEntrenamiento;
		int aumentoEstadisticas;

		switch (tipoEntrenamiento) {
		case "pesado":
			costoEntrenamiento = 20 * pokemon.getNivel();
			aumentoEstadisticas = 5;
			break;
		case "furioso":
			costoEntrenamiento = 30 * pokemon.getNivel();
			aumentoEstadisticas = 5;
			break;
		case "funcional":
			costoEntrenamiento = 40 * pokemon.getNivel();
			aumentoEstadisticas = 5;
			break;
		case "onirico":
			costoEntrenamiento = 40 * pokemon.getNivel();
			aumentoEstadisticas = 5;
			break;
		default:
			System.out.println("tipo de entrenamiento no valido");
			return;
		}

		if (pokedollars >= costoEntrenamiento) {
			pokedollars -= costoEntrenamiento;
			pokemon.aumentarEstadisticas(aumentoEstadisticas);
		} else {
			System.out.println("no tienes sufucientes pokedollars para realizar este entrenamiento");
		}
	}

	public void capturarPokemon(Pokemon pokemon) {
		cajaPokemon.add(pokemon);
	}

	public void establecerNivelMaximoEquipo(int maxNivelRival) {
		
		for (Pokemon pokemon : equipoPrincipal) {
			int nivel = pokemon.getNivel ();
			if (nivel < maxNivelRival) {
				pokemon.setNivel(maxNivelRival);
			}
		}
		
	}

	public int obtenerMaxNivelPokemon() {
		int maxNivel = 0;
		
		for (Pokemon pokemon : equipoPrincipal) {
			int nivel = pokemon.getNivel();
			if (nivel < maxNivel) {
				
			}
		}
		return maxNivel;
	}

	public Pokemon elegirPokemon() {
		 ArrayList<Pokemon> equipo = getEquipoPrincipal();
		    int numPokemons = equipo.size();

		    System.out.println("Elige un Pokémon para el combate:");

		    for (int i = 0; i < numPokemons; i++) {
		        Pokemon pokemon = equipo.get(i);
		        System.out.println((i + 1) + ". " + pokemon.getNombre() + " (Nivel: " + pokemon.getNivel() + ")");
		    }

		    Scanner scanner = new Scanner(System.in);
		    int opcion = -1;

		    while (opcion < 1 || opcion > numPokemons) {
		        System.out.print("Ingresa el número del Pokémon: ");
		        opcion = scanner.nextInt();
		    }

		    return equipo.get(opcion - 1);
		}
		
	

}
