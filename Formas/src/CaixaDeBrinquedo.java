
public class CaixaDeBrinquedo {
		private Forma brinquedos[];//Create a array of toys, forma(interface) type
		private int iterador;
		private int adc = 0;
		
	        //6 objects created
		public CaixaDeBrinquedo(){
			this.brinquedos = new Forma[6];
			iterador = 0;
		}
		//Show my figure
		public void MostrarFigura() {
		  for(iterador = 0;iterador < 6;iterador++) {
			  if(brinquedos[iterador] != null ) {
				  //I have to cast it to a bidimensional characteristics 
			  	System.out.print("eu sou o mais "+((Bidimensional)brinquedos[iterador]).getNome()+" e minha area é "  + brinquedos[iterador].ObterArea());
			  	
			  }
		  }
		}
		//Just adc object to my toy's array
		public void adcFigura(Forma x) {
			
				brinquedos[adc] = x;
				adc++;
		}
}
