
public class Esfera extends Tridimensional implements Forma{
	double r;
	
	//Sphere*
		public Esfera(String nome, double r) {
		
		}
	
	public double ObterArea() {
		return (4*Math.PI*Math.pow(r, 2));
	}	
	public double ObterVolume() {
		
		return (4*Math.PI*Math.pow(r, 3))/3;
	}
}
