package ejercicio06;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] meses={"Enero", "Febrero", "Marzo", "Abril", "Mayo"};
		double [] precios= {23.5, 17.6, 19.9, 20.2, 13.4};
		
		for (int i = 0; i < meses.length; i++) {
			System.out.print(meses[i]+"\t\t");
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < precios.length; i++) {
			System.out.print(precios[i]+"\t\t");
		}
		
	}

}
