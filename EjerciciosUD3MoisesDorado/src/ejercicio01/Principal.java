package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nomAsignatura;
		String nomAula;
		String fecha;
		Examen ex;
		
		System.out.println("Diga nombre de la asignatura");
		nomAsignatura = Leer.dato();
		
		System.out.println("Diga aula donde se realiza");
		nomAula = Leer.dato();
		
		System.out.println("Diga fecha");
		fecha = Leer.dato();
		
		ex = new Examen (nomAsignatura, nomAula, fecha);
		
		System.out.println(ex);
		
	}

}
