
package modelo.DTO;

public class Receta {
    private int Id_receta;
    private String descripccion; 

    public Receta(int Id_receta, String descripccion) {
        this.Id_receta = Id_receta;
        this.descripccion = descripccion;
    }
    public Receta() {
        this.Id_receta = Id_receta;
        this.descripccion = "";
    }

    public int getId_receta() {
        return Id_receta;
    }

    public void setId_receta(int Id_receta) {
        this.Id_receta = Id_receta;
    }

    public String getDescripccion() {
        return descripccion;
    }

    public void setDescripccion(String descripccion) {
        this.descripccion = descripccion;
    }

    @Override
    public String toString() {
        return "Receta: " + ",Id de la receta: " + Id_receta + ",Descripccion: " + descripccion;
    }
    
    
}
