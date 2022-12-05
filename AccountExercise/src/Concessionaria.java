/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vitor
 */
public class Concessionaria extends Conta{
    
    public Concessionaria(int dia, int mes, double valor){
        super(dia, mes, valor);
    
    }

    @Override
    public double getValorAPagar(int dia, int mes) {
         return this.valor;
     }
     @Override
      public boolean equals(Pagavel p) {
            return false;
        }
}
