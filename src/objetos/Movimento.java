package objetos;

public class Movimento {
	
	private Integer id;
	private Integer data;
	private Double total;
	
	public Movimento() {
		
	}
	public Movimento(Integer id, Integer data, Double total) {
		this.id = id;
		this.data = data;
		this.total = total;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getData() {
		return data;
	}
	public void setData(Integer data) {
		this.data = data;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	
}
