
public class Cliente implements Cadastro {
	private int cpf;

	public void cadastrar() {

	}

	public void listar() {

	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", getCpf()=" + getCpf() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
