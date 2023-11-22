package ejercicio18;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion;
		int cero = 0;
		float saldo;
		float sacar;
		float ingreso;
		int cantidadEntradas;
		float precioEntradas;
		
		
		System.out.println("Bienvenido al cajero");
		
		System.out.println("Antes de comenzar indiqueme su saldo");
		saldo = Leer.datoFloat();
		
		
		do {
			
			System.out.println("Pulse 1. Ver saldo");
			System.out.println("Pulse 2. Sacar dinero");
			System.out.println("Pulse 3. Comprar entradas");
			System.out.println("Pulse 4. Ingresas dinero");
			System.out.println("Pulse 0. Finalizar");
			
			opcion = Leer.datoInt();
			
			switch (opcion) {
			
				case 1:
					System.out.printf("%.2f€\n", saldo);
					break;
					
				case 2:
					System.out.println("¿Cuánto dinero quieres retirar?");
					sacar = Leer.datoFloat();
					if (sacar > saldo) {
						System.out.println("No tienes tanto dinero");
					}else
						saldo = saldo - sacar;
						System.out.printf("Dinero retirado exitosamente, le queda en la cuenta: %.2f€\n", saldo);
					break;
				
				case 3:
					System.out.println("¿Cuánto cuestan las entradas?");
					precioEntradas =Leer.datoFloat();
					System.out.println("¿Cuántas entradas quiere comprar?");
					cantidadEntradas = Leer.datoInt();
					if ((precioEntradas*cantidadEntradas) > saldo) {
						System.out.println("No tienes tanto dinero");
					}else
						saldo = saldo - (precioEntradas*cantidadEntradas);
						System.out.printf("Entradas compradas exitosamente, le queda en la cuenta: %.2f€\n", saldo);
					break;
				
				case 4:
					System.out.println("¿Cuánto dinero quiere ingresar?");
					ingreso = Leer.datoFloat();
					saldo = saldo + ingreso;
					System.out.printf("Dinero ingresado exitosamente, le queda en la cuenta: %.2f\n", saldo);
					break;
					
				case 0:
					System.out.println("Gracias por usar nuestro banco");
					break;
				
				default:
					System.out.println("Pulsa un número que se ha indicado porfavor");
					break;
			}	
			
			System.out.println("Gracias por usar nuestro banco");
			
		} while (opcion != cero);
		
	}

}
