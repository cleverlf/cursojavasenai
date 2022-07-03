package lista2;

import javax.swing.JOptionPane;

public class Algoritmo2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String projeto;
        double valor, valorc;

        projeto = JOptionPane.showInputDialog(null, "Nome do projeto : ").toUpperCase();
        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do projeto : "));
        valorc = valor * (0.10) + valor;

        if (projeto.contains("UX DESING")) {
            JOptionPane.showMessageDialog(null, "Valor corrigido : " + valorc);

        }
    }
}
