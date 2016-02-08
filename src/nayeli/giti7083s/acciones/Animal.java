package nayeli.giti7083s.acciones;

public class Animal implements AccionesSeresVivos{//Clase Animal que implementa acciones de los Seres vivos

	@Override
	public void hablar() {//métodos de acciones de los seres vivos
		System.out.println("Hablar");
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
