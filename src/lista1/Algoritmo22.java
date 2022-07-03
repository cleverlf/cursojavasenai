package lista1;

import javax.swing.JOptionPane;

public class Algoritmo22 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        double diagonal1, diagonal2, area;

        JOptionPane.showMessageDialog(null, "Digite as diagonais de um losango para obter sua area : ");
        diagonal1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Diagonal 1: "));
        diagonal2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Diagonal 2: "));
        area = (diagonal1 * diagonal2) / 2;
        JOptionPane.showMessageDialog(null, "Área = " + area);

    }
}
