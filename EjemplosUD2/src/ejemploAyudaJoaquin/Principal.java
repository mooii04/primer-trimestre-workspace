package ejemploAyudaJoaquin;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int tam;
		int [] numeros;
		int hasta, desde;
		int suma=0;
		int modificado, op;
		
		//Comenzamos
		System.out.println("Bienvenidos a nuestro programa");
		
		System.out.println("Indique el tamaño (cantidad de números que se almacenarán)");
		tam = Leer.datoInt();
		
		numeros = new int [tam];
		
Random rnd= new Random (System.nanoTime());
		
		//Pedir desde donde y hasta donde quiere tener los números
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.println("Necesitamos saber el intervalo de los números para que salgan en pantalla");
			System.out.println("Primero, ¿desde qué número quieres que cuente?");
			desde = Leer.datoInt();
			System.out.println("Segundo, ¿hasta qué número quieres que cuente?");
			hasta = Leer.datoInt();
			
		//Con esta frase tendremos los aleatorios
			numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
			
		
		}
		
		//Mostrará los números aleatorios
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+"\t\n");
			System.out.println("================");
 			
 		}
	}
}