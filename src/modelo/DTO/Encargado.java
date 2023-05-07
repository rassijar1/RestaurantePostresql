
package modelo.DTO;


public class Encargado {
 private int ID;
 private String Nombre;
 private int ID_region;
 private int ID_administrador;

    public Encargado(int ID, String Nombre, int ID_region, int ID_administrador) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.ID_region = ID_region;
        this.ID_administrador = ID_administrador;
    }
  public Encargado() {
        this.ID = ID;
        this.Nombre = Nombre;
        this.ID_region = ID_region;
        this.ID_administrador = ID_administrador;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getID_region() {
        return ID_region;
    }

    public void setID_region(int ID_region) {
        this.ID_region = ID_region;
    }

    public int getID_administrador() {
        return ID_administrador;
    }

    public void setID_administrador(int ID_administrador) {
        this.ID_administrador = ID_administrador;
    }
  
 
  
    
}
