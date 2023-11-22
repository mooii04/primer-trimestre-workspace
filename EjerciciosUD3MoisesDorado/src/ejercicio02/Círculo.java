package ejercicio02;

public class Círculo {
	
	//Atributo
	private double radio;
	
	//Constructor
	public Círculo(double radio) {
		this.radio=radio;
	}
	
	//Método cálculo del área
	public double calcularArea () {
		
		double area;
		int dos=2;
		
		area=Math.pow(radio, dos)*Math.PI;
		
		return area;
	}
	
	//Método cálculo 
	public double pasarMetros2 () {
		
		double conversion=10000;
		
		return calcularArea()/conversion;	
	}
	
}
