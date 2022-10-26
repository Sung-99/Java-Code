
public class Circulo extends Bidimensional implements Forma{
	double r;
	
	public Circulo(String nome, double r) {
		super(nome);
	}
	
	public double ObterArea() {
		
		return r*r*3.14;
	}
}
