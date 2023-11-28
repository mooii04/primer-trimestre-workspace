package ejercicio01;

import java.util.Arrays;

public class Tienda {

	private Producto lista[];

	public Tienda(Producto[] lista) {
		this.lista = lista;
	}

	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Tienda [lista=" + Arrays.toString(lista) + "]";
	}	
	
		
	public double calcularPVP (double precioCoste, double PVP, double precioFabrica, double porcentajeTransporte) {
		precioCoste = precioFabrica + precioFabrica*porcentajeTransporte;
		return precioCoste + precioCoste*PVP;
	}
	
	public double calcularCosteMenosFabrica (double precioCoste, double precioFabrica, double porcentajeTransporte) {
		precioCoste = precioFabrica + precioFabrica*porcentajeTransporte;
		return precioCoste;
	}
	
	public double calcularPrecioFabrica (double precioFabrica, double precioTotalFabrica) {
		precioTotalFabrica += precioFabrica;
		return precioTotalFabrica;
	}
	
}
