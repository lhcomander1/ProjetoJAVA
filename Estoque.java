import java.util.List;

public class Estoque {
	private int idEstoque;
	private List<Produto> produtos;
	
	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public void listar(){
		
		
	}

	public int getIdEstoque() {
		return idEstoque;
	}

	public void setIdEstoque(int idEstoque) {
		this.idEstoque = idEstoque;
	}

	@Override
	public String toString() {
		return "Estoque [idEstoque=" + idEstoque + ", produtos=" + produtos + ", getProdutos()=" + getProdutos()
				+ ", getIdEstoque()=" + getIdEstoque() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
