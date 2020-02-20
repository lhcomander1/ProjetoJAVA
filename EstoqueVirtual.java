
public class EstoqueVirtual extends Estoque {
	private String site;
	
	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public void listar(){
		
	}

	@Override
	public String toString() {
		return "EstoqueVirtual [site=" + site + ", getSite()=" + getSite() + ", getProdutos()=" + getProdutos()
				+ ", getIdEstoque()=" + getIdEstoque() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
