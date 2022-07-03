package lista3.Algoritmo18;

import javax.swing.JOptionPane;

public class Principal {
	public static Pessoa pes = new Pessoa();

	public static void main(String[] args) {

		pes.setNome(JOptionPane.showInputDialog(null, "Digite seu nome: "));
		if ((pes.getNome().substring(0, 4)).contains("JOS�")) {
			JOptionPane.showMessageDialog(null, pes.getNome());
		}
	}

}
