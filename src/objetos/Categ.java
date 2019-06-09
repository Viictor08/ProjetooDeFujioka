package objetos;

public class Categ {
	String id_categ;
	
	public Categ() {
		
	}

	public Categ(String id_categ) {
		this.id_categ = id_categ;
	}

	public String getId_categ() {
		return id_categ;
	}

	public void setId_categ(String id_categ) {
		this.id_categ = id_categ;
	}

	@Override
	public String toString() {
		return "ID da Categoria: " + id_categ;
	}
	
}