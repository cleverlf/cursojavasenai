package lista3.Algoritmo1;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Algoritmo 01
		 * Construir um algoritmo que leia dois valores num�ricos inteiros e efetue a
		 * adi��o; caso o resultado seja maior que 10, apresent�-lo.
		 */
		AlgoritmoUm vn = new AlgoritmoUm();

		JOptionPane.showMessageDialog(null,
				"Faca a soma de dois numeros inteiros, caso resultado for maior que 10 ir� mostrar");
		vn.setValorNumericoUm(Integer.parseInt(JOptionPane.showInputDialog(null, "Numero 1: ")));
		vn.setValorNumericoDois(Integer.parseInt(JOptionPane.showInputDialog(null, "Numero 2: ")));

		if (vn.getResultado() >= 10) {
			JOptionPane.showMessageDialog(null, "Resultado: " + vn.getResultado());
		}
	}

}
