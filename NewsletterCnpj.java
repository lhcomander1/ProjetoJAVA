
public class NewsletterCnpj extends Newsletter{
	private String clienteCnpj;
	
	public void enviarEmail(){
		
	}

	public String getClienteCnpj() {
		return clienteCnpj;
	}

	public void setClienteCnpj(String clienteCnpj) {
		this.clienteCnpj = clienteCnpj;
	}

	@Override
	public String toString() {
		return "NewsletterCnpj [clienteCnpj=" + clienteCnpj + ", getClienteCnpj()=" + getClienteCnpj()
				+ ", getCliente()=" + getCliente() + ", getIdNewsletter()=" + getIdNewsletter() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
