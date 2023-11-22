package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int opcion, opcionCasos;
		int uno=1, num;
		int primitiva;
		int desde, hasta;
		boolean resultado;
		Generadora g;
		
		g = new Generadora ();
		
		System.out.println("Pulse 1. Realizar programa cuantas veces quiera");
		System.out.println("Cualquier otro número hará que lo haga una vez solo");
		opcion = Leer.datoInt();
		
		do {
			System.out.println("Pulse 1. Quiniela"
					+ "\nPulse 2. Par o impar"
					+ "\nPulse 3. 1, 2 o 3 los chinos"
					+ "\nPulse 4. La primitiva"
					+ "\nPulse 0. Finalizar programa");
			opcionCasos = Leer.datoInt();
			
			switch(opcionCasos) {
				case 1:
					
					
				break;
				
				case 2:	
					desde = 1;
					hasta = 100; 
					
					resultado = g.generarParImpar(desde, hasta);
					
					g.imprimirParImpar(resultado);
					
				break;
				
				case 3:
					desde = 1;
					hasta = 3;
					
					num=g.generarChinos(desde, hasta);
					
					g.imprimirChinos(num);
					
				break;
				
				case 4:
					desde = 1;
					hasta = 49;
					primitiva = 3;
					
					for (int i = 0; i < primitiva; i++) {
						
						System.out.println(g.generarPrimitiva(desde, hasta));
						
					}
				break;
				
				case 0:
					
					System.out.println("Programa finalizado");
					
				break;
				
				default:
					System.out.println("Inserte un número comentado amteriormente");
				break;

			}
			
		}while (opcion == uno);
		
		
	}

}
