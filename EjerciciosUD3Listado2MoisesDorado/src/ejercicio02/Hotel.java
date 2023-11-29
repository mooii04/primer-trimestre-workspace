package ejercicio02;

import java.util.Arrays;

public class Hotel {

	private Habitacion [] lista;

	public Hotel(Habitacion[] lista) {
		this.lista = lista;
	}

	public Habitacion[] getLista() {
		return lista;
	}

	public void setLista(Habitacion[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Hotel [lista=" + Arrays.toString(lista) + "]";
	}
	
	public void add(Habitacion hab, int posicion) {
		lista[posicion]=hab;
	}
	
	public double calcularPrecioHabitacion (String tipoHab, double precioHab) {
		
		if (tipoHab == "Individual") {
		}
		if (tipoHab == "Doble") {
			precioHab = 40;
		}
		if (tipoHab == "Familiar") {
			precioHab = 80;
		}
		return precioHab;
	}
	
	public double calcularTotalDiasPrecio (double precioHab, double numDiasEstancia, String tipoHab) {
		
		precioHab = calcularPrecioHabitacion(tipoHab, precioHab);
		
		return precioHab*numDiasEstancia;
		
	}
	
	public boolean comprobarLimpieza (int leerLimpia, boolean limpia) {
		
		if (leerLimpia == 1) {
			limpia = true;
		}
		else {
			limpia = false;
		}
		return limpia;
	}
	
	public boolean comprobarOcupacion (int leerOcupada, boolean ocupada) {
		
		if (leerOcupada == 1) {
			ocupada = true;
		}
		else {
			ocupada = false;
		}
		return ocupada;
	}
	
	public String verServiciosExtras (int serviciosExtras, double precioHab, String tipoExtra) {
		if (serviciosExtras == 1) {
			
		}
		return tipoExtra;
	}
}
