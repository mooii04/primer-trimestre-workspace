package ejercicio05;

public class Copiado {

	private String frase;
	private int num;
	
	public Copiado(String frase, int num) {
		super();
		this.frase = frase;
		this.num = num;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String repetirFrase () {
		
		for (int i=0; i < num; i++) {
			System.out.println(frase);
		}
		return frase;
	}
	
}
