package pokemon;
/**
 * 
 * @author Antonio
 *
 */
public class Objeto {
	
	    private String nombre;
	    private double aumentoAtaque;
	    private double aumentoDefensa;
	    private double aumentoDefensaEsp;
	    private double aumentoVelocidad;
	    private double aumentoEstamina;
	    private double disminucionAtaque;
	    private double disminucionDefensa;
	    private double disminucionDefensaEsp;
	    private double disminucionVelocidad;
	    private double disminucionRecuperacion;
	   
	    
	    public String getNombre() {
			return nombre;
		}




		public void setNombre(String nombre) {
			this.nombre = nombre;
		}




		public double getAumentoAtaque() {
			return aumentoAtaque;
		}




		public void setAumentoAtaque(double aumentoAtaque) {
			this.aumentoAtaque = aumentoAtaque;
		}




		public double getAumentoDefensa() {
			return aumentoDefensa;
		}




		public void setAumentoDefensa(double aumentoDefensa) {
			this.aumentoDefensa = aumentoDefensa;
		}




		public double getAumentoDefensaEsp() {
			return aumentoDefensaEsp;
		}




		public void setAumentoDefensaEsp(double aumentoDefensaEsp) {
			this.aumentoDefensaEsp = aumentoDefensaEsp;
		}




		public double getAumentoVelocidad() {
			return aumentoVelocidad;
		}




		public void setAumentoVelocidad(double aumentoVelocidad) {
			this.aumentoVelocidad = aumentoVelocidad;
		}




		public double getAumentoEstamina() {
			return aumentoEstamina;
		}




		public void setAumentoEstamina(double aumentoEstamina) {
			this.aumentoEstamina = aumentoEstamina;
		}




		public double getDisminucionAtaque() {
			return disminucionAtaque;
		}




		public void setDisminucionAtaque(double disminucionAtaque) {
			this.disminucionAtaque = disminucionAtaque;
		}




		public double getDisminucionDefensa() {
			return disminucionDefensa;
		}




		public void setDisminucionDefensa(double disminucionDefensa) {
			this.disminucionDefensa = disminucionDefensa;
		}




		public double getDisminucionDefensaEsp() {
			return disminucionDefensaEsp;
		}




		public void setDisminucionDefensaEsp(double disminucionDefensaEsp) {
			this.disminucionDefensaEsp = disminucionDefensaEsp;
		}




		public double getDisminucionVelocidad() {
			return disminucionVelocidad;
		}




		public void setDisminucionVelocidad(double disminucionVelocidad) {
			this.disminucionVelocidad = disminucionVelocidad;
		}




		public double getDisminucionRecuperacion() {
			return disminucionRecuperacion;
		}




		public void setDisminucionRecuperacion(double disminucionRecuperacion) {
			this.disminucionRecuperacion = disminucionRecuperacion;
		}




		public Objeto(String nombre, double aumentoAtaque, double aumentoDefensa, double aumentoDefensaEsp,
	                  double aumentoVelocidad, double aumentoEstamina, double disminucionAtaque,
	                  double disminucionDefensa, double disminucionDefensaEsp, double disminucionVelocidad,
	                  double disminucionRecuperacion) {
	        this.nombre = nombre;
	        this.aumentoAtaque = aumentoAtaque;
	        this.aumentoDefensa = aumentoDefensa;
	        this.aumentoDefensaEsp = aumentoDefensaEsp;
	        this.aumentoVelocidad = aumentoVelocidad;
	        this.aumentoEstamina = aumentoEstamina;
	        this.disminucionAtaque = disminucionAtaque;
	        this.disminucionDefensa = disminucionDefensa;
	        this.disminucionDefensaEsp = disminucionDefensaEsp;
	        this.disminucionVelocidad = disminucionVelocidad;
	        this.disminucionRecuperacion = disminucionRecuperacion;
	    }
	    
	    

}
