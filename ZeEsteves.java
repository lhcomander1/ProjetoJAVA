import java.util.ArrayList;
import java.util.List;

public class ZeEsteves implements Caixa {

	private int cnpj;
	private List<Loja> lojas;

	public void gerarCaixa() {
	}

	public void listar() {

	}

	public static void main(String[] args) {

		// produto 2
		Produto p2 = new Produto();
		p2.setDescricao("ihpone");
		p2.setNumeroSerie(0320);
		p2.setValor(300);

		// fim

		// venda normal
		VendaNormal vn1 = new VendaNormal();
		vn1.setIdVenda(1);
		vn1.setCliente(null);
		vn1.setEntrega(null);
		vn1.setFormaPagamento(null);
		vn1.setProdutos(null);
		vn1.setVendedor("Luis otavio");

		vn1.confirmarVenda();
		// fim

		// venda online
		VendaOnline vo1 = new VendaOnline();
		vo1.setIdVenda(1);
		vo1.setCliente(null);
		vo1.setEntrega(null);
		vo1.setFormaPagamento(null);
		vo1.setProdutos(null);

		vo1.confirmarVenda();
		// fim

		// boleto
		Boleto boleto1 = new Boleto();
		boleto1.setNumeroBoleto(101010);
		boleto1.setValorTotalPagamento(87);
		boleto1.setValor(10);
		boleto1.aplicarJuro();
		boleto1.aplicarDesconto();
		boleto1.autorizarPagamento();

		// fim

		// cartao
		Cartao cartao1 = new Cartao();
		cartao1.setNumeroConta(01234);
		cartao1.setValor(10);
		cartao1.setValorTotalPagamento(200);
		cartao1.aplicarJuro();
		cartao1.autorizarPagamento();

		// fim

		// dinheiro
		Dinheiro d1 = new Dinheiro();
		d1.setCodigoCedula(0023);
		d1.setValor(20);
		d1.setValorTotalPagamento(600);
		d1.aplicarDesconto();
		d1.autorizarPagamento();
		// fim

		// cliente normal
		ClienteNormal c1 = new ClienteNormal();
		c1.setCpf(203040);
		c1.setFilaNormal(false);
		c1.cadastrar();

		// fim

		// cliente vip
		ClienteVip cv1 = new ClienteVip();
		cv1.setAtendimentoPreferencial(true);
		cv1.setCpf(020331);
		cv1.cadastar();
		cv1.listar();
		// fim

		// entrega normal
		EntregaNormal en1 = new EntregaNormal();
		en1.setCorreios("sedex");
		en1.setData(10);
		en1.setUltimaEntrega(20);
		en1.efetuarEntrega();
		// fim

		// entrega expressa
		EntregaExpressa ex1 = new EntregaExpressa();
		ex1.setTransportadora("expresso nepomuceno");
		ex1.setData(10);
		ex1.setUltimaEntrega(20);
		// fim

		// estoque fisico
		EstoqueFisico estf1 = new EstoqueFisico();
		estf1.setProdutos(new ArrayList<Produto>());
		estf1.setLocalidade("Lavras");
		// criando get estoque fisico-sempre que for lista
		Produto p1 = new Produto();
		p1.setDescricao("celular nokia");
		p1.setNumeroSerie(10203040);
		p1.setValor(200);
		estf1.getProdutos().add(p1);
		estf1.listar();
		// fim

		// estoque virtual
		EstoqueVirtual estv1 = new EstoqueVirtual();
		estv1.setIdEstoque(1);
		estv1.setSite("www.lojazeesteves.com.br");
		// criando get estoque virtual
		Produto p21 = new Produto();
		p21.setDescricao("celular iphone");
		p21.setNumeroSerie(506070);
		p21.setValor(300);
		estv1.listar();
		// fim

		// fornecedor nacional
		FornecedorNacional fn1 = new FornecedorNacional();
		fn1.setCnpj(0233);
		fn1.setTaxaNacional(2030);
		fn1.gerarRelatorio();
		fn1.listar();
		// fim

		// fornecedor internacional
		FornecedorInternacional fi1 = new FornecedorInternacional();
		fi1.setCnpj(0230);
		fi1.setTaxaCambio(6352);
		fi1.gerarRelatorio();
		fi1.listar();
		// fim

		// newslettercpf
		NewsletterCpf newscpf1 = new NewsletterCpf();
		newscpf1.setIdNewsletter(3);
		newscpf1.setClienteCpf("02366");
		newscpf1.setCliente(new ArrayList<Cliente>());
		newscpf1.getCliente().add(cv1);
		newscpf1.getCliente().add(c1);
		// fim

		// newslettercnpj
		NewsletterCnpj newscnpj1 = new NewsletterCnpj();
		newscnpj1.setIdNewsletter(3);
		newscnpj1.setClienteCnpj("02356");
		newscnpj1.setCliente(new ArrayList<Cliente>());
		newscnpj1.getCliente().add(cv1);
		newscnpj1.getCliente().add(c1);
		// fim

		// Promoção
		Promocao pro1 = new Promocao();
		pro1.setIdPromocao(20);
		pro1.setProdutos(new ArrayList<Produto>());
		pro1.getProdutos().add(p21);
		pro1.getProdutos().add(p1);
		pro1.getProdutos().add(p2);
		pro1.gerarRelatorio();
		// fim

		// loja fisica
		LojaFisica lf1 = new LojaFisica();
		lf1.setProdutos(new ArrayList<Produto>());
		lf1.setFormasPagamento(new ArrayList<FormaPagamento>());
		lf1.setClientes(new ArrayList<Cliente>());
		lf1.setFornecedores(new ArrayList<Fornecedor>());
		lf1.setEstoques(new ArrayList<Estoque>());
		lf1.setVendas(new ArrayList<Venda>());
		lf1.setEntregas(new ArrayList<Entrega>());
		lf1.setNewsletters(new ArrayList<Newsletter>());
		lf1.setEstoques(new ArrayList<Estoque>());
		lf1.setCnpj(0230);
		lf1.setUltimaVenda(null);
		lf1.setEstacionamento(2);
		lf1.getProdutos().add(p21);
		lf1.getFormasPagamento().add(boleto1);
		lf1.getFormasPagamento().add(d1);
		lf1.getFormasPagamento().add(cartao1);
		lf1.getClientes().add(cv1);
		lf1.getClientes().add(c1);
		lf1.getFornecedores().add(fi1);
		lf1.getFornecedores().add(fn1);
		lf1.getEstoques().add(estf1);
		lf1.getEstoques().add(estv1);
		lf1.getVendas().add(vn1);
		lf1.getVendas().add(vo1);
		lf1.getEntregas().add(ex1);
		lf1.getEntregas().add(en1);
		lf1.getNewsletters().add(newscnpj1);
		lf1.getNewsletters().add(newscpf1);
		lf1.getEstoques().add(estv1);
		lf1.getEstoques().add(estf1);
		// fim

		// loja virtual

		LojaVirtual lv1 = new LojaVirtual();
		lv1.setProdutos(new ArrayList<Produto>());
		lv1.setFormasPagamento(new ArrayList<FormaPagamento>());
		lv1.setClientes(new ArrayList<Cliente>());
		lv1.setFornecedores(new ArrayList<Fornecedor>());
		lv1.setEstoques(new ArrayList<Estoque>());
		lv1.setVendas(new ArrayList<Venda>());
		lv1.setEntregas(new ArrayList<Entrega>());
		lv1.setNewsletters(new ArrayList<Newsletter>());
		lv1.setEstoques(new ArrayList<Estoque>());
		lv1.setCnpj(0230);
		lv1.setUltimaVenda(null);
		lv1.setEnderecoOnline("www.lojavirtual.com.br");
		lv1.getProdutos().add(p21);
		lv1.getFormasPagamento().add(boleto1);
		lv1.getFormasPagamento().add(d1);
		lv1.getFormasPagamento().add(cartao1);
		lv1.getClientes().add(cv1);
		lv1.getClientes().add(c1);
		lv1.getFornecedores().add(fi1);
		lv1.getFornecedores().add(fn1);
		lv1.getEstoques().add(estf1);
		lv1.getEstoques().add(estv1);
		lv1.getVendas().add(vn1);
		lv1.getVendas().add(vo1);
		lv1.getEntregas().add(ex1);
		lv1.getEntregas().add(en1);
		lv1.getNewsletters().add(newscnpj1);
		lv1.getNewsletters().add(newscpf1);
		lv1.getEstoques().add(estv1);
		lv1.getEstoques().add(estf1);
		// fim

		ZeEsteves ze = new ZeEsteves();
		ze.setLojas(new ArrayList<Loja>());
		ze.getLojas().add(lv1);
		ze.getLojas().add(lf1);

		System.out.println(ze);
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

	public List<Loja> getLojas() {
		return lojas;
	}

	public void setLojas(List<Loja> lojas) {
		this.lojas = lojas;
	}

	@Override
	public String toString() {
		return "ZeEsteves [cnpj=" + cnpj + ", lojas=" + lojas + ", getCnpj()=" + getCnpj() + ", getLojas()="
				+ getLojas() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
