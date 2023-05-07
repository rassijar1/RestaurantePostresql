
package modelo.DTO;


public class Pedido {
   private int ID_Pedido;
   private String Fecha_pedido;

    public Pedido(int ID_Pedido, String Fecha_pedido) {
        this.ID_Pedido = ID_Pedido;
        this.Fecha_pedido = Fecha_pedido;
    }
    public Pedido() {
        this.ID_Pedido = 0;
        this.Fecha_pedido = "";
    }

    public int getID_Pedido() {
        return ID_Pedido;
    }

    public void setID_Pedido(int ID_Pedido) {
        this.ID_Pedido = ID_Pedido;
    }

    public String getFecha_pedido() {
        return Fecha_pedido;
    }

    public void setFecha_pedido(String Fecha_pedido) {
        this.Fecha_pedido = Fecha_pedido;
    }

    @Override
    public String toString() {
        return "Pedido" + "ID: " + ID_Pedido + ", Fecha: " + Fecha_pedido;
    }

   
   
}
