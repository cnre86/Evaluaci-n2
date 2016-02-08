package nayeli.giti7083s.factory;

public abstract class FactoriaConcreta2 implements AbstractFactory{
	
		//Depende de
		 ProductoA2 productoA2;
		 ProductoB2 productoB2;
		 
		 //Métodos
		public FactoriaConcreta2() {
			
		}
		public void crearProductoA(){
			productoA2=new ProductoA2();
			 System.out.println("Se crea producto A2");	
			}
		
		public void crearProductoB(){
			productoB2=new ProductoB2();
			 System.out.println("Se crea producto B2");	
		}
}
