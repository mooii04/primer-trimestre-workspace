package gestion;

import modelo.Producto;

public class GestionProductos {

	private Producto p;
	
	public GestionProductos(Producto p){
		this.p = p;		
	}
	
	public double calcularLinea (int cantidad) {
		
		double subTotal=0;
		subTotal=cantidad*p.getPrecioUnitario();
		
		return subTotal;
	}

	public double calcularConDescuento (double descuento, int tope, int cantidad) {
		
		double cien=100;
		if (cantidad >= tope) {
			return calcularLinea(cantidad)-calcularLinea(cantidad)*descuento/cien;
		} else {
			return calcularLinea(cantidad);
		}
	}
	
}
