package objetos;

public class ItemMovimento {
	
	private Integer id;
	private Integer quantidade;
	private Double preco;
	
	public ItemMovimento() {
		
	}
	public ItemMovimento(Integer id, Integer quantidade, Double preco) {
		this.id = id;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
}
