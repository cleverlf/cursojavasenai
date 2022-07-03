package lista1;

import javax.swing.JOptionPane;

public class Algoritmo26 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Efetuar o cálculo do valor de uma prestação em atraso, utilizando a fórmula
        // de prestação = valor+(valor*(taxa/100)*tempo).

        JOptionPane.showMessageDialog(null, "Para saber o novo valor da sua prestação, digite os seguintes dados: ");
        double valor, taxa, tempo, prestacao;
        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor da prestação: "));
        taxa = Double.parseDouble(JOptionPane.showInputDialog(null, "Taxa em % : "));
        tempo = Double.parseDouble(JOptionPane.showInputDialog(null, "Dias de atraso : "));
        prestacao = valor + (valor * (taxa / 100) * tempo);
        JOptionPane.showMessageDialog(null, "Novo valor da sua prestação : " + prestacao);
    }
}
