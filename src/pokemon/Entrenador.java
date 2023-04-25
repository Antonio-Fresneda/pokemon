package pokemon;

import java.util.ArrayList;
import java.util.Random;

public class Entrenador {

	private String nombre;
	private int pokedollars;
	private ArrayList<Pokemon> equipoPrincipal;
	private ArrayList<Pokemon> cajaPokemon;
	private ArrayList<Objeto> mochila;
     private Random rand;
	
	public Entrenador(String nombre) {
		 this.nombre = nombre;
		 this.pokedollars = new Random().nextInt(201) + 800;
		 this.equipoPrincipal = new ArrayList<>();
		 this.cajaPokemon = new ArrayList<>();
		 this.mochila = new ArrayList<>();
		 this.rand = new Random();
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
	
	public void moverAEquipoSecundario (Pokemon pokemon) {
		if (equipoPrincipal.size() > 1) {
			equipoPrincipal.remove(pokemon);
		} else {
			System.out.println("No puedes mover al último Pokémon de tu equipo principal a la caja.");
		}
	}
	
	public void moverAEquipoPrincipal(Pokemon pokemon) {
		if (equipoPrincipal.size()< 4) {
			cajaPokemon.remove(pokemon);
			equipoPrincipal.add(pokemon);
		}else {
			System.out.println("tu equipo principal esta lleno, debe de sacar un pokemon antes de meter otro");
		}
	}
}
