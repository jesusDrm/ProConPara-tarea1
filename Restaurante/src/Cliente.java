import java.util.Random;
import java.util.LinkedList;
import java.util.HashMap;

public class Cliente {
    private String nombre;
    

    public Cliente(String nombre){
        this.nombre = nombre;
    }

    public LinkedList<String> ordenar(HashMap<String, Double> menu){
        //lista almacenara la orden de cosas que "quiere" el cliente. 
        LinkedList<String> lista = new LinkedList<String>();

        //se necesita para poder elegir algun platillo de manera aleatoria
        Object[] listaPlatillos = menu.keySet().toArray();

        //genera un numero aleatorio correspondiente al numero de cosas que quiere el cliente.
        Random rand = new Random();
        int limite = menu.size();
        int numeroPlatilos = rand.nextInt(limite);
        //si el numero de platillos es 0, se cambia automaticamente a 2, sino mantiene su valor.
        //esto para evitar ordenes vacias []
        numeroPlatilos = (numeroPlatilos == 0) ? 2 : numeroPlatilos;

        //repite el ciclo dependiendo del numero de cosas ordenadas por el cliente
        for (int i = 0; i < numeroPlatilos; i++){
            //genera un indice aleatorio
            //esto para tomar un platillo aleatorio del array Object[] listaPlatillos
            int randomIndex = rand.nextInt(limite);

            //agrega a la orden el platillo que tiene el indide randomIndex
            lista.add( (String)listaPlatillos[randomIndex] );
        }        
        
        return lista;
    }

    public String getNombre(){
        return this.nombre;
    }
}
