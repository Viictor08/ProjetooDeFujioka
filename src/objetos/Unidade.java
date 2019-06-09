package objetos;

public class Unidade {
	
	private Integer unidade;
	private String nome;
	
	public Unidade() {
		
	}
	public Unidade(Integer unidade, String nome) {
		this.unidade = unidade;
		this.nome = nome;
	}
	public Integer getUnidade() {
		return unidade;
	}
	public void setUnidade(Integer unidade) {
		this.unidade = unidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
