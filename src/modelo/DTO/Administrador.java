
package modelo.DTO;

public class Administrador {
    private int ID;
    private String nombre;

    public Administrador(int ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
    }
    public Administrador() {
        this.ID = 0;
        this.nombre = "";
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "Administrador" + "\nID:" + ID + ", nombre: " + nombre;
    }
    
    
}
