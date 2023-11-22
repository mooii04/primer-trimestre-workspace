package ejercicio07;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float preciogasolinaporlitro=1.809f;
		double kilometros=300;
		double kilometrosporlitro=13;
		double litrospor345km=0.0;
		double preciopor345km=0.00;
		
		
		litrospor345km=kilometros/kilometrosporlitro;
		preciopor345km=litrospor345km*preciogasolinaporlitro;
		
		System.out.printf("La media de kilometros que podemos llegar a conducir con 1 litro es de %.2f km,"
				+ "\npor lo que obtenemos que en %.2f km gastamos %.2f Litros y por ello tenemos que"
				+ "\ngastarnos un total de %.2f€",kilometrosporlitro,kilometros,litrospor345km,preciopor345km);
		
	}

}
