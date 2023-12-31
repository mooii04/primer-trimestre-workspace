package ejercicio09;

import java.util.Random;

public class Sorteo {

	//Cambiar numLoteria a numPremiado
	private int numPremiado;

	public Sorteo(int numLoteria) {
		this.numPremiado = numLoteria;
	}

	public int getNumLoteria() {
		return numPremiado;
	}

	public void setNumLoteria(int numLoteria) {
		this.numPremiado = numLoteria;
	}

	@Override
	public String toString() {
		return "Sorteo [numLoteria=" + numPremiado + "]";
	}
	
	public int sacarNumeroAleatorio() {
		
		//el desde y el hasta ponerlo como parámetro
		int desde=000001, hasta=999999;
		Random rnd= new Random (System.nanoTime());
		
		return rnd.nextInt(hasta-desde+1)+desde;
	}
	
	public int sacarNumeroLoteria() {
		int desde=000001, hasta=999999;
		Random rnd= new Random (System.nanoTime());
		
		numPremiado = rnd.nextInt(hasta-desde+1)+desde;
		return numPremiado;
	}
	
	public int comprobarNumElegido (int numElegido) {
		if (numElegido <= 999999) {
		}else {
			//no se imprime en el método de calcular ni inventadonos otro método
			/*
			 * Si no lo hacemos con el if en el main, lo hacemos
			 * poniendo un boolean, con el return boolean
			 * y crear un método void usando el boolean
			 */
			comentarMal();
		}
		return numElegido;
	}
	
	public void comentarMal () {
		System.out.println("Ese número no es válido");
	}
	
	public boolean comprobarGanador (int numAleatorio, int numElegido) {
		boolean factor;
		numAleatorio = sacarNumeroAleatorio();
		numElegido = comprobarNumElegido(numElegido);
		
		if (numPremiado == numAleatorio || numPremiado == numElegido) {
			factor = true;
		} else {
			factor = false;
		}
			
		return factor; 
	}
	
	public void mostrarGanadorAleatorio (int numAleatorio, int numElegido) {
		boolean factor = comprobarGanador(numAleatorio, numElegido);	
		comprobarGanador(numAleatorio, numElegido);
		
		if (factor == true) {
			System.out.println("Enhorabuena ha ganado el premio, recuerda Hacienda se lleva la mitad ;)");
		} else {
			System.out.println("Mala suerte, no se preocupe nos quedamos con su dinero y el año que viene lo intentará otra vez ;)");
			System.out.println("El número premiado es el: "+numPremiado);
		}
			
	}
	
	
}
