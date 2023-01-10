import java.util.LinkedList;
import java.util.HashMap;

public class Mesero {
    private String nombre;

    public Mesero(String nombre){
        this.nombre = nombre;
    }

    public LinkedList<String> tomarOrden(HashMap<String, Double> menu, Cliente c){
        System.out.println("mesero "+this.nombre+" atendiendo al cliente "+c.getNombre());
        return c.ordenar(menu);
    }
    
}
