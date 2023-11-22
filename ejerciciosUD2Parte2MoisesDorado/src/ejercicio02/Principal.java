package ejercicio02;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int tam = 10;
		int [] numeros;
		numeros = new int [tam];
		int doble=2;
		int desde=0, hasta=99;
		Random rnd= new Random (System.nanoTime());
		
		for (int i = 0; i < numeros.length; i++) {
			
			numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
			
		}
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.print(numeros[i]+"\t");
			
			System.out.println(numeros[i]*doble+"\t");
		}
		
	}

}
