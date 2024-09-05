/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vitor
 */
public class AssalariadoComissionado extends Comissionado {
    private double PercentualBonus;

    public double getPercentualBonus() {
        return PercentualBonus;
    }

    public void setPercentualBonus(double PercentualBonus) {
        this.PercentualBonus = PercentualBonus;
    }
    
    public AssalariadoComissionado(double valorVendas, double PercentualBonus, String nome, String sobrenome, int numeroIdentidade){
        super(valorVendas ,nome, sobrenome, numeroIdentidade);
        this.PercentualBonus = PercentualBonus;
    }
    
    @Override
    public double getValorAPagar(int dia, int mes) {
        return ControlePagamento.SALARIO+(ControlePagamento.SALARIO*PercentualBonus);
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
