package lista1;

import javax.swing.JOptionPane;

public class Algoritmo8 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String nome, endereco, telefone;
        nome = JOptionPane.showInputDialog(null, "Nome: ");
        JOptionPane.showMessageDialog(null, nome);

        endereco = JOptionPane.showInputDialog(null, "Endereço: ");
        JOptionPane.showMessageDialog(null, endereco);

        telefone = JOptionPane.showInputDialog(null, "Telefone: ");
        JOptionPane.showMessageDialog(null, telefone);
    }

}