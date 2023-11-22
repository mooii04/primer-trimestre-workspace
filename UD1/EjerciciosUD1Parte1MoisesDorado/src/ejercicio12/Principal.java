package ejercicio12;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float cocaCol=1.20f;
		float pipas=0.40f;
		float espada=150f;
		double precTot=0.00;
		float pagado=200f;
		double devuelto;
		double precCocaTol=0.00;
		String cocaCola="CocaCola 'lata 33 cl'";
		String pipasEle="Pipas Elefante rosa";
		String espaGarra="Espada 'Garra'";
		String depenTien="John Snow ID:(#6457)";
		
		precCocaTol = cocaCol * 4;
		precTot = precCocaTol + pipas + espada;
		devuelto = pagado - precTot;
		
		System.out.printf("\t\t\t\t\t_.IchirakuShop._\t\t\t\t\t\n"
				+ "--------------------------------------------------"
				+ "-------------------------------------------------\n"
				+ "Fue atendido por:\t\t\t"+depenTien+"\n"
				+ "--------------------------------------------------"
				+ "-------------------------------------------------"
				+ "\nProducto\t\t\tCantidad\t\tPrecio Unitario\t\t\tPrecio\n"
				+ cocaCola+"\t\t4\t\t\t"+cocaCol+"€\t\t\t\t%.2f€", precCocaTol);
		System.out.printf("\n"+pipasEle+"\t\t1\t\t\t"+pipas+"€\t\t\t\t%.2f€", pipas);
		System.out.printf("\n"+espaGarra+"\t\t\t1\t\t\t"+espada+"€\t\t\t\t%.2f€", espada);
		System.out.println("\n--  --  --  --  --  --  --  --  --  --  -- -- -- "
				+ "-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --");
		System.out.printf("TOTAL:\t\t\t\t\t\t\t\t\t\t\t%.2f€",precTot,"\n");
		System.out.printf("\nEFECTIVO: \t\t\t"+pagado+"€\t\t\tCAMBIO:\t\t\t\t-%.2f€", devuelto);
		
	}

}
