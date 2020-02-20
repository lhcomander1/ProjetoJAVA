
public class Entrega {
	private int codEntrega;
	private int data;
	private static int ultimaEntrega;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public static int getUltimaEntrega() {
		return ultimaEntrega;
	}

	public static void setUltimaEntrega(int ultimaEntrega) {
		Entrega.ultimaEntrega = ultimaEntrega;
	}

	public void efetuarEntrega() {

	}

	public int getCodEntrega() {
		return codEntrega;
	}

	public void setCodEntrega(int codEntrega) {
		this.codEntrega = codEntrega;
	}

	@Override
	public String toString() {
		return "Entrega [codEntrega=" + codEntrega + ", data=" + data + ", getData()=" + getData()
				+ ", getCodEntrega()=" + getCodEntrega() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
