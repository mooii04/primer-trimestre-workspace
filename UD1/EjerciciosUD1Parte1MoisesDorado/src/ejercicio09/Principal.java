package ejercicio09;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double habitNavas=1500;
		double capacCampNou=99394;
		double capacU2=650000;
		double teatro=600;
		double resul=0.00;
		
		System.out.println("Bienvenidos al programa de las capacidades de los habitantes de Las Navas");
		
		resul=capacCampNou/habitNavas;
		System.out.printf("En el estadio del Barcelona entrarían %.2f Navas aproximadamente", resul);
		
		resul=capacU2/habitNavas;
		System.out.printf("\nEn el cocierto de U2 entrarían %.2f Navas aproximadamente", resul);
		
		resul=teatro/habitNavas;
		System.out.printf("\nEn el teatro del colegio entrarían %.2f Navas aproximadamente", resul);
		
		System.out.println("\nGracias por utilizar nuestro programa, si quieres más lugares y otros pueblos"
				+ "\nmandanos un mensaje, gracias!!");
		
	}

}
