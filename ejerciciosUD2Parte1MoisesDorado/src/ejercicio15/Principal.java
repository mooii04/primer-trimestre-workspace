package ejercicio15;
import utilidades.Leer;
public class Principal {
	public static void main(String[] args) {
		
		System.out.println("Bienvenido, a ver esas notas");
		
		float nota;
		float notaa = 0;
		int numeroNota;
		float notaMedia = 0f;
		int numeroNotas = 6;
		int suspensos = 0;
		int suspensoos = 0;
		do {
			System.out.println("Pulsa 1 para comenzar a introducir las notas o pulsa 0 para salir del programa");
			numeroNota = Leer.datoInt();
			
			switch (numeroNota) {
			
			case 1:
				System.out.println("Introduce la nota de mates");
				nota = Leer.datoFloat();
				if (nota < 5) {
					suspensos=suspensoos++;
				}
				notaa = 0 + nota;
				System.out.println("Introduce la nota de lengua");
				nota = Leer.datoFloat();
				if (nota < 5) {
					suspensos = suspensoos++;
				}
				notaa = notaa + nota;
				System.out.println("Introduce la nota de inglés");
				nota = Leer.datoFloat();
				if (nota < 5) {
					suspensos = suspensoos++;
				}
				notaa = notaa + nota;
				System.out.println("Introduce la nota de física");
				nota = Leer.datoFloat();
				if (nota < 5) {
					suspensos = suspensoos++;
				}
				notaa = notaa + nota;
				System.out.println("Introduce la nota de química");
				nota = Leer.datoFloat();
				if (nota < 5) {
					suspensos = suspensoos++;
				}
				notaa = notaa + nota;
				System.out.println("Introduce la nota de filosofía");
				nota = Leer.datoFloat();
				if (nota < 5) {
					suspensos = suspensoos++;
				}
				notaa = notaa + nota;
				break;
			case 0:
				System.out.println("Adiós");
				break;
				default:
					System.out.println("Opción no válida\n");
					break;
			}
			notaMedia = notaa / numeroNotas;
			if (numeroNota == 1 || numeroNota == 0){
			System.out.printf("Tu media es de %.2f y has tenido "+suspensoos+" suspensos\n",notaMedia);
			}else {
				System.out.println("No se ha podido calcular tu media porque has introducido un número erróneo");
				}
			
			
			}while (numeroNota != 0);
		
	}
}

