package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam;
		int lista[];
		double precioFabrica;
		double precioCoste;
		double porcentajeTransporte;
		boolean fragil;
		double PVP;
		Producto p = new Producto (PVP, porcentajeTransporte, precioCoste, fragil, precioFabrica);
		
		Tienda t = new Tienda (lista[]);
		
		System.out.println("Diga cuantos productos tiene");
		tam = Leer.datoInt();
		
		System.out.println("Diga precio de fábrica");
		precioFabrica = Leer.datoDouble();
		
		System.out.println("Diga precio de Coste");
		precioCoste = Leer.datoDouble(); 
		
		System.out.println("Diga porcentaje de transporte");
		porcentajeTransporte = Leer.datoDouble();
		
		
		
	}

}
