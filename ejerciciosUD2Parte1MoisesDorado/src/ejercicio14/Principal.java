package ejercicio14;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sumatorio = 0;
		int suma;
		int producto = 1;
		int tope = 10;
		
		System.out.println("Bienvenido al programa que te suma y te hace el producto");
		
		
		for(int i=0; i<tope; i++) {
			System.out.println("Introduce un número");
			suma = Leer.datoInt();
			sumatorio += suma; // sumatorio = sumatorio + suma;
			producto *= suma;
		}
		
		System.out.println("La suma de los números es: "+sumatorio); 
		System.out.println("El producto de todos esos números es: "+producto);
		
		System.out.println("Gracias por usar nuestro programa"); 
		
	}

}

