package lista1;

import javax.swing.JOptionPane;

public class Algoritmo9 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Integer n1, n2, soma;
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Faça a soma de dois numeros inteiros"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, " + "));
        soma = n1 + n2;

        JOptionPane.showMessageDialog(null, "Soma = " + soma);

    }
}
