
public class EstoqueFisico extends Estoque {
	private String localidade;
	
	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public void listar(){
		
	}

	@Override
	public String toString() {
		return "EstoqueFisico [localidade=" + localidade + ", getLocalidade()=" + getLocalidade() + ", getProdutos()="
				+ getProdutos() + ", getIdEstoque()=" + getIdEstoque() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
