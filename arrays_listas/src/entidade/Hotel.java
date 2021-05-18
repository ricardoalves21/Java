package entidade;

public class Hotel {
	
	// ATRIBUTOS
	private String nome;
	private String email;
	
	// CONSTRUTOR
	public Hotel(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	// METODOS MODIFICADORES
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
