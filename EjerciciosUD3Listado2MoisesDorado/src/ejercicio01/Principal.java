package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tam;
		double precioFabrica=0;
		double precioCoste=0;
		double porcentajeTransporte=0;
		boolean fragil=true;
		double PVP=0;
		int opcion;
		int codigo;
		int contador=0;
		int leerFragil;
		double precioTotalFabrica=0;
		int opcionMiniCaso;
		String nombreProd= "Manolo";
		CrudProducto Crud;
		Producto[] listaCrud;
				
		System.out.println("Diga cuántos productos habrá");
		tam = Leer.datoInt();
		listaCrud = new Producto[tam];
		
		Tienda t = new Tienda (listaCrud);
		
		Crud = new CrudProducto(listaCrud);
		
		Producto prod = new Producto(precioFabrica, precioCoste, fragil, PVP, nombreProd);
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
				System.out.println("Diga código del producto");
				codigo = Leer.datoInt();
				System.out.println("Diga nombre del producto");
				nombreProd = Leer.dato();
				System.out.println("Diga el precio de fábrica");
				precioFabrica = Leer.datoDouble();
				precioTotalFabrica = t.calcularPrecioFabrica(precioFabrica, precioTotalFabrica);
				System.out.println("¿Es frágil el producto?");
				leerFragil = Leer.datoInt();
				fragil = prod.comprobarFragilidad(leerFragil);
				Crud.add(new Producto(precioFabrica, porcentajeTransporte, fragil, PVP, nombreProd), contador);
				contador++;
			break;
				
			case 3:
				System.out.printf("La suma de todos los productos por su Precio de Fábrica es de: €.2f",t.calcularPrecioFabrica(precioFabrica, precioTotalFabrica));
			break;
				
			case 4:
				System.out.println("Indique el porcentaje del PVP");
				PVP = Leer.datoDouble();
				System.out.println("¿Ha dicho ya en algún momento el porcentaje de Transporte o del PVP?"
						+ "\n(1) Si"
						+ "\n(2) No");
				opcionMiniCaso = Leer.datoInt();
				switch (opcionMiniCaso) {
					case 1:
						System.out.printf("El Precio de Venta al Público es de: %.2f", t.calcularPVP(precioCoste, PVP, precioFabrica, porcentajeTransporte));
					break;
						
					case 2:
						System.out.println("Indique el porcentaje de Transporte");
						porcentajeTransporte = Leer.datoDouble();
						System.out.printf("La ganancia de la Tienda del Precio del Coste menos "
								+ "del Precio de Fábrica es de: %.2f", t.calcularPVP(precioCoste, PVP, precioFabrica, porcentajeTransporte));
					break;
					
					default:
						System.out.println("Número no definido anteriormente");
					break;
				}
			break;
	
			case 5:
				System.out.println("¿Ha dicho ya en algún momento el porcentaje de Transporte?"
						+ "\n(1) Si"
						+ "\n(2) No");
				opcionMiniCaso = Leer.datoInt();
				switch (opcionMiniCaso) {
					case 1:
						System.out.printf("La ganancia de la Tienda del Precio del Coste menos "
								+ "del Precio de Fábrica es de: %.2f", t.calcularCosteMenosFabrica(precioCoste, precioFabrica, porcentajeTransporte));
					break;
						
					case 2:
						System.out.println("Indique el porcentaje de Transporte");
						porcentajeTransporte = Leer.datoDouble();
						System.out.printf("La ganancia de la Tienda del Precio del Coste menos "
								+ "del Precio de Fábrica es de: %.2f", t.calcularCosteMenosFabrica(precioCoste, precioFabrica, porcentajeTransporte));
					break;
					
					default:
						System.out.println("Número no definido anteriormente");
					break;
				}
			break;
			default:
				System.out.println("Número no definido anteriormente");
			break;
		}
		
		}while (opcion != 0);
		
	}

	private static void imprimirMenu() {
		System.out.println("\n\n");
		System.out.println("************************************");
		System.out.println("(1) Listar todos los productos");
		System.out.println("(2) Añadir producto");
		System.out.println("(3) Calcular el total del precio de fábrica de todos los productos");
		System.out.println("(4) Calcular el PVP");
		System.out.println("(5) Calcular todos los productos que se han vendido (menos su coste de fábrica)");
		System.out.println("(0) Salir");
		System.out.println("************************************");
	}

}
