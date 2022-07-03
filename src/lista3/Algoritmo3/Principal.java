package lista3.Algoritmo3;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Algoritmo 03
		 * Entrar com um n�mero e imprimir a raiz quadrada do n�mero caso ele seja
		 * positivo e o
		 * quadrado do n�mero caso ele seja negativo.
		 */
		Numeros n = new Numeros();

		n.setNumero(Double.parseDouble(JOptionPane.showInputDialog(null, "Numero: ")));
		if (n.getNumero() > 0) {
			JOptionPane.showMessageDialog(null, "Raiz quadrada: " + n.getRaizQuadrada());

		} else {
			JOptionPane.showMessageDialog(null, "Quadrado do numero: " + n.getQuadradoDoNumero());
		}

	}
}