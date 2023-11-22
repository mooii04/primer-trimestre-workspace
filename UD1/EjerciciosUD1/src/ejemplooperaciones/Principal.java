package ejemplooperaciones;

public class Principal {

	public static void main(String[] args) {

		
		int num1=23;
		int num2=2;
		int resultado=0;
		
		double numdec1=0.5;
		double resul=0.0;
		
		System.out.println("Bienvenido, vamos a multiplicar dos números");
		
			//Aquí irá la lectura por teclado
	
	//Operaciones con números sin decimales
		resultado=num1*num2;
		System.out.println("El resultado es: "+resultado);
		//System.out.println("Otra forma: "+(num1*num2));		
		
	//Operaciones con números con decimales
		resul=numdec1*num2;
		System.out.println("El resultado es: "+resul);
		
		resul=numdec1*num1;
		System.out.println("El resultado es: "+resul);
		
		
		
	}
	
}
