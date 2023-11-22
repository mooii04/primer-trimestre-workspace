package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float dineroRetirado;
		float dineroCuenta;
		
		System.out.println("Bienvenido al programa del banco");
		
		System.out.println("Porfavor inserte cuanto dinero tiene en la cuenta");
		dineroCuenta = Leer.datoFloat();
		
		System.out.println("Porfavor inserte cuuanto dinero quiere retirar de la cuenta");
		dineroRetirado = Leer.datoFloat();
		
		if(dineroCuenta >= dineroRetirado) {
			
			dineroCuenta -= dineroRetirado;
			System.out.printf("Le queda en la cuenta un total de: %.2f€", dineroCuenta);
			
		}else {
			
			System.out.println("No se puede realizar la operación, quiere sacar más dinero de lo que tiene\n");
			
		}
		
		System.out.println("");
		System.out.println("Gracias por usar nuestro programa");
		
	}

}
