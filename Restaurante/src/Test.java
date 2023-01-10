import java.util.*;

public class Test  {

    public static void main(String[] args) {
        //el menu consiste del nombre del platillo (String) y su precio (double)
        HashMap<String, Double> menu = new HashMap<String, Double>();

        //las cuentas consisten del nombre del cliente (String)
        //y la lista de cosas que ha pedido
        HashMap<String, LinkedList> cuentas = new HashMap<String, LinkedList>();

        //se crea una lista de clientes que estan a la espera de ser atendidos
        Queue<Cliente> listaClientes = new LinkedList<Cliente>();

        Mesero mesero1 = new Mesero("Panchito");
        Mesero mesero2 = new Mesero("Jorge");

        //entran a la cola 4 clientes
        listaClientes.add(new Cliente("Jose"));
        listaClientes.add(new Cliente("Juan"));
        listaClientes.add(new Cliente("Gonzalo"));
        listaClientes.add(new Cliente("Ricardo"));

        rellenarMenu(menu);

        //el mesero 1 toma la orden del primer cliente en llegar
        Cliente cliente1 = listaClientes.poll();
        System.out.println(
            mesero1.tomarOrden(menu, cliente1)
        );

        Cliente cliente2 = listaClientes.poll();
        System.out.println(
            mesero1.tomarOrden(menu, cliente2)
        );

        Cliente cliente3 = listaClientes.poll();
        System.out.println(
            mesero1.tomarOrden(menu, cliente3)
        );
    }

    public static void rellenarMenu(HashMap<String, Double> menu){
        menu.put("coca cola 600 ml", 15.50);
        menu.put("torta ahogada", 30.00);
        menu.put("chilaquiles", 50.50);
        menu.put("sangria", 23.5);
        menu.put("quesadilla", 40.50);
        menu.put("chiles rellenos", 70.50);
        menu.put("torta de choriquezo", 25.50);
        menu.put("crema de zanahoria", 25.50);
    }
}