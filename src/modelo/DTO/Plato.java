
package modelo.DTO;

public class Plato {
private int ID;
private String Nombre;
private String Foto;
private String Descripcion;
private int Id_complejidad_FK;
private int Id_categoria_FK;
private int Id_receta_FK;
private int Id_region_FK;
private int id_Carta_FK; 
private int precio;

    public Plato(int ID, String Nombre, String Foto, String Descripcion, int Id_complejidad_FK, int Id_categoria_FK, int Id_receta_FK, int Id_region_FK, int id_Carta_FK, int precio) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Foto = Foto;
        this.Descripcion = Descripcion;
        this.Id_complejidad_FK = Id_complejidad_FK;
        this.Id_categoria_FK = Id_categoria_FK;
        this.Id_receta_FK = Id_receta_FK;
        this.Id_region_FK = Id_region_FK;
        this.id_Carta_FK = id_Carta_FK;
        this.precio = precio;
    }

    public Plato() {
        this.ID = 0;
        this.Nombre = "";
        this.Foto = "";
        this.Descripcion = "";
        this.Id_complejidad_FK = 0;
        this.Id_categoria_FK = 0;
        this.Id_receta_FK = 0;
        this.Id_region_FK = 0;
        this.id_Carta_FK = 0;
        this.precio = 0;
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

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String Foto) {
        this.Foto = Foto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getId_complejidad_FK() {
        return Id_complejidad_FK;
    }

    public void setId_complejidad_FK(int Id_complejidad_FK) {
        this.Id_complejidad_FK = Id_complejidad_FK;
    }

    public int getId_categoria_FK() {
        return Id_categoria_FK;
    }

    public void setId_categoria_FK(int Id_categoria_FK) {
        this.Id_categoria_FK = Id_categoria_FK;
    }

    public int getId_receta_FK() {
        return Id_receta_FK;
    }

    public void setId_receta_FK(int Id_receta_FK) {
        this.Id_receta_FK = Id_receta_FK;
    }

    public int getId_region_FK() {
        return Id_region_FK;
    }

    public void setId_region_FK(int Id_region_FK) {
        this.Id_region_FK = Id_region_FK;
    }

    public int getId_Carta_FK() {
        return id_Carta_FK;
    }

    public void setId_Carta_FK(int id_Carta_FK) {
        this.id_Carta_FK = id_Carta_FK;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }





  
}