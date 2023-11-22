package ejercicio11;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double caudal=8, horas=24, segundos=3600, metrosCúb=0.001, resul=0.00;

		System.out.println("Bienvenidos al programa que calcula el desastre ocurrido en un pueblo");
		
		//La idea aqui es hacer 8 L/s por 3600s/1h por 0,001m^3/1L por 24 horas
		resul=caudal*segundos*metrosCúb*horas;
		
		System.out.printf("Del pozo se sacarán: %.2f metros cúbicos en 24 horas", resul);
		
		System.out.println("\nGracias por usar nuestro programa de desastres en tu pueblo");
		
	}

}
