package pokemon;

public class Combate {
	
	private Entrenador jugador;
	private Entrenador rival;
	private Turno turno;
	private Pokemon pokemonJugadorKO;
	private Pokemon pokemonRivalKO;
	
	public Combate(Entrenador jugador, Entrenador rival, Turno turno, Pokemon pokemonJugadorKO,
			Pokemon pokemonRivalKO) {
		super();
		this.jugador = jugador;
		this.rival = rival;
		this.turno = turno;
		this.pokemonJugadorKO = pokemonJugadorKO;
		this.pokemonRivalKO = pokemonRivalKO;
	
	
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

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	public Pokemon getPokemonJugadorKO() {
		return pokemonJugadorKO;
	}

	public void setPokemonJugadorKO(Pokemon pokemonJugadorKO) {
		this.pokemonJugadorKO = pokemonJugadorKO;
	}

	public Pokemon getPokemonRivalKO() {
		return pokemonRivalKO;
	}

	public void setPokemonRivalKO(Pokemon pokemonRivalKO) {
		this.pokemonRivalKO = pokemonRivalKO;
	}

	@Override
	public String toString() {
		return "Combate [jugador=" + jugador + ", rival=" + rival + ", turno=" + turno + ", pokemonJugadorKO="
				+ pokemonJugadorKO + ", pokemonRivalKO=" + pokemonRivalKO + "]";
	}

	
	
}
