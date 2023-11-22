package ejercicio05;

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
		int opcion;
		int mayor=0, menor=0;
		//Etiqueta a poner para los aleatorios
		Random rnd= new Random (System.nanoTime());
		
		//Comenzamos
		System.out.println("Pulsa 0. Poder repetir el programa");
		System.out.println("Pulse Cualquier Número. Para hacer el programa solo una vez");
		opcion = Leer.datoInt();
		
		do {
			
			System.out.println("Bienvenidos a nuestro programa");
		
			System.out.println("Indique el tamaño (cantidad de números que se almacenarán)");
			tam = Leer.datoInt();
		
			numeros = new int [tam];
		
			System.out.println("Necesitamos saber el intervalo de los números para que salgan en pantalla");
			System.out.println("Primero, ¿desde qué número quieres que cuente?");
			desde = Leer.datoInt();
			System.out.println("Segundo, ¿hasta qué número quieres que cuente?");
			hasta = Leer.datoInt();
		
		//Pedir desde donde y hasta donde quiere tener los números
			for (int i = 0; i < numeros.length; i++) {
			
			
		//Con esta frase tendremos los aleatorios
				numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
			
			}
			
		//Mostrará los números aleatorios
			for (int i = 0 ; i < numeros.length; i++) {
			
				System.out.print(numeros [i]+ "\t\n");
				System.out.println("================"); 
			
			}
		
 		
 		//Sumará los números aleatorios
			for (int i = 0; i < numeros.length; i++) {
			
				suma = numeros[i] + suma;
			}		
		
		System.out.println("La suma es: "+suma);
		
		//Mostrar el mayor número
			for (int i = 0; i < numeros.length; i++) {
				if (i == 0) {
			
					mayor = numeros [i];
				}
				
				if(mayor<numeros[i]) {
					
					mayor = numeros [i];
				}

			}
		
		System.out.println("El número más grande es: "+mayor);
		
		//Mostrar el menor número
			for (int i = 0; i < numeros.length; i++) {
				if (i == 0) {
		
					menor = numeros [i];
				}

				if (menor > numeros[i]) {
					
					menor = numeros [i];
				}
			}
	
		System.out.println("El número más pequeño es: "+menor);
		
		//Modificar valor elegido por usuario
		System.out.println("Diga el nuevo número para introducirlo");
		modificado = Leer.datoInt();
		
		System.out.println("Diga posición donde introducir nuevo número");
		op = Leer.datoInt()-1;
		
		numeros [op] = modificado;
			
		System.out.println("El número que hemos cambiado se lo voy a mostrar para que vea, que es el número que usted ha puesto: "+numeros [op]);
		
		}while (opcion == 0);
	}

}
