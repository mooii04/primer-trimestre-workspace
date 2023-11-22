package ejercicio04;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int desde=1, hasta=99;
		int tam=10;
		int numeros [];
		int suma=0;
		numeros = new int [tam];
		int op;
		double media;
		
		Random rnd= new Random (System.nanoTime());
		
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
			
		}
		
		System.out.println("Diga posición a mostrar");
		op = Leer.datoInt()-1;
		
		System.out.println(numeros[op]);
		
		
		for (int i = 0; i < numeros.length; i++) {
			
			suma = numeros[i] + suma;
		}		
		
		System.out.println("La suma total de todos los números es: "+suma);
		
		for (int i = 0; i < numeros.length; i++) {
			
 			suma += numeros[i];
 			 		
		}
 		
 		media = (double) suma / numeros.length;
 		
 		System.out.printf("La media es: %.2f", media);
	}

}
