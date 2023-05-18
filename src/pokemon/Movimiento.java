package pokemon;

public class Movimiento {

	private int Potencia;
	private int ventaja;
	private int ataque;
	private int turno;
	private int estamina;

	public Movimiento() {
		super();
		Potencia = 0;
		this.ventaja = 0;
		this.ataque = 0;
		this.turno = 0;
		this.estamina = 0;
	}

	public Movimiento(int potencia, int ventaja, int ataque, int turno, int estamina) {
		super();
		Potencia = potencia;
		this.ventaja = ventaja;
		this.ataque = ataque;
		this.turno = turno;
		this.estamina = estamina;
	}

	public int getPotencia() {
		return Potencia;
	}

	public void setPotencia(int potencia) {
		Potencia = potencia;
	}

	public int getVentaja() {
		return ventaja;
	}

	public void setVentaja(int ventaja) {
		this.ventaja = ventaja;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	public int getEstamina() {
		return estamina;
	}

	public void setEstamina(int estamina) {
		this.estamina = estamina;
	}

	@Override
	public String toString() {
		return "Movimiento [Potencia=" + Potencia + ", ventaja=" + ventaja + ", ataque=" + ataque + ", turno=" + turno
				+ ", estamina=" + estamina + "]";
	}

	/**
	 * Metodo para el movimiento de ataque del pokemon
	 * 
	 * @param ventaja
	 * @param Potencia
	 * @param ataque
	 * @param estamina
	 */
	public static Pokemon movmientoAtaque() {
		Pokemon p = new Pokemon();
		int atacar;
		int ventaja;
		int Potencia;
		int ataque;
		int estamina;

		atacar = (p.ataque + p.potencia) * p.ventaja;
		estamina = p.estamina - (p.potencia / 2);

		return p;

	}

	/**
	 * Metodo para el movimiento paralizar del pokemon
	 * 
	 * @param velocidad
	 */
	public void movimientoEstadoParalizado(int turno, int velocidad) {
		for (int i = 1; i > 1; i++) {
			turno++;
			velocidad = velocidad / 2;
		}
	}

	/**
	 * Metodo para cuando el pokemon esta quemado
	 * 
	 * @param ataque
	 * @param turno
	 * @param vitalidad
	 */
	public void MovimientoEstadoQuemado(int ataque, int turno, double vitalidad) {
		ataque = ataque / 2;
		for (int i = 1; i > 5; i++) {
			turno++;
			vitalidad = vitalidad - (vitalidad * 0.0625);

		}
	}

	/**
	 * Metodo para cuando un pokemon
	 * 
	 * @param turno
	 * @param vitalidad
	 */
	public void MovimientoEstadoEnvenenado(int turno, double vitalidad) {
		for (int i = 1; i > 3; i++) {
			turno++;
			vitalidad = vitalidad - (vitalidad * 0.125);
		}
	}

	/**
	 * Metodo para cuando un pokemon esta durmiendo
	 * 
	 * @param turno
	 */
	public void MovimientoEstadoDormido(int turno) {
		for (int i = 1; i > 3; i++) {
			turno++;
			Pokemon.descansar();
		}

	}

	/**
	 * Metodo para cuando un pokemon esta congelado
	 * 
	 * @param turno
	 */
	public void MovimientoCongelado(int turno) {
		for (int i = 1; i > 3; i++) {
			turno++;
		}
	}

}
