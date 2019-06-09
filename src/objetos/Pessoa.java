package objetos;

public class Pessoa {
	
	private String nome;
	private String email;
	private Integer celular;
	
	public Pessoa() {
		
	}

	public Pessoa(String nome, String email, Integer celular) {
		super();
		this.nome = nome;
		this.email = email;
		this.celular = celular;
	}

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

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}
	
}
