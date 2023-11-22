package sistemauefa;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VARIABLES DECLARADAS
		
		String []Bombo1 = {"Nápoles", "Barcelona", "Manchester City", "Bayern", "PSG", "Benfica",
				"Sevilla", "Feyenoord"};
		String []Bombo2 = {"Real Madrid", "Manchester United", "Inter", "Borussia Dortmund", "Atlético de Madrid",
				"Leipzig", "Oporto", "Arsenal"};
		String []Bombo3 = {"Union Berlin", "Lens", "Newcastle", "Galatasaray", "Real Sociedad", "Young Boys",
				"Celtic", "Royal Antwerp"};
		
		int desde=1, hasta=8, tope=1, opcion, opcionCasos;
		int variableGuardada1=0, variableGuardada2=0, variableGuardada3=0;
		int variableGuardada4=0, variableGuardada5=0, variableGuardada6=0;
		int variableGuardada7=0, variableGuardada8=0, variableGuardada9=0;
		int variableGuardada10=0, variableGuardada11=0, variableGuardada12=0;
		int variableGuardada13=0, variableGuardada14=0, variableGuardada15=0;
		int variableGuardada16=0, variableGuardada17=0, variableGuardada18=0;
		int variableGuardada19=0, variableGuardada20=0, variableGuardada21=0;
		int variableGuardada22=0, variableGuardada23=0, variableGuardada24=0;
		
		String Palop="Don Andrés Palop", Lama="Don Manolo Lama", Matheu="Don Matheu Lahoz", Zlatan="Don Zlatan Ibrahimovic", Pablo="Don Pablo Motos", 
				Felipe="Don Felipe VI",	Torrente="Señor Torrente", Bicho="Cristiano Ronaldo";
		
		int numeros[];
		numeros = new int [tope];
		
		Random rnd= new Random (System.nanoTime());
		
		
		//COMIENZO SORTEO CHAMPIONS
		
		System.out.println("Enhorabuena por tu entrada en Champions procederemos al sorteo de Champions");
		System.out.println("Para comenzar simplemente tienes que pulsar el número 1");
		opcion = Leer.datoInt();
		
		while (opcion == 1) {
			
			System.out.println("Por favor siga las instrucciones en orden ¡SI o SI!:");
			System.out.println("");
			System.out.println("Pulsa 1. Sacar 1º GRUPO");
			System.out.println("Pulse 2. Sacar 2º GRUPO");
			System.out.println("Pulse 3. Sacar 3º GRUPO");
			System.out.println("Pulsa 4. Sacar 4º GRUPO");
			System.out.println("Pulse 5. Sacar 5º GRUPO");
			System.out.println("Pulse 6. Sacar 6º GRUPO");
			System.out.println("Pulsa 7. Sacar 7º GRUPO");
			System.out.println("Pulse 8. Sacar 8º GRUPO");
			System.out.println("Pulse 0. Finalizar Sorteo Champions");
			opcionCasos = Leer.datoInt();
			System.out.println("");
			
			switch (opcionCasos) {
				
				case 1:
					
					System.out.println("\nEl primer grupo lo sacará el mejor de todos "+Palop);
								
					for (int i=0 ; i<tope; i++) {
									
						numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
										
						variableGuardada1 = numeros[i] - 1;
									
						System.out.print("El número "+numeros[i]);
					}
								
					System.out.println(" que corresponde al equipo --> "+Bombo1[variableGuardada1]);
								
								
					for (int i=0 ; i<tope; i++) {
									
						numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
										
						variableGuardada2 = numeros[i] - 1;
										
						System.out.print("El número "+numeros[i]);
					}
									
					System.out.println(" que corresponde al equipo --> "+Bombo2[variableGuardada2]);			
																
					for (int i=0 ; i<tope; i++) {
										
						numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
											
						variableGuardada3 = numeros[i] - 1;
										
						System.out.print("El número "+numeros[i]);
					}
								
									
					System.out.println(" que corresponde al equipo --> "+Bombo3[variableGuardada3]);
								
				
							
					System.out.println("Ya tenemos el 1º GRUPO lo componen "+Bombo1[variableGuardada1]+", "
									+ ""+Bombo2[variableGuardada2]+" y "+Bombo3[variableGuardada3]);						
					
				break;
						
				case 2:
					
					System.out.println("\nPara el segundo grupo nos acompaña "+Lama);
			
					for (int i=0 ; i<tope; i++) {
											
						numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
												
						variableGuardada4 = numeros[i] - 1;
											
							while (variableGuardada4 == variableGuardada1){
												
								numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
												
								variableGuardada4 = numeros[i] - 1;
												
							}
											
							System.out.print("El número "+numeros[i]);
					}
										
					System.out.println(" que corresponde al equipo --> "+Bombo1[variableGuardada4]);
				
										
					for (int i=0 ; i<tope; i++) {
											
						numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
												
						variableGuardada5 = numeros[i] - 1;
											
							while (variableGuardada5 == variableGuardada2){
												
								numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
												
								variableGuardada5 = numeros[i] - 1;
												
							}
												
						System.out.print("El número "+numeros[i]);
					}
											
					System.out.println(" que corresponde al equipo --> "+Bombo2[variableGuardada5]);
								
		
					for (int i=0 ; i<tope; i++) {
												
						numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
													
						variableGuardada6 = numeros[i] - 1;
											
							while (variableGuardada6 == variableGuardada3){
													
								numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
													
								variableGuardada6 = numeros[i] - 1;
													
							}
													
						System.out.print("El número "+numeros[i]);
					}
												
					System.out.println(" que corresponde al equipo --> "+Bombo3[variableGuardada6]);
						
					System.out.println("Ya tenemos el 2º GRUPO lo componen "+Bombo1[variableGuardada4]+", "
									+ ""+Bombo2[variableGuardada5]+" y "+Bombo3[variableGuardada6]);			
								
				break;
				
							
				case 3:
					
					System.out.println("\nEsto está que arde solo llevamos dos grupos y que dos grupos fuertes");
					System.out.println("Para el tercer grupo nos acompaña "+Matheu);
							
					for (int i=0 ; i<tope; i++) {
											
						numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
												
						variableGuardada7 = numeros[i] - 1;
											
							while (variableGuardada7 == variableGuardada1 || variableGuardada7 == variableGuardada4){
												
								numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
												
								variableGuardada7 = numeros[i] - 1;
												
							}
											
						System.out.print("El número "+numeros[i]);
					}
										
					System.out.println(" que corresponde al equipo --> "+Bombo1[variableGuardada7]);
										
					for (int i=0 ; i<tope; i++) {
											
						numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
												
						variableGuardada8 = numeros[i] - 1;
											
							while (variableGuardada8 == variableGuardada2 || variableGuardada8 == variableGuardada5){
												
								numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
											
								variableGuardada8 = numeros[i] - 1;
												
							}
												
						System.out.print("El número "+numeros[i]);
					}
											
					System.out.println(" que corresponde al equipo --> "+Bombo2[variableGuardada8]);
										
					for (int i=0 ; i<tope; i++) {
												
						numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
													
						variableGuardada9 = numeros[i] - 1;
											
							while (variableGuardada9 == variableGuardada3 || variableGuardada9 == variableGuardada6){
												
								numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
												
								variableGuardada9 = numeros[i] - 1;
												
							}
												
						System.out.print("El número "+numeros[i]);
					}
											
					System.out.println(" que corresponde al equipo --> "+Bombo3[variableGuardada9]);
									
					System.out.println("Ya tenemos el 3º GRUPO lo componen "+Bombo1[variableGuardada7]+", "
													+ ""+Bombo2[variableGuardada8]+" y "+Bombo3[variableGuardada9]);
									
				break;	
						
				
				case 4:
					
					System.out.println("\nProcedemos a sacar el cuarto grupo para ello nos acompaña nada más y nada menos que "+Zlatan);
							
					for (int i=0 ; i<tope; i++) {
								
						numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
									
						variableGuardada10 = numeros[i] - 1;
								
							while (variableGuardada10 == variableGuardada1 || variableGuardada10 == variableGuardada4 || variableGuardada10 == variableGuardada7){
									
								numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
									
								variableGuardada10 = numeros[i] - 1;
									
							}
								
						System.out.print("El número "+numeros[i]);
					}
							
					System.out.println(" que corresponde al equipo --> "+Bombo1[variableGuardada10]);
							
								
					for (int i=0 ; i<tope; i++) {
								
						numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
									
						variableGuardada11 = numeros[i] - 1;
								
							while (variableGuardada11 == variableGuardada2 || variableGuardada11 == variableGuardada5 || variableGuardada11 == variableGuardada8){
									
								numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
									
								variableGuardada11 = numeros[i] - 1;
									
							}
									
						System.out.print("El número "+numeros[i]);
					}
								
					System.out.println(" que corresponde al equipo --> "+Bombo2[variableGuardada11]);
					
								
					for (int i=0 ; i<tope; i++) {
									
						numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
										
						variableGuardada12 = numeros[i] - 1;
								
							while (variableGuardada12 == variableGuardada3 || variableGuardada12 == variableGuardada6 || variableGuardada12 == variableGuardada9){
									
								numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
									
								variableGuardada12 = numeros[i] - 1;
									
							}
									
						System.out.print("El número "+numeros[i]);
					}
								
								
					System.out.println(" que corresponde al equipo --> "+Bombo3[variableGuardada12]);
								
					System.out.println("Ya tenemos el 4º GRUPO lo componen "+Bombo1[variableGuardada10]+", "
							+ ""+Bombo2[variableGuardada11]+" y "+Bombo3[variableGuardada12]);
							
				break;
					
				
				case 5:
					
					System.out.println("\nA por el quinto grupo queda menos para saber como quedarían todos los grupos");
					System.out.println("Qué entre "+Pablo+", quien será el encargado de sacar dicho grupo");
							
					for (int i=0 ; i<tope; i++) {
								
						numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
									
						variableGuardada13 = numeros[i] - 1;
								
							while (variableGuardada13 == variableGuardada1 || variableGuardada13 == variableGuardada4 || variableGuardada14 == variableGuardada7 || variableGuardada13 == variableGuardada10){
									
									numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
									
									variableGuardada13 = numeros[i] - 1;
									
							}
								
						System.out.print("El número "+numeros[i]);
					}
							
					System.out.println(" que corresponde al equipo --> "+Bombo1[variableGuardada13]);						
								
					for (int i=0 ; i<tope; i++) {
								
						numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
									
						variableGuardada14 = numeros[i] - 1;
								
							while (variableGuardada14 == variableGuardada2 || variableGuardada14 == variableGuardada5 || variableGuardada14 == variableGuardada8 || variableGuardada14 == variableGuardada11){
									
								numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
							
								variableGuardada14 = numeros[i] - 1;
									
							}
									
					System.out.print("El número "+numeros[i]);
					}
							
					System.out.println(" que corresponde al equipo --> "+Bombo2[variableGuardada14]);
					
								
					for (int i=0 ; i<tope; i++) {
									
						numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
										
						variableGuardada15 = numeros[i] - 1;
								
							while (variableGuardada15 == variableGuardada3 || variableGuardada15 == variableGuardada6 || variableGuardada15 == variableGuardada9 || variableGuardada15 == variableGuardada12){
									
								numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
									
								variableGuardada15 = numeros[i] - 1;
									
							}
									
						System.out.print("El número "+numeros[i]);
					}
								
								
					System.out.println(" que corresponde al equipo --> "+Bombo3[variableGuardada15]);
								
					System.out.println("Ya tenemos el 5º GRUPO lo componen "+Bombo1[variableGuardada13]+", "
									+ ""+Bombo2[variableGuardada14]+" y "+Bombo3[variableGuardada15]);
							
				break;
				
				
				case 6:
					
					System.out.println("\nVamos a por el grupo 6 que lo sacará "+Felipe);
							
					for (int i=0 ; i<tope; i++) {
								
						numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
									
						variableGuardada16 = numeros[i] - 1;
								
							while (variableGuardada16 == variableGuardada1 || variableGuardada16 == variableGuardada4 || variableGuardada16 == variableGuardada7 || variableGuardada16 == variableGuardada10
									|| variableGuardada16 == variableGuardada13){
									
								numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
									
								variableGuardada16 = numeros[i] - 1;
									
							}
								
						System.out.print("El número "+numeros[i]);
					}
							
					System.out.println(" que corresponde al equipo --> "+Bombo1[variableGuardada16]);						
								
					for (int i=0 ; i<tope; i++) {
								
						numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
									
						variableGuardada17 = numeros[i] - 1;
								
							while (variableGuardada17 == variableGuardada2 || variableGuardada17 == variableGuardada5 || variableGuardada17 == variableGuardada8 || variableGuardada17 == variableGuardada11
									|| variableGuardada17 == variableGuardada14){
								
								numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
									
								variableGuardada17 = numeros[i] - 1;
									
								}
									
						System.out.print("El número "+numeros[i]);
					}
								
					System.out.println(" que corresponde al equipo --> "+Bombo2[variableGuardada17]);
					
								
					for (int i=0 ; i<tope; i++) {
									
						numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
										
						variableGuardada18 = numeros[i] - 1;
								
							while (variableGuardada18 == variableGuardada3 || variableGuardada18 == variableGuardada6 || variableGuardada18 == variableGuardada9 || variableGuardada18 == variableGuardada12
									|| variableGuardada18 == variableGuardada15){
									
								numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
									
								variableGuardada18 = numeros[i] - 1;
									
							}
									
						System.out.print("El número "+numeros[i]);
					}
								
								
					System.out.println(" que corresponde al equipo --> "+Bombo3[variableGuardada18]);
								
					System.out.println("Ya tenemos el 6º GRUPO lo componen "+Bombo1[variableGuardada16]+", "
							+ ""+Bombo2[variableGuardada17]+" y "+Bombo3[variableGuardada18]);
						
				break;
						
				
				case 7:
					
					System.out.println("\nPenúltimo grupo para dar por comienzo la Champions de este año");
					System.out.println("Este grupo lo sacará el "+Torrente);
							
					for (int i=0 ; i<tope; i++) {
								
						numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
									
						variableGuardada19 = numeros[i] - 1;
								
							while (variableGuardada19 == variableGuardada1 || variableGuardada19 == variableGuardada4 || variableGuardada19 == variableGuardada7 || variableGuardada19 == variableGuardada10
									|| variableGuardada19 == variableGuardada13 || variableGuardada19 == variableGuardada16){
									
								numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
									
								variableGuardada19 = numeros[i] - 1;
									
							}
								
						System.out.print("El número "+numeros[i]);
					}
							
					System.out.println(" que corresponde al equipo --> "+Bombo1[variableGuardada19]);						
								
					for (int i=0 ; i<tope; i++) {
								
						numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
									
						variableGuardada20 = numeros[i] - 1;
								
							while (variableGuardada20 == variableGuardada2 || variableGuardada20 == variableGuardada5 || variableGuardada20 == variableGuardada8 || variableGuardada20 == variableGuardada11
									|| variableGuardada20 == variableGuardada14 || variableGuardada20 == variableGuardada17){
								
								numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
									
								variableGuardada20 = numeros[i] - 1;
									
							}
									
						System.out.print("El número "+numeros[i]);
					}
								
					System.out.println(" que corresponde al equipo --> "+Bombo2[variableGuardada20]);
					
								
					for (int i=0 ; i<tope; i++) {
									
						numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
										
						variableGuardada21 = numeros[i] - 1;
								
							while (variableGuardada21 == variableGuardada3 || variableGuardada21 == variableGuardada6 || variableGuardada21 == variableGuardada9 || variableGuardada21 == variableGuardada12
									|| variableGuardada21 == variableGuardada15 || variableGuardada21 == variableGuardada18){
									
								numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
									
								variableGuardada21 = numeros[i] - 1;
									
							}
									
						System.out.print("El número "+numeros[i]);
					}
								
								
					System.out.println(" que corresponde al equipo --> "+Bombo3[variableGuardada21]);
								
					System.out.println("Ya tenemos el 7º GRUPO lo componen "+Bombo1[variableGuardada19]+", "
									+ ""+Bombo2[variableGuardada20]+" y "+Bombo3[variableGuardada21]);
					
				break;
				
					
				case 8:
					
					System.out.println("\nY por último y por ello no menos importante sacará el último grupo el inigualable "+Bicho);
							
					for (int i=0 ; i<tope; i++) {
								
						numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
									
						variableGuardada22 = numeros[i] - 1;
								
							while (variableGuardada22 == variableGuardada1 || variableGuardada22 == variableGuardada4 || variableGuardada22 == variableGuardada7 || variableGuardada22 == variableGuardada10
									|| variableGuardada22 == variableGuardada13 || variableGuardada22 == variableGuardada16 || variableGuardada22 == variableGuardada19){
									
								numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
									
								variableGuardada22 = numeros[i] - 1;
									
							}
								
						System.out.print("El número "+numeros[i]);
					}
							
					System.out.println(" que corresponde al equipo --> "+Bombo1[variableGuardada22]);						
								
					for (int i=0 ; i<tope; i++) {
								
						numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
									
						variableGuardada23 = numeros[i] - 1;
								
							while (variableGuardada23 == variableGuardada2 || variableGuardada23 == variableGuardada5 || variableGuardada23 == variableGuardada8 || variableGuardada23 == variableGuardada11
									|| variableGuardada23 == variableGuardada14 || variableGuardada23 == variableGuardada17 || variableGuardada23 == variableGuardada20){
									
								numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
									
								variableGuardada23 = numeros[i] - 1;
									
							}
									
						System.out.print("El número "+numeros[i]);
					}
								
					System.out.println(" que corresponde al equipo --> "+Bombo2[variableGuardada23]);
					
								
					for (int i=0 ; i<tope; i++) {
									
						numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
										
						variableGuardada24 = numeros[i] - 1;
								
							while (variableGuardada24 == variableGuardada3 || variableGuardada24 == variableGuardada6 || variableGuardada24 == variableGuardada9 || variableGuardada24 == variableGuardada12
									|| variableGuardada24 == variableGuardada15 || variableGuardada24 == variableGuardada18 || variableGuardada24 == variableGuardada21){
									
								numeros[i] = rnd.nextInt(hasta-desde+1)+desde;
									
								variableGuardada24 = numeros[i] - 1;
									
							}
									
						System.out.print("El número "+numeros[i]);
					}
								
								
					System.out.println(" que corresponde al equipo --> "+Bombo3[variableGuardada24]);
								
					System.out.println("Ya tenemos el 8º GRUPO lo componen "+Bombo1[variableGuardada22]+", "
										+ ""+Bombo2[variableGuardada23]+" y "+Bombo3[variableGuardada24]);
					
				break;
				
				
				case 0: 
					System.out.println("Ya tenemos todos los equipos en sus respectivos grupos");
					
					System.out.println("Grupo 1 --> "+Bombo1[variableGuardada1]+" // "+Bombo2[variableGuardada2]+" // "+Bombo3[variableGuardada3]);
					System.out.println("");
					System.out.println("Grupo 2 --> "+Bombo1[variableGuardada4]+" // "+Bombo2[variableGuardada5]+" // "+Bombo3[variableGuardada6]);
					System.out.println("");
					System.out.println("Grupo 3 --> "+Bombo1[variableGuardada7]+" // "+Bombo2[variableGuardada8]+" // "+Bombo3[variableGuardada9]);
					System.out.println("");
					System.out.println("Grupo 4 --> "+Bombo1[variableGuardada10]+" // "+Bombo2[variableGuardada11]+" // "+Bombo3[variableGuardada12]);
					System.out.println("");
					System.out.println("Grupo 5 --> "+Bombo1[variableGuardada13]+" // "+Bombo2[variableGuardada14]+" // "+Bombo3[variableGuardada15]);
					System.out.println("");
					System.out.println("Grupo 6 --> "+Bombo1[variableGuardada16]+" // "+Bombo2[variableGuardada17]+" // "+Bombo3[variableGuardada18]);
					System.out.println("");
					System.out.println("Grupo 7 --> "+Bombo1[variableGuardada19]+" // "+Bombo2[variableGuardada20]+" // "+Bombo3[variableGuardada21]);
					System.out.println("");
					System.out.println("Grupo 8 --> "+Bombo1[variableGuardada22]+" // "+Bombo2[variableGuardada23]+" // "+Bombo3[variableGuardada24]);
					System.out.println("");
					
					System.out.println("Suerte en esta etapa");
					
					opcion++;
				break;
				
				
				default:
					System.out.println("Por favor ingrese un número comentado anteriormente");
					
			}
			
		}
		
	}
	
}
