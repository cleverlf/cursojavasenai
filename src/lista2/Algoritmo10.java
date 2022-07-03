package lista2;

import javax.swing.JOptionPane;

public class Algoritmo10 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Integer codigo;
        JOptionPane.showInputDialog(null, "Nome do desafio : ");
        codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas linhas de codigo total no projeto : "));
        JOptionPane.showInputDialog(null, "Quantas horas voce demorou para desenvolver : ");
        if (codigo > 1000) {
            JOptionPane.showMessageDialog(null, "Codigo necessita de refatoracao");
        }

    }
}
