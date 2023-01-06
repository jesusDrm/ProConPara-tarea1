import java.util.HashMap;

public class Test  {

    static Mesero Mesero1 = new Mesero();
    static Mesero Mesero2 = new Mesero();

    static HashMap<String, Double> menu = new HashMap<String, Double>();

    public static void main(String[] args) {
        /*Cliente Cliente1 = new Cliente();
        Cliente Cliente2 = new Cliente();

        String orden1 = "2 cocas, 2 tortas de jamon";
        String orden2 = "3 hamburguesas";

        Cliente1.setOrden(orden1,Mesero1);
        System.out.println(Cliente1.pedirOrden());
        */

        menu.put("coca cola 600 ml", 15.50);
        menu.put("torta ahogada", 30.00);
        menu.put("chilaquiles", 50.50);
        menu.put("sangria", 23.5);
        menu.put("quesadilla", 40.50);
        menu.put("chiles rellenos", 70.50);

        Cliente cliente1 = new Cliente();


        System.out.println(menu.toString());

        System.out.println( cliente1.ordenar(menu).toString() );

    }
}