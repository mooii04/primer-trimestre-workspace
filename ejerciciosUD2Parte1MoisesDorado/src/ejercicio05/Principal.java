package ejercicio05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double base;
		double exponente;
		double cero = 0;
		double potencia;
		double resultado;
		
		System.out.println("Bienvenido, vamos a calcular la potencia de un número");
		
		System.out.println("Introduce la base");
		base = Leer.datoInt();
		
		System.out.println("Introduce el exponente");
		exponente = Leer.datoInt();
		
			if(exponente > cero) {
				potencia = Math.pow(base, exponente);
				System.out.println("El resultado es "+potencia);
			}
			
			if (exponente == cero) {
				potencia = Math.pow(base, exponente);
				System.out.println("El resultado es "+potencia);
			}
			
			if (exponente < cero) {
				potencia = Math.pow(base, -exponente);
				resultado =((1)/(potencia));
				System.out.println("El resultado es "+resultado);
		
	}

		System.out.println("Gracias por usar nuestro programa :)");
			
	}
}
