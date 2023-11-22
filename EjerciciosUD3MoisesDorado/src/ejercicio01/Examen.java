package ejercicio01;

public class Examen {

	private String nomAsignatura;
	private String nomAula;
	private String fecha;

	public Examen(String nomAsignatura, String nomAula, String fecha) {
		this.nomAsignatura = nomAsignatura;
		this.nomAula = nomAula;
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Examen [Asignatura = " + nomAsignatura + ", Aula = " + nomAula + ", Fecha = " + fecha + "]";
	}
}
