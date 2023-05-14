package pokemon;

public class Turno {
 
	    private int numeroTurno;
	    private String accionEntrenador;
	    private String accionRival;

	    public Turno(int numeroTurno, String accionEntrenador, String accionRival) {
	        this.numeroTurno = numeroTurno;
	        this.accionEntrenador = accionEntrenador;
	        this.accionRival = accionRival;
	    }

	    public int getNumeroTurno() {
	        return numeroTurno;
	    }

	    public void setNumeroTurno(int numeroTurno) {
	        this.numeroTurno = numeroTurno;
	    }

	    public String getAccionEntrenador() {
	        return accionEntrenador;
	    }

	    public void setAccionEntrenador(String accionEntrenador) {
	        this.accionEntrenador = accionEntrenador;
	    }

	    public String getAccionRival() {
	        return accionRival;
	    }

	    public void setAccionRival(String accionRival) {
	        this.accionRival = accionRival;
	    }

	    @Override
	    public String toString() {
	        return "Turno " + numeroTurno + ":\n" +
	                "Entrenador: " + accionEntrenador + "\n" +
	                "Rival: " + accionRival;
	    }
	

}
