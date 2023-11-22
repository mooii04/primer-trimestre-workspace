package ejemploscondicionales1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		int num2;
		int tope = 5;
		
		System.out.println("Diga número 1");
		num1 = Leer.datoInt();
		
		System.out.println("Diga número 2");
		num2 = Leer.datoInt();

		
		if(num1 >= tope) {
			System.out.println("Aprobado");
		}
		else {
			System.out.println("Suspenso");
		}
		
		
		if(num1 < num2 && num2 > num1) {
			System.out.println(num1+" menor que "+num2);
		}
		
		System.out.println("Adiós");
	
	}

}
