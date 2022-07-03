package lista2;

import javax.swing.JOptionPane;

public class Algoritmo9 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String nn;
        nn = JOptionPane.showInputDialog(null, "Digite seu nome e seu nivel de categoria : ").toUpperCase();
        if (nn.contains("BRONZE")) {
            JOptionPane.showMessageDialog(null, "Lista de espera encerra em janeiro");
        } else if (nn.contains("PRATA")) {
            JOptionPane.showMessageDialog(null, "Lista de espera encerra em julho");
        } else if (nn.contains("OURO")) {
            JOptionPane.showMessageDialog(null, "Não possui lista de espera");
        }
    }
}
