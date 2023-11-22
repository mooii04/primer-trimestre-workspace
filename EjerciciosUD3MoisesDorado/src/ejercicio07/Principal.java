package ejercicio07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num;
		int numElegido;
		CaraCruz cc = new CaraCruz();
		
		System.out.println("Elige Cara (1) o Cruz (2)");
		numElegido = Leer.datoInt();
		
		num = cc.lanzarMoneda();
		cc.comprobarGanador(num, numElegido);
		cc.enseñarGanador(numElegido, num);
		
	}

}
