package nayeli.giti7083s.acciones;

public class Gato extends Animal{//Clase Gato, que hereda de Animal
	
	@Override
	public void hablar() {//métodos de acciones del gato
		System.out.println("Miau miau");
	    }
	
		@Override
		public void desplazarse() {
			System.out.println("Desplazarse");
		}

		@Override
		public void jugar() {
			System.out.println("Jugar");
		}

		@Override
		public void alimentarse() {
			System.out.println("Alimentarse");
		}

		@Override
		public void dormir() {
			System.out.println("Dormir");
		}


}
