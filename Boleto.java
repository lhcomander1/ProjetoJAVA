
public class Boleto extends FormaPagamento implements Desconto, Juro {
	private int numeroBoleto;

	public void aplicarDesconto() {

	}

	public void aplicarJuro() {

	}

	public int getNumeroBoleto() {
		return numeroBoleto;
	}

	public void setNumeroBoleto(int numeroBoleto) {
		this.numeroBoleto = numeroBoleto;
	}

	public void autorizarPagamento() {

	}

	@Override
	public String toString() {
		return "Boleto [numeroBoleto=" + numeroBoleto + ", getNumeroBoleto()=" + getNumeroBoleto() + ", getValor()="
				+ getValor() + ", getIdPagamento()=" + getIdPagamento() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
