package lista1;

import javax.swing.JOptionPane;

public class Algoritmo19 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        double lado, perimetro, area, diagonal;

        lado = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Digite um lado do quadrao para obter seus respectivos calculos : "));
        perimetro = 4 * lado;
        JOptionPane.showMessageDialog(null, "Perímetro: " + perimetro);
        area = Math.pow(lado, 2);
        JOptionPane.showMessageDialog(null, "Área: " + area);
        diagonal = Math.sqrt(Math.pow(lado, 2) + Math.pow(lado, 2));
        JOptionPane.showMessageDialog(null, "Diagonal: " + diagonal);

    }
}
