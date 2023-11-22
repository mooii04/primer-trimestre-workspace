package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float nota1 = 0f;
		float nota2 = 0f;
		float nota3 = 0f;
		float media = 0f;
		int notaAprobar=5;
		int tres = 3;
		
		System.out.println("Bienvenido, vamos a calcular la media de tus notas para ver si apruebas");
		
		System.out.println("Introduce tu primera nota");
		nota1 = Leer.datoFloat();
		
		System.out.println("Introduce tu segunda nota");
		nota2 = Leer.datoFloat();
		
		System.out.println("Introduce tu tercera nota");
		nota3 = Leer.datoFloat();
		
		media = (nota1 + nota2 + nota3) / tres;
		
		if (media>=notaAprobar) {
			System.out.printf("Felicidades, tienes una media de %.2f. ¡Has aprobado!",media);
		}else {
			System.out.printf("Te queda una media de %.2f, por lo que has suspendido. Haber estudiao.",media);
		}
		
		System.out.println("Gracias por usar nuestro programa");		
		
	}

}
