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
	
	public void imprimirTodosLasHabitaciones () {
		for(int i=0; i<lista.length;i++) {
			System.out.println((i+1)+". "+lista[i]);
		}
	}
	
	public double calcularPrecioTipo (String tipoHab, double precioHab) {
		
		if (tipoHab == "Individual") {
			precioHab = 50;
		}
		if (tipoHab == "Doble") {
			precioHab = 40;
		}
		if (tipoHab == "Familiar") {
			precioHab = 80;
		}
		return precioHab;
	}
	
	public double calcularTotalDiasPrecio (double precioPorTipo, double numDiasEstancia, String tipoHab) {
		
		return precioPorTipo*numDiasEstancia;
		
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
	
	public void mostrarOcupacion (boolean ocupada, int leerOcupada) {
		ocupada = comprobarOcupacion(leerOcupada, ocupada);
		if (ocupada = true) {
			System.out.println("La habitación está ocupada, tiene que elegir otra");
		}
		else {
			System.out.println("No está ocupada puede cogerla");
		}
	}
	
	public double calcularPrecioConServicio(double precioPorDias, int serviciosExtra) {
		if(serviciosExtra == 1) {
			precioPorDias = precioPorDias+20;
		}
		if(serviciosExtra == 2) {
			precioPorDias = precioPorDias+15;
		}
		if(serviciosExtra == 3) {
			precioPorDias = precioPorDias+30;
		}
		if(serviciosExtra == 0) {	
		}
		return precioPorDias;
	}
	
	public String ponerNombreServicio(String nombreServicio, int serviciosExtra) {
		if(serviciosExtra==1) {
			nombreServicio="Minibar";
		}
		if(serviciosExtra==2) {
			nombreServicio="Desayuno";
		}
		if(serviciosExtra==3) {
			nombreServicio="Limpieza";
		}
		if(serviciosExtra==0) {
			nombreServicio="Ninguno";
		}
		return nombreServicio;
	}
	
	public String establecerPrecioServicio(String precioServicio, int serviciosExtra) {
		if(serviciosExtra==1) {
			precioServicio="30€";
		}
		if(serviciosExtra==2) {
			precioServicio="20€";
		}
		if(serviciosExtra==3) {
			precioServicio="15€";
		}
		if(serviciosExtra==0) {
			precioServicio="0€";
		}
		return precioServicio;
	}
	
	public void mostrarFactura(String nombreCliente, String tipoHab, double precioHab, int numDiasEstancia, String nombreServicio, String precioServicio, double precioPorDias) {
		System.out.println("*********************************");
		System.out.println("Nombre del cliente: "+nombreCliente);
		System.out.println("Tipo de habitación: "+tipoHab+" ("+precioHab+"€)");
		System.out.println("Dias contratados: "+numDiasEstancia);
		System.out.println("Servicios extra contratados: "+nombreServicio+"("+precioServicio+")");
		System.out.println("-----------------------------------------");
		System.out.println("Precio final: "+precioPorDias);
		
}
	
}
