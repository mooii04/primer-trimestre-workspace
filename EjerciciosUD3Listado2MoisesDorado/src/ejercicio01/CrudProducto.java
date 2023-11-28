package ejercicio01;

import java.util.Arrays;

public class CrudProducto {

	private Producto [] lista;

	public CrudProducto(Producto[] lista) {
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
		return "CrudProducto [lista=" + Arrays.toString(lista) + "]";
	}

	//Muestra todos los productos de la lista
	public void imprimirTodosLosProductos () {
			for(int i=0; i<lista.length;i++) {
				System.out.println((i+1)+". "+lista[i]);
			}
		}
	
	//Pasamos un producto y una posición y se añade ese producto a esa posición
	//Lo que haya dentro de esa posición si se cambia se pierde
	public void add(Producto p, int posicion) {
		lista[posicion]=p;
	}
	
	
}
