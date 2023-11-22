package ejemplo03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre = "ACoche";
		double precioNuevo;
		
		vehiculo v= new vehiculo ("Amoto", 1200.00, 2);
		
		Vendedor vd= new Vendedor ("Moi", 1200.00, 2);
		
	//Mostrar
		System.out.println(v);
		
		System.out.println(nombre);
		
		//System.out.println(v.nombre);
		
		System.out.println(v.getNombre());
		
	//Modificar
		System.out.println("Diga nuego precio");
		precioNuevo = Leer.datoDouble();
		
		v.setPrecio(precioNuevo);
		
		System.out.printf("El nuevo precio es: %.2f\n",v.getPrecio());
		
		System.out.println(vd);
		
	}

}
