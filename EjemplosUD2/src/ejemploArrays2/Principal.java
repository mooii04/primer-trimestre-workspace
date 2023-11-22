package ejemploArrays2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam;
		int [] edades; //Declaramos Array
		int suma = 0;
		int op;
		int leida;
		
		
		//Pedimos tamaño
		System.out.println("Diga tamaño");
		tam = Leer.datoInt();
		
		//Instanciamos Array
		edades = new int [tam];
		
		//Vamos a rellenar con números leídos por teclado
		
		//No usamos como tope del for el tam, SIEMPRE se usa nombrearray.length
		for (int i = 0; i < edades.length; i++) {
			
			System.out.println("Digame las edades");
			edades [i] = Leer.datoInt();
		}
		
		
		//Mostrar
		for (int i = 0; i < edades.length; i++) {
			System.out.println(i+1+". "+"la edad es: "+edades [i]);
			
		}
		
		
		//Sumar todos los elementos
		for (int i = 0; i < edades.length; i++) {
			
			suma = edades[i] + suma;
		}		
		
		System.out.println("La suma es: "+suma);
		
		
		
		//Mostrar un elemento elegido
		System.out.println("Diga posición a mostrar");
		op = Leer.datoInt()-1;
		
		System.out.println(edades[op]);
		
		
		//Modificar un valor elegido por el usuario
		System.out.println("Diga una nueva edad");
		leida = Leer.datoInt();
		
		System.out.println("Diga posición donde introducir nuevo valor");
		op = Leer.datoInt()-1;
		
		edades [op] = leida;
		
		
			}

}
