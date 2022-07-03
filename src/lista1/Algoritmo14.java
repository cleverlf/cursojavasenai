package lista1;

import javax.swing.JOptionPane;

public class Algoritmo14 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        double n1, reajuste;
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite o saldo da sua aplicaçao para saber seu novo saldo com reajuste de 1% "));
        reajuste = n1 * (0.01) + n1;
        JOptionPane.showMessageDialog(null, "Novo saldo: " + reajuste);

    }
}
