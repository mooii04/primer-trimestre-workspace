package ejemplosaleatorios;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Random num= new Random (System.nanoTime());
			
			int hasta, desde, tope;
			int ale;
			
			System.out.println("¿Hasta qué número quieres que cuente?");
			hasta = Leer.datoInt();
			
			System.out.println("¿Desde qué número quiere que cuente?");
			desde = Leer.datoInt();
			
			System.out.println("¿Cuántos números quiere que ponga?");
			tope = Leer.datoInt();
			
			
			for (int i=0; i<tope; i++) {
				
				ale = num.nextInt(hasta-desde+1)+desde;
				
				System.out.println(ale);
			}
		
			
	}
	
}


