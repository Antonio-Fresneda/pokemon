package pokemon;

import java.util.Arrays;
import java.util.List;

public class Pokemon {

	private int idPokemon;
	private int numPokedex;
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
	private Movimiento[] movimiento = new Movimiento[4];
	private int fertilidad;
	private String sexo;
	private String tipo1;
	private String tipo2;
	private String estado;
	private String objeto;
	private int experiencia;
	private int ventaja;
	private String imagen;
	private String especie;

	public Pokemon() {
		
	}
	
	public Pokemon(String string, Object nivelMaximo) {
		this.idPokemon=0;
		this.numPokedex=0;
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
		this.sexo="";
		this.estado = "";
		this.objeto = "";
		this.experiencia = 0;
		this.ventaja = 0;

	}

	public Pokemon(int idPokemon,int numPokedex,String nombre, String mote, int vitalidad, int ataque, int defensa, int ataqueEspecial,
			int defensaEspecial, int velocidad, int estamina, int nivel, Movimiento[] movimiento, int fertilidad,
			String sexo, String tipo1, String tipo2, String estado, String objeto, int experiencia, int ventaja) {

		super();
		this.idPokemon=idPokemon;
		this.numPokedex=numPokedex;
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
		this.tipo1 = tipo1;
		this.tipo2 = tipo2;
		this.estado = estado;
		this.objeto = objeto;
		this.experiencia = experiencia;
		this.ventaja = ventaja;
		
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

	public Movimiento[] getMovimiento() {
		return movimiento;
	}

	public void setMovimiento(Movimiento[] movimiento) {
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

	public int getIdPokemon() {
		return idPokemon;
	}

	public void setIdPokemon(int idPokemon) {
		this.idPokemon = idPokemon;
	}

	public String getTipo1() {
		return tipo1;
	}

	public void setTipo1(String string) {
		this.tipo1 = string;
	}

	public String getTipo2() {
		return tipo2;
	}

	public void setTipo2(String tipo2) {
		this.tipo2 = tipo2;
	}

	public int getVentaja() {
		return ventaja;
	}

	public void setVentaja(int ventaja) {
		this.ventaja = ventaja;
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
	
	public int getNumPokedex() {
		return numPokedex;
	}

	public void setNumPokedex(int numPokedex) {
		this.numPokedex = numPokedex;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	@Override
	public String toString() {
		return "Pokemon [idPokemon=" + idPokemon +",numPokedex="+numPokedex+ ", nombre=" + nombre + ", mote=" + mote + ", vitalidad="
				+ vitalidad + ", ataque=" + ataque + ", defensa=" + defensa + ", ataqueEspecial=" + ataqueEspecial
				+ ", defensaEspecial=" + defensaEspecial + ", velocidad=" + velocidad + ", estamina=" + estamina
				+ ", nivel=" + nivel + ", movimiento=" + Arrays.toString(movimiento) + ", fertilidad=" + fertilidad
				+ ", sexo=" + sexo + ", tipo1=" + tipo1 + ", tipo2=" + tipo2 + ", estado=" + estado + ", objeto="
				+ objeto + ", experiencia=" + experiencia + ", ventaja=" + ventaja + "]";
	}

	public void subirNivel(int experiencia, int nivel, int vitalidad, int ataque, int defensa, int ataqueEspecial,
			int defensaEspecial, int velocidad, int estamina) {
		for (int n = 1; n < 100; n++) {
			if (experiencia == 10 * nivel) {
				nivel++;
				vitalidad = vitalidad + (int) Math.floor(Math.random() * (1 - 5) + 5);
				ataque = ataque + (int) Math.floor(Math.random() * (1 - 5) + 5);
				defensa = defensa + (int) Math.floor(Math.random() * (1 - 5) + 5);
				ataqueEspecial = ataqueEspecial + (int) Math.floor(Math.random() * (1 - 5) + 5);
				defensaEspecial = defensaEspecial + (int) Math.floor(Math.random() * (1 - 5) + 5);
				velocidad = velocidad + (int) Math.floor(Math.random() * (1 - 5) + 5);
				estamina = estamina + (int) Math.floor(Math.random() * (1 - 5) + 5);
				AprenderMovimiento();
					
				
			}
		}

	}

	public void AtacarPokemon() {
	}

	public int ComprobarVentaja(int ventaja) {
		if (ventaja==0.5) {
			System.out.println("Es poco eficaz");
		}else if(ventaja==1) {
			System.out.println("Neutro");
		}else if(ventaja==0.25) {
			System.out.println("Es muy poco eficaz");
		}else if(ventaja==2) {
			System.out.println("Es eficaz");
		}else if(ventaja==4) {
			System.out.println("Es muy eficaz");
		}
		
		double[][] efectividadesPokemon = {
				/*
				 * ACERO AGUA BICHO DRAGON ELÉC FANT FUEGO HADA HIELO LUCHA NORMAL PLANTA PSI
				 * ROCA SINIE TIERRA VENENO VOLADOR
				 */
				{ 0.5, 0.5, 1, 1, 0.5, 1, 0.5, 2, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1 }, // ACERO
				{ 1, 0.5, 1, 0.5, 1, 1, 2, 1, 1, 1, 1, 0.5, 1, 2, 1, 2, 1, 1 }, // AGUA
				{ 0.5, 1, 1, 1, 1, 0.5, 0.5, 0.5, 1, 0.5, 1, 2, 2, 1, 2, 1, 0.5, 0.5 }, // BICHO
				{ 0.5, 1, 1, 2, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, // DRAGÓN
				{ 1, 2, 1, 0.5, 0.5, 1, 1, 1, 1, 1, 1, 0.5, 1, 1, 1, 0, 1, 2 }, // ELÉCTRICO
				{ 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 0, 1, 2, 1, 0.5, 1, 1, 1 }, // FANTASMA
				{ 2, 0.5, 2, 0.5, 1, 1, 0.5, 1, 2, 1, 1, 2, 1, 0.5, 1, 1, 1, 1 }, // FUEGO
				{ 0.5, 1, 1, 2, 1, 1, 0.5, 1, 1, 2, 1, 1, 1, 1, 2, 1, 0.5, 1 }, // HADA
				{ 0.5, 0.5, 1, 2, 1, 1, 0.5, 1, 0.5, 1, 1, 2, 1, 1, 1, 2, 1, 2 }, // HIELO
				{ 2, 1, 0.5, 1, 1, 0, 1, 0.5, 2, 1, 2, 1, 0.5, 2, 2, 1, 0.5, 0.5 }, // LUCHA
				{ 0.5, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0.5, 1, 1, 1, 1 }, // NORMAL
				{ 0.5, 2, 0.5, 0.5, 1, 1, 0.5, 1, 1, 1, 1, 0.5, 1, 2, 1, 2, 0.5, 0.5 }, // PLANTA
				{ 0.5, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 0.5, 1, 0, 1, 2, 1 }, // PSÍQUICO
				{ 0.5, 1, 2, 1, 1, 1, 2, 1, 2, 0.5, 1, 1, 1, 1, 1, 0.5, 1, 2 }, // ROCA
				{ 1, 1, 1, 1, 1, 2, 1, 0.5, 1, 0.5, 1, 1, 2, 1, 0.5, 1, 1, 1 }, // SINIESTRO
				{ 2, 1, 0.5, 1, 2, 1, 2, 1, 1, 1, 1, 0.5, 1, 2, 1, 1, 2, 0 }, // TIERRA
				{ 0, 1, 1, 1, 1, 0.5, 1, 2, 1, 1, 1, 2, 1, 0.5, 1, 0.5, 0.5, 1 }, // VENENO
				{ 0.5, 1, 2, 1, 0.5, 1, 1, 1, 1, 2, 1, 2, 1, 0.5, 1, 1, 1, 1 } // VOLADOR
				
				
		};

		return ventaja;
	}

	public void Descansar(int estamina) {
		estamina = estamina + 50;

	}

	public void AprenderMovimiento() {
		System.out.println("Tu "+nombre+" quiere aprender un nuevo movimiento");
		Movimiento movimiento=new Movimiento();
		
	}

	public void aumentarEstadisticas(int aumentoEstadisticas) {
		// TODO Auto-generated method stub

	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	
}
