package ejemplo02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre;
		double notaPro;
		double notaBD;
		double notaMedia = 0.0;
		Alumno a1;
		
		System.out.println("Diga nombre:");
		nombre = Leer.dato();
		
		System.out.println("Diga nota de Programación");
		notaPro = Leer.datoDouble();
		
		System.out.println("Diga nota de Base de Datos");
		notaBD = Leer.datoDouble();
		
		a1 = new Alumno (nombre, notaPro, notaBD);
		
		//Esto es lo mismo que lo de abajo
		notaMedia = a1.calcularMedia();
		a1.mostrarMedia (notaMedia);
		
		//Esto es lo mismo que lo de arriba
		System.out.println("La nota media de "+nombre+" es: "+a1.calcularMedia());
	}

}
