package modelo.DAO;

import persistencia.MysqlConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import modelo.DTO.Pedido;
import modelo.DTO.Administrador;
        


/**
 *
 * @author Usuario
 */
public class PedidoDAO {
       private static final String SQL_READ_ALL= "select * from Pedido";
    private static final String SQL_INSERT="insert into Pedido values (?,?)";
    private static final String SQL_UPDATE="update Pedido set fecha_pedido where id_pedido=?";
    private static final String SQL_DELETE= "delete from Pedido where id_pedido=?";
    
    
     Connection con= MysqlConexion.ObtenerConexion();
     
     
      public List<Pedido> getPedido(){
    List<Pedido> listPedido= null;
    if(con!=null){
        
    PreparedStatement psmt;
    
        try {
            psmt = con.prepareStatement(SQL_READ_ALL);
            ResultSet rs= psmt.executeQuery();
            
            listPedido = new ArrayList<>();
            
            while(rs.next()){
            Pedido obj= new Pedido(rs.getInt("id_Pedido"),rs.getString("fecha_pedido"));
            
           listPedido.add(obj);
            }
        } catch (SQLException ex) {
            System.out.println("erro dao");
        }finally{
        MysqlConexion.cerrar();
        }
    }
    return listPedido;
   
    }
    
   public boolean create(Pedido nuevo){
        try {
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-M-d");
          java.util.Date date1=  formato.parse(nuevo.getFecha_pedido());
          java.sql.Date nuevo2 = new java.sql.Date(date1.getTime());
            PreparedStatement ps= con.prepareStatement(SQL_INSERT);
            ps.setInt(1, nuevo.getID_Pedido());
            ps.setDate(2, nuevo2);
            if(ps.executeUpdate()>0){
            return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  catch (ParseException ex) {
               Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
           }finally {
        MysqlConexion.cerrar();
        }
    return false;
    }
      
     public boolean update(Pedido item){
        PreparedStatement ps;
        try {
             ps= con.prepareStatement(SQL_UPDATE);
             ps.setString(1, SQL_INSERT);
             ps.setString(2,item.getFecha_pedido());
             ps.setInt(1,item.getID_Pedido());
             if(ps.executeUpdate()>0){
            return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        MysqlConexion.cerrar();
        }
    return false;
    }
    
     public Pedido read(Pedido filtro){
        Pedido objPe=null;
        
        PreparedStatement ps;
        //codigo para consultar el producto
        return objPe;
    }
    
    
}