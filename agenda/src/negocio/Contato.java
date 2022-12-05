package negocio;

public class Contato {
  
   public Contato(String nome, String telefone, String endereço, String email) {
		
		this.nome = nome;
		this.telefone = telefone;
		this.endereço = endereço;
		this.email = email;
	}
   private String nome;
   private String telefone;
   private String endereço;
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
public String getEndereço() {
	return endereço;
}
public void setEndereço(String endereço) {
	this.endereço = endereço;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
  
}
