package ejercicio07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float precioProducto = 0f;
		int cantidadProducto = 0;
		float descuento = 0f;
		float precioSinDescuento = 0f;
		float precioConDescuento = 0f;
		int cien = 100;
		
		System.out.println("Bienvenido, vamos a calcular el precio de la compra");
		
		System.out.println("¿Cuánto cuesta el producto?");
		precioProducto = Leer.datoFloat();
		
		System.out.println("¿Cuántos te llevas?");
		cantidadProducto=Leer.datoInt();
		
		System.out.println("¿Cuánto descuento hay? En %%.");
		descuento=Leer.datoFloat();
		
		precioSinDescuento=precioProducto*cantidadProducto;
		
		if (precioSinDescuento>100) {
			precioConDescuento=(precioSinDescuento)*(descuento/cien);
			System.out.printf("El precio total es de %.2f",precioConDescuento);
		}
		else {
			System.out.printf("El precio total es de %.2f euros",precioSinDescuento);
		}
		
		System.out.println("Gracias por usar nuestro programa");
		
	}

}
