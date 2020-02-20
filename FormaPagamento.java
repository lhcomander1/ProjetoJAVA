
public class FormaPagamento {
	private int idPagamento;
	private int valor;
	private static int valorTotalPagamento;
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public static int getValorTotalPagamento() {
		return valorTotalPagamento;
	}
	public static void setValorTotalPagamento(int valorTotalPagamento) {
		FormaPagamento.valorTotalPagamento = valorTotalPagamento;
	}
	public void listar(){
		
	}
	public void autorizarPagamento(){
		
	}
	public int getIdPagamento() {
		return idPagamento;
	}
	public void setIdPagamento(int idPagamento) {
		this.idPagamento = idPagamento;
	}
	@Override
	public String toString() {
		return "FormaPagamento [idPagamento=" + idPagamento + ", valor=" + valor + ", getValor()=" + getValor()
				+ ", getIdPagamento()=" + getIdPagamento() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
