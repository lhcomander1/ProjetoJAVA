import java.util.List;

public class Newsletter  {
	private int idNewsletter;
	private List<Cliente> cliente;
	
	public void enviarEmail(){
		
	}
	public void listar(){
		
	}
	public List<Cliente> getCliente() {
		return cliente;
	}
	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}
	public int getIdNewsletter() {
		return idNewsletter;
	}
	public void setIdNewsletter(int idNewsletter) {
		this.idNewsletter = idNewsletter;
	}
	@Override
	public String toString() {
		return "Newsletter [idNewsletter=" + idNewsletter + ", cliente=" + cliente + ", getCliente()=" + getCliente()
				+ ", getIdNewsletter()=" + getIdNewsletter() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
