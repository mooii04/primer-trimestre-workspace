package ejemplo03;

public class vehiculo {

	
	private String nombre;
	private double precio;
	private int numeroRuedas;
	
	//Constructor
	public vehiculo (String nombre, double precio, int numeroRuedas) {
		this.nombre = nombre;
		this.precio = precio;
		this.numeroRuedas = numeroRuedas;
	}
	
	public String getNombre () {
		return nombre;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public double getPrecio () {
		return precio;
	}
	
	public void setPrecio (double precio) {
		this.precio = precio;
	}
	
	public double getNumeroRuedas () {
		return numeroRuedas;
	}
	
	public void setNumeroRuedas (int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}
	//Métodos que nos van ayudar a obtener el valor de un atributo
	
	
}
