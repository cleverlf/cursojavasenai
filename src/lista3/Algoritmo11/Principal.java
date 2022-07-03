package lista3.Algoritmo11;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		// Algoritmo 11
		// Construir um algoritmo que indique se o n�mero digitado est� compreendido
		// entre 20
		// e 90 ou n�o.
		AlgOnze num = new AlgOnze();

		num.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: ")));
		if (num.getNumero() >= 20 && num.getNumero() <= 90) {
			JOptionPane.showMessageDialog(null, "O numero digitado est� compreendido entre 20 e 90");
		} else {
			JOptionPane.showMessageDialog(null, "O numero digitado N�O est� compreendido entre 20 e 90");
		}
	}

}
