package lista3.Algoritmo17;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		/*
		 * Algoritmo 17
		 * Entrar com o nome de uma pessoa e so imprimi-lo se o prenome for JOSE
		 */

		Pessoa pes = new Pessoa();

		pes.setNome(JOptionPane.showInputDialog(null, "Digite seu nome: "));
		if ((pes.getNome().substring(0, 4)).contains("JOSE")) {
			JOptionPane.showMessageDialog(null, pes.getNome());
		}
	}
}
