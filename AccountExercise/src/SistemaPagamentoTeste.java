
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vitor
 */
public class SistemaPagamentoTeste {
    public static void main(String[] args) {
        //Create an add object from my ControlePagamento class
       ControlePagamento adc = new ControlePagamento();
        
        //Input from user in my IN variable
        Scanner in = new Scanner(System.in);
        
        //Create a serie of object from my classes and adding them in my adc object
       Assalariado f = new Assalariado(1,"Vitorrrrr","hugo",98789);
       adc.adicionaItemPagavel(f);
       Comissionado c = new Comissionado(3,"Bocaoooo","da Silva",12412);
       adc.adicionaItemPagavel(new Comissionado(6,"pedro","henrique",89777));
       adc.adicionaItemPagavel(new AssalariadoComissionado(1,4,"rosa","da moreira",79237));
       adc.adicionaItemPagavel(new Terceirizado(1,"jao","carlos",79237));
       adc.adicionaItemPagavel(new Terceirizado(6,"Gabriel","Lagunes",4324));
       adc.adicionaItemPagavel(new Titulo(25,04,5000));
       adc.adicionaItemPagavel(new Titulo(25,01,1800));
       adc.adicionaItemPagavel(new Concessionaria(01,8,3940));
       adc.adicionaItemPagavel(new Concessionaria(20,07,2987));
        //Show in a ordered/unodered list
       adc.listarFunc(07,1);
       System.out.println("Valor total pago aos empregados e: " + 
               adc.valorPagoTotalEmpregado(20, 04));
       System.out.println("Valor total pago a contas e: " + 
               adc.calculaValorAPagarContas(30, 04));
       System.out.println("Valor total pago em contas e funcionarios e " + 
               adc.calculaValorAPagar(20, 04));
     
       Comissionado cc = new Comissionado(3,"Bocao","da Silva",12412);
       Assalariado fff = new Assalariado(1,"Vitor","hugo",98789);
       adc.adicionaItemPagavel(cc);
       adc.adicionaItemPagavel(c);
        //Test my remove method
       adc.remover(f);
      
       adc.adicionaItemPagavel(fff);
        adc.listarFunc(07,1);
        adc.adicionaItemPagavel(f);
        adc.listarFunc(07,1);
    }
}
