package lista3.Algoritmo9;

import javax.swing.JOptionPane;

public class Principal {
	public static Numeros nu = new Numeros();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Algoritmo 09
		 * Ler um n�mero inteiro de 3 casas decimais e imprimir se o algarismo da casa
		 * das
		 * centenas � par ou �mpar.
		 */

		nu.setNumero(
				Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero inteiro de 3 casas decimais: ")));
		nu.setCentena(Integer.parseInt(String.valueOf(nu.getNumero()).substring(0, 1)));
		if (nu.getCentena() % 2 == 0) {
			JOptionPane.showMessageDialog(null, "O algarismo da casa das centenas � par.");
		} else {
			JOptionPane.showMessageDialog(null, "O algarismo da casa das centenas � �mpar.");
		}

	}
}
