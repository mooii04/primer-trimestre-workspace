package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Operaciones o= new Operaciones ();
		
		System.out.println("Diga número:");
		num = Leer.datoInt();
		
		System.out.println(o.mostrarResultado(num));
		
	}

}
