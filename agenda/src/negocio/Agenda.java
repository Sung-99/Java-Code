package negocio;

import java.util.Set;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import servicos.ManipulaArquivoTexto;
public class Agenda {
 private HashMap<String,Contato> contatos = new HashMap<>();
   public Agenda() {
	   
   }
  public boolean incluirContato(Contato contato) {
	 contatos.put(contato.getNome(),contato);
		  return true;
	  
  }
    public boolean existeContato(String nome) {
    if(contatos.containsKey(nome)==true) {
    	return true;
    }
    else
    	return false;
    }
    
    public Contato consultarContato(String nome) {
		
    	if(contatos.containsKey(nome)==true) {
           return contatos.get(nome);
    	}
    	else {
		return null;
    	}
		
    	
    }
    public void persistirAgenda() throws IOException {
    	ManipulaArquivoTexto agenda = new ManipulaArquivoTexto("agenda.txt");
    	agenda.abrirArquivoParaGravacao();
    	 // Para adicionar um contato no hash map contatos
    	//  O hash precisa ser salvo por indices(posicao da chave)
    	// O hash transforma indice em chave 
    	Set<String> chaves = contatos.keySet();
          
          for(String key :chaves){
              agenda.gravarContato(contatos.get(key));
          }
         // for(Contato contato : contatos.values()) {
        	//  agenda.gravarContato(contato);
        //  }
    	
    	agenda.fecharArquivoGravacao();
    	
    }
    public void lerAgenda() {
    	ManipulaArquivoTexto agenda = new ManipulaArquivoTexto("agenda.txt");
    	agenda.abrirArquivoParaLeitura();
    	ArrayList<Contato> print = new ArrayList<>();
    	print = agenda.lerArquivo();
    	//  Tipo do objeto variavel qualquer : nome do ArrayList
    	for(Contato ler : print) {
    		System.out.printf(" %n Agenda %n Contatos:%nNome:%s%nNumero de Telefone:%s%nEndereço:%s%nEmail:%s%n",
    				ler.getNome(),ler.getTelefone(),ler.getEndereço(),ler.getEmail());
    	}
    	agenda.fecharArquivoLeitura();
    }
    public void removerContato(String nome) {
    	contatos.remove(nome);
    }
	public HashMap<String, Contato> getContatos() {
		return contatos;
	}
	public void setContatos(HashMap<String, Contato> contatos) {
		this.contatos = contatos;
	}
}
