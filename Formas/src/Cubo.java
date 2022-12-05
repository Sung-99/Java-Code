
public class Cubo extends Tridimensional implements Forma{
	double aresta;
	//----cube
	public Cubo(String nome, double aresta) {
		
	}
	
	
	public double ObterArea() {
		
		return (Math.pow(aresta,2))*6;
	}	
	public double ObterVolume() {
		
		return (Math.pow(aresta,3));
	}

}
