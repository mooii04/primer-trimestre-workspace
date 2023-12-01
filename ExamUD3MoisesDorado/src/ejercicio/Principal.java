package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcionWhile;
		int tam;
		int posicion=0;
		
		String nombre="";
		String apellidos="";
		int dorsal=0;
		int numCategoria=0;
		double tiempoEnTerminar=0.00;
		double kilometrosCarrera=0.00;
	
		Corredor c;
		Carrera car;
		Corredor [] lista;
		
		System.out.println("Bienvenido al programa");
		
		System.out.println("¿Cuántos corredor hay en la carrera?");
		tam = Leer.datoInt();
		
		c = new Corredor (nombre, apellidos, dorsal, numCategoria, tiempoEnTerminar);
		
		lista = new Corredor [tam];
		
		car = new Carrera (lista, kilometrosCarrera);
		
		do {
			imprimirMenu();
			opcionWhile = Leer.datoInt();
			
			switch (opcionWhile) {
				case 1:
					System.out.println("¿Cómo se llama el corredor?");
					nombre = Leer.dato();
					
					System.out.println("¿Cuáles son los apellidos?");
					apellidos = Leer.dato();
					
					System.out.println("¿Qué dorsal tiene?");
					dorsal = Leer.datoInt();
					
					System.out.println("¿Qué categoria es?"
							+ "\n(1) Juvenil"
							+ "\n(2) Senior"
							+ "\n(3) Veterano");
					numCategoria = Leer.datoInt();
					
					System.out.println("¿Cuánto tiempo ha tardado en terminar (minutos)?");
					tiempoEnTerminar = Leer.datoDouble();
					
					car.add(new Corredor (nombre, apellidos, dorsal, numCategoria, tiempoEnTerminar), posicion);
					posicion++;
					
				break;
				
				case 2:
					System.out.println("¿Qué posición quiere ver para calcular su tiempo en segundos?");
					car.imprimirCorredores();
					System.out.println("Diga posición");
					posicion = Leer.datoInt()-1;
					
					c.calcularTiempoEnSegundos(posicion);
				break;
				
				case 3:
					System.out.println("Vamos a mostrarle los corredores veteranos");
					car.imprimirVeteranos();
				break;
			
				case 4:
					System.out.println("¿Qué corredor quiere cambiarle el tiempo?");
					car.imprimirCorredores();
					
					System.out.println("Diga el numero del dorsal de la persona que desea cambiar");
					dorsal = Leer.datoInt();
					
					System.out.println("Diga el tiempo nuevo a cambiar del corredor");
					tiempoEnTerminar = Leer.datoDouble();
					
					car.imprimirPorDorsal(dorsal);
				break;
				
				case 5:
					System.out.println("¿Qué corredor quiere saber su media de tiempo por kilómetros?");
					car.imprimirCorredores();
					
					System.out.println("Diga el numero del dorsal de la persona que quiere calcular");
					dorsal = Leer.datoInt();
					
					System.out.println("¿Cuántos kilómetros ha hecho?");
					kilometrosCarrera = Leer.datoDouble();
					
					kilometrosCarrera = c.calcularMediaMinutosKilometros(kilometrosCarrera);
					
					System.out.println(c.calcularMediaMinutosKilometros(kilometrosCarrera));
				break;
				
				case 6:
					System.out.println("Diga el numero del dorsal de la categoría juvenil");
					dorsal = Leer.datoInt();
					
					System.out.println(car.calcularTiempoTotalJuveniles(tiempoEnTerminar, dorsal));
				break;
				
				case 7:
					System.out.println("¿Qué corredor ha corrido menos?");
					car.imprimirCorredores();
					
					System.out.println("Diga el numero del dorsal de la persona que haya corrido menos");
					dorsal = Leer.datoInt();
					
					car.imprimirPorDorsal(dorsal);
				break;
				
				case 0:
					System.out.println("Hasta pronto");
				break;
				
				default:
					System.out.println("Diga un número comentado anteriormente");
				break;
			}
			
		}while (opcionWhile != 0);
		
	}

	public static void imprimirMenu() {
		System.out.println("Indicaciones del programa:");
		System.out.println("(1) Agregar un nuevo corredor");
		System.out.println("(2) Calcular el tiempo en segundos");
		System.out.println("(3) Buscar y mostrar la categoría veterana");
		System.out.println("(4) Modificar tiempo de un corredor");
		System.out.println("(5) Calcular media de tiempo en minutos por kilómetro");
		System.out.println("(6) Calcular tiempo total de la categoría juvenil");
		System.out.println("(7) Buscar corredor que menos ha tardado");
	}
	
}
