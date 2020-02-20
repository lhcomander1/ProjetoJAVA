
public class FornecedorInternacional extends Fornecedor {
	private int taxaCambio;
	
	public void listar(){
		
	}

	public int getTaxaCambio() {
		return taxaCambio;
	}

	public void setTaxaCambio(int taxaCambio) {
		this.taxaCambio = taxaCambio;
	}

	@Override
	public String toString() {
		return "FornecedorInternacional [taxaCambio=" + taxaCambio + ", getTaxaCambio()=" + getTaxaCambio()
				+ ", getCnpj()=" + getCnpj() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
