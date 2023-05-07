
package modelo.DTO;

public class plato_pedido {
    private int id_plato;
    private int id_pedido;

    public plato_pedido(int id_plato, int id_pedido) {
        this.id_plato = id_plato;
        this.id_pedido = id_pedido;
    }
    public plato_pedido() {
        this.id_plato = id_plato;
        this.id_pedido = id_pedido;
    }
    public int getId_plato() {
        return id_plato;
    }

    public void setId_plato(int id_plato) {
        this.id_plato = id_plato;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }
    
}
