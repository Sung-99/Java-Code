/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vitor
 */
public class Titulo extends Conta {
    
    public Titulo(int dia, int mes, double valor){
        super(dia, mes, valor);
    }

    
    @Override
    public double getValorAPagar(int diaPagto, int mesPagto) {
        if (diaPagto > this.dia){
            return ((((diaPagto-this.dia)*1.1)/100)*this.valor)+this.valor;
        }
        return this.valor;
    }
    
    @Override
    public boolean equals(Pagavel p) {
            return false;
        }
}
