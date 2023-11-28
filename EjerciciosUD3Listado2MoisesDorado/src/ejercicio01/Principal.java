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
		int opcion;
		CrudProducto Crud;
		Producto[] listaCrud;
		
		System.out.println("Diga cuántos productos habrá");
		tam = Leer.datoInt();
		listaCrud = new Producto[tam];
		
		Crud = new CrudProducto(listaCrud);
		
		do {
		imprimirMenu();
		opcion = Leer.datoInt();
		
		switch(opcion) {
			case 0:
				
			break;
			
			case 1:
				Crud.imprimirTodosLosProductos();
			break;
			
			case 2:
				
			break;
				
			case 3:
				
			break;
				
			case 4:
				
			break;
	
			case 5:
	
			break;
		}
		
		}while (opcion != 0);
		
	}

	private static void imprimirMenu() {
		System.out.println("\n\n");
		System.out.println("************************************");
		System.out.println("(1) Listar todos los productos");
		System.out.println("(2) Añadir producto");
		System.out.println("(3) Calcular todos los precios de fábrica");
		System.out.println("(4) Calcular el PVP");
		System.out.println("(5) Calcular todos los productos que se han vendido (menos su coste de fábrica)");
		System.out.println("(0) Salir");
		System.out.println("************************************");
	}

}
