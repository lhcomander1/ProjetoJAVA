
public class Dinheiro extends FormaPagamento implements Desconto {
	private int codigoCedula;

	public int getCodigoCedula() {
		return codigoCedula;
	}

	public void setCodigoCedula(int codigoCedula) {
		this.codigoCedula = codigoCedula;
	}

	public void aplicarDesconto() {

	}

	public void autorizarPagamento() {

	}

	@Override
	public String toString() {
		return "Dinheiro [codigoCedula=" + codigoCedula + ", getCodigoCedula()=" + getCodigoCedula() + ", getValor()="
				+ getValor() + ", getIdPagamento()=" + getIdPagamento() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
