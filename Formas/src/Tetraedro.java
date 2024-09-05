import java.lang.Math;
public class Tetraedro extends Tridimensional implements Forma{
		double aresta;
// 		tetrahedron*
		public Tetraedro(String nome, double aresta) {
			
		}
		public double ObterArea() {
		
			return (Math.pow(aresta,2)*Math.sqrt(3));
		}	
		public double ObterVolume() {
			
			return (Math.pow(aresta,3)*Math.sqrt(2))/2;
		}
}
