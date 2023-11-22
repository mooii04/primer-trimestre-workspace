package ejercicio04;

public class Cilindro {

	private double radio;
	private double altura;
	
	public Cilindro(double radio, double altura) {
		this.radio = radio;
		this.altura = altura;
	}
	
	public double calcularVolumen() {
		
		double volumen;
		int dos=2;
		
		volumen = Math.PI * Math.pow(radio, dos) * altura;
		
		return volumen;
	}
	
	public double mostrarVolumen () {
		
		return calcularVolumen();
		
	}
	
}
