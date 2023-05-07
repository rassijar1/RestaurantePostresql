
package modelo.DTO;


public class Carta {
  private int ID;
  private String vigencia;
  private int ID_encargado;

    public Carta(int ID, String vigencia, int ID_encargado) {
        this.ID = ID;
        this.vigencia = vigencia;
        this.ID_encargado = ID_encargado;
    }
  
   public Carta() {
        this.ID = ID;
        this.vigencia = vigencia;
        this.ID_encargado = ID_encargado;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public int getID_encargado() {
        return ID_encargado;
    }

    public void setID_encargado(int ID_encargado) {
        this.ID_encargado = ID_encargado;
    }
  
  
 
  
}
