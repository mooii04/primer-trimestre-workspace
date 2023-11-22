package ejercicio06;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double precio=78.90;
		double descuento=20.00;
		
		
		double preciofinal=precio*(descuento/100);
		preciofinal=precio-preciofinal;
		
		System.out.printf("Nos ha costado la compra %.2f€, pero como tienen un descuento del %.2f"
				+ "\ntenemos que nos ha costado la compra al final %.2f€",precio,descuento,preciofinal);
		
		
	}

}
