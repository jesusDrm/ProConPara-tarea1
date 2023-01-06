public class Test  {

    static Mesero Mesero1 = new Mesero();
    static Mesero Mesero2 = new Mesero();



    public static void main(String[] args) {
        Cliente Cliente1 = new Cliente();
        Cliente Cliente2 = new Cliente();

        String orden1 = "2 cocas, 2 tortas de jamon";
    String orden2 = "3 hamburguesas";

        Cliente1.setOrden(orden1,Mesero1);
        System.out.println(Cliente1.pedirOrden());


    }
}