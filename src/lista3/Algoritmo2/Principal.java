package lista3.Algoritmo2;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Algoritmo 02
		 * Construir um algoritmo que leia dois n�meros e efetue a adi��o. Caso o valor
		 * somado
		 * seja maior que 20, este dever� ser apresentado somando-se a ele mais 8; caso
		 * o valor
		 * somado seja menor ou igual a 20, este dever� ser apresentado subtraindo-se 5.
		 */
		Numeros nu = new Numeros();

		JOptionPane.showMessageDialog(null, "Faca a soma de dois numeros: ");
		nu.setNumeroUm(Integer.parseInt(JOptionPane.showInputDialog(null, "Numero 1: ")));
		nu.setNumeroDois(Integer.parseInt(JOptionPane.showInputDialog(null, "Numero 2: ")));

		if (nu.getResultado() > 20) {
			JOptionPane.showMessageDialog(null, "Resultado:  " + (nu.getResultado() + 8));
		} else if (nu.getResultado() <= 20) {
			JOptionPane.showMessageDialog(null, "Resultado:  " + (nu.getResultado() - 5));

		}
	}

}
