package lista3.Algoritmo8;

public class Dinheiro {
	private double salario;
	private double prestacao;

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setPrestacao(double prestacao) {
		this.prestacao = prestacao;
	}

	public double getPrestacao() {
		return prestacao;
	}

	public double getEmprestimo() {
		return salario * (0.30);
	}

}
