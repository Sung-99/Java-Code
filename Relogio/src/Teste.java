
public class Teste {

	public static void main(String[] args) {
		//Creating my new object from Relogio class
		Relogio relogio = new Relogio();
		
		for(int x = 0; x <= 23; x++){
			for(int y = 0; y <= 59; y++) {
				//Making my clock work with TIC TAC method
				relogio.TicTac();
				//Showw
				System.out.println(relogio.exibe());
			}
		}
		
	}

}
