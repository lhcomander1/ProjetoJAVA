
public class LojaVirtual extends Loja {
	private String enderecoOnline;

	public void listar() {

	}

	public String getEnderecoOnline() {
		return enderecoOnline;
	}

	public void setEnderecoOnline(String enderecoOnline) {
		this.enderecoOnline = enderecoOnline;
	}

	@Override
	public String toString() {
		return "LojaVirtual [enderecoOnline=" + enderecoOnline + ", getEnderecoOnline()=" + getEnderecoOnline()
				+ ", getFormasPagamento()=" + getFormasPagamento() + ", getProdutos()=" + getProdutos()
				+ ", getFornecedores()=" + getFornecedores() + ", getEstoques()=" + getEstoques() + ", getClientes()="
				+ getClientes() + ", getVendas()=" + getVendas() + ", getNewsletters()=" + getNewsletters()
				+ ", getEntregas()=" + getEntregas() + ", getCnpj()=" + getCnpj() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
