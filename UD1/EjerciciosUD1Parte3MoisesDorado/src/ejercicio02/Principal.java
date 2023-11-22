package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float espacInic = 5.5f;
		float velocidadCons = 3.2f;
		float tiempo;
		float espacFin = 0.00f;
		
		System.out.println("Bienvenidos al programma de las madres y las zapatillas mortales");
		System.out.println("\n-----------------------------------------------------------------");
		
		System.out.println("\n¿Cuánto tiempo va a tardar la zapatilla en el aire?\nIndique el "
				+ "tiempo en ¡¡SEGUNDOS!!");
		System.out.println();
		
		tiempo = Leer.datoFloat();
		
		espacFin = espacInic + (velocidadCons * tiempo);
		
		System.out.printf("\nBien pues ya sabemos que la zapatilla con ese tiempo que usted ha elegido"
				+ " va recorrer una distacia de: \n%.2f metros", espacFin);
	}

}
