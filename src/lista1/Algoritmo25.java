package lista1;

import javax.swing.JOptionPane;

public class Algoritmo25 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        double raio, altura, volume;
        JOptionPane.showMessageDialog(null, "Para calcular o volume de uma lata de óleo, digite seu : ");
        raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Raio : "));
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Altura : "));
        volume = Math.PI * (Math.pow(raio, 2)) * altura;
        JOptionPane.showMessageDialog(null, "Volume = " + volume);

    }
}
