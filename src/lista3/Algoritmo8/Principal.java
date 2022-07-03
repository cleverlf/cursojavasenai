package lista3.Algoritmo8;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Algoritmo 08
		 * A prefeitura do Rio de Janeiro abriu uma linha de cr�dito para os
		 * funcion�rios
		 * estatut�rios. O valor m�ximo da presta��o n�o poder� ultrapassar 30% do
		 * sal�rio
		 * bruto. Fazer um algoritmo que permita entrar com o sal�rio bruto e o valor da
		 * presta��o e informar se o empr�stimo pode ou n�o ser concedido.
		 */
		Dinheiro din = new Dinheiro();

		JOptionPane.showMessageDialog(null, "Para saber se ter� emprestimo digite os seguintes dados");
		din.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null, "Salario bruto: ")));
		din.setPrestacao(Double.parseDouble(JOptionPane.showInputDialog(null, "Prestacao: ")));
		if (din.getPrestacao() <= din.getEmprestimo()) {
			JOptionPane.showMessageDialog(null, "Voce pode fazer um emprestimo");
		} else {
			JOptionPane.showMessageDialog(null, "Voce nao pode fazer um emprestimo");
		}
	}

}
