package ejemplomenucompleto;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int cero= 0;
		int opcion;
		
		System.out.println("Refranero semanal");
		
		do {
			
		System.out.println("0. Para Salir");
		System.out.println("1. Lunes");
		System.out.println("2. Martes");
		System.out.println("3. Miércoles");
		System.out.println("4. Jueves");
		System.out.println("5. Viernes");
		System.out.println("6. Sábado");
		System.out.println("7. Domingo");
			
		System.out.println("Pulse uno de los número que te hemos mostrado");
		opcion = Leer.datoInt();
		
		switch (opcion) {
		 
			case 0:
				System.out.println("Hasta luego lucarrr");
				break;
				
			case 1:
				System.out.println("Lunes a mediodía, alegría");
				break;
			
			case 2:
				System.out.println("Martes, ni te cases ni...");
				break;
			
			case 3:
				System.out.println("Miércoles, ufff medua semana");
				break;
			
			case 4:
				System.out.println("Jueves, ehhh qué");
				break;
			
			case 5:
				System.out.println("Viernes, ¿cómo? ¿ya?");
				break;
			
			case 6:
				System.out.println("Sábado, oeeeee");
				break;
			
			case 7:
				System.out.println("Domingo, ¿cómo? ¿ya?");
				break;
			
			default:
				System.out.println("Opción no válida");
				break;
		}
		
			
		} while (opcion != cero); 
			
		
	}

}
