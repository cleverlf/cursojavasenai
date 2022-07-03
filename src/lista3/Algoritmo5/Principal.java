package lista3.Algoritmo5;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Algoritmo 05
		// Entrar com um n�mero e informar se ele � ou n�o divis�vel por 5.
		Numeros n = new Numeros();

		n.setNumero(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um numero: ")));
		if (n.getNumero() % 5 == 0) {
			JOptionPane.showMessageDialog(null, "� divisivel por 5");
		} else {
			JOptionPane.showMessageDialog(null, "N�o � divisivel por 5");
		}

	}

}
