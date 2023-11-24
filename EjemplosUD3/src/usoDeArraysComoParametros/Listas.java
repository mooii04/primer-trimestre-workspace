package usoDeArraysComoParametros;

import java.util.Random;

public class Listas {

	public void rellenarArrays (int hasta, int desde, int [] lista1) {
		
		Random r= new Random (System.nanoTime());
		
		for (int i = 0; i < lista1.length; i++) {
			
			lista1 [i]=r.nextInt(hasta-desde+1)+desde;
			
		}
		
	}
	
	public void mostrarArrays (int [] lista1) {
		
		for (int i = 0; i < lista1.length; i++) {
			System.out.print(" "+lista1[i]);
		}
		
	}
	
	
	/*
	 * Podría haber dos versiones, una pasando la lista
	 * también como parámetro y otra instanciando la
	 * lista dentro del método
	 */
	
	public int[] trucarLista (int [] lista1) {
		
		int diez=10;
		
		for (int i = 0; i < lista1.length; i++) {
			lista1[i]=diez;
		}
		
		return lista1;
	}
	
	
}
