package lista3.Algoritmo19;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		/*
		 * Algoritmo 19
		 * Criar um algoritmo que entre com dois nomes e imprimi-los em ordem
		 * alfab�tica.
		 */

		Pessoas pes = new Pessoas();

		pes.setNomeUm(JOptionPane.showInputDialog(null, "Digite seu nome: "));
		pes.setNomeDois(JOptionPane.showInputDialog(null, "Digite seu nome: "));
		JOptionPane.showMessageDialog(null, pes.getNomeUm().compareTo(pes.getNomeDois()));

	}

}
