package lista1;

import javax.swing.JOptionPane;

public class Algoritmo12 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        double n1, n2, media;
        JOptionPane.showMessageDialog(null, "Digite dois números reais para obter a média aritimética dos mesmos");
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Número 1"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Número 2"));
        media = (n1 + n2) / 2;
        JOptionPane.showMessageDialog(null, "Média = " + media);

    }
}
