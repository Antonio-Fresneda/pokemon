package pokemon;

import crud.CapturaCrud;

public class Captura {
	
	private int pokeballs;
	private Pokemon pokemon;
	
	public Captura(int pokeballs, Pokemon pokemon) {
		super();
		this.pokeballs = pokeballs;
		this.pokemon = pokemon;
	}

	public int getPokeballs() {
		return pokeballs;
	}

	public void setPokeballs(int pokeballs) {
		this.pokeballs = pokeballs;
	}

	public Pokemon getPokemon() {
		return pokemon;
	}

	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	@Override
	public String toString() {
		return "Captura [pokeballs=" + pokeballs + ", pokemon=" + pokemon + "]";
	}

	
	
	
	}

