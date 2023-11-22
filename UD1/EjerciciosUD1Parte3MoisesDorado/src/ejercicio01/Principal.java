package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float precioFin=0f;
		float porcGanancia=0f;
		float porcImpuestos=0f;
		float costeFabr=0f;
		float ganancia=0f;
		float impuestos=0f;
		int cien=100;
		
		System.out.println("Bienvenido, vamos a calcular cuanto costaría el vehículo");
		
		System.out.println("Indique su ganancia como vendedor en %:");
		porcGanancia = Leer.datoFloat();
		
		System.out.println("Indique el % de los impuestos estatales:");
		porcImpuestos = Leer.datoFloat();
		
		System.out.println("Por favor, indique el coste de fabricación:");
		costeFabr = Leer.datoFloat();
		
		ganancia = costeFabr * (porcGanancia / cien);
		
		System.out.printf("La ganancia suya como vendedor sería de: %.2f€", ganancia);
		
		impuestos = costeFabr * (porcImpuestos / cien);
		
		System.out.printf("\nLo que se llevaría el Estado por los impuestos sería de: %.2f€", impuestos);
		
		precioFin = costeFabr + (costeFabr * (porcGanancia / cien)) + (costeFabr * (porcImpuestos / cien));
		
		System.out.printf("\n\nLe tiene que comentar al vendedor que el precio se le quedaría en un total de: %.2f€", precioFin);
	
		System.out.println("\n\nGracias por usar nuestro programa :)");
		
		
	}

}
