package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int dos = 2;
		
		System.out.println("Hola, bienvenido a nuestro programa porfavor siga las instrucciones");
		System.out.println("Inserte un número natural");
		
		num = Leer.datoInt();	
		
		if(num % dos  == 0) {
			
			System.out.println("Es PAR");
		}
		
		else {
			System.out.println("Es IMPAR");
		}
		
		System.out.println("Gracias por usar nuestro programa");	
		
	}

}
