
public class EntregaExpressa extends Entrega {
	private String transportadora;

	public String getTransportadora() {
		return transportadora;
	}

	public void setTransportadora(String transportadora) {
		this.transportadora = transportadora;
	}

	public void efetuarEntrega() {

	}

	@Override
	public String toString() {
		return "EntregaExpressa [transportadora=" + transportadora + ", getTransportadora()=" + getTransportadora()
				+ ", getData()=" + getData() + ", getCodEntrega()=" + getCodEntrega() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
