package pokemon;

import java.util.Arrays;

public class Pokemon {

	private String nombre;
	private String mote;
	private int vitalidad;
	private int ataque;
	private int defensa;
	private int ataqueEspecial;
	private int defensaEspecial;
	private int velocidad;
	private int estamina;
	private int nivel;
	private String[] movimiento = new String[4];
	private int fertilidad;
	private String sexo;
	private String[] tipo = new String[2];
	private String estado;
	private String objeto;
	private int experiencia;

	public Pokemon() {
		this.nombre = "";
		this.mote = "";
		this.vitalidad = 0;
		this.ataque = 0;
		this.defensa = 0;
		this.ataqueEspecial = 0;
		this.defensaEspecial = 0;
		this.velocidad = 0;
		this.estamina = 0;
		this.nivel = 0;
		this.fertilidad = 0;
		this.sexo = "";
		this.estado = "";
		this.objeto = "";
		this.experiencia = 0;
	}

	public Pokemon(String nombre, String mote, int vitalidad, int ataque, int defensa, int ataqueEspecial,
			int defensaEspecial, int velocidad, int estamina, int nivel, String[] movimiento, int fertilidad,
			String sexo, String[] tipo, String estado, String objeto, int experiencia) {

		super();
		this.nombre = nombre;
		this.mote = mote;
		this.vitalidad = vitalidad;
		this.ataque = ataque;
		this.defensa = defensa;
		this.ataqueEspecial = ataqueEspecial;
		this.defensaEspecial = defensaEspecial;
		this.velocidad = velocidad;
		this.estamina = estamina;
		this.nivel = nivel;
		this.movimiento = movimiento;
		this.fertilidad = fertilidad;
		this.sexo = sexo;
		this.tipo = tipo;
		this.estado = estado;
		this.objeto = objeto;
		this.experiencia = experiencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMote() {
		return mote;
	}

	public void setMote(String mote) {
		this.mote = mote;
	}

	public int getVitalidad() {
		return vitalidad;
	}

	public void setVitalidad(int vitalidad) {
		this.vitalidad = vitalidad;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public int getAtaqueEspecial() {
		return ataqueEspecial;
	}

	public void setAtaqueEspecial(int ataqueEspecial) {
		this.ataqueEspecial = ataqueEspecial;
	}

	public int getDefensaEspecial() {
		return defensaEspecial;
	}

	public void setDefensaEspecial(int defensaEspecial) {
		this.defensaEspecial = defensaEspecial;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getEstamina() {
		return estamina;
	}

	public void setEstamina(int estamina) {
		this.estamina = estamina;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String[] getMovimiento() {
		return movimiento;
	}

	public void setMovimiento(String[] movimiento) {
		this.movimiento = movimiento;
	}

	public int getFertilidad() {
		return fertilidad;
	}

	public void setFertilidad(int fertilidad) {
		this.fertilidad = fertilidad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String[] getTipo() {
		return tipo;
	}

	public void setTipo(String[] tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getObjeto() {
		return objeto;
	}

	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Pokemon [nombre=" + nombre + ", mote=" + mote + ", vitalidad=" + vitalidad + ", ataque=" + ataque
				+ ", defensa=" + defensa + ", ataqueEspecial=" + ataqueEspecial + ", defensaEspecial=" + defensaEspecial
				+ ", velocidad=" + velocidad + ", estamina=" + estamina + ", nivel=" + nivel + ", movimiento="
				+ Arrays.toString(movimiento) + ", fertilidad=" + fertilidad + ", sexo=" + sexo + ", tipo="
				+ Arrays.toString(tipo) + ", estado=" + estado + ", objeto=" + objeto + ", experiencia=" + experiencia
				+ "]";
	}

	public void subirNivel(int experiencia, int nivel, int vitalidad, int ataque, int defensa, int ataqueEspecial,
			int defensaEspecial, int velocidad, int estamina) {
		for (int i = 1; i < 100; i++) {
			if (experiencia == 10 * nivel) {
				i++;
				vitalidad = (int) Math.floor(Math.random() * (1 - 5) + 5);
				ataque = (int) Math.floor(Math.random() * (1 - 5) + 5);
				defensa = (int) Math.floor(Math.random() * (1 - 5) + 5);
				ataqueEspecial = (int) Math.floor(Math.random() * (1 - 5) + 5);
				defensaEspecial = (int) Math.floor(Math.random() * (1 - 5) + 5);
				velocidad = (int) Math.floor(Math.random() * (1 - 5) + 5);
				estamina = (int) Math.floor(Math.random() * (1 - 5) + 5);
			}
		}

	}
}
