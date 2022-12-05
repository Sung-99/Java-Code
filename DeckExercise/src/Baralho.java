/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vitor
 */
import java.util.Random;
public class Baralho {

    private Carta[] baralho;//vector of Cards from Baralho class
    private String[] naipes = {"Ouro", "Paus", "Espada", "Copas"};
    private Random gerador = new Random();
    
    
    //Creating cards method for my deck
    public Baralho(){
        //Creating a Carta object vector from Carta class with 52 positions
        baralho = new Carta[52];
        int k = 0;
       //Creating a standard deck of cards, to shuffle afterward
        for(int j = 0; j< naipes.length;j++){
            for(int i = 0;i< 13;i++){
                baralho[k] = new Carta((i+1),naipes[j]);     
                k++;
            }
        }
    }
    //shuffle method 
    public void embaralharCartas(){
                
        Carta aux;
        int posicao;
         //shuffle my Cards
        for(int i=0;i< baralho.length;i++){
           posicao = gerador.nextInt(52);
           aux = baralho[i];
           baralho[i] = baralho[posicao];
           baralho[posicao] = aux;
            
        }
    }
    //Distribute cards vector method to players
    public Carta[] distribuirCartas(int quantidade){
        Carta[] retorno = new Carta[quantidade];
        int aux;
        for(int i=0;i<quantidade;i++){
            aux = gerador.nextInt(52);
            while (baralho[aux] == null){
                //random Generate way with random class
                aux = gerador.nextInt(52);
            }
            retorno[i] = baralho[aux];
            baralho[aux] = null;
        }
        return retorno;
    }
    
    
    
}


