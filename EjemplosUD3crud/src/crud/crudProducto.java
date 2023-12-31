package crud;

import java.util.Arrays;

import modelo.Producto;

public class crudProducto {

	private Producto [] lista;
	
	/*
	 * Constructor para crear un objeto de esta clase pasando como parámetros de
	 * una lista que ya puede tener tamaño dado por el usuario en el main
	 */
	
	public crudProducto(Producto[] lista) {
		this.lista = lista;
	}
	
	public Producto[] getLista() {
		return lista;
	}



	public void setLista(Producto[] lista) {
		this.lista = lista;
	}
	
	@Override
	public String toString() {
		return "crudProducto [lista=" + Arrays.toString(lista) + "]";
	}
	
	/*
	 * Pasamos un producto y una posición y se añade dicho producto en dicha posición
	 * Ojo, porque no se comprueba nada, se pierde lo que había
	 */

	public void agregar (Producto p, int posicion) {
		lista[posicion] = p;
	}
	
	public Producto findById(String codigo) {
		int i = 0;
		boolean encontrado = false;
		
	//Mientras no hayamos llegado al final o encontrado lo que buscamos
	//Al encontrarlo, el bucle para
		
		while (i < lista.length && !encontrado) {
			Producto deLista = lista[i];
			if (deLista.getCodigo().equalsIgnoreCase(codigo))
				encontrado = true;
			else 
				i++;
		}
		if (encontrado)
			return lista[i]; //Devolvemos el producto buscando
		else 
			return null;
	}
	
	public int findByIdV2(String codigo) {
		int i = 0;
		boolean encontrado = false;
		
		while (i < lista.length && !encontrado) {
			Producto deLista = lista[i];
			if (deLista.getCodigo().equalsIgnoreCase(codigo))
				encontrado = true;
			else
				i++;
		}
		if (encontrado)
			return i;
		else
			return -1;
	}
	
	public void editPrecio(String codigo, double precioN) {
		int index = findByIdV2(codigo);
		if (index >= 0) {
			lista[index].setPrecioUnitario(precioN);
		}
	}
	
	/*public void delete (Producto p) {
		int index = findProduct(p);
		if (index >= 0)
			lista[index].setActivo(false);			
	}*/
	
	//Mostrar todos los productos de la lista
	public void imprimirTodosLosProductos () {
		for (int i=0; i<lista.length; i++) {
			System.out.println((i+1)+". "+lista[i]);
		}
	}
	
	//Mostrar solo los productos cuyo atributo activo es true
	//están a la venta
	public void imprimirSoloActivos () {
		for (int i = 0; i < lista.length && lista[i]!=null; i++) {
			System.out.println((i+1)+". "+lista[i]);
		}
	}
	
}
