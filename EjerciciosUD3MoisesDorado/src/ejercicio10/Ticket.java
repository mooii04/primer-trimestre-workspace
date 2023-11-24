package ejercicio10;

public class Ticket {

	//Poner como atributo el número de personas
	//private int numPersonas;
	private double precioUnitario;
	
	/*
	 * ES PREFERIBLE NO HACER ESTO A MENOS QUE TE DUGAN LO CONTRARIO
	 * Podemos llegar a poner algunos métodos aquí como:
	 * - imprimirBillete
	 */
	
	public Ticket(double precioUnitario) {
		super();
		this.precioUnitario = precioUnitario;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	@Override
	public String toString() {
		return "Ticket [precioUnitario=" + precioUnitario + "]";
	}
	
}
