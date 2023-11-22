package ejercicio08;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double dineroCuenta=0;
		String nombre;
		double dineroAniadido;
		double dineroSolicitado;
		double dineroDolares=0;
		double unEuroEnDolares;
		int opcionCasos;
		
		System.out.println("Bienvenido al cajero VVBO");
		System.out.println("/////////////////////////////");
		
		System.out.println("¿Cómo se llama?");
		nombre = Leer.dato();
		
		Banco b = new Banco(dineroCuenta, nombre);
			
			do {
				System.out.println("\nMenú Sistema VVBO:");
				System.out.println("Si desea ingresar dinero PULSE 1");
				System.out.println("Si desea retirar dinero PULSE 2");
				System.out.println("Si desea consultar su dinero en $ PULSE 3");
				System.out.println("Si desea consultar su saldo PULSE 4");
				System.out.println("Si desea no segur en el sistema PULSE 0");
				opcionCasos = Leer.datoInt();
			switch (opcionCasos) {
			
				case 1:
					System.out.println("¿Cuánto dinero quiere ingresar?");
					dineroAniadido = Leer.datoDouble();
					b.ingresarDinero(dineroAniadido);
				break;
				
				case 2:
					System.out.println("¿Cuánto dinero quiere sacar?");
					dineroSolicitado = Leer.datoDouble();
					dineroCuenta = b.retirar(dineroSolicitado);
				break;
					
				case 3:
					System.out.println("¿A cuánto está el dollar?");
					unEuroEnDolares = Leer.datoDouble();
					dineroDolares = b.calcularEnDolares(unEuroEnDolares);
					System.out.printf("Al intercambiar el dinero de € a $ su cuenta se queda en: %.2f",dineroDolares,"$\n");
				break;
				
				case 4:
					b.verSaldo();
				break;
					
				case 0:
					System.out.println("Cerrando sistema");
				break;
				
				default:
					System.out.println("Ingrese un número comentado anteriormente");
				break;
			}
			}while(opcionCasos != 0);
			
		System.out.println("Gracias por confiar en VVBO");
	}

}
