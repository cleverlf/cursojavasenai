package lista1;

import javax.swing.JOptionPane;

public class Algoritmo15 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        double v1, v2, v3, salario, watts;

        salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Salário mínimo: "));
        watts = Double.parseDouble(JOptionPane.showInputDialog(null, "Quilowatts gasto na residência: "));

        v1 = (salario * 1 / 7) / 100;
        JOptionPane.showMessageDialog(null, "Valor em reais de cada quilowatt :" + v1);
        v2 = v1 * watts;
        JOptionPane.showMessageDialog(null, "Valor em reais a ser pago: " + v2);
        v3 = v2 - v2 * (0.10);
        JOptionPane.showMessageDialog(null,
                "O novo valor a ser pago por essa residência com um desconto de 10%: " + v3);

    }
}
