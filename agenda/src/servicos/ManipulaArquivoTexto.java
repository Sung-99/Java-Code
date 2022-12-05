package servicos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import negocio.Contato;

public class ManipulaArquivoTexto {
  private File arquivo;
  private Formatter gravador;
  private Scanner leitor;
 
  public ManipulaArquivoTexto(String nomeArquivo) {
	  arquivo = new File(nomeArquivo);
  }
  public void abrirArquivoParaGravacao() {
	  try {
		  gravador = new Formatter(arquivo);
	  } catch (FileNotFoundException ex) {
		  System.err.println("Ocorreu erro ao tentar abrir o arquivo.");
		  
	  }
  }
  public void gravarContato(Contato contato) {
	 try {
		 gravador.format("%s;%s;%s;%s\n", contato.getNome(),contato.getTelefone(),contato.getEndereço(),contato.getEmail());
		 
	 } catch (FormatterClosedException formatterClosedException) {
		 System.err.println("Ocorreu erro ao tentar escrever o arquivo.");
	 }
	 catch(NoSuchElementException elementException) {
		 System.err.println("Input invalido");
	 }
	 
  }
  public void fecharArquivoGravacao() throws IOException {
	  if(gravador != null) {
		  gravador.close();
		System.out.println("Arquivo fechado.");
	  }
  }
  public void abrirArquivoParaLeitura() {
	  try {
		  leitor = new Scanner(arquivo);
	  }
	  catch(IOException ioException) {
		  System.err.println("Erro ao abrir o arquivo.");
		  System.exit(1);
	  }
  }
  public ArrayList<Contato> lerArquivo() {
 ArrayList<Contato> contatos = new ArrayList<>();
	 while(leitor.hasNextLine()) {
		String[] contatosSeparados = leitor.nextLine().split(";") ;
		Contato contatos1 = new Contato(contatosSeparados[0], contatosSeparados[1], contatosSeparados[2], contatosSeparados[3]);
		contatos.add(contatos1);
		
	 }
	 return contatos;
  }
  
  public void fecharArquivoLeitura() {
	  if(leitor != null)
		  leitor.close();
	  
  }
  
}
