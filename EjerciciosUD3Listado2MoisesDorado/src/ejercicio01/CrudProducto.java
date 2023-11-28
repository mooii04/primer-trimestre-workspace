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
	
	
}
