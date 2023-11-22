package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int tam=8;
		int [] numeros;
		numeros = new int [tam];
		int suma=0;
		double media;
		int numCero=0;
		
		System.out.println("Bienvenidos al programa");
		
		System.out.println("Le voy a pedir 8 números");
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.println("Diga número");
			numeros [i] = Leer.datoInt();
		}		
		
		
		for (int i = 0; i < numeros.length; i++) {
			
 			suma += numeros[i];
 			 		
		}
 		
 		media = (double) suma / numeros.length;
 		
 		System.out.printf("La media es: %.2f\n", media);
 		
 		for (int i = 0; i < numeros.length; i++) {
			
			if (numeros[i] == 0) {
				numCero++;
			}
			
		}
 		
 		System.out.println("Hay un total de: "+numCero+" ceros");
 		
	}

}
