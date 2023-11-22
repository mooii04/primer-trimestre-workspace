package ejemploArray3;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] nombres={"Moisés", "Pablo", "Inma", "MoisesJavier", "Kyra"};
		int tam=5, hasta=99, desde=1, suma=0;
		double media;
		int [] numeros;
		
		numeros = new int [tam];
		
		Random rnd= new Random (System.nanoTime());
		
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
			
		}
		
			
		
 		for (int i = 0; i < nombres.length; i++) {
			
 			System.out.print(nombres [i]+ "\t\n");
 			System.out.println("================"); 
 			
		}
		
 		
 		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+"\t\n");
			System.out.println("================");
 			
		}
 		
 		
 		//calculo de la media
 		
 		for (int i = 0; i < numeros.length; i++) {
			
 			suma += numeros[i];
 			 		
		}
 		
 		media = (double) suma / numeros.length;
 		
 		System.out.printf("La media es: %.2f", media);
 		
	}

}
