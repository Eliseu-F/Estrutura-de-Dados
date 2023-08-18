package ED_Aula2;

/**
 *
 * @author eliseu.fsantos1
 */
public class Teste {

    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(5);

        try {
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
            vetor.adiciona("elemento 3");
            vetor.adiciona("elemento 4");
            vetor.adiciona("elemento 5");             
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Tamanho do vetor: " + vetor.tamanho());
        System.out.println("Informações dentro do array: "+vetor.toString());
        System.out.println(vetor.busca(6));
    }
}
