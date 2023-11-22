package ejercicio08;

public class Banco {

	private double dineroCuenta;
	private String nombre;
	
	public Banco(double dineroCuenta, String nombre) {
		this.dineroCuenta = dineroCuenta;
		this.nombre = nombre;
	}
		
	public double getDineroCuenta() {
		return dineroCuenta;
	}


	public void setDineroCuenta(double dineroCuenta) {
		this.dineroCuenta = dineroCuenta;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void ingresarDinero (double dineroAniadido) {
		
		dineroCuenta = dineroCuenta + dineroAniadido;
		
	}
	
	public void verSaldo() {
		System.out.println(dineroCuenta);
	}
	
	public double retirar (double dineroSolicitado) {
		if(dineroSolicitado > dineroCuenta) {
			comprobarValidez();
		}else {
		dineroCuenta = dineroCuenta - dineroSolicitado;
		
		}
		return dineroCuenta;
	}
		
		public void comprobarValidez () {
			System.out.println("No tienes tanto dinero");
			
		}
	
	public double calcularEnDolares (double unEuroEnDolares) {
		
		double dineroDolares;
		
		dineroDolares = dineroCuenta * unEuroEnDolares;
		
		return dineroDolares;
	}
	
	public double consultarSaldo () {
		
		return dineroCuenta;
		
	}
	
}
