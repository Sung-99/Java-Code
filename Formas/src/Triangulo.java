
public class Triangulo extends Bidimensional implements Forma{
	double b;
	double h;
	
	//triangle*
	public Triangulo(String nome, double b, double h) {
		super(nome);
	}
	
	public double ObterArea() {
		
			return (b*h)/2;
		}
}
