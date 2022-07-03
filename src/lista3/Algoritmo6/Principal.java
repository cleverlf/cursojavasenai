package lista3.Algoritmo6;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Algoritmo 06
		// Entrar com um n�mero e informar se ele � divis�vel por 3 e por 7.
		Numeros n = new Numeros();
		n.setNumero(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um numero: ")));
		if (n.getNumero() % 3 == 0) {
			JOptionPane.showMessageDialog(null, "� divisivel por 3");
		} else if (n.getNumero() % 7 == 0) {
			JOptionPane.showMessageDialog(null, "� divisivel por 7");
		} else {
			JOptionPane.showMessageDialog(null, "N�o � divisivel por 3 ou 7");
		}

	}

}
