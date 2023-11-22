package ejercicio09;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float precioEntradas;
		float total;
		double totalFin;
		int numEntradas;
		int cien = 100;
		double descuento = 30;
		int dia;
		int diaDescuento = 1;
		
		System.out.println("Bienvenido al programa del cine");
		
		System.out.println("¿Cuánto cuesta la entrada?");
		precioEntradas = Leer.datoFloat();
		
		System.out.println("¿Cuántas entradas quieres?");
		numEntradas = Leer.datoInt();
		
		System.out.println("¿Es Miércoles? Marque con un 1 si es Miércoles");
		dia = Leer.datoInt();
		
		if (dia == diaDescuento) {
			System.out.println("Al ser miércoles hay que aplicarle un descuento del 30%");
			total = precioEntradas * numEntradas;
			totalFin = total * (descuento / cien);
			System.out.printf("Debe pagar por las entradas: %.2f€", totalFin);
			
		}else {
			totalFin = precioEntradas * numEntradas;
			System.out.printf("Debe pagar por las entradas: %.2f€", totalFin);
		}
		
		System.out.println("\nGracias por usar nuestro programa");
		
	}

}
