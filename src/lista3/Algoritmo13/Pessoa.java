package lista3.Algoritmo13;

public class Pessoa {
	private int nascimento;
	private int anoAtual;

	public void setNascimento(int nascimento) {
		this.nascimento = nascimento;
	}

	public int getNascimento() {
		return nascimento;
	}

	public void setAnoAtual(int anoAtual) {
		this.anoAtual = anoAtual;
	}

	public int getAnoAtual() {
		return anoAtual;
	}

	public int getIdade() {
		return (nascimento - anoAtual) * (-1);
	}

}
