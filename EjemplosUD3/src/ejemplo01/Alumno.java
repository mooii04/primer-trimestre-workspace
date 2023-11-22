package ejemplo01;

public class Alumno {

	
	//Atributos
	
	private String nombre;
	int edad;
	private double notaMedia;
	
	
	//Constructores
	
	//Para crear un objeto con valores
	
	public Alumno (String nombre, int edad, double notaMedia) {
		this.nombre = nombre;
		this.edad = edad;
		this.notaMedia = notaMedia;
	}
	
	public Alumno (String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Alumno () {
		
	}
	
	//Métodos
	
	//Primer método propio, para imprimir en bonito
	
	public void mostrarDatos (String calle){
		
		//Cuerpo
		System.out.println("Los datos del alumno son");
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Nota media: "+notaMedia);
		System.out.println("Calle: "+calle);
		
	}
	
	
	/*calcularMedia
	insertarNota
	darAlta
	medirAsistencia
	notificarFalta*/
	
	
	
}
