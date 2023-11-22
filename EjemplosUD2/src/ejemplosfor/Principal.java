package ejemplosfor;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int tope;
		String palabra;
		
		System.out.println("¿Qué palabra quiere repetir?");
		palabra = Leer.dato();
		
		System.out.println("¿Cuántas veces la quiere repetir?");
		tope = Leer.datoInt();
		
		for (int i=0; i < tope ; i++ ) {
			
			System.out.println(palabra);
			
		}
		
		
		
	}

}
