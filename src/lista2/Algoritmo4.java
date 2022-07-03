package lista2;

import javax.swing.JOptionPane;

public class Algoritmo4 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String matricula;
        Integer msg;
        JOptionPane.showInputDialog(null, "Nome do cliente : ");
        matricula = JOptionPane.showInputDialog(null, "Matricula no formato (CCAAMMFFG) \r\n "
                + "CC: Código de duas letras equivalente à concessionária que o cliente está associado;\r\n"
                + "AA: Dois dígitos equivalentes ao ano da data de matrícula do cliente;\r\n"
                + "MM: Dois dígitos equivalentes ao mês da data de matrícula do cliente;\r\n"
                + "FF: Equivale ao nível da categoria do cliente (00 para Bronze, 01 para Prata, 02 para Ouro, 03 para Diamante);\r\n"
                + "G: Gênero do cliente (M para Masculino, F para Feminino, N para Não definido, O para Outro).\r\n");
        msg = Integer.parseInt(matricula.substring(2, 4));
        JOptionPane.showMessageDialog(null, "Matricula : " + matricula);
        if (msg < 22) {
            JOptionPane.showMessageDialog(null, "Não é desse ano essa matricula");

        }

    }
}
