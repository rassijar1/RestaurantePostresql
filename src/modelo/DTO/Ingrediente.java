
package modelo.DTO;

public class Ingrediente {
    private int Id_ingrediente;
    private String nombre;
    private String medida;
    private int cantidad;

    public Ingrediente(int Id_ingrediente, String nombre, String medida, int cantidad) {
        this.Id_ingrediente = Id_ingrediente;
        this.nombre = nombre;
        this.medida = medida;
        this.cantidad = cantidad;
    }
      public Ingrediente() {
        this.Id_ingrediente = 0;
        this.nombre = "";
        this.medida = "";
        this.cantidad = 0;
    }

    public int getId_ingrediente() {
        return Id_ingrediente;
    }

    public void setId_ingrediente(int Id_ingrediente) {
        this.Id_ingrediente = Id_ingrediente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Ingrediente: " + ",Id del ingrediente: " + Id_ingrediente + ",Nombre: " + nombre + "Medida: " + medida + "Cantidad=" + cantidad;
    }
    
    
}
