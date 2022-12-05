/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vitor
 */
public class Terceirizado  extends Empregado{
    private double horasTrabalhadas;

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public Terceirizado(double horasTrabalhadas, String nome, String sobrenome, int numeroIdentidade){
        super(nome, sobrenome, numeroIdentidade);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double getValorAPagar(int dia, int mes) {
            return ControlePagamento.SALARIO + (horasTrabalhadas * ControlePagamento.HORA);
        }
     @Override
      public boolean equals(Pagavel p) {
            if(p instanceof Empregado){
              if(p != null){  
                return ((Empregado)p).nome.equals(this.nome);
                }
            }
            return false;
        }
      
    
    
}
