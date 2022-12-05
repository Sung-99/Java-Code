/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 **/

/**
 *
 * @author vitor
 */
public class Carta {
    private int valor;
    private String naipe;
    
    public Carta(){
        this.naipe = "";
        this.valor = 0;
    }
    
    public Carta(int valor, String naipe){
        this.valor = valor;
        this.naipe = naipe;
    }
    //The greater one(cards) win
    public int comparaValor(Carta carta){
        if(valor > carta.getValor()){
            return 1;
        } else {
            if (valor < carta.getValor()){
                return -1;
            }else {
                return 0;
            }
        }
    }
    //the most strong symbol wins
    public boolean comparaNaipe(String carta){
        if (naipe.equals("Ouro")){
            if(!carta.equals("Ouro"))
            return true;
        }
        return false;
    }
    
    public int getValor(){
        return valor;
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
    public String getNaipe(){
        return naipe;
    }
    
    public void setNaipe(String naipe){
        this.naipe = naipe;
    }
}
