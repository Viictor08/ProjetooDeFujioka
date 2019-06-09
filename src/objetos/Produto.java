package objetos;

public class Produto {
	
	private Integer id;
	private String nome;
	private Double precovenda;
	private Integer qtde_estoque;
	
	public Produto() {
		
	}

	public Produto(Integer id, String nome, Double precovenda, Integer qtde_estoque) {
		super();
		this.id = id;
		this.nome = nome;
		this.precovenda = precovenda;
		this.qtde_estoque = qtde_estoque;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPrecovenda() {
		return precovenda;
	}

	public void setPrecovenda(Double precovenda) {
		this.precovenda = precovenda;
	}

	public Integer getQtde_estoque() {
		return qtde_estoque;
	}

	public void setQtde_estoque(Integer qtde_estoque) {
		this.qtde_estoque = qtde_estoque;
	}

	@Override
	public String toString() {
		return "ID do Produto: " + id + " Nome: " + nome + ", Preço de Venda: " + precovenda 
				+ ", Quantidade em Estoque: " 
				+ qtde_estoque;
	}
	
}
