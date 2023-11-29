package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double precioPorTipo=0;
		double precioPorDias=0;
		double precioJuntoServicios=0;
		String precioServicio="";
		String nombreServicio="";
		double precioHab=50;
		String nombreCliente="";
		double numDiasEstancia=0;
		boolean limpia=false;
		int leerLimpia=0;
		String tipoHab="";
		boolean ocupada=false;
		int posicion=0;
		int contador=0;
		int leerOcupada=0;
		int serviciosExtras=0;	
		int tam, opcion;
		String nombreHotel = "Hotel Mauricio";
		
		Habitacion hab;
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
					
					
					System.out.println("Nombre del cliente");
					nombreCliente = Leer.dato();
					
					System.out.println("Elija posición para guardar los datos de la habitación");
					posicion = Leer.datoInt();
					
					System.out.println("Diga el tipo de habitación que quiere"
							+ "\n\nIndividual\t (50€)"
							+ "\n\nDoble\t\t (40€)"
							+ "\n\nFamiliar\t (80€)");
					tipoHab = Leer.dato();
					precioPorTipo = h.calcularPrecioTipo(tipoHab, precioHab);
					
					System.out.println("¿Cuántos días se va a quedar?");
					numDiasEstancia = Leer.datoInt();
					precioPorDias = h.calcularTotalDiasPrecio(precioPorTipo, numDiasEstancia, tipoHab);
					
					System.out.println("Puede elegir si quiere un servicio extra pero solo uno"
							+ "\nCada servicio tiene un precio"
							+ "\n(1) Mini-bar (30€)"
							+ "\n(2) Desayuno en habitación (20€)"
							+ "\n(3) Limpieza de habitación diaria (15€)"
							+ "\n(4) Ningún servicio");
					serviciosExtras = Leer.datoInt();
					
					precioJuntoServicios = h.calcularPrecioConServicio(precioPorDias, serviciosExtras);
					
					nombreServicio = h.ponerNombreServicio(nombreHotel, serviciosExtras);
					
					precioServicio = h.establecerPrecioServicio(nombreHotel, serviciosExtras);
			
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
					
					hab = new Habitacion (numDiasEstancia, nombreCliente, serviciosExtras, limpia, tipoHab, ocupada, serviciosExtras);
			
					h.add(hab, posicion);
					posicion++;
				break;
				
				case 2:
					System.out.println("Vamos a mostrarle la lista de las habitaciones, diga la posición de la habitación"
							+ "que quiere ver si está ocupada");
					h.add(new Habitacion(numDiasEstancia, nombreCliente, serviciosExtras, limpia, tipoHab, ocupada, posicion), contador);
					h.imprimirTodosLasHabitaciones();
					System.out.println("Ahora diga posición para comprobar");
					posicion = Leer.datoInt();
					h.comprobarOcupacion(leerOcupada, ocupada);
					h.mostrarOcupacion(ocupada, leerOcupada);
				break;
				
				case 3:
					h.imprimirTodosLasHabitaciones();
				break;
			
				case 4:
					h.mostrarFactura(nombreCliente, tipoHab, precioHab, serviciosExtras, nombreServicio, precioServicio, precioPorDias);
				break;
				
				default:
					System.out.println("Número no comentado anteriormente");
				break;
			}
			
			
		}while (opcion != 0);

	}
	
	private static void imprimirMenu() {
		System.out.println("\n");
		System.out.println("************************************");
		System.out.println("(1) Agregar una habitación");
		System.out.println("(2) Ver si está ocupada");
		System.out.println("(3) Mostrar lista de habitaciones");
		System.out.println("(4) Mostrar factura");
		System.out.println("************************************");

	}

}
