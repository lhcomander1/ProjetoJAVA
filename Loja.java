import java.util.List;

public class Loja implements Caixa {
	private int cnpj;
	private List<FormaPagamento> formasPagamento;
	private List<Produto> produtos;
	private List<Fornecedor> fornecedores;
	private List<Estoque> estoques;
	private List<Cliente> clientes;
	private List<Venda> vendas;
	private List<Newsletter> newsletters;
	private List<Entrega> entregas;
	private static Venda ultimaVenda;

	public void listar() {

	}

	public void gerarCaixa() {

	}

	public List<FormaPagamento> getFormasPagamento() {
		return formasPagamento;
	}

	public void setFormasPagamento(List<FormaPagamento> formasPagamento) {
		this.formasPagamento = formasPagamento;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}

	public List<Estoque> getEstoques() {
		return estoques;
	}

	public void setEstoques(List<Estoque> estoques) {
		this.estoques = estoques;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Venda> getVendas() {
		return vendas;
	}

	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;
	}

	public List<Newsletter> getNewsletters() {
		return newsletters;
	}

	public void setNewsletters(List<Newsletter> newsletters) {
		this.newsletters = newsletters;
	}

	public List<Entrega> getEntregas() {
		return entregas;
	}

	public void setEntregas(List<Entrega> entregas) {
		this.entregas = entregas;
	}

	public static Venda getUltimaVenda() {
		return ultimaVenda;
	}

	public static void setUltimaVenda(Venda ultimaVenda) {
		Loja.ultimaVenda = ultimaVenda;
	}

	@Override
	public void gerarcaixa() {
		// TODO Auto-generated method stub

	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Loja [cnpj=" + cnpj + ", formasPagamento=" + formasPagamento + ", produtos=" + produtos
				+ ", fornecedores=" + fornecedores + ", estoques=" + estoques + ", clientes=" + clientes + ", vendas="
				+ vendas + ", newsletters=" + newsletters + ", entregas=" + entregas + ", getFormasPagamento()="
				+ getFormasPagamento() + ", getProdutos()=" + getProdutos() + ", getFornecedores()=" + getFornecedores()
				+ ", getEstoques()=" + getEstoques() + ", getClientes()=" + getClientes() + ", getVendas()="
				+ getVendas() + ", getNewsletters()=" + getNewsletters() + ", getEntregas()=" + getEntregas()
				+ ", getCnpj()=" + getCnpj() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
