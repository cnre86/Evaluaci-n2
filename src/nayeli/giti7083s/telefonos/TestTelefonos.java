package nayeli.giti7083s.telefonos;

public class TestTelefonos {

	public static void main(String[] args) {
		
		Telefono tel;
		tel= new TelefonoFijo();
		 System.out.println("El Teléfono Fijo está marcando: "+ tel.marcarNumero(1));
		 
		tel=new TelefonoMovil();
		 System.out.println("El Teléfono Movil está marcando: "+ tel.marcarNumero(2));
		
		tel= new VideoTelefono();
		 System.out.println("El Video teléfono está marcando: "+ tel.marcarNumero(3));

	}
	
}
