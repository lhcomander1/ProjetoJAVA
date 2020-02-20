
public class FornecedorNacional extends Fornecedor {
	private int taxaNacional;
	
	public void listar(){
		
	}

	public int getTaxaNacional() {
		return taxaNacional;
	}

	public void setTaxaNacional(int taxaNacional) {
		this.taxaNacional = taxaNacional;
	}

	@Override
	public String toString() {
		return "FornecedorNacional [taxaNacional=" + taxaNacional + ", toString()=" + super.toString() + "]";
	}

}
