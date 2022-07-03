package lista1;

import javax.swing.JOptionPane;

public class Algoritmo6 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Integer x, x1;
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Escreva um numero inteiro"));
        x1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Escreva outro numero inteiro"));
        JOptionPane.showMessageDialog(null, x + " e " + x1);
    }
}
