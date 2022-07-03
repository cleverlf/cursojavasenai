package lista1;

import javax.swing.JOptionPane;

public class Algoritmo4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        double x1, x2, x3, media;
        x1 = 8;
        x2 = 9;
        x3 = 7;
        media = (x1 + x2 + x3) / 3;
        JOptionPane.showInputDialog(null, "Qual a média aritmética entre os números 8,9 e 7 ?");
        JOptionPane.showMessageDialog(null, media);
    }

}