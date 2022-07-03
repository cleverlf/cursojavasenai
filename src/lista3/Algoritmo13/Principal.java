package lista3.Algoritmo13;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		/*
		 * Algoritmo 13
		 * Entrar com o ano de nascimento de uma pessoa e o ano atual. Imprimira idade
		 * da
		 * pessoa. N�o se esque�a de verificar se o ano de nascimento � um ano v�lido.
		 */

		Pessoa pes = new Pessoa();

		pes.setNascimento(Integer.parseInt(JOptionPane.showInputDialog(null, "Ano de nascimento: ")));
		pes.setAnoAtual(Integer.parseInt(JOptionPane.showInputDialog(null, "Ano atual: ")));
		if (pes.getNascimento() < pes.getAnoAtual()) {
			JOptionPane.showMessageDialog(null, "Idade: " + pes.getIdade());
		} else {
			JOptionPane.showMessageDialog(null, "Ano de nascimento n�o � v�lido!");
		}
	}

}
