package lista1;

import javax.swing.JOptionPane;

public class Algoritmo18 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        double raio, perimetro, area;

        raio = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Digite o raio de um círculo para obter seu perímetro e área: "));

        perimetro = Math.PI * raio;
        JOptionPane.showMessageDialog(null, "Perímetro: " + perimetro);
        area = Math.PI * (Math.pow(raio, 2));
        JOptionPane.showMessageDialog(null, "Área: " + area);

    }
}
