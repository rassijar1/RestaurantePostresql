
package modelo.DTO;

public class Cliente {
    private int ID_cliente;
    private String nombre;

    public Cliente(int ID_cliente, String nombre) {
        this.ID_cliente = ID_cliente;
        this.nombre = nombre;
    }
    public Cliente() {
        this.ID_cliente = 0;
        this.nombre = "";
    }

    public int getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(int ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente: " + ",ID del cliente : " + ID_cliente + ", Nombre: " + nombre;
    }
    
}
