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
	private String Genero;
	private String Especie;
	private ArrayList<String> listaTipos;
	private ArrayList<String> listaAtaques;
	private Object madre;

	public Entrenador(String nombre) {
		this.nombre = nombre;
		this.pokedollars = new Random().nextInt(201) + 800;
		this.equipoPrincipal = new ArrayList<>();
		this.cajaPokemon = new ArrayList<>();
		this.mochila = new ArrayList<>();
		this.rand = new Random();
		this.listaTipos = new ArrayList<>();
	}

	public Entrenador() {

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

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		this.Genero = genero;
	}

	public String getEspecie() {
		return Especie;
	}

	public void setEspecie(String especie) {
		this.Especie = especie;
	}

	public ArrayList<String> getListaTipos() {
		return listaTipos;
	}

	public void setListaTipos(ArrayList<String> listaTipos) {
		this.listaTipos = listaTipos;
	}

	public void setListaAtaques(ArrayList<String> listaAtaques) {
		this.listaAtaques = listaAtaques;
	}

	public ArrayList<String> getListaAtaques() {
		return listaAtaques;
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
			int nivel = pokemon.getNivel();
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
			System.out.print("Ingresa el número de pokemon: ");
			opcion = scanner.nextInt();
		}

		return equipo.get(opcion - 1);
	}

	public Pokemon obtenerPokemonActivo() {

		if (!equipoPrincipal.isEmpty()) {
			return equipoPrincipal.get(0);
		}

		if (!cajaPokemon.isEmpty()) {
			return cajaPokemon.get(0);
		}
		return null;
	}

	public int obtenerNivelPokemonActivo() {
		Pokemon pokemonActivo = obtenerPokemonActivo();

		if (pokemonActivo != null) {
			return pokemonActivo.getNivel();
		}

		return 0;
	}

	public void ganarExperiencia(double calcularExperiencia) {
		Entrenador rival = null;
		int maxNivelRival = rival.obtenerMaxNivelPokemon();
		Pokemon pokemonActivo = obtenerPokemonActivo();

		if (pokemonActivo != null) {
			int experienciaGanada = (pokemonActivo.getNivel() + maxNivelRival * 10) / 4;
			pokemonActivo.setExperiencia(experienciaGanada);
			System.out.println("¡Tu Pokémon ha ganado " + experienciaGanada + " puntos de experiencia!");

		}

	}

	public void entregarPokédollars(Entrenador ganador) {
		int pokedollarsEntregados = (int) Math.floor(getPokedollars() / 3.0);
		ganador.setPokedollars(ganador.getPokedollars() + pokedollarsEntregados);
		setPokedollars(getPokedollars() - pokedollarsEntregados);
		System.out.println("Se han entregado " + pokedollarsEntregados + " Pokédollars al ganador.");
	}

	public Pokemon criarPokemon(Pokemon madre, Pokemon padre) {
		// Verificar si los Pokémon son compatibles para la crianza
 if (!sonCompatiblesParaCrianza(madre, padre)) {
		 System.out.println("Error: Los Pokémon no son compatibles para la crianza.");
		 return null;
		 }


 String moteMadre = madre.getMote();
		 String motePadre = padre.getMote();
		 int longitudMoteMadre = moteMadre.length() / 2;
		 int longitudMotePadre = motePadre.length() / 2;
		String mitadMoteMadre = moteMadre.substring(0, longitudMoteMadre);
		 String mitadMotePadre = motePadre.substring(longitudMotePadre);
		String moteHijo = mitadMoteMadre + mitadMotePadre;

		
		 List<Combate> ataquesMadre = madre.getListaAtaques();
		 List<Combate> ataquesPadre = padre.getListaAtaques();
		 int longitudAtaquesMadre = ataquesMadre.size() / 2;
		 int longitudAtaquesPadre = ataquesPadre.size() / 2;
		 List<Combate> ataquesHijo = new ArrayList<>();
		 ataquesHijo.addAll(ataquesMadre.subList(0, longitudAtaquesMadre));
		 ataquesHijo.addAll(ataquesPadre.subList(0, longitudAtaquesPadre));

		// Mezclar los tipos del hijo
 List<String> tiposMadre = madre.getListaTipos();
		 List<String> tiposPadre = padre.getListaTipos();
		List<String> tiposHijo = new ArrayList<>();
		 tiposHijo.addAll(tiposMadre);
		 tiposHijo.addAll(tiposPadre);

		// Obtener las mejores características de cada progenitor
 int mejorAtaqueMadre = madre.getAtaque();
		 int mejorAtaquePadre = padre.getAtaque();
		 int mejorDefensaMadre = madre.getDefensa();
		 int mejorDefensaPadre = padre.getDefensa();
		 int mejorVelocidadMadre = madre.getVelocidad();
		 int mejorVelocidadPadre = padre.getVelocidad();

		// Crear al hijo
 Pokemon hijo = new Pokemon(moteHijo, ataquesHijo, tiposHijo);
		 hijo.setAtaque(Math.max(mejorAtaqueMadre, mejorAtaquePadre));
		 hijo.setDefensa(Math.max(mejorDefensaMadre, mejorDefensaPadre));
		 hijo.setVelocidad(Math.max(mejorVelocidadMadre, mejorVelocidadPadre));

		 // Reducir la fertilidad de los padres en 1 punto
 madre.setFertilidad(madre.getFertilidad() - 1);
		 padre.setFertilidad(padre.getFertilidad() - 1);

		// Devolver al hijo
return hijo; 
		    }

	private boolean sonCompatiblesParaCrianza(Pokemon madre, Pokemon padre) {
		// Verificar si los Pokémon tienen diferentes géneros
		 if (madre.getSexo().equals(padre.getSexo())) {
		 return false;
		}

		 if (!madre.getEspecie().equals(padre.getEspecie())) {
		return false;
		}

	
		 return true;
		    }

}
