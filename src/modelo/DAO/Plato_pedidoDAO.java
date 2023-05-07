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

import modelo.DTO.plato_pedido;

/**
 *
 * @author User
 */
public class Plato_pedidoDAO {
    
    private static final String SQL_READ_ALL= "select * from Pedido_Plato";
    private static final String SQL_INSERT="insert into Pedido_Plato values (?,?)";
    
    Connection con= MysqlConexion.ObtenerConexion();
    
    public List<plato_pedido> getplato_pedido(){
    List<plato_pedido> listAdministrador= null;
    if(con!=null){
        
        
     PreparedStatement psmt;
    
        try {
            psmt = con.prepareStatement(SQL_READ_ALL);
            ResultSet rs= psmt.executeQuery();
            listAdministrador = new ArrayList<>();
            
            while(rs.next()){
            plato_pedido obj= new plato_pedido(rs.getInt("id_pedido_FK"),rs.getInt("id_plato_FK"));
            
            listAdministrador.add(obj);
            }
        } catch (SQLException ex) {
            System.out.println("erro dao");
        }finally{
        MysqlConexion.cerrar();
        }
    }
    return listAdministrador;
    
    }
    public boolean create(plato_pedido nuevo){
        if(con!=null){
        try {
            PreparedStatement ps= con.prepareStatement(SQL_INSERT);
            ps.setInt(1, nuevo.getId_pedido());
            ps.setInt(2, nuevo.getId_plato());
            if(ps.executeUpdate()>0){
            return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(plato_pedido.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
        MysqlConexion.cerrar();
        }
        }
        
    return false;
    }
    

    public plato_pedido read(plato_pedido filtro){
        plato_pedido objRes=null;
        
        PreparedStatement ps;
        //codigo para consultar el producto
        return objRes;
    }
}
