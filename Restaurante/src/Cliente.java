import java.util.Random;
import java.util.LinkedList;
import java.util.HashMap;

public class Cliente {
    

    public LinkedList<String> ordenar(HashMap<String, Double> menu){
        LinkedList<String> lista = new LinkedList<String>();
        Object[] listaPlatillos = menu.keySet().toArray();

        Random rand = new Random();
        int limite = menu.size();
        int numeroPlatilos = rand.nextInt(limite);

        for (int i = 0; i < numeroPlatilos; i++){
            int randomIndex = rand.nextInt(limite);

            lista.add( (String)listaPlatillos[randomIndex] );
        }        
        
        return lista;
    }

}
