package lista3.Algoritmo15;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		/*
		 * Algoritmo 15
		 * Entrar com a sigla do estado de uma pessoa e imprimir uma das mensagens:
		 * carioca
		 * paulista
		 * mineiro
		 * outros estados
		 */

		Estado uf = new Estado();
		uf.setEstado(JOptionPane.showInputDialog(null, "Digite a sigla do seu estado: "));
		switch (uf.getEstado()) {
			case "RJ":
				JOptionPane.showMessageDialog(null, "Carioca");
				break;
			case "SP":
				JOptionPane.showMessageDialog(null, "Paulista");
				break;
			case "MG":
				JOptionPane.showMessageDialog(null, "Mineiro");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Outros estados");
				break;
		}

	}

}
