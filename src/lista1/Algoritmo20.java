package lista1;

import javax.swing.JOptionPane;

public class Algoritmo20 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        double a, b, c, diagonal;

        a = Double.parseDouble(JOptionPane.showInputDialog(null, "Lado a: "));
        b = Double.parseDouble(JOptionPane.showInputDialog(null, "Lado b: "));
        c = Double.parseDouble(JOptionPane.showInputDialog(null, "Lado c: "));
        diagonal = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        JOptionPane.showMessageDialog(null, "Diagonal = " + diagonal);
    }
}
