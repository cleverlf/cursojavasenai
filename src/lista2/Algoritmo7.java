package lista2;

import javax.swing.JOptionPane;

public class Algoritmo7 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String galpao;
        galpao = JOptionPane.showInputDialog(null, "Digite o nome e a cor do galpão : ").toUpperCase();
        if (galpao.contains("BRANCO")) {
            JOptionPane.showMessageDialog(null,
                    "área está sem automóveis alocados para ela, ou seja, está com 0 ocupação.");
        } else if (galpao.contains("AZUL")) {
            JOptionPane.showMessageDialog(null,
                    "área está com automóveis alocados para ela, mas não está totalmente ocupada.");
        } else if (galpao.contains("VERMELHO")) {
            JOptionPane.showMessageDialog(null, "área está com a sua capacidade máxima ocupada com automóveis.");
        }
    }
}
