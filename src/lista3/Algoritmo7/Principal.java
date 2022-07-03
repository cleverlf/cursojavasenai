package lista3.Algoritmo7;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Algoritmo 07
		 * Entrar comum n�mero e informar se ele � divis�vel por 10, por 5, por2 ouse
		 * n�o �
		 * divis�vel por nenhum destes.
		 */
		Numeros n = new Numeros();
		n.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: ")));
		if (n.getNumero() % 10 == 0 && n.getNumero() % 5 == 0) {
			JOptionPane.showMessageDialog(null, "� divisivel por 10 e por 5");
		} else if (n.getNumero() % 10 == 0) {
			JOptionPane.showMessageDialog(null, "� divisivel por 10");
		} else if (n.getNumero() % 5 == 0) {
			JOptionPane.showMessageDialog(null, "� divisivel por 5");
		} else if (n.getNumero() % 2 == 0) {
			JOptionPane.showMessageDialog(null, "� divisivel por 2");
		} else {
			JOptionPane.showMessageDialog(null, "N�o � divis�vel por nenhum destes");
		}
	}

}
