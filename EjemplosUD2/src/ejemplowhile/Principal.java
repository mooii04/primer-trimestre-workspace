package ejemplowhile;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1, tope;
		
		System.out.println("Elija un tope para terminar de contar en ese número");
		tope = Leer.datoInt();
		
		
		while(num <= tope) {
			System.out.println(tope);
			tope = Leer.datoInt();
		}
				
	}

}
