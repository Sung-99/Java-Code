
public class CaixaDeBrinquedo {
		private Forma brinquedos[];
		private int iterador;
		private int adc = 0;
		
		public CaixaDeBrinquedo(){
			this.brinquedos = new Forma[6];
			iterador = 0;
		}
	
		public void MostrarFigura() {
		  for(iterador = 0;iterador < 6;iterador++) {
			  if(brinquedos[iterador] != null ) {
			  	System.out.print("eu sou o mais "+((Bidimensional)brinquedos[iterador]).getNome()+" e minha area é "  + brinquedos[iterador].ObterArea());
			  	
			  }
		  }
		}
		
		public void adcFigura(Forma x) {
			
				brinquedos[adc] = x;
				adc++;
		}
}
