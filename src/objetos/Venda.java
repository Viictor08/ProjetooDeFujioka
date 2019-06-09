package objetos;

public class Venda extends Movimento{
	
	private Double desconto;

	public Venda(Integer id, Integer data, Double total, Double desconto) {
		super(id, data, total);
		this.desconto = desconto;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	
}