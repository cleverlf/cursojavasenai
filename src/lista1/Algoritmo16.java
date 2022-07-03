package lista1;

import javax.swing.JOptionPane;

public class Algoritmo16 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String nome;
        nome = JOptionPane.showInputDialog(null, "Qual o seu nome? ");

        JOptionPane.showMessageDialog(null, nome);
        JOptionPane.showMessageDialog(null, nome.substring(0, 1));

        JOptionPane.showMessageDialog(null, nome.substring(nome.length() - 1));

        JOptionPane.showMessageDialog(null, nome.substring(0, 3));

        JOptionPane.showMessageDialog(null, nome.substring(3, 4));

        JOptionPane.showMessageDialog(null, nome.substring(1));

        JOptionPane.showMessageDialog(null, nome.substring(nome.length() - 2));

    }
}
