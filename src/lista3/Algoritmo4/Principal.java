package lista3.Algoritmo4;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Algoritmo 04
		 * Entrar com um n�mero e imprimir uma das mensagens: � multiplo de 3 ou n�o �
		 * m�ltiplo de 3.
		 */
		Numeros n = new Numeros();

		n.setNumero(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um numero: ")));
		if (n.getNumero() % 3 == 0) {
			JOptionPane.showMessageDialog(null, "� multiplo de 3");
		} else {
			JOptionPane.showMessageDialog(null, "N�o � multiplo de 3");
		}

	}

}
