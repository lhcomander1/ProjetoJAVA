
public class Produto  {
	private int numeroSerie;
	private String descricao;
	private int valor;
	
	
	

	

	public int getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Produto [numeroSerie=" + numeroSerie + ", descricao=" + descricao + ", valor=" + valor
				+ ", getNumeroSerie()=" + getNumeroSerie() + ", getDescricao()=" + getDescricao() + ", getValor()="
				+ getValor() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
