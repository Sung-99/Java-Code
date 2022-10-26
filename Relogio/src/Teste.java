
public class Teste {

	public static void main(String[] args) {
		Relogio relogio = new Relogio();
		
		for(int x = 0; x <= 23; x++){
			for(int y = 0; y <= 59; y++) {
				relogio.TicTac();
				System.out.println(relogio.exibe());
			}
		}
		
	}

}
