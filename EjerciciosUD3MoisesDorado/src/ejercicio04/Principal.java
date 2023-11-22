package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double altura;
		double radio;
		Cilindro c;
		
		System.out.println("Por favor todos lo datos que le vamos a pedir, que sean en cm");
		
		System.out.println("Diga altura del cilindro");
		altura = Leer.datoDouble();
		
		System.out.println("Diga radio del cilindro");
		radio = Leer.datoDouble();
		
		c = new Cilindro (altura, radio);
		
		System.out.println(c.calcularVolumen());
		
	}

}
