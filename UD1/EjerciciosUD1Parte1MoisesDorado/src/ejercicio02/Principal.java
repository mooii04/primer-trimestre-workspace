package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double largo=50.00;
	double ancho=21.00;
	double profrect=2.50;
	double solucion=0.00;
	double soluapart1=0.00;
	
	double profcir=1.80;
	double radio=12.00;
	double diametro=0.00;
	double coeficiente=0.78;
	double soluapart2=0.00;
	
	double preciorect=0.00;
	double preciocirc=0.00;
	double preciometrocúbico=1.80;
	
	
		System.out.println("Bienvenidos vamos a calcular los volumenes y que nos costará llenar una piscina");
		
		
	//Apartado uno
		soluapart1=largo*ancho;
		soluapart1=soluapart1*profrect;
		
		System.out.println("El volumen de la piscina rectangular es: "+soluapart1+" m^3");
	
		
	//Apartado dos
		diametro=radio+radio;
		diametro=diametro*diametro;
		solucion=profcir*diametro;
		soluapart2=solucion*coeficiente;
		
		System.out.println("El volumen de la piscina circular es: "+soluapart2+" m^3");
		
		
	//Apartado tres
		preciorect=soluapart1*preciometrocúbico;
		preciocirc=soluapart2*preciometrocúbico;
		
		System.out.println("El precio de la piscina rectangular sería de: "+preciorect+("€"));
		System.out.println("El precio de la piscina circular sería de: "+preciocirc+("€"));
		
		//Prueba del printf
			System.out.printf("El precio de a piscina circuar sería aproximadamente de: %.2f€",preciocirc);
			System.out.printf("\nEl resultado de %.2f por %.2f es: %.2f",soluapart2,preciometrocúbico,preciocirc);
	
	}

}
