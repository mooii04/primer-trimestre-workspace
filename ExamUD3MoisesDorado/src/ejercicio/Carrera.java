package ejercicio;

import java.util.Arrays;

public class Carrera {

	private Corredor [] lista;
	private double kilometrosCarrera;
	
	public Carrera(Corredor[] lista, double kilometrosCarrera) {
		this.lista = lista;
		this.kilometrosCarrera = kilometrosCarrera;
	}

	public Corredor[] getLista() {
		return lista;
	}

	public void setLista(Corredor[] lista) {
		this.lista = lista;
	}

	public double getKilometrosCarrera() {
		return kilometrosCarrera;
	}

	public void setKilometrosCarrera(double kilometrosCarrera) {
		this.kilometrosCarrera = kilometrosCarrera;
	}

	@Override
	public String toString() {
		return "Carrera [lista=" + Arrays.toString(lista) + ", kilometrosCarrera=" + kilometrosCarrera + "]";
	}
	
	public void add (Corredor c, int posicion) {
		lista[posicion]=c;
	}
	
	public void imprimirCorredores () {
		for (int i=0; i < lista.length; i++) {
			System.out.println((i+1)+". "+lista[i]);
		}
	}
	
	public void imprimirVeteranos() {
		for (int i=0; i < lista.length && lista[i].getNumCategoria()==3; i++) {
			if (lista[i].getNumCategoria() == 3) {
				System.out.println((i+1)+". "+lista[i]);
			}
		}
	}
	
	public void imprimirPorDorsal (int dorsal) {
		for (int i=0; i < lista.length && lista[i].getDorsal()==dorsal; i++) {
			if (lista[i].getDorsal() == dorsal) {
				System.out.println((i+1)+". "+lista[i]);
			}
			else {
				System.out.println("No coincide el dorsal");
			}
		}
	} 

	public double calcularTiempoTotalJuveniles(double tiempoEnTerminar, double tiempoTotalJuvenil) {
		for (int i=0; i < lista.length && lista[i].getNumCategoria()==1; i++) {
			if (lista[i].getNumCategoria() == 1) {
				tiempoTotalJuvenil = tiempoEnTerminar;
			}
		}
		return tiempoTotalJuvenil;
	}
}
