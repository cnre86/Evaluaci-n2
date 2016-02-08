package nayeli.giti7083s.acciones;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import nayeli.giti7083s.interfacefigura.Testinterface;

public class TestAcciones {

	public static void main(String[] args) {
				
		Animal animal = null;
		Humano humano;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Teclea la opcion de las acciones realizadas: ");
		System.out.println("Teclea 1: Animal");
		System.out.println("Teclea 2: Humano");
		int seleccion = scanner.nextInt();
		

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		switch (seleccion) {//Para solicitar las opciones
		case 1:
			animal= new Animal();
			System.out.println("Acciones de los animales: ");
			animal.hablar();
			animal.desplazarse();
			animal.jugar();
			animal.alimentarse();
			animal.dormir();
			break;
			
		case 2:
			humano= new Humano();
			System.out.println("Acciones de los humanos: ");
			humano.bailar();
			humano.tocarInstrumentos();
			humano.estudiar();
			humano.trabajar();
			humano.hablar();
			humano.desplazarse();
			humano.jugar();
			humano.alimentarse();
			humano.dormir();
			break;

			default:
			break;
		}
	}
}
