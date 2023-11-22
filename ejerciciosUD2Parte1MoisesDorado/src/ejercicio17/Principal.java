package ejercicio17;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		float sueldoFijo=1000f;
		float porcentaje=20;
		int cien=100;
		float sueldoFinal;
		int opcion;
		float ventas;
		
		System.out.println("Bienvenido al programa");
		
		System.out.println("Pulse 1. Inicar programa");
		System.out.println("Otro número siginifcará que solo lo podrás hacer una vez");
		opcion = Leer.datoInt();
		
		do {
			
			System.out.println("¿Cuántas ventas has hecho?");
			ventas = Leer.datoFloat();
			
			sueldoFinal = sueldoFijo + (ventas * (porcentaje / cien));
			
			System.out.printf("Su sueldo este mes es de: %.2f€\n", sueldoFinal);
			
		}while(opcion == 1);
		
		System.out.println("Gracias por usar el programa");
		
	}

}
