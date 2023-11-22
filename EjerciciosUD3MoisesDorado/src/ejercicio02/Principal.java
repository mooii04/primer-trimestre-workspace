package ejercicio02;

import utilidades.Leer;

public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radio;
		double areaM=0.0;
		double areaCM=0.0;
		Círculo c;
		
		System.out.println("Bienvenido, vamos a calcular el radio de un círculo");
		
		System.out.println("Diga el radio");
		radio=Leer.datoDouble();
		
		c = new Círculo (radio);
		
		areaM = c.calcularArea();
		
		System.out.printf("El área es de %.2f cm cuadrados", areaM);
		
		areaCM = c.pasarMetros2();
		
		System.out.println("");
		System.out.printf("El área en metros cuadrados es de %.2f", areaCM);
	}
}