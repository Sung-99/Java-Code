package negocio;

public class Contato {
  
   public Contato(String nome, String telefone, String endere�o, String email) {
		
		this.nome = nome;
		this.telefone = telefone;
		this.endere�o = endere�o;
		this.email = email;
	}
   private String nome;
   private String telefone;
   private String endere�o;
   private String email;
   public String getNome() {
	return nome;
 }
public void setNome(String nome) {
	this.nome = nome;
}
public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}
public String getEndere�o() {
	return endere�o;
}
public void setEndere�o(String endere�o) {
	this.endere�o = endere�o;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
  
}
