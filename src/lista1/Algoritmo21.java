package lista1;

import javax.swing.JOptionPane;

public class Algoritmo21 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		double base,altura,area;
		
		JOptionPane.showMessageDialog(null, "Digite os dados de um triangulo para obter sua area : ");
		base = Double.parseDouble(JOptionPane.showInputDialog(null, "Base: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Altura: "));
		area = (base*altura)/2;
		JOptionPane.showMessageDialog(null, "Área = " + area);
		
	}
}
