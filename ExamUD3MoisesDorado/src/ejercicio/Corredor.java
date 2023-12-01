package ejercicio;

public class Corredor {

	private String nombre;
	private String apellidos;
	private int dorsal;
	private int numCategoria;
	private double tiempoEnTerminar;
	
	public Corredor(String nombre, String apellidos, int dorsal, int numCategoria, double tiempoEnTerminar) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dorsal = dorsal;
		this.numCategoria = numCategoria;
		this.tiempoEnTerminar = tiempoEnTerminar;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getNumCategoria() {
		return numCategoria;
	}

	public void setNumCategoria(int numCategoria) {
		this.numCategoria = numCategoria;
	}

	public double getTiempoEnTerminar() {
		return tiempoEnTerminar;
	}

	public void setTiempoEnTerminar(double tiempoEnTerminar) {
		this.tiempoEnTerminar = tiempoEnTerminar;
	}

	@Override
	public String toString() {
		return "Corredor [nombre=" + nombre + ", apellidos=" + apellidos + ", dorsal=" + dorsal + ", numCategoria="
				+ numCategoria + ", tiempoEnTerminar=" + tiempoEnTerminar + "]";
	}
	
	
	public double calcularTiempoEnSegundos (int sesenta) {
		sesenta = 60;
		
		return tiempoEnTerminar * sesenta;
	}
	
	public double calcularMediaMinutosKilometros(double kilometrosCarrera) {
		return tiempoEnTerminar / kilometrosCarrera;
	}
	
}
