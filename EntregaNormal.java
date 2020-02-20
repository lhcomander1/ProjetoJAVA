
public class EntregaNormal extends Entrega {
	private String correios;
	 
	public String getCorreios() {
		return correios;
	}

	public void setCorreios(String correios) {
		this.correios = correios;
	}

	public void efetuarEntrega (){
		
		
	}

	@Override
	public String toString() {
		return "EntregaNormal [correios=" + correios + ", getCorreios()=" + getCorreios() + ", getData()=" + getData()
				+ ", getCodEntrega()=" + getCodEntrega() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
