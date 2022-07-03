package lista2;

import javax.swing.JOptionPane;

public class Algoritmo8 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String uf;
        uf = JOptionPane
                .showInputDialog(null, "Digite a sigla do seu estado(UF) para obter a capital correspondente : ")
                .toUpperCase();
        switch (uf) {
            case "AC":
                JOptionPane.showMessageDialog(null, "Rio Branco");
                break;
            case "AL":
                JOptionPane.showMessageDialog(null, "Maceió");
                break;
            case "AP":
                JOptionPane.showMessageDialog(null, "Macapá");
                break;
            case "AM":
                JOptionPane.showMessageDialog(null, "Manaus");
                break;
            case "BA":
                JOptionPane.showMessageDialog(null, "Salvador");
                break;
            case "CE":
                JOptionPane.showMessageDialog(null, "Fortaleza");
                break;
            case "DF":
                JOptionPane.showMessageDialog(null, "Brasília");
                break;
            case "ES":
                JOptionPane.showMessageDialog(null, "Vitória");
                break;
            case "GO":
                JOptionPane.showMessageDialog(null, "Goiânia");
                break;
            case "MA":
                JOptionPane.showMessageDialog(null, "São Luís");
                break;
            case "MT":
                JOptionPane.showMessageDialog(null, "Cuiabá");
                break;
            case "MS":
                JOptionPane.showMessageDialog(null, "Campo Grande");
                break;
            case "MG":
                JOptionPane.showMessageDialog(null, "Belo Horizonte");
                break;
            case "PA":
                JOptionPane.showMessageDialog(null, "Belém");
                break;
            case "PB":
                JOptionPane.showMessageDialog(null, "João Pessoa");
                break;
            case "PR":
                JOptionPane.showMessageDialog(null, "Curitiba");
                break;
            case "PE":
                JOptionPane.showMessageDialog(null, "Recife");
                break;
            case "PI":
                JOptionPane.showMessageDialog(null, "Teresina");
                break;
            case "RJ":
                JOptionPane.showMessageDialog(null, "Rio de Janeiro");
                break;
            case "RN":
                JOptionPane.showMessageDialog(null, "Natal");
                break;
            case "RS":
                JOptionPane.showMessageDialog(null, "Porto Alegre");
                break;
            case "RO":
                JOptionPane.showMessageDialog(null, "Porto Velho");
                break;
            case "RR":
                JOptionPane.showMessageDialog(null, "Boa Vista");
                break;
            case "SC":
                JOptionPane.showMessageDialog(null, "Florianópolis");
                break;
            case "SP":
                JOptionPane.showMessageDialog(null, "São Paulo");
                break;
            case "SE":
                JOptionPane.showMessageDialog(null, "Aracaju");
                break;
            case "TO":
                JOptionPane.showMessageDialog(null, "Palmas");
                break;
            default:
                JOptionPane.showMessageDialog(null, "UF não correspondente");

        }
    }
}
