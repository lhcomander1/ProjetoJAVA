import java.util.List;

public class Venda implements Cadastro {
	private int idVenda;
	private Cliente cliente;
	private List<Produto> produtos;
	private FormaPagamento formaPagamento;
	private Entrega entrega;

	public void confirmarVenda() {

	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Entrega getEntrega() {
		return entrega;
	}

	public void setEntrega(Entrega entrega) {
		this.entrega = entrega;
	}

	@Override
	public void cadastrar() {
		// TODO Auto-generated method stub

	}

	public int getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}

	@Override
	public String toString() {
		return "Venda [idVenda=" + idVenda + ", cliente=" + cliente + ", produtos=" + produtos + ", formaPagamento="
				+ formaPagamento + ", entrega=" + entrega + ", getCliente()=" + getCliente() + ", getProdutos()="
				+ getProdutos() + ", getFormaPagamento()=" + getFormaPagamento() + ", getEntrega()=" + getEntrega()
				+ ", getIdVenda()=" + getIdVenda() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
