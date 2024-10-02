package essesConstrutores;

public class Animal {
	private float tamanho;
	private String cor;
	
	public Animal () {
	}
	
	public Animal(float tamanho) {
		this.tamanho = 3.50f;
	}
	
	public Animal(float tamanho, String cor) {
		this.tamanho = 3.50f;
		this.cor = cor;
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = 3.50f;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
}
