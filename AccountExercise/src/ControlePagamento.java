/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vitor
 */
public class ControlePagamento {
    public static final double SALARIO = 1212.0;
    public static final double HORA = 30.0;
    private Pagavel[] controlePagamento;
    private int posicao;
    private int armazenaPosi;
    
    
    public ControlePagamento(){
        this.controlePagamento = new Pagavel[10];// declaring my Interface object
        this.posicao = 0;
        this.armazenaPosi = 0;
    }
    //add method
    public void adicionaItemPagavel(Pagavel item){
        if(posicao<10){
            controlePagamento[posicao] = item;
            posicao++;
        }
        if(posicao >= 10){
            for( posicao = 0; posicao < controlePagamento.length; posicao++){
                if(controlePagamento[posicao] instanceof Empregado){
                   if(controlePagamento[posicao] == null ){ 
                    armazenaPosi = posicao;
                    break;
                   }
                }
            }
            for(posicao = 0; posicao < controlePagamento.length; posicao++){
                if(controlePagamento[posicao] instanceof Empregado){
                  if( posicao == armazenaPosi){  
                    controlePagamento[posicao] = item;
                    break;
                  }
                }
            }
        }
    }
    public double valorPagoTotalEmpregado(int dia, int mes){
         double tot = 0.0;
        for (Pagavel controlePagamento1 : controlePagamento) {
            if (controlePagamento1 != null && controlePagamento1 instanceof Empregado) {
                tot = controlePagamento1.getValorAPagar(dia, mes) + tot;
            }
        }
        return tot;
    
    }
    public double valorPagoTotalConta(int dia, int mes){
         double tot = 0.0;
        for (Pagavel controlePagamento1 : controlePagamento) {
            if (controlePagamento1 != null && controlePagamento1 instanceof Conta) {
                tot = controlePagamento1.getValorAPagar(dia, mes) + tot;
            }
        }
        return tot;
    
    }
    //remove item method
    public void remover(Pagavel z){
        for (int x = 0; x < controlePagamento.length; x++){
            if(controlePagamento[x] instanceof Empregado){
                if(controlePagamento[x].equals(z)){
                    controlePagamento[x] = null;
                    
                }
            }
        }
    }
    //show my employer in a list
    public void listarFunc(int dia, int mes){//Lista funcionarios
          for(Pagavel item : controlePagamento){
              if(item != null){
                  if(item instanceof Empregado empregado){
                       System.out.println("O funcionario:"+
                       empregado.getNome() + empregado.getSobrenome() + 
                        " Recebeu:"+empregado.getValorAPagar(dia, mes));
                  }
                   
              }
          }
    }
    //Calculate taxes
    public double calculaValorAPagarContas(int dia, int mes){
        double retorno = 0;
        
        for(Pagavel item : controlePagamento){
            if (item instanceof Conta){
                retorno = retorno + item.getValorAPagar(dia, mes);
            }
        }
        return retorno;
    }
    //Calculate a wage
    public double calculaValorAPagar(int dia, int mes){
        double retorno = 0;
        
        for(Pagavel item : controlePagamento){
            if(item != null){
                retorno = retorno + item.getValorAPagar(dia, mes);
            }
        }
        return retorno;
    }
}
