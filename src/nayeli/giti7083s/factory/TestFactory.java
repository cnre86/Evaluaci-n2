package nayeli.giti7083s.factory;

public class TestFactory {

	public static void main(String[] args) {
		AbstractFactory factory= new FactoriaConcreta2() {
	};
	factory.crearProductoA();
	factory.crearProductoB();
	}
	
}
