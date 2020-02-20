
public class Cartao extends FormaPagamento implements Juro {
	private int numeroConta;

	public void aplicarJuro() {

	}

	public void autorizarPagamento() {

	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	@Override
	public String toString() {
		return "Cartao [numeroConta=" + numeroConta + ", getNumeroConta()=" + getNumeroConta() + ", getValor()="
				+ getValor() + ", getIdPagamento()=" + getIdPagamento() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
