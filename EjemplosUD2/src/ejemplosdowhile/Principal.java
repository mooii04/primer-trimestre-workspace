package ejemplosdowhile;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num = 0, tope;
		int cero = 0;
		
		
		System.out.println("Diga tope");
		tope = Leer.datoInt();
		
		
		do {
					
			System.out.println(tope);
			tope = Leer.datoInt();
			
		}while (num < tope);
		
		do {
		
			System.out.println("Diga un número, cero para acabar");
			num = Leer.datoInt();
			System.out.println(num);
			
		}while (num != cero);
			
		
		
	}

}
