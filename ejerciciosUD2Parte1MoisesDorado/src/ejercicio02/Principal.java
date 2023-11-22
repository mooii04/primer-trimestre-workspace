package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1;
		double num2;
		double resul;
		double cero = 0;
		
		System.out.println("Bienvenido al programa de dividir dos número");
		
		System.out.println("Primero elija el primer número:");
		num1 = Leer.datoDouble();
		
		System.out.println("Ahora elija el segundo número:");
		num2 = Leer.datoDouble();
		
		if (num2 == cero) {
			System.out.println("No podemos calcularlo, porfavor el denominador tiene que ser distinto de 0");
		}
			else {
				resul = num1 / num2;
				System.out.printf("El resultado de la operación es: %.2f", resul);
			}
		
		System.out.println("\nGracias por usar nuestro programa :)");
		
		
		
	}

}
