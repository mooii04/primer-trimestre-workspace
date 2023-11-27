package ejemploArraysObjetos;

import java.util.Arrays;

public class Concesionario {

	//Atributos
	private Concesionario [] lista;
	private int nVs;
	private double potencia;
	private String modelo;

	public Concesionario(Concesionario[] lista, int nVs, double potencia, String modelo) {
		this.lista = lista;
		this.nVs = nVs;
		this.potencia = potencia;
		this.modelo = modelo;
	}

	public Concesionario[] getLista() {
		return lista;
	}

	public void setLista(Concesionario[] lista) {
		this.lista = lista;
	}

	public int getnVs() {
		return nVs;
	}

	public void setnVs(int nVs) {
		this.nVs = nVs;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Concesionario [lista=" + Arrays.toString(lista) + ", nVs=" + nVs + ", potencia=" + potencia
				+ ", modelo=" + modelo + "]";
	}

	public void agregar (Vehiculo v) {
		
		lista[nVs]=v;
		
		nVs++;
		
	}
	
	public void mostrarEmpepinados (int topePotencia) {
		
		for(int i=0; i < nVs; i++) {
			if(lista[i].getPotencia()>=topePotencia) {
				System.out.println(lista[i].getModelo());
			}
		}
	}
	
}