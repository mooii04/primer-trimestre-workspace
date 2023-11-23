package ejercicio10;

public class Maquina {

	private double precioUnitario;
	
	private double comprarTicket(double precioTickets, int numTickets) {
		
		if (numTickets>1) {
			precioTickets = precioUnitario * numTickets;
		} else {
			precioTickets = precioUnitario;
		}
		
		return precioUnitario;		
	}
	
	public double delvolverCambio (double dineroRecibido, double dineroDevuelto) {
		
			dineroDevuelto = dineroRecibido - precioUnitario;
		
		return dineroDevuelto;
	}
	
	public void imprimirBillete () {
		
		//IMPRIMIMOS EL BILLETE
		
	}
	
	
	
}
