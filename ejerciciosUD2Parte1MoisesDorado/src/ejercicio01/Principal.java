package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;
		
		System.out.println("Bienvenido al programa que calcula si dos números son iguales o si uno es mayor o menor que el otro");
		
		System.out.println("Primero que nada elija el primer número, por favor que sea natural");
		num1 = Leer.datoInt();
		
		System.out.println("Ahora elija el segundo número, por favor que sea natural");
		num2 = Leer.datoInt();
		
		if (num1 == num2) {
			System.out.println("El primer número es igual que el segundo");
		}else if (num1 > num2) {
				System.out.println("El primer número es mayor que el segundo");
		}else {
				System.out.println("El primer número es menor que el segundo número");
			}
		
		System.out.println("Gracias por usar este programa :)");
		
	}

}
