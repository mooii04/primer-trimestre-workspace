package ejercicio16;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		float salarioSemanal;
		int horas;
		int cuarenta=40;
		int precioHora=16, precioExtra=20;
		int opcion;
		
		System.out.println("Bienvenido al programa");
		
		System.out.println("Para empezar necesitamos saber cuantas horas ha trabajado");
		horas = Leer.datoInt();
		

		do {
			
			System.out.println("Pulse 1. Saber dinero semanal");
			System.out.println("Pulse 0. Finalizar programa");
			opcion = Leer.datoInt();
			
			switch (opcion) {
		
				case 1:
		
					if (horas <= cuarenta){
						salarioSemanal = horas * precioHora;
						System.out.printf("Ha ganado en esta semana la cantidad de: %.2f€\n", salarioSemanal);
				
					}else {
						horas = horas - cuarenta;
						salarioSemanal = (horas * precioExtra) + (cuarenta * precioHora);
						System.out.printf("Ha ganado en esta semana la cantidad de: %.2f\n", salarioSemanal);
					}
					break;
			
				case 0:
					System.out.println("Programa finalizado");
				break;
			
				default:
					System.out.println("Introduzca uno de los números comentados anteriormente");
					break;
			}
		}while (opcion != 0);
			
		System.out.println("Gracias, vuelva pronto");
		
	}

}
