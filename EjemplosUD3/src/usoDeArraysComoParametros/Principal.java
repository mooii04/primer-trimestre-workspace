package usoDeArraysComoParametros;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] lista1;
		int desde, hasta;
		int tam;
		
		Listas l = new Listas ();
		
		
		System.out.println("Diga tamaño de la lista");
		tam = Leer.datoInt();
		
		lista1 = new int [tam];
		
		System.out.println("Diga desde");
		desde = Leer.datoInt();
		
		System.out.println("Diga hasta");
		hasta = Leer.datoInt();
		
		l.rellenarArrays(hasta, desde, lista1);
		
		l.mostrarArrays(lista1);
		System.out.println("");
		l.mostrarArrays(l.trucarLista(lista1));
	}

}
