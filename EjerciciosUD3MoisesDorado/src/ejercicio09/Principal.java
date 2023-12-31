package ejercicio09;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numPremiado=0;
		int numElegido=0;
		int numAleatorio=0;
		int opcion1, opcion2;
		Sorteo s = new Sorteo (numPremiado);
		
		do {
			System.out.println("""
					Pulse:
					(1) para comprar un décimo
					(2) para sortear la Lotería
					(3) para comprobar si has ganado
					(0) para salir
					""");
			opcion1=Leer.datoInt();
			switch (opcion1) {
				case 1:
					System.out.println("""
							Pulse
							(1) para elegir el número
							(2) para generarlo aleatoriamente
							""");
					opcion2=Leer.datoInt();
					
					switch (opcion2) {
					case 1:
						System.out.println("Introduce tu número");
						numElegido = Leer.datoInt();
						//Poner if por si es mayor que 999999
						numElegido = s.comprobarNumElegido(numElegido);
					break;
					
					case 2:
						numPremiado = s.sacarNumeroLoteria();
						System.out.println("Se le ha generado un número de Lotería --> "+numPremiado);
					break;
					}
				break;
				case 2:
					s.sacarNumeroLoteria();
				break;
				
				case 3:
					s.mostrarGanadorAleatorio(numAleatorio, numElegido);
				break;
				
				case 0:
					System.out.println("Gracias por cofiar en nosotros"
							+ "\nLoterías y Apuestas del Estado");
				break;
				default:
					System.out.println("Introduce un número correcto");
				break;
				
			}
		}while(opcion1!=0);
		
	}
}

