package lista2;

import javax.swing.JOptionPane;

public class Algoritmo1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String empresa, parceria;
        Integer funcionarios, clientes;
        double valor;

        empresa = JOptionPane.showInputDialog(null, "Empresa : ");
        parceria = JOptionPane.showInputDialog(null, "Parceria : ");
        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do software : "));
        funcionarios = Integer.parseInt(JOptionPane.showInputDialog(null, "Funcionarios : "));
        clientes = Integer.parseInt(JOptionPane.showInputDialog(null, "Clientes : "));

        if (valor > (100.000)) {
            JOptionPane.showMessageDialog(null, "Empresa : " + empresa);
            JOptionPane.showMessageDialog(null, "Parceria : " + parceria);
            JOptionPane.showMessageDialog(null, "Funcionarios : " + funcionarios);
            JOptionPane.showMessageDialog(null, "Clientes : " + clientes);
        }
    }
}