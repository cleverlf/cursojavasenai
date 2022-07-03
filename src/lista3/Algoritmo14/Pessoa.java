package lista3.Algoritmo14;

public class Pessoa {
	private String nome;
	private String sexo;
	private int idade;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public String getSexo() {
		return sexo.toUpperCase();
	}

	public int getIdade() {
		return idade;
	}

}
