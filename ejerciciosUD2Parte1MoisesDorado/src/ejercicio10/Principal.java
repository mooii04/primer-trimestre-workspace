package ejercicio10;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int salas;
		float precioEntrada;
		int numEntradas;
		float precioFin;
		
		System.out.println("Buenas, bienvenido al programa de elegir la sala de cine");
		
		System.out.println("Para elegir la Sala Vip pulse 1");
		System.out.println("Para elegir la Sala 3D pulse 2");
		System.out.println("Para elegir la Sala Normal pulse 3");
		System.out.println("Para elegir la Sala de Niños pulse 4");
		
		salas = Leer.datoInt();
		
		switch (salas) {
		
			case 1:
				System.out.println("¿Cuánto vale cada entrada?");
				precioEntrada = Leer.datoFloat();
				System.out.println("El precio de la Sala Vip es de: "+precioEntrada+"€ cada entrada");
				System.out.println("¿Cuántas entradas quiere?");
				numEntradas = Leer.datoInt();
				precioFin = numEntradas * precioEntrada;
				System.out.println("El precio total que debe pagar es de: "+precioFin+"€");
				break;
				
			case 2:
				System.out.println("¿Cuánto vale cada entrada?");
				precioEntrada = Leer.datoFloat();
				System.out.println("El precio de la Sala 3D es de: "+precioEntrada+"€ cada entrada");
				System.out.println("¿Cuántas entradas quiere?");
				numEntradas = Leer.datoInt();
				precioFin = numEntradas * precioEntrada;
				System.out.println("El precio total que debe pagar es de: "+precioFin+"€");
				break;
				
			case 3:
				System.out.println("¿Cuánto vale cada entrada?");
				precioEntrada = Leer.datoFloat();
				System.out.println("El precio de la Sala Normal es de: "+precioEntrada+"€ cada entrada");
				System.out.println("¿Cuántas entradas quiere?");
				numEntradas = Leer.datoInt();
				precioFin = numEntradas * precioEntrada;
				System.out.println("El precio total que debe pagar es de: "+precioFin+"€");
				break;
				
			case 4:
				System.out.println("¿Cuánto vale cada entrada?");
				precioEntrada = Leer.datoFloat();
				System.out.println("El precio de la Sala de Niños es de: "+precioEntrada+"€ cada entrada");
				System.out.println("¿Cuántas entradas quiere?");
				numEntradas = Leer.datoInt();
				precioFin = numEntradas * precioEntrada;
				System.out.println("El precio total que debe pagar es de: "+precioFin+"€");
				break;
				
			default: 
				System.out.println("Por favor pulse uno de los números comentados anteriormente, gracias.");
				
		}
		
		System.out.println("Gracias por usar nuestro programa de entradas de cine");
		
	}

}
