package lista1;

import javax.swing.JOptionPane;

public class Algoritmo10 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Integer n1, n2, produto;
        n1 = Integer
                .parseInt(JOptionPane.showInputDialog(null, "Digite dois numeros para obter o produto.Numero 1 = "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero 2 = "));
        produto = n1 * n2;
        JOptionPane.showMessageDialog(null, produto);
    }
}
