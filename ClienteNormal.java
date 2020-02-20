
public class ClienteNormal extends Cliente {
	private boolean filaNormal;

	public void cadastrar() {

	}

	public boolean isFilaNormal() {
		return filaNormal;
	}

	public void setFilaNormal(boolean filaNormal) {
		this.filaNormal = filaNormal;
	}

	@Override
	public String toString() {
		return "ClienteNormal [filaNormal=" + filaNormal + ", isFilaNormal()=" + isFilaNormal() + ", getCpf()="
				+ getCpf() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}
