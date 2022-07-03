package lista1;

import javax.swing.JOptionPane;

public class Algoritmo17 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        JOptionPane.showMessageDialog(null, "Digite os dados do retângulo: ");

        double base, altura, perimetro, area, diagonal;

        base = Double.parseDouble(JOptionPane.showInputDialog(null, "Base: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Altura: "));
        area = base * altura;
        perimetro = 2 * (base + altura);
        diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        JOptionPane.showMessageDialog(null, "Area: " + area);
        JOptionPane.showMessageDialog(null, "Perimetro: " + perimetro);
        JOptionPane.showMessageDialog(null, "Diagonal: " + diagonal);

    }
}
