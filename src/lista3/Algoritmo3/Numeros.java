package lista3.Algoritmo3;

public class Numeros {
	private double numero;

	public void setNumero(double numero) {
		this.numero = numero;
	}

	public double getNumero() {
		return numero;
	}

	public double getRaizQuadrada() {
		return Math.sqrt(numero);
	}

	public double getQuadradoDoNumero() {
		return Math.pow(numero, 2);
	}
}
