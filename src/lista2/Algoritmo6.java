package lista2;

import javax.swing.JOptionPane;

public class Algoritmo6 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String a1, a2, a3, a4, a5, a6;
        a1 = "base_dados.xlsx";
        JOptionPane.showMessageDialog(null, a1);
        a2 = "ccode39.zip";
        JOptionPane.showMessageDialog(null, a2);
        a3 = "Logos_concessionarias.zip";
        JOptionPane.showMessageDialog(null, a3);
        a4 = "modelo_dicionario_dados.docx";
        JOptionPane.showMessageDialog(null, a4);
        a5 = "modelo_relatorio.png";
        JOptionPane.showMessageDialog(null, a5);
        a6 = "plantas_eventos.zip fotos.zip";
        JOptionPane.showMessageDialog(null, a6);

        if (a1.contains(".xlsx")) {
            JOptionPane.showMessageDialog(null, "xlsx - excel");
        }
        if (a2.contains(".zip") && a3.contains(".zip") && a6.contains(".zip")) {
            JOptionPane.showMessageDialog(null, "zip - winzip");
        }
        if (a4.contains(".docx")) {
            JOptionPane.showMessageDialog(null, "docx - word");
        }
        if (a5.contains(".png")) {
            JOptionPane.showMessageDialog(null, "png - paint");
        }

    }
}
