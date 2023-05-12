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
	
	public void capturarPokemon(int pokeballs) {
		int idEntrenador;
		int idPokemon; 
		int numPokedex; 
		String mote;
		char sexo;
		int nivel;
		int vitalidad;
		int ataque;
		int defensa; 
		int ataEspecial;
		int defEspecial; 
		int velocidad;
		int estamina;
		int fertilidad;
		int equipo;
		
		int ratioCaptura= (int) (Math.random()*3+1);;
		if(pokeballs>0) {
			System.out.println("Has lanzado una pokeball");
			pokeballs--;
				if(ratioCaptura==1||ratioCaptura==2) {
					System.out.println("¡POKEMON CAPTURADO!");
					//CapturaCrud.InsertarPokemon();
				}else {
					System.out.println("El pokemon se ha escapado");
				}
			
		}else {
			System.out.println("No te quedan pokeballs");
		}
	}
	
	
	
	}

