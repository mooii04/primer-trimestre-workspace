package ejemploArrays;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam = 4;
		int edadLeida;
		int pos;
		
		//Primera forma
		int [] edades;
		edades = new int [tam]; 
		
		
		//Segunda forma
		int [] edades2 = new int [tam];
		
		
		//Tercera forma, inicializando con valores
		int [] edades3 = {20, 18, 21};
		
		
		//Guardar valores
		edades [2]= 47;
		System.out.println(edades[2]);
		
		//Usuario
		System.out.println("Diga usted su edad");
		edadLeida = Leer.datoInt();
				
		System.out.println("Diga en que posición quiere guardarlo");
		pos = Leer.datoInt() -1;	//MUY IMPORTANTE RESTARLE 1 AHÍ SIEMPRE
		
		edades [pos]=edadLeida;
		System.out.println(edades [pos]);
		
	}

}
