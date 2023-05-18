package pokemon;

import java.text.SimpleDateFormat;
import java.util.Date;

import crud.CapturaCrud;

public class Captura {

	private int pokeballs;
	private Pokemon pokemon;

	public Captura(int pokeballs, Pokemon pokemon) {
		super();
		this.pokeballs = pokeballs;
		this.pokemon = pokemon;
	}
	/**
	 * 
	 * @return Devuelve get y set de los atributos de arriba
	 */
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
	/**
	 * Metodo para captura pokemon
	 */
	public void capturarPokemon() {

		Pokemon p = new Pokemon();
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
		int pokeballs = 10;
		int ratioCaptura = (int) (Math.random() * 3 + 1);

		if (pokeballs > 0) {
			System.out.println("Has lanzado una pokeball");

			pokeballs--;
			if (ratioCaptura == 1 || ratioCaptura == 2) {
				System.out.println("¡POKEMON CAPTURADO!");

				p = CapturaCrud.InsertarPokemon(1, numPokedex = CapturaCrud.numPokedex, null, sexo = 'H', 1,
						vitalidad = (int) (Math.random() * ((20 - 1) + 1)) + 1,
						ataque = (int) (Math.random() * ((20 - 1) + 1)),
						defensa = (int) (Math.random() * ((20 - 1) + 1)),
						ataEspecial = (int) (Math.random() * ((20 - 1) + 1)),
						defEspecial = (int) (Math.random() * ((20 - 1) + 1)),
						velocidad = (int) (Math.random() * ((20 - 1) + 1)),
						estamina = (int) (Math.random() * ((20 - 1) + 1)),
						fertilidad = (int) (Math.random() * ((20 - 1) + 1)), equipo = 2);

			} else {
				System.out.println("El pokemon se ha escapado");

			}

		} else {
			System.out.println("No te quedan pokeballs");
		}
	}
}
