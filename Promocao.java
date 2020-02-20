import java.util.List;

public class Promocao  implements Relatorio{
	private int idPromocao;
	private List<Produto> produtos;
	
	public void gerarRelatorio(){
		
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public int getIdPromocao() {
		return idPromocao;
	}

	public void setIdPromocao(int idPromocao) {
		this.idPromocao = idPromocao;
	}

	@Override
	public String toString() {
		return "Promocao [idPromocao=" + idPromocao + ", produtos=" + produtos + ", getProdutos()=" + getProdutos()
				+ ", getIdPromocao()=" + getIdPromocao() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
