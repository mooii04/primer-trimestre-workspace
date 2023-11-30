package ejercicio03Bruno;
import ejercicio01.Producto;
/*
* Atributos:
* Lista de habitaciones
*/
public class Hotel {
	private Habitacion lista[];
	
	
	
	public Hotel(Habitacion[] lista) {
		this.lista = lista;
	}
	
	
	public Hotel() {
		
	}
	public double hacerPrecioPorTipo(double precioBase, String tipo) {
		if (tipo=="Simple") {
			precioBase=80;
		}
		if (tipo=="Doble") {
			precioBase=60;
		}
		if (tipo=="VIP") {
			precioBase=260;
		}
		if (tipo=="Suite") {
			precioBase=300;
		}
		return precioBase;
	}
	
	public double hacerPrecioPorDias(double precioPorTipo, int diasContratados) {
		return precioPorTipo*diasContratados;
	}
	
	public double hacerPrecioPorServicio(double precioPorDias, int serviciosExtra) {
		if(serviciosExtra==1) {
			precioPorDias=precioPorDias+20;
		}
		if(serviciosExtra==2) {
			precioPorDias=precioPorDias+15;
		}
		if(serviciosExtra==3) {
			precioPorDias=precioPorDias+30;
		}
		if(serviciosExtra==0) {
			
		}
		return precioPorDias;
	}
	
	public String establecerNombreServicio(String nombreServicio, int serviciosExtra) {
		if(serviciosExtra==1) {
			nombreServicio="Minibar";
		}
		if(serviciosExtra==2) {
			nombreServicio="Desayuno";
		}
		if(serviciosExtra==3) {
			nombreServicio="Minibar + Desayuno";
		}
		if(serviciosExtra==0) {
			nombreServicio="Ninguno";
		}
		return nombreServicio;
	}
	
	public String establecerPrecioServicio(String precioServicio, int serviciosExtra) {
		if(serviciosExtra==1) {
			precioServicio="20€";
		}
		if(serviciosExtra==2) {
			precioServicio="15€";
		}
		if(serviciosExtra==3) {
			precioServicio="30€";
		}
		if(serviciosExtra==0) {
			precioServicio="0€";
		}
		return precioServicio;
	}
	
	public boolean establecerLimpio(int leerLimpio) {
		if(leerLimpio==1) {
			return true;
		}
		if(leerLimpio==0) {
			return false;
		}
		else {
			return false;
		}
	}
	
	public boolean establecerOcupado(int leerOcupada) {
		if(leerOcupada==1) {
			return true;
		}
		if(leerOcupada==0) {
			return false;
		}
		else {
			return false;
		}
	}
	
	public void add(Habitacion hab, int posicion) {
		lista[posicion]=hab;
	}
	
	public void mostrarFactura(String nombreCliente, String tipo, double precioBase, int diasContratados, String nombreServicio, String precioServicio, double precioPorDias) {
		System.out.println("*********************************");
		System.out.println("Nombre del cliente: "+nombreCliente);
		System.out.println("Tipo de habitación: "+tipo+" ("+precioBase+"€)");
		System.out.println("Dias contratados: "+diasContratados);
		System.out.println("Servicios extra contratados: "+nombreServicio+"("+precioServicio+")");
		System.out.println("-----------------------------------------");
		System.out.println("Precio final: "+precioPorDias);
		
	}
	
	public void imprimirTodosLosProductos () {
		for(int i=0; i<lista.length;i++) {
			System.out.println((i)+". "+lista[i]);
		}
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
public void mostrarOcupacion (boolean ocupada) {
	if (ocupada) {
		System.out.println("La habitación está ocupada, tiene que elegir otra");
	}
	else {
		System.out.println("No está ocupada puede cogerla");
	}
}
	public boolean comprobarOcupado (Habitacion hab) {
		boolean result;
		
		if(hab.isOcupada()) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}
	public void imprimirOcupado(Habitacion hab) {
		if(hab.isOcupada()) {
			System.out.println("La habitación está ocupada");
		}
		else {
			System.out.println("Está libre");
		}
	}
	
	
}
