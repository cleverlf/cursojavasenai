package lista3.Algoritmo14;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {

		/*
		 * Algoritmo 14
		 * Entrar com nome, sexo e idade de uma pessoa. Se a pessoa for do sexo feminino
		 * e
		 * tiver menos que 25 anos, imprimir nome e a mensagem: ACEITA. Caso contr�rio,
		 * imprimir nome e a mensagem: N�O ACEITA. (Considerar f ou F.)
		 */

		Pessoa pes = new Pessoa();

		pes.setNome(JOptionPane.showInputDialog(null, "Nome: "));
		pes.setSexo(JOptionPane.showInputDialog(null, "Sexo: "));
		pes.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Idade: ")));

		if (pes.getSexo().contains("FEMININO") && pes.getIdade() < 25) {
			JOptionPane.showMessageDialog(null, pes.getNome() + " ACEITA");
		} else {
			JOptionPane.showMessageDialog(null, pes.getNome() + " N�O ACEITA");
		}
	}
}
