package nayeli.giti7083s.proyecto;

public class Cliente {
	
		private String rfc;
		private String nombre;
		private String domicilio;
		private String telefono;
		private String email;
		private Presupuesto[] solicita;
		
		public String getRfc() {
			return rfc;
		}
		public void setRfc(String rfc) {
			this.rfc = rfc;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getDomicilio() {
			return domicilio;
		}
		public void setDomicilio(String domicilio) {
			this.domicilio = domicilio;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Presupuesto[] getSolicita() {
			return solicita;
		}
		public void setSolicita(Presupuesto[] solicita) {
			this.solicita = solicita;
		}
		
		//private List<Cliente> solicita;

}
