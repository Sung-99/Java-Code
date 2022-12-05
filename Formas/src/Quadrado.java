
public class Quadrado extends Bidimensional implements Forma{
	private double l;
	//square*
	public Quadrado(String nome, double l) {
		super(nome);
		this.l = l;
	}
	
	public double ObterArea() {
		
		return l*l;
	}
	
	
}
