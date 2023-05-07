/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

import modelo.DTO.Carta;


/**
 *
 * @author User
 */
public class CartaDAO {
    
    private static final String SQL_READ_ALL= "select * from Carta";
    private static final String SQL_INSERT="insert into Carta values (?,?,?)";
    private static final String SQL_UPDATE="update Carta set vigencia where id_carta=?";
    private static final String SQL_DELETE= "delete from Carta where id_carta=?";
    
    Connection con= MysqlConexion.ObtenerConexion();
    
    public List<Carta> getCarta(){
    List<Carta> listcarta= null;
    if(con!=null){
        
     PreparedStatement psmt;
    
        try {
            psmt = con.prepareStatement(SQL_READ_ALL);
            ResultSet rs= psmt.executeQuery();
            listcarta = new ArrayList<>();
            
            while(rs.next()){
            Carta obj= new Carta(rs.getInt("id_carta"),rs.getString("vigencia"), rs.getInt("id_encargado_FK"));
            
            listcarta.add(obj);
            }
        } catch (SQLException ex) {
            System.out.println("erro dao");
        }finally{
        MysqlConexion.cerrar();
        }
    }
    return listcarta;
    
    }
    public boolean create(Carta nuevo){
        try {
          SimpleDateFormat formato = new SimpleDateFormat("yyyy-M-d");
          java.util.Date date1=  formato.parse(nuevo.getVigencia());
          java.sql.Date nuevo2 = new java.sql.Date(date1.getTime());
            PreparedStatement ps= con.prepareStatement(SQL_INSERT);
            ps.setInt(1, nuevo.getID());
            ps.setDate(2, nuevo2);
            ps.setInt(3, nuevo.getID_encargado());
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
       /*public boolean create(Pedido nuevo){
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
    return false;
    }
    */
    public boolean update(Carta item){
        PreparedStatement ps;
        if(con!=null){
        try {
             ps= con.prepareStatement(SQL_UPDATE);
             ps.setString(1, item.getVigencia());
             ps.setInt(2,item.getID());
             if(ps.executeUpdate()>0){
            return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Carta.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        MysqlConexion.cerrar();
        }
        }
        
    return false;
    }
    
    public boolean delete(Carta item){
        PreparedStatement ps;
        if(con!=null){
            try {
            ps= con.prepareStatement(SQL_DELETE);
            ps.setInt(1, item.getID());
            if(ps.executeUpdate()>0){
            return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CartaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        MysqlConexion.cerrar();
        }
        }
        
    return false;
    }
    public Carta read(Carta filtro){
        Carta objRes=null;
        
        PreparedStatement ps;
        //codigo para consultar el producto
        return objRes;
    }
}
