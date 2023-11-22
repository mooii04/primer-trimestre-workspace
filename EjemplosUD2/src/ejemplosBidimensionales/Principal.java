package ejemplosBidimensionales;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int fil, col, desde, hasta, leida;
		int [] [] lista;
		Random rnd= new Random (System.nanoTime());
		
		int [][] listas2= {{2,5,4},{3,3,1}};
		
		String [] asignaturas = {"PR", "LM", "BD", "SI"};
		String [] nombres = {"Nombre 1", "Nombre 2", "Nombre 3", "Nombre 4"};
		
		System.out.println("¿Cuántas filas quieres en la tabla?");
		fil = Leer.datoInt();
		
		System.out.println("¿Cuántas columnas quieres en la tabla?");
		col = Leer.datoInt();
		
		
		lista = new int [fil][col];
		
		
		for (int i = 0; i < lista.length; i++) {
			
			for (int j = 0; j < lista[i].length; j++) {
				
				lista[i][j]=5;
				
			}
			
		}
		
		//Mostrar el array en forma de tabla
		
		for (int i = 0; i < lista.length; i++) {
			
			for (int j = 0; j < lista[i].length; j++) {
				
				System.out.print(lista[i][j]+"\t");
				
			}
			
			System.out.println();
			
		}
				
		//Rellenamos con aleatorios
		System.out.println("¿Cuántas filas quieres en la tabla?");
		fil = Leer.datoInt();
		
		System.out.println("¿Cuántas columnas quieres en la tabla?");
		col = Leer.datoInt();
		
		System.out.println("Desde que número");
		desde = Leer.datoInt();
		
		System.out.println("Hasta qué número");
		hasta = Leer.datoInt();
		
		lista = new int [fil][col];
		
		
		
		for (int i = 0; i < lista.length; i++) {
			
			for (int j = 0; j < lista[i].length; j++) {
				
				lista[i][j] = rnd.nextInt (hasta-desde+1)+desde;
				
			}
			System.out.print(asignaturas[i]+"\t\t");
		}
			
			for (int i = 0; i < lista.length; i++) {
				
				for (int j = 0; j < lista[i].length; j++) {
					
					System.out.print(lista[i][j]+"\t");
					System.out.println(nombres[i]);
				}
				
				System.out.println();
			}
			
			
			//Modificar valor
			System.out.println("Diga fila a cambiar");
			fil = Leer.datoInt()-1;
			
			System.out.println("Diga columna");
			col = Leer.datoInt()-1;
			
			System.out.println("Diga nueva cifra");
			leida = Leer.datoInt();
			
			lista[fil][col] = leida;
			
			//Mostramos de nuevo para ver el cambio
			for (int i = 0; i < lista.length; i++) {
				
				for (int j = 0; j < lista[i].length; j++) {
					
					System.out.print(lista[i][j]+"\t");
					
				}
				
				System.out.println();
				
			}
			
	}

}
