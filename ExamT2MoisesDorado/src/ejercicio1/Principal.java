package ejercicio1;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rnd= new Random (System.nanoTime());
		int tam=10;
		int numeros [];
		numeros = new int [tam];
		int opcion;
		int opcion2;
		int suma=0;
		double media;
		int desde, hasta;
		int menorCinco=0, maximoValor=0, diez=10;
		String saludo="Hola bienvenido al programa", despedida="Gracias por usar nuestro programa, hasta pronto";
		String tirada="Tirada";
		int numTirada=1;
		int menor=0;
		int numLeido, posTirada;
				
		
		System.out.println(saludo);
		
		
		System.out.println("Para comenzar pulse cualquier número");
		opcion = Leer.datoInt();

			
		do {
			
			System.out.print("\n");
			System.out.println("Si no pulsa el 1 PRIMERO no se le mostrarán las tiradas");
			System.out.println("Pulse 1. Para generar las tiradas");
			System.out.println("Pulse 2. Para ver la suma de las tiradas");
			System.out.println("Pulse 3. Para ver la media de las tiradas");
			System.out.println("Pulse 4. Para ver cuantos valores están por debajo de 5");
			System.out.println("Pulse 5. Para ver el porcentaje que ha obtenido de sacar el número más alto");
			System.out.println("Pulse 6. Para ver los valores obtenidos en las tiradas");
			System.out.println("Pulse 7. Para ver la tirada más baja");
			System.out.println("Pulse 8. Para sumar un número a una posición");
			System.out.println("Pulse 0. Para finalizar programa");
			opcion2 = Leer.datoInt();
			
			switch (opcion2) {
			
			
				case 1: 
					System.out.println("¿Qué valor quiere que sea el más pequeño del dado?");
					desde = Leer.datoInt();

					System.out.println("¿Qué valor quiere que sea el más grande del dado?");
					hasta = Leer.datoInt();
			
					for (int i = 0; i < numeros.length; i++) {
				
						numeros [i] = rnd.nextInt (hasta-desde+1)+desde;
					}
						
				break;
				
				case 2:
					for (int i = 0; i < numeros.length; i++) {
				
						suma += numeros [i];
					}
			
					System.out.println("\nLa suma de todos los valores de las "+tam+" tiradas es de: "+suma);
				break;
				
				case 3:
					System.out.println("\nLe mostraremos la media de todos los valores, es decir calcularemos el total de la suma entre las "+tam+" tiradas");
			
					media = suma / numeros.length;
			
					System.out.printf("La media calculada ha sido de: %.2f\n", media);
			
				break;
				
				case 4:
					for (int i = 0; i < numeros.length; i++) {
			
						if (numeros [i] < 5) {
					
							menorCinco++;
				
						}
					}
			
					System.out.println("\nHa sacado la cantidad de "+menorCinco+" números menor que 5");
					
				break;
				
				case 5:
										
					System.out.println("Repita el valor más grande que ha decidido usted para el dado");
					hasta = Leer.datoInt();
					
					for (int i = 0; i < numeros.length; i++) {
						
						if (numeros [i] == hasta) {
					
							maximoValor++;
						}
					}
			
					maximoValor = maximoValor * diez;
			
					System.out.println("\nHa tenido el porcentaje de "+maximoValor+"% de sacar el número más alto");
				
				break;
				
				case 6:			
					System.out.println("Vamos a mostrarle el valor de cada tirada\n");
			
					for (int i = 0; i < numeros.length; i++) {
				
						System.out.print(tirada+" "+numTirada+". \t");
						
						numTirada++;
					}
					
					System.out.print("\n\n");
					
					for (int i = 0; i < numeros.length; i++) {
						
						System.out.print(numeros[i]+"\t\t");
					}
					
					System.out.println("\n");
					
				break;
			
				case 7:
					for (int i = 0; i < numeros.length; i++) {
				
						if (i == 0) {
					
							menor = numeros[i];
						}
				
						if (menor > numeros [i]) {
					
							menor = numeros[i];
						}
						
					}
			
					System.out.println("\nDe las "+tam+" tiradas el número más pequeño obtenido es el: "+menor);
			
				break;
					
				case 8:
					System.out.println("Diga número para sumar a una de las tiradas");
					numLeido = Leer.datoInt();
			
					System.out.println("¿A qué tirada se lo quiere sumar?");
					posTirada = Leer.datoInt()-1;
			
					numeros [posTirada] = numeros [posTirada] + numLeido;
			
					System.out.println("El valor de dicha tirada ha cambiado, ahora es: "+numeros [posTirada]);
					
				break;
				
				case 0:
					System.out.println("\nLe voy a volver a preguntar por última vez si quiere seguir jugando\n"
							+ " Pulse 1. Volver a jugar\n"
							+ " Pulse cualquier otra tecla para finalizar");
					opcion = Leer.datoInt();
				break;
				
				default:
					System.out.println("Inserte un valor comentado anteriormente");
				break;
					
				}
			
		}while (opcion == 1);
		
		System.out.println("\n"+despedida);
		
	}

}
