package nayeli.giti7083s.interfacefigura;

import java.util.Scanner;

public class Testinterface implements Figura {//Se declara la clase Test

	public void test(){
			Figura figura;
			Cuadrado cuadrado;
			Circulo circulo;
			Triangulo triangulo;
		
		Scanner scanner = new Scanner(System.in);//Aqui se pide la figura
		System.out.println("Teclea la Figura que deseas");
		int seleccion = scanner.nextInt();
		
		switch (seleccion){//para solicitar la opción
		case 1:
			figura = new Cuadrado();
			break;
			
		case 2:
			figura = new Circulo();
			break;
			
		case 3:
			figura = new Triangulo();
			break;
		
			default:
			break;
		}
	}
	
	public static void main(String[] args){
		new Testinterface().test();
		
	}
}
