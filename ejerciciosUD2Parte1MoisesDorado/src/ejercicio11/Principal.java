package ejercicio11;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float peso;
		int planetas;
		float pesoPlanetas;
		String planeta1="Mercuio", planeta2="Venus", planeta3="Marte", planeta4="Jupiter",
				planeta5="Saturno", planeta6="Urano", planeta7="Neptuno";
		float mercurio=0.38f, venus=0.91f, marte=0.38f, jupiter=2.53f, saturno=1.06f, urano=0.92f, neptuno=1.2f;
		
		
		System.out.println("Bienvenidos al programa que calcula su peso en cualquier planeta del Sistema Solar");
		
		System.out.println("Para empezar, ¿cúal es su peso? Indíquelo en kilogramos");
		peso = Leer.datoFloat();
		
		System.out.println("Para saber cuanto pesa en "+planeta1+" pulse 1");
		System.out.println("Para saber cuanto pesa en "+planeta2+" pulse 2");
		System.out.println("Para saber cuanto pesa en "+planeta3+" pulse 3");
		System.out.println("Para saber cuanto pesa en "+planeta4+" pulse 4");
		System.out.println("Para saber cuanto pesa en "+planeta5+" pulse 5");
		System.out.println("Para saber cuanto pesa en "+planeta6+" pulse 6");
		System.out.println("Para saber cuanto pesa en "+planeta7+" pulse 7");
		planetas = Leer.datoInt();
		
		switch (planetas) {
		
			case 1:
				pesoPlanetas = peso * mercurio;
				System.out.printf("Su peso en "+planeta1+" es de: %.2f kg", pesoPlanetas);
				break;
			case 2: 
				pesoPlanetas = peso * venus;
				System.out.printf("Su peso en "+planeta2+" es de: %.2f kg", pesoPlanetas);
				break;
			case 3: 
				pesoPlanetas = peso * marte;
				System.out.printf("Su peso en "+planeta3+" es de: %.2f kg", pesoPlanetas);
				break;
			case 4: 
				pesoPlanetas = peso * jupiter;
				System.out.printf("Su peso en "+planeta4+" es de: %.2f kg", pesoPlanetas);
				break;
			case 5: 
				pesoPlanetas = peso * saturno;
				System.out.printf("Su peso en "+planeta5+" es de: %.2f kg", pesoPlanetas);
				break;
			case 6: 
				pesoPlanetas = peso * urano;
				System.out.printf("Su peso en "+planeta6+" es de: %.2f kg", pesoPlanetas);
				break;
			case 7: 
				pesoPlanetas = peso * neptuno;
				System.out.printf("Su peso en "+planeta7+" es de: %.2f kg", pesoPlanetas);
				break;
			default:
				System.out.println("Opción no válida, elija un número comentado anteriormente");	
		}
		
		System.out.println("\nGracias por usar nuestro programa");
		
	}

}
