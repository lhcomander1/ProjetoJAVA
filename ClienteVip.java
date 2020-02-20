
public class ClienteVip extends Cliente {
	private boolean atendimentoPreferencial;

	public boolean isAtendimentoPreferencial() {
		return atendimentoPreferencial;
	}

	public void setAtendimentoPreferencial(boolean atendimentoPreferencial) {
		this.atendimentoPreferencial = atendimentoPreferencial;
	}

	public void cadastar() {

	}

	@Override
	public String toString() {
		return "ClienteVip [atendimentoPreferencial=" + atendimentoPreferencial + ", isAtendimentoPreferencial()="
				+ isAtendimentoPreferencial() + ", getCpf()=" + getCpf() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
