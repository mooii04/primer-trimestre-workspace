package ejercicio10;

public class Maquina {

	private double precioUnitario;
	/*
	 * private String contrasenia;
	 * private double saldoTotal;
	 * private Ticket t;
	 */
	
	public Maquina(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
	private double comprarTicket(double precioTickets, int numPersonas) {
		
			precioTickets = precioUnitario * numPersonas;
		
		return precioTickets;		
	}

	public double delvolverCambio (double dineroRecibido, double dineroDevuelto) {
		
			dineroDevuelto = dineroRecibido - precioUnitario;
		
		return dineroDevuelto;
	}
	
	public void imprimirBillete () {
		
		//IMPRIMIMOS EL BILLETE
		
	}
	
	
	
}
