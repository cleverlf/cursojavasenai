package lista1;

import javax.swing.JOptionPane;

public class Algoritmo11 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        double n1, resultado;
        n1 = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Digite um numero real para obter a terça parte deste número "));
        resultado = (n1 * 1 / 3);
        JOptionPane.showMessageDialog(null, resultado);
    }

}
