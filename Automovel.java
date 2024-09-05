/*Encapsulamento, onde acesso as variaveis da minha classe por meio de get e setter, sem ter contato diretamente
 * com o valor da classe
 */
public class Automovel{
    private int placa;
    private int chassi;


    public Automovel(int placa, int chassi){
        this.placa = placa;
        this.chassi = chassi;
    }
    

    

    public int getPlaca(){
        return placa;
    }

    public int getChassi(){
        return chassi;
    }
    public void setterPlaca(int N_placa){
        this.placa = N_placa;
        
    }

    public void setterChassi(int N_chassi){
        this.chassi = N_chassi;
    }

}


/*Herança é mostrado na minha classe automovel herdande a placa e o chassi da classe automovel */

public class FiatUno extends Automovel{
    private int TanqueGasol;
    private int portas;

    

    public FiatUno(int TanqueGasol, int portas, int placa , int chassi){
        super(placa,chassi);

        this.TanqueGasol = TanqueGasol;
        this.portas = portas;
    }

   

    

    public int getPlaca(){
        return TanqueGasol;
    }

    public int getChassi(){
        return portas;
    }

}


/*Composição, onde um objeto pode assumir a coleção de varios outros objetos como atributo*/
 class LojaCarro {
    private Carro[] Carros;
    

    public LojaCarro(){
       
        this.Carros = new Carro[10];
        this.Carros[0] = new Carro("GOL","BRUUUM",56546546,5645444);    
    }

    


}


/*Polimorfismo, onde cada carro(objeto) pode ter seu proprio barulho(caracteristica,função metodo) quando instanciado*/
class Carro extends Automovel {
    private String Carro;
    private String Som;

    public Carro(String Carro, String Som, int chassi, int placa){
        super(chassi,placa);
        this.Som = Som;
        this.Carro = Carro;
           
    }

    public void SomCarro(){
       System.out.println(""+this.Som);
    }


}