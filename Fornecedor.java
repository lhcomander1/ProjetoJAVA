
public class Fornecedor implements Relatorio{
	private int cnpj;
	
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public void listar(){
		
	}
	public void gerarRelatorio(){
		
	}
	@Override
	public String toString() {
		return "Fornecedor [cnpj=" + cnpj + ", getCnpj()=" + getCnpj() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
