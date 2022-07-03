package lista1;

import javax.swing.JOptionPane;

public class Algoritmo13 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        JOptionPane.showMessageDialog(null,
                "Digite quatro números para obter sua média ponderada, sabendo-se que os pesos são respectivamente: 1,2,3 e 4");
        double n1, n2, n3, n4, mediap;
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Número 1 ")) * 1;
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Número 2 ")) * 2;
        n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Número 3 ")) * 3;
        n4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Número 4 ")) * 4;
        mediap = (n1 + n2 + n3 + n4) / (1 + 2 + 3 + 4);
        JOptionPane.showMessageDialog(null, "Média ponderada = " + mediap);
    }
}
