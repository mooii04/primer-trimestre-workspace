package ejemplosswitch;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int opcion1;
		int opcion2;
		
		System.out.println("Buenas espero que no tenga que utilizar más este programa");
		
		System.out.println("Pulse 1 para buenos días");
		System.out.println("Pulse 2 para buenas tardes");
		System.out.println("Pulse 3 para buenas noches");
		
		opcion1 = Leer.datoInt();
		
		switch (opcion1) {
		
		
			case 1:
				System.out.println("Buenos días");
				System.out.println("Pulse 1 si quiere ser felicitado");
				System.out.println("Pulse 2 si quiere ser piropeado");
				System.out.println("Pulse 3 si quiere ser gratificado");
				opcion2 = Leer.datoInt();
					
				switch (opcion2) {
						
					case 1:
						System.out.println("Felicidades!!!");
						break;
					case 2:
						System.out.println("Guapo");
						break;
					case 3:
						System.out.println("Toma una carita feliz :)");
						break;
					default:
						System.out.println("Opción no válida, pulse unos de los número comentados anterioromente");
						
					}
				break;
				
			case 2:
				System.out.println("Buenas tardes");
				break;
				
			case 3:
				System.out.println("Buenas noches");
				break;	
				
			default:
				System.out.println("Opción no válida, pulse unos de los número comentados anterioromente");
		}
		
		System.out.println("Adiós, no vuelvas más");
		
	}

}
