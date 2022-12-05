

/**
 *
 * @author vitor
 */
public class Jogador {
    private Carta[] mao;
    //How much cards will a player have in hand ? so my parameter will received from mesa class
    public Jogador (int quantidade){
        mao = new Carta[quantidade];
    }
    
    //Choose the greater number in my hand, and the symbol with advantage method
    public Carta escolherEjogarMaiorCarta(){
        Carta maiorvalor = mao[0];
        int posicaoMaior = 0;
        int j = 0;
        
        while(mao[j] == null){
            j++;
        }
        
        maiorvalor = mao[j];
        
        for(int i = 1; i<mao.length; i++){
            if (mao[i] != null){
                if(maiorvalor.getValor() < mao[i].getValor()){
                  maiorvalor = mao[i];
                    posicaoMaior = i;
                } 
            }
        }  
        mao[posicaoMaior] = null;
        
        return maiorvalor;
    }

    public Carta[] getMao() {
        return mao;
    }

    public void setMao(Carta[] mao) {
        this.mao = mao;
    }
    
}
