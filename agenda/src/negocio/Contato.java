package negocio;

public class Contato {
  
   public Contato(String nome, String telefone, String enderešo, String email) {
		
		this.nome = nome;
		this.telefone = telefone;
		this.enderešo = enderešo;
		this.email = email;
	}
   private String nome;
   private String telefone;
   private String enderešo;
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
public String getEnderešo() {
	return enderešo;
}
public void setEnderešo(String enderešo) {
	this.enderešo = enderešo;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
  
}
