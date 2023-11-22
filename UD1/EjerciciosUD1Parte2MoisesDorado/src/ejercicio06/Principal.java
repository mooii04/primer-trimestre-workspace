package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int horasTrabajadas = 0;
		double precioHora = 0;
		int horasExtras = 0;
		double precioHorasExtra = 0;
		double total = 0;
		
		System.out.println("Bienvenido al programa encargado de calcular el sueldo de tu trabajo");
		System.out.println("----------------------------------------------------------------------");
		
		System.out.println("Indique las horas trabajadas del trabajador:");
		
		horasTrabajadas = Leer.datoInt();
		
		System.out.println("Indique el precio de la hora:");
		
		precioHora = Leer.datoDouble();
		
		System.out.println("Indique las horas extras trabajadas");

		horasExtras = Leer.datoInt();
		
		System.out.println("Indique el precio de las horas extras");
		
		precioHorasExtra = Leer.datoDouble();
		
		total = (horasTrabajadas * precioHora) + (horasExtras * precioHorasExtra);
		
		System.out.println("------------------------------------------------------------------------");
		System.out.printf("El sueldo final de un trabajador es: %.2f\n:", total);
		System.out.println("------------------------------------------------------------------------");
		
		
		
		
	}

}
