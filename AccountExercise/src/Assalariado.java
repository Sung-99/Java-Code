/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author vitor
 */
public class Assalariado extends Empregado{
    private double horaExtra;

    public double getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(double horaExtra) {
        this.horaExtra = horaExtra;
    }

    public Assalariado(double horaExtra, String nome, String sobrenome, int numeroIdentidade) {
        super(nome, sobrenome, numeroIdentidade);
        this.horaExtra = horaExtra;
    }
     
    

    @Override
    public double getValorAPagar(int dia, int mes) {
        return ControlePagamento.SALARIO + (horaExtra * ControlePagamento.HORA);
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
