package lista3.Algoritmo12;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {

		/*
		 * Algoritmo 12
		 * Entrar com um n�mero e imprimir uma das mensagens: maior do que 20, igual a
		 * 20 ou
		 * menor do que 20.
		 */

		AlgDoze num = new AlgDoze();

		num.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero:")));
		if (num.getNumero() > 20) {
			JOptionPane.showMessageDialog(null, "Maior do que 20.");
		} else if (num.getNumero() == 20) {
			JOptionPane.showMessageDialog(null, "Igual a 20.");
		} else {
			JOptionPane.showMessageDialog(null, "Menor do que 20");
		}

	}

}
