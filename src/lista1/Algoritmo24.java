package lista1;

import javax.swing.JOptionPane;

public class Algoritmo24 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        double c, f;
        c = Double.parseDouble(JOptionPane.showInputDialog(null, "Temperatura em graus centígrados : "));
        f = (c + 160) / 5;
        JOptionPane.showMessageDialog(null, "Fahrenheit : " + f);
    }
}
