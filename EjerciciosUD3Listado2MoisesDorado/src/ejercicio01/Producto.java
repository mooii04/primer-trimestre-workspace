package ejercicio01;

public class Producto {

	private double precioFabrica;
	private double porcentajeTransporte;
	private boolean fragil;
	private double PVP;
	
	public Producto(double precioFabrica, double porcentajeTransporte, boolean fragil, double PVP) {
		this.precioFabrica = precioFabrica;
		this.porcentajeTransporte = porcentajeTransporte;
		this.fragil = fragil;
		this.PVP = PVP;
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

	@Override
	public String toString() {
		return "Producto [precioFabrica=" + precioFabrica + ", porcentajeTransporte="
				+ porcentajeTransporte + ", fragil=" + fragil + ", PVP=" + PVP + "]";
	}
	
	
	
}
