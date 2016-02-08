package nayeli.giti7083s.acciones;

public abstract class Humano implements AccionesHumano, AccionesSeresVivos{
	/*Clase humano que trae acciones de los Humanos 
	 * y Acciones de los seres vivos
	 */

	@Override
	public void bailar() {//métodos de las acciones de los humanos
		System.out.println("Bailar");
	}

	public void tocarInstrumentos() {
		System.out.println("Tocar Instrumentos");
	}

	@Override
	public void estudiar() {
		System.out.println("Estudiar");
	}

	@Override
	public void trabajar() {
		System.out.println("Trabajar");
	}

	@Override
	public void hablar() {//métodos de las acciones de los seres vivos
		System.out.println("Hola");
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
		System.out.println("Domir");
	}

}
