
public class VendaNormal extends Venda {
	private String vendedor;
	
	public void confirmarVenda(){
		
	}

	public String getVendedor() {
		return vendedor; 	  
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	@Override
	public String toString() {
		return "VendaNormal [vendedor=" + vendedor + ", getVendedor()=" + getVendedor() + ", getCliente()="
				+ getCliente() + ", getProdutos()=" + getProdutos() + ", getFormaPagamento()=" + getFormaPagamento()
				+ ", getEntrega()=" + getEntrega() + ", getIdVenda()=" + getIdVenda() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
