
public class VendaOnline extends Venda  {
	private Entrega entrega;
	
	public void confirmarVenda(){
		
	}

	public Entrega getEntrega() {
		return entrega;
	}

	public void setEntrega(Entrega entrega) {
		this.entrega = entrega;
	}

	@Override
	public String toString() {
		return "VendaOnline [entrega=" + entrega + ", getEntrega()=" + getEntrega() + ", getCliente()=" + getCliente()
				+ ", getProdutos()=" + getProdutos() + ", getFormaPagamento()=" + getFormaPagamento()
				+ ", getIdVenda()=" + getIdVenda() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}



}