/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vitor
 */
public class Comissionado extends Empregado{
    private double valorVendas;

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas*0.6;
    }
    
    public Comissionado(double valorVendas, String nome, String sobrenome, int numeroIdentidade){
        super(nome, sobrenome, numeroIdentidade);
        this.valorVendas = valorVendas;
    }

    @Override
    public double getValorAPagar(int dia, int mes) {
        return (valorVendas*0.06) + ControlePagamento.SALARIO+(ControlePagamento.SALARIO*0.01);
    }
    @Override
      public boolean equals(Pagavel p) {
            if(p instanceof Empregado empregado){
              if(empregado != null){  
                return empregado.nome.equals(this.nome);
                }
            }
            return false;
        }
    
}
