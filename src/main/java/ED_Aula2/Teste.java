package ED_Aula2;

/**
 *
 * @author eliseu.fsantos1
 */
public class Teste {

    public static void main(String[] args) throws Exception {
        VetorObjeto vetor = new VetorObjeto(5);

        Contato c1 = new Contato("Claudio", "9999-2525", "claudio@gmail.com");
        Contato c2 = new Contato("Daniel", "9999-7213", "daniel@gmail.com");
        Contato c3 = new Contato("Miguel", "9999-6546", "miguel@gmail.com");
        
        try {
            
                vetor.adiciona(c1);
                vetor.adiciona(c2);
                vetor.adiciona(c3);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

       // System.out.println(vetor.adicionaInicio(0, "elemento 0"));
        
       // vetor.remove(2);
        
        System.out.println("Tamanho do vetor: " + vetor.tamanho());
        
        System.out.println(vetor);
        
       // System.out.println("Informações dentro do array: " + vetor.toString());

    }
}
