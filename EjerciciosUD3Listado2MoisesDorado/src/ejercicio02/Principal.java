package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double precioHab=50;
		String nombreCliente;
		double numDiasEstancia;
		boolean limpia=false;
		int leerLimpia;
		String tipoHab;
		boolean ocupada=false;
		int leerOcupada;
		int serviciosExtras;	
		int tam, opcion;
		String nombreHotel = "Hotel Mauricio";
		
		Hotel h;
		Habitacion[] lista;
		
		System.out.println("Bienvenido a "+nombreHotel);
		
		System.out.println("¿Cuántas habitaciones hay en el hotel?");
		tam = Leer.datoInt();
		lista = new Habitacion [tam];
		
		h = new Hotel(lista);
		
		do {
			imprimirMenu();
			opcion = Leer.datoInt();
			
			switch (opcion) {
			
				case 1:
					System.out.println("Diga el tipo de habitación que quiere"
							+ "\n\nIndividual\t (50€)"
							+ "\n\nDoble\t (40€)"
							+ "\n\nFamiliar\t (80€)");
					tipoHab = Leer.dato();
					precioHab = h.calcularPrecioHabitacion(tipoHab, precioHab);
					
					System.out.println("Diga su nombre");
					nombreCliente = Leer.dato();
					
					System.out.println("¿Cuántos días se va a quedar?");
					numDiasEstancia = Leer.datoInt();
					
					precioHab = h.calcularTotalDiasPrecio(precioHab, numDiasEstancia, tipoHab);
					
					System.out.println("¿La habitación se encuentra limpia?"
							+ "\n(1) Limpia"
							+ "\n(2) Sucia");
					leerLimpia = Leer.datoInt();
					limpia = h.comprobarLimpieza(leerLimpia, limpia);
					
					System.out.println("¿La habitación se encuentra ocupada?"
							+ "\n(1) Ocupada"
							+ "\n(2) Vacía");
					leerOcupada = Leer.datoInt();
					ocupada = h.comprobarOcupacion(leerOcupada, ocupada);
					
					System.out.println("Puede elegir si quiere un servicio extra pero solo uno"
							+ "\nTodos los servicios extras tienen un precio de 20€"
							+ "\n(1) Mini-bar"
							+ "\n(2) Desayuno en habitación"
							+ "\n(3) Limpieza de habitación diaria"
							+ "\n(4) Ningún servicio");
					serviciosExtras = Leer.datoInt();
										
				break;
				
				case 2:
					
				break;
				
				case 3:
					
				break;
			
			}
			
			
		}while (opcion != 0);

	}
	
	private static void imprimirMenu() {
		System.out.println("\n\n");
		System.out.println("************************************");
		System.out.println("(1) Agregar una habitación");
		System.out.println("(2) Ver si está ocupada");
		System.out.println("(3) Calcular precio final");
		System.out.println("(4) Mostrar factura");
		System.out.println("************************************");

	}

}
