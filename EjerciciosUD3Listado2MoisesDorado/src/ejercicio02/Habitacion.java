package ejercicio02;

public class Habitacion {

	private double precioHab;
	private String nombreCliente;
	private int numDiasEstancia;
	private boolean limpia;
	private String tipoHab;
	private boolean ocupada;
	private int serviciosExtras;
	
	public Habitacion(double precioHab, String nombreCliente, int numDiasEstancia, boolean limpia, String tipoHab,
			boolean ocupada, int serviciosExtras) {
		this.precioHab = precioHab;
		this.nombreCliente = nombreCliente;
		this.numDiasEstancia = numDiasEstancia;
		this.limpia = limpia;
		this.tipoHab = tipoHab;
		this.ocupada = ocupada;
		this.serviciosExtras = serviciosExtras;
	}

	public double getPrecioHab() {
		return precioHab;
	}

	public void setPrecioHab(double precioHab) {
		this.precioHab = precioHab;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getNumDiasEstancia() {
		return numDiasEstancia;
	}

	public void setNumDiasEstancia(int numDiasEstancia) {
		this.numDiasEstancia = numDiasEstancia;
	}

	public boolean isLimpia() {
		return limpia;
	}

	public void setLimpia(boolean limpia) {
		this.limpia = limpia;
	}

	public String getTipoHab() {
		return tipoHab;
	}

	public void setTipoHab(String tipoHab) {
		this.tipoHab = tipoHab;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public int getServiciosExtras() {
		return serviciosExtras;
	}

	public void setServiciosExtras(int serviciosExtras) {
		this.serviciosExtras = serviciosExtras;
	}

	@Override
	public String toString() {
		return "Habitacion [precioHab=" + precioHab + ", nombreCliente=" + nombreCliente + ", numDiasEstancia="
				+ numDiasEstancia + ", limpia=" + limpia + ", tipoHab=" + tipoHab + ", ocupada=" + ocupada
				+ ", serviciosExtras=" + serviciosExtras + "]";
	}
	
	
	
	
}
