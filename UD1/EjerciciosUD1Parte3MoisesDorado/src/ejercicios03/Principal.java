package ejercicios03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dependiente;
		String fecha;
		float patatasMed;
		float bebidMed;
		float hamburguesaMCRoyal;
		float total = 0.00f;
		float entregado;
		float cambio = 0.00f;
		int cantidad = 1;
		
		System.out.println("Bienvenido a MC Donalds, para continuar inserte su nombre:");
		
		dependiente = Leer.dato();
		
		System.out.println("***************************************************************");
		
		System.out.println("Para saber si hay alguna oferta del día, inserte que día es hoy:");
		fecha = Leer.dato();
		
		System.out.println("***************************************************************");
		
		System.out.println("Indique el precio de las patatas medianas:");
		patatasMed = Leer.datoFloat();
		
		System.out.println("Indique el precio de la bebida mediana:");
		bebidMed = Leer.datoFloat();
		
		System.out.println("Indique el precio de la MC Royal");
		hamburguesaMCRoyal = Leer.datoFloat();
		
		System.out.println("****************************************************************");
		
		total = patatasMed + bebidMed + hamburguesaMCRoyal;
		
		System.out.printf("Comentale al cliente que el total del pedido es de: %.2f€", total);
		
		System.out.println("\n\n¿Cuánto le ha entregado para pagar?");
		entregado = Leer.datoFloat();
		
		cambio = entregado - total;
		
		System.out.println("El ticket se está imprimiendo");
		
		System.out.printf("Le tiene que devolver al cliente la cantidad de: %.2f€", cambio);
		
		System.out.println("\n\n\t\t\tRestaurante Mc Donald\t\t");
		System.out.println("***********************************************************************");
		System.out.println("Persona que le atendió:\t\t\t\t\t"+dependiente);
		System.out.println("Día del pedido:\t\t\t\t\t\t"+fecha);
		System.out.println("***********************************************************************");
		System.out.println("Producto\t\t\tCantidad\t\tPrecio");
		System.out.println("Bebida Med\t\t\t"+cantidad+"\t\t\t"+bebidMed+"€");
		System.out.println("Patatas Med\t\t\t"+cantidad+"\t\t\t"+patatasMed+"€");
		System.out.println("Mc Royal\t\t\t"+cantidad+"\t\t\t"+hamburguesaMCRoyal+"€");
		System.out.println("\nTOTAL:\t\t\t\t\t\t\t"+total+"€");
		System.out.println("\nENTREGADO:\t\t\t\t\t\t"+entregado+"€");
		System.out.println("\nCAMBIO:\t\t\t\t\t\t\t"+cambio+"€");
		
		
		
		
	}

}
