package ejercicio01;

public class Producto {

	private double precioFabrica;
	private double porcentajeTransporte;
	private boolean fragil;
	private double PVP;
	private String nombre;
	
	public Producto(double precioFabrica, double porcentajeTransporte, boolean fragil, double pVP, String nombre) {
		this.precioFabrica = precioFabrica;
		this.porcentajeTransporte = porcentajeTransporte;
		this.fragil = fragil;
		PVP = pVP;
		this.nombre = nombre;
	}

	public double getPrecioFabrica() {
		return precioFabrica;
	}



	public void setPrecioFabrica(double precioFabrica) {
		this.precioFabrica = precioFabrica;
	}



	public double getPorcentajeTransporte() {
		return porcentajeTransporte;
	}



	public void setPorcentajeTransporte(double porcentajeTransporte) {
		this.porcentajeTransporte = porcentajeTransporte;
	}



	public boolean isFragil() {
		return fragil;
	}



	public void setFragil(boolean fragil) {
		this.fragil = fragil;
	}



	public double getPVP() {
		return PVP;
	}



	public void setPVP(double pVP) {
		PVP = pVP;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Producto --> el nombre es: "+ nombre +" y su precio de fábrica: "+ precioFabrica;
	}

	public boolean comprobarFragilidad (int leerFragil) {
		if (leerFragil == 1) {
			fragil = true;
		} else {
			fragil = false;
		}
		return fragil;
	}
	
	
		
}
