package objetos;

public class PessoaJuridica extends Pessoa {
	
	private Integer cnpj;

	public PessoaJuridica(String nome, String email, Integer celular, Integer cnpj) {
		super(nome, email, celular);
		this.cnpj = cnpj;
	}

	public Integer getCnpj() {
		return cnpj;
	}

	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", getCnpj()=" + getCnpj() + ", getNome()=" + getNome()
				+ ", getEmail()=" + getEmail() + ", getCelular()=" + getCelular() + ", toString()=" + super.toString()
				+ "]";
	}
}
