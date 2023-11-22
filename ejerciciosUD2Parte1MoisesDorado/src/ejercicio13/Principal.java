package ejercicio13;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int resul;
		int tope;
		
		System.out.println("Bienvenido al programa de la tabla de multiplicar");
		
		System.out.println("¿Hasta qué número quieres multiplicar?");
		tope = Leer.datoInt();
		
		for(int i=0; i<tope; i++) {
			System.out.println("Introduce un número que quieras multiplicar");
			num = Leer.datoInt();
			
			do {
				
			i++;
			resul = num * i;
			
			System.out.println(num+" * "+i+" = "+resul);
		
		}while (i < tope);
			
			System.out.println("Gracias por usar nuestro programa"); 
		
		}
	}
}