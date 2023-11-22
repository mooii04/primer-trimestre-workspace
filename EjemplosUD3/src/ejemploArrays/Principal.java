package ejemploArrays;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam, tam2;
		int desde, hasta, elemento, nuevoValor, total=0, contCeros=0;
		Random rnd = new Random (System.nanoTime());
		
		//1.- Declaración de Arrays, varias formas
		
		//a) Dando valores inicialmente, inicialiando
		
		/*
		 * Como no damos el tamaño, el tamaño es directamente
		 * el número de elememtos que ponemos
		 */
		
		int []lista= {2, 3, 6}; //Tamaño = 3 Ya se puede usar
		
		
		//b) Declarando e instanciando en diferentes líneas
		
		//Primero se declara, siempre primero
		
		int lista2[];
		
		//Todavía no se puede usar
		//Necesito el tamaño, lo pido
		//Tengo que declarar una variable al cominezo para guardarlo
		
		System.out.println("Diga el tamaño");
		tam = Leer.datoInt();
		
		//Instancio con ese tamaño
		
		lista2 = new int [tam]; //El tamaño es leído, ya se puede usar
		
		
		//c) Todo en la misma línea
		
		System.out.println("Diga el tamaño");
		tam2 = Leer.datoInt();
		
		int [] lista3 = new int [tam2];
		
		
		//El mejor el segundo, auqnue puede que nos encontremos el primero
		
		
		//2.- Cargar, rellenar un array
		//Varias formas
		
		//a) Leyendo por teclado
		
		for (int i = 0; i < lista.length; i++) {
			
			lista[i] = Leer.datoInt();
					
		}
		
		
		//b) Aleatoria
		
		System.out.println("Diga desde");
		desde = Leer.datoInt();
		
		System.out.println("Diga hasta");
		hasta = Leer.datoInt();
		
		for (int i = 0; i < lista2.length; i++) {
			
			lista2[i] = rnd.nextInt((hasta-desde+1)+desde) ;
			
		}
		
		//c) Cascaporra style

		int lista4[] = {2, 3, 55, 5};
		
		for (int i = 0; i < lista4.length; i++) {
			
			System.out.println(" "+lista4[i]);
			
		}
		
		//Acceso a un elemento
		
		System.out.println("Indique el elemento que desea cambiar");
		elemento = Leer.datoInt()-1;
		
		System.out.println("Indique el nuevo valor: ");
		nuevoValor = Leer.datoInt();
		
		lista4[elemento] = nuevoValor;
		
		//Sumamos elementos
		
		for (int i = 0; i < lista4.length; i++) {
			
			total += lista4[i];
			
		}
		
		//Operaciones variadas
		
		for (int i = 0; i < lista4.length; i++) {
			
			if(lista4[i] %2 == 0) {
				
				lista4[i] = lista4[i]*2;
				
			}
			
		}
		
		//Contar cúantos ceros hay
		
		for (int i = 0; i < lista4.length; i++) {
			
			if(lista4[i] == 0) {
				
				contCeros++;
				
			}
			
		}
		
	}

}
