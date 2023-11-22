package ejercicio05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase;
		int num;
		
		System.out.println("Buenas inserte la frase que quiere decir");
		frase = Leer.dato();
		
		System.out.println("Ahora inserte el número de veces a repetir");
		num = Leer.datoInt()-1;
		
		Copiado c = new Copiado (frase, num);
		
		System.out.println(c.repetirFrase());
	}

}
