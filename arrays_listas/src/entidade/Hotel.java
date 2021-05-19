package entidade;

public class Hotel {
	
	// ATRIBUTOS
	private String nome;
	private String email;
	private int apto;
	
	// CONSTRUTOR
	public Hotel(String nome, String email, int apto) {
		this.nome = nome;
		this.email = email;
		this.apto = apto;
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

	public int getApto() {
		return apto;
	}

	public void setApto(int apto) {
		this.apto = apto;
	}
	
	public String toString() {
		return
				
				+ apto
				+ ": "
				+ nome
				+ ", "
				+ email;
	}
	
}
