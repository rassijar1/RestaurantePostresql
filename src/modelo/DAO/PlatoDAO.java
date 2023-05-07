
package modelo.DAO;

import persistencia.MysqlConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import modelo.DTO.Plato;
import modelo.DTO.Administrador;


public class PlatoDAO {
    
     private static final String SQL_READ_ALL= "select * from Plato";
    private static final String SQL_INSERT="insert into Plato values (?,?,?,?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE="update Plato set Descripcion='vendido' where id_plato=?";
    private static final String SQL_DELETE= "delete from Plato where id_plato=?";
    
    Connection con= MysqlConexion.ObtenerConexion();
    
    public List<Plato> getPlato(){
    List<Plato> listPlato= null;
    if(con!=null){
        
    PreparedStatement psmt;
    
        try {
            psmt = con.prepareStatement(SQL_READ_ALL);
            ResultSet rs= psmt.executeQuery();
            listPlato = new ArrayList<>();
            
            while(rs.next()){
            Plato obj= new Plato(rs.getInt("id_plato"),rs.getString("nombre"),rs.getString("foto"),rs.getString("Descripcion"),rs.getInt("Precio"),rs.getInt("Id_complejidad_FK"),rs.getInt("Id_categoria_FK"),rs.getInt("Id_receta_FK"),rs.getInt("Id_region_FK"),rs.getInt("id_Carta_FK"));
            
           listPlato.add(obj);
            }
        } catch (SQLException ex) {
            System.out.println("erro dao");
        }finally{
        MysqlConexion.cerrar();
        }
    }
    return listPlato;
    
    }
    
    public boolean create(Plato nuevo){
        try {
            PreparedStatement ps= con.prepareStatement(SQL_INSERT);
            ps.setInt(1,nuevo.getID());
             ps.setString(2,nuevo.getNombre());
             ps.setString(3,nuevo.getFoto());
              ps.setString(4,nuevo.getDescripcion());
                ps.setInt(5,nuevo.getPrecio());
                  ps.setInt(6,nuevo.getId_complejidad_FK());
                    ps.setInt(7,nuevo.getId_categoria_FK());
                      ps.setInt(8,nuevo.getId_receta_FK());
                        ps.setInt(9,nuevo.getId_region_FK());
                          ps.setInt(10,nuevo.getId_Carta_FK());
            if(ps.executeUpdate()>0){
            return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PlatoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
        MysqlConexion.cerrar();
        }
    return false;
    } 
    
     public boolean update(Plato item){
        try {
            PreparedStatement ps= con.prepareStatement(SQL_UPDATE);
             ps.setInt(1,item.getID());
            if(ps.executeUpdate()>0){
            return true;
            }
            
       } catch (SQLException ex) {
            Logger.getLogger(PlatoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        MysqlConexion.cerrar();
        }
    return false;
    }
    
     public Plato read(Plato filtro){
        Plato objPlt=null;
        
        PreparedStatement ps;
        //codigo para consultar el producto
        return objPlt;
    }
    
    
}