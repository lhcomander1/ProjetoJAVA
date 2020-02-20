
public class LojaFisica extends Loja {
	private int estacionamento;

	public void listar() {

	}

	public int getEstacionamento() {
		return estacionamento;
	}

	public void setEstacionamento(int estacionamento) {
		this.estacionamento = estacionamento;
	}

	@Override
	public String toString() {
		return "LojaFisica [estacionamento=" + estacionamento + ", getEstacionamento()=" + getEstacionamento()
				+ ", getFormasPagamento()=" + getFormasPagamento() + ", getProdutos()=" + getProdutos()
				+ ", getFornecedores()=" + getFornecedores() + ", getEstoques()=" + getEstoques() + ", getClientes()="
				+ getClientes() + ", getVendas()=" + getVendas() + ", getNewsletters()=" + getNewsletters()
				+ ", getEntregas()=" + getEntregas() + ", getCnpj()=" + getCnpj() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
