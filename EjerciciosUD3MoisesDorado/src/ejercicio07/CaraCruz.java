package ejercicio07;

import java.util.Random;

public class CaraCruz {

	
	public int lanzarMoneda() {
		
		int desde=1, hasta=2;
		int num=0;
		Random rnd= new Random (System.nanoTime());
		
		num = rnd.nextInt(hasta-desde+1)+desde;
		
		return num;
		
	}
	
	public boolean comprobarGanador(int numElegido, int num) {
		
		boolean ganaPierde;
		
		if (num == numElegido) {
		 ganaPierde = true;
	}
	else {
		ganaPierde = false;
	}
		
	return ganaPierde;
	
	}
	
	public void enseñarGanador (int num, int numElegido) {
		
		boolean ganaPierde; 
		
		ganaPierde = comprobarGanador(numElegido, num);
		
		if (ganaPierde == true) {
			System.out.println("Enhorabuena ha ganado");
		}
		else {
			System.out.println("Ohhhhhh ha perdido");
		}
		
	}
}
