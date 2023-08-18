package ED_Aula1;


import javax.swing.JOptionPane;

public class Projeto_Temperatura {

    public static void main(String[] args) {

        double temperatura[] = new double[7];
        double soma = 0, media;
        int i, dias_acima, dias_abaixo;

        for (i = 1; i < 7; i++) {
            temperatura[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a" + (i + 1) + "° temperatura"));

            soma = soma + temperatura[i];
        }
        media = soma / 7;
        dias_acima = 0;
        dias_abaixo = 0;

        for ( i = 0; i < 7; i++) {
            if (temperatura[i] > media) {
                dias_acima = dias_acima + 1;
            }
            if (temperatura[i] < media) {
                dias_abaixo = dias_abaixo + 1;
            }
        }
        
            JOptionPane.showMessageDialog(null, "A média das temperaturas é " + media);
            JOptionPane.showMessageDialog(null, "A quantidade de dias acima da média é " + dias_acima);
            JOptionPane.showMessageDialog(null, "A quantidade de dias acima da média é " + dias_abaixo);
        }

    }
