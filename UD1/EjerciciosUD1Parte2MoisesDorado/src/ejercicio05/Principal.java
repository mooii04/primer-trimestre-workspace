package ejercicio05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double saldoIn;
		double intereses = 3;		
		double mantenimiento = 1;
		int num = 100;
		double saldoFin;
		
		System.out.println("Bienvenido al programa que te calcula tu saldo final en el banco :)");
		
		System.out.println("Indique su sueldo actual:");
		
		saldoIn = Leer.datoDouble();
		
		saldoFin = (saldoIn) - (mantenimiento / num) + (intereses / num);
		
		System.out.printf("Su saldo final quitando el mantenimineto y los intereses se queda en: %.2f", saldoFin);
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
