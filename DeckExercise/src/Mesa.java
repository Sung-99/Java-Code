
import java.util.Scanner;


/*
 *
 * @author vitor
 */
public class Mesa {
       public static void main(String[] args) {
       
        //Read a input from user   
        Scanner input = new Scanner(System.in);
        
        //Creating a new Baralho object(from Baralho class)
        Baralho copag = new Baralho();
        
        //Creating a two new Carta object (from Carta class)
        Carta c1 = new Carta();
        Carta c2 = new Carta();
        
        //Call embaralharCartas method from copag object(from Baralho)
        System.out.println("Mesa embaralhando...");
        copag.embaralharCartas();
        
        //How much cards will be deliver to each player
        System.out.println("Informe o numero de cartas a distribuir");
        int quantidade = input.nextInt();
        System.out.println("Distribuindo cartas....");
        
        //Creating my player from Jogador class, sending a quantity as parameter
        Jogador jogadorA = new Jogador(quantidade);
        Jogador jogadorB = new Jogador(quantidade);
        
        //Set cards on each player's hand 
         jogadorA.setMao(copag.distribuirCartas(quantidade));
         jogadorB.setMao(copag.distribuirCartas(quantidade));
         
         //Choose the best card(the greater one and with the best symbol)
         int JogadorcartaA = jogadorA.escolherEjogarMaiorCarta().getValor();//valores apenas
         int JogadorcartaB = jogadorA.escolherEjogarMaiorCarta().getValor();//valores apenas
         String JogadorNaipeA = jogadorA.escolherEjogarMaiorCarta().getNaipe();//Naipes apenas
         String JogadorNaipeB = jogadorB.escolherEjogarMaiorCarta().getNaipe();//Naipes apenas
         c1.setNaipe(JogadorNaipeA);
         c2.setNaipe(JogadorNaipeB);
         System.out.println("O jogador A joga a carta "
                 + JogadorcartaA
                 + " de "+ JogadorNaipeA);
         System.out.println("O jogador B joga a carta "
                 + JogadorcartaB
                 + " de "+ JogadorNaipeB);
         
         if(JogadorcartaA > JogadorcartaB){
               System.out.println("Jogador A ganhou com a carta "+
                      JogadorcartaA
                 + " de "+JogadorNaipeA );
         }else if(JogadorcartaA < JogadorcartaB){
             System.out.println("Jogador B ganhou com a carta"+
                     JogadorcartaB
                 + " de "+ JogadorNaipeB);
         }else if(JogadorcartaA == JogadorcartaB){
             if(c1.comparaNaipe(JogadorNaipeB)==true){
                 System.out.println("Jogador A ganhou com a carta "+
                      JogadorcartaA
                 + " de "+JogadorNaipeA );
             }
             else if(c2.comparaNaipe(JogadorNaipeA)==true){
                 System.out.println("Jogador B ganhou com a carta "+
                      JogadorcartaB
                 + " de "+JogadorNaipeB );
            
             }else{
                  System.out.println("EMPATE");
             }
         }
         
    }
}
