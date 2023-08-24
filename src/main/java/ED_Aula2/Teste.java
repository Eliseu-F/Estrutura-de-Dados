package ED_Aula2;

/**
 *
 * @author eliseu.fsantos1
 */
public class Teste {

    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(5);

        try {
            for(int i=0; i <= 10; i++){
                vetor.adiciona("elemento "+i);
            }
            

        } catch (Exception e) {
            e.printStackTrace();
        }

       // System.out.println(vetor.adicionaInicio(0, "elemento 0"));
        
       vetor.remove(2);
        
        System.out.println("Tamanho do vetor: " + vetor.tamanho());
        
        System.out.println("Informações dentro do array: " + vetor.toString());

    }
}
