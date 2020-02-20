
public class NewsletterCpf extends Newsletter {
	private String clienteCpf;
	
	public void enviarEmail(){
		
	}

	public String getClienteCpf() {
		return clienteCpf;
	}

	public void setClienteCpf(String clienteCpf) {
		this.clienteCpf = clienteCpf;
	}

	@Override
	public String toString() {
		return "NewsletterCpf [clienteCpf=" + clienteCpf + ", getClienteCpf()=" + getClienteCpf() + ", getCliente()="
				+ getCliente() + ", getIdNewsletter()=" + getIdNewsletter() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
