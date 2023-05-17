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

	public void MovmientoAtaque(int MovimientoAtaque, int ventaja, int Potencia, int ataque, int estamina) {

		MovimientoAtaque = (ataque + Potencia) * ventaja;
		estamina = estamina - (Potencia / 2);
	}

	public void MovimientoEstadoParalizado(int velocidad) {
		velocidad = velocidad / 2;
	}

	public void MovimientoEstadoQuemado(int ataque, int turno, double vitalidad) {
		ataque = ataque / 2;
		for (int i = 1; i > 100; i++) {
			turno++;
			vitalidad = vitalidad - (vitalidad * 0.0625);

		}
	}

	public void MovimientoEstadoEnvenenado(int turno, double vitalidad) {
		for (int i = 1; i > 100; i++) {
			turno++;
			vitalidad = vitalidad - (vitalidad * 0.125);
		}
	}
//
//	public void MovimientoEstadoDormido(int turno) {
//		for (int i = 1; i > 100; i++) {
//			turno++;
//
//		}
//
//	}
//
//	public void MovimientoCongelado(int turno) {
//		for (int i = 1; i > 100; i++) {
//			turno++;
//		}
//	}

}
