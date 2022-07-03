package lista2;

import javax.swing.JOptionPane;

public class Algoritmo3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String imagem, ext;
        imagem = JOptionPane.showInputDialog(null, "Nome de uma determinada imagem com sua extensão : ");
        ext = (imagem.substring(6));
        JOptionPane.showMessageDialog(null, ext);
        if (ext.contains(".bmp")) {
        } else {
            JOptionPane.showMessageDialog(null, "imagem de qualidade para web");
        }
    }
}
