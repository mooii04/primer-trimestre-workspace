package ejercicio06;

import java.util.Random;

public class Generadora {

	
	public int generarNum (int desde, int hasta) {
		
		int num=0;
		Random rnd= new Random (System.nanoTime());
		
		num = rnd.nextInt(hasta-desde+1)+desde;
		
		return num;
	}
	
	public int generarPrimitiva (int desde, int hasta) {
		
		int num=0;
			
		num = generarNum(desde, hasta);
		
		return num;
	}
		
	public boolean generarParImpar (int desde, int hasta) {
		
		int dos = 2, num1;
		boolean resultado;
		
		num1 = generarNum(desde, hasta);
		
		if (num1 %dos==0) {
			resultado=true;
		}
		else {
			resultado=false;
		}
		
		return resultado;
	}
		
	
	public void imprimirParImpar(boolean resultado){
		
		if (resultado==true) {
			System.out.println("El número es par");
		}
		
		else {
			System.out.println("El número es impar");
		}
		
	}
	
	public int generarQuiniela(int desde, int hasta) {
		
		int num=0;
		
		num = generarNum(desde, hasta);
		
		return num;
	}
	
	public void imprimirQuiniela(int num) {
		if (num==1) {
			System.out.println("El resultado para esta quiniela es: 1");
		}
		if (num==2) {
			System.out.println("El resultado para esta quiniela es: X");
		}
		if (num==3) {
			System.out.println("El resultado para esta quiniela es: 2");
		}
	}
	
	public int generarChinos (int desde, int hasta) {
		int num=0;
		
		num = generarNum(desde, hasta);
		
		return num;
	}
	
	public void imprimirChinos (int num) {
		if (num==1) {
			System.out.println("El resultado para esta quiniela es: "+num);
		}
		if (num==2) {
			System.out.println("El resultado para esta quiniela es: "+num);
		}
		if (num==3) {
			System.out.println("El resultado para esta quiniela es: "+num);
		}
	}
	
}
