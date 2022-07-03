package lista3.Algoritmo16;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {

		/*
		 * Algoritmo 16
		 * Entrar com um nome e imprimi-lo se o primeiro caractere for a letra A
		 * (considerar
		 * letra min�scula ou mai�scula).
		 */

		Pessoa pes = new Pessoa();

		pes.setNome(JOptionPane.showInputDialog(null, "Digite seu nome :"));

		if (pes.getNome().substring(0, 1).contains("A")) {
			JOptionPane.showMessageDialog(null, pes.getNome());
		}
	}

}
