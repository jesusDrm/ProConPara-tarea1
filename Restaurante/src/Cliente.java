public class Cliente {
    String orden;
    Mesero mesero;

    public String getOrden() {
        return orden;
    }


     public String pedirOrden(){
            mesero.setOrden(orden);
            return mesero.getOrden();
        }
    public void setOrden(String orden, Mesero mesero) {
        this.orden = orden;
        this.mesero = mesero;
    }
}
