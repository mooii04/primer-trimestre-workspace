package ejemplo02;

public class Alumno {

	private String nombre;
	private double notaPro;
	private double notaBD;
	
	public Alumno (String nombre, double notaPro, double notaBD) {
		this.nombre = nombre;
		this.notaPro = notaPro;
		this.notaBD = notaBD;
	}
	
	public double calcularMedia () {
		
		double suma, notaMedia;
		double dos=2;
		
		suma = notaPro + notaBD;
		notaMedia = suma / dos;
		
		return notaMedia;
		
	}
	
	public void mostrarMedia (double notaMedia) {
		
		System.out.println("La nota media de "+nombre+" es: "+notaMedia);
		
	}
	
}
