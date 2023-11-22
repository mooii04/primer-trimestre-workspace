package ejercicio19;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion;
		int sumar, restar, multiplicar;
		int num1, num2;
		double dividir;
		
		System.out.println("Bienvenido al programa");
		
		System.out.println("Pulse 1. Usar el programa");
		System.out.println("Si pulsa cualquier otro número no podrá iniciar el programa otra vez");
		opcion = Leer.datoInt();
		
		do {
			System.out.println("Pulse 1. Sumar");
			System.out.println("Pulse 2. Restar");
			System.out.println("Pulse 3. Multiplicar");
			System.out.println("Pulse 4. Dividir");
			System.out.println("Pulse 5. Comprobar par o impar");
			System.out.println("Pulse 0. Finalizar programa");
			opcion = Leer.datoInt();
			
			switch (opcion){
			
				case 1:
					System.out.println("Diga número 1");
					num1 = Leer.datoInt();
					System.out.println("Diga número 2");
					num2 = Leer.datoInt();
					
					sumar = num1 + num2;
					
					System.out.println("La suma de esos dos números es: "+sumar);
				break;
				
				case 2:
					System.out.println("Diga número 1");
					num1 = Leer.datoInt();
					System.out.println("Diga número 2");
					num2 = Leer.datoInt();
					
					restar = num1 - num2;
					
					System.out.println("La resta de esos dos números es: "+restar);
				break;
				
				case 3:
					System.out.println("Diga número 1");
					num1 = Leer.datoInt();
					System.out.println("Diga número 2");
					num2 = Leer.datoInt();
					
					multiplicar = num1 * num2;
					
					System.out.println("La multiplicación de esos dos números es: "+multiplicar);
				break;
					
				case 4: 
					System.out.println("Diga número 1 (numerador)");
					num1 = Leer.datoInt();
					System.out.println("Diga número 2 (denominador)");
					num2 = Leer.datoInt();
					
					if (num2 == 0) {
						System.out.println("No podemos dividir entre 0");
					}else {
						
						dividir = (double) num1 / num2;
						
						System.out.printf("La división de esos dos números es: %.2f\n", dividir);
						
					}
					
				break;
				
				case 5:
					System.out.println("Introduzca un número");
					num1 = Leer.datoInt();
					
					if (num1 %2 == 0) {
						System.out.println("Su número es par");
					}else {
						
						System.out.println("Su número es impar");
						
					}
					
				break;
				
				case 0:
					System.out.println("Finalizar programa");
				break;
				
				default:
					System.out.println("Introduzca uno de los números que se han comentado anteriormente");
				break;
			}			
			
			System.out.println("Gracias por usar nuestro programa");
			
		}while (opcion <= 5);
				
	}

}
