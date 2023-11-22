package ejercicio12;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double peso, altura;
		double imc;
		double exp = 2;
		int estado;
		String diag1="Criterio de ingreso en hospital", diag2="Infrapeso", diag3="Bajo peso", diag4="Peso normal (Saludable)",
				diag5="Sobrepeso (Obresidad de grado I)", diag6="Sobrepeso crónico (Obesidad de grado II)",
				diag7="Obesidad premórbida (Obesidad de grado III)", diag8="Obesidad mórbida (Obesidad de grado IV)";
		
		System.out.println("Bienvenido al programa que calcula tu índice de masa corporal (IMC)");
		
		System.out.println("Por favor, inserte su peso en kg");
		peso = Leer.datoFloat();
		
		System.out.println("Por favor, inserte su altura en m");
		altura = Leer.datoFloat();
		
		imc = peso / Math.pow(altura, exp);
		
		System.out.printf("Su índice de masa corporal es de: %.5f", imc);
		
		System.out.printf("\n\n");
		System.out.println("Si su IMC ha sido menor que 16, pulse 1");
		System.out.println("Si su IMC ha sido entre 16 y 17, pulse 2");
		System.out.println("Si su IMC ha sido entre 17 y 18, pulse 3");
		System.out.println("Si su IMC ha sido entre 18 y 25, pulse 4");
		System.out.println("Si su IMC ha sido entre 25 y 30, pulse 5");
		System.out.println("Si su IMC ha sido entre 30 y 35, pulse 6");
		System.out.println("Si su IMC ha sido entre 35 y 40, pulse 7");
		System.out.println("Si su IMC ha sido mayor que 40, pulse 8");
		
		estado = Leer.datoInt();
		
		switch (estado) {
		
			case 1:
				System.out.println("Su IMC es menor que 16 por lo que, su diagnóstico es: "+ diag1);
				break;
				
			case 2: 
				System.out.println("Su IMC es entre 16 y 17 por lo que, su diagnóstico es: "+ diag2);	
				break;
			
			case 3: 
				System.out.println("Su IMC es entre 17 y 18 por lo que, su diagnóstico es: "+ diag3);
				break;
				
			case 4: 
				System.out.println("Su IMC es entre 18 y 25 por lo que, su diagnóstico es: "+ diag4);
				break;
				
			case 5: 
				System.out.println("Su IMC es entre 25 y 30 por lo que, su diagnóstico es: "+ diag5);
				break;
				
			case 6: 
				System.out.println("Su IMC es entre 30 y 35 por lo que, su diagnóstico es: "+ diag6);
				break;
			
			case 7: 
				System.out.println("Su IMC es entre 35 y 40 por lo que, su diagnóstico es: "+ diag7);
				break;
				
			case 8: 
				System.out.println("Su IMC es mayor que 40 por lo que, su diagnóstico es: "+ diag8);
				break;
				
			default:
				System.out.println("Por favor elija uno de los números comentados anteriormente");
		}
		
		System.out.println("\nGracias por usar nuestro programa, que tenga un bunen día");
	}

}
