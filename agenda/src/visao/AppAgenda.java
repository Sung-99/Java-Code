package visao;
import java.io.IOException;
// Nome :Vitor Hugo Mota
//Obs: Peguei como base o que o Vitor Martins e a Ana fez, fico bem igual porque nao tava conseguindo pensar em nada.

import negocio.Agenda;
import negocio.Contato;

public class AppAgenda {
     public static void main(String args[]) throws IOException {
    	  Agenda agenda = new Agenda();
    	 
    	  Contato contato1 = new Contato("Pedro augusto barbosa","995602014", "Rua azevaldo,12413,Centro(Apt582)", "augusto987@gmail.com");
    	  Contato contato2 = new Contato("Gabriel jonson da silva","40028922","Rua voadora,4865,riacho","jonson33@gmail.com");
    	  Contato contato3 = new Contato("Lachica da silva", "22982004","Avenida voando alto, 111,cabrons " , "lachia99@gmail.com ");
    	  agenda.incluirContato(contato1);
    	  agenda.incluirContato(contato2);
    	  agenda.incluirContato(contato3);
    	  Contato contatoRetorno = agenda.consultarContato("Ronaldo Pereira Silva");
    	  System.out.printf(" %n Agenda %n Consulta de Contato%nNome:%s%nNumero de Telefone:%s%nEndereço:%s%nEmail:%s%n",
    	  contatoRetorno.getNome(),contatoRetorno.getTelefone(),contatoRetorno.getEndereço(),contatoRetorno.getEmail());
    	  System.out.println("Consultando contatos....");
    	  if(agenda.existeContato("Denise Moreira Faria")==true) {
    		  System.out.println("Contato existe na agenda!");
    	  }
    	  else {
    		  System.out.println("Contato não existe na agenda!");
    	  }
    	  System.out.println("Removendo contatos....");
    	  agenda.removerContato("Pedro augusto barbosa");
    	  if(agenda.existeContato("Pedro augusto barbosa")==true) {
    		  System.out.println("Contato existe na agenda!");
    	  }
    	  else {
    		  System.out.println("Contato não existe na agenda!");
    	  }
    	  System.out.println("Lista de todos os contato: ");
    	  agenda.persistirAgenda();
    	  agenda.lerAgenda();
    	  
     }
}
