package objetos;

public class PessoaFisica extends Pessoa {
	
	private String cpf;
	
	public PessoaFisica() {
		
	}

	public PessoaFisica(String nome, String email, Integer celular, String cpf) {
		super(nome, email, celular);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "cpf: " + cpf + ", Nome: " + getNome() + ", Email: " + getEmail()
				+ ", Celular: " + getCelular();
	}

	
	
}
