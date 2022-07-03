package lista1;

import javax.swing.JOptionPane;

public class Algoritmo7 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Integer numero, sucessor, antecessor;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Escreva um numero inteiro"));
        sucessor = (numero + 1);
        antecessor = (numero - 1);
        JOptionPane.showMessageDialog(null, sucessor);
        JOptionPane.showMessageDialog(null, antecessor);

    }
}
