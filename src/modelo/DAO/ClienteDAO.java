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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import modelo.DTO.Cliente;

/**
 *
 * @author User
 */
public class ClienteDAO {
    
    private static final String SQL_READ_ALL= "select * from cliente";
    private static final String SQL_INSERT="insert into cliente values (?,?)";
    private static final String SQL_UPDATE="update cliente set nombre where id_clienter=?";
    private static final String SQL_DELETE= "delete from cliente where id_cliente=?";
    private static final String SQL_LOGIN="select * from cliente where id_cliente=?";
    Connection con= MysqlConexion.ObtenerConexion();
    
    public List<Cliente> getCliente(){
    List<Cliente> listAdministrador= null;
    if(con!=null){
        
        
     PreparedStatement psmt;
    
        try {
            psmt = con.prepareStatement(SQL_READ_ALL);
            ResultSet rs= psmt.executeQuery();
            listAdministrador = new ArrayList<>();
            
            while(rs.next()){
            Cliente obj= new Cliente(rs.getInt("id_cliente"),rs.getString("nombre"));
            
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
    public boolean create(Cliente nuevo){
        if(con!=null){
        try {
            PreparedStatement ps= con.prepareStatement(SQL_INSERT);
            ps.setInt(1, nuevo.getID_cliente());
            ps.setString(2, nuevo.getNombre());
            if(ps.executeUpdate()>0){
            return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
        MysqlConexion.cerrar();
        }
        }
        
    return false;
    }
     public boolean buscar(Cliente nuevo){
        if(con!=null){
        try {
            PreparedStatement ps= con.prepareStatement(SQL_INSERT);
            ps.setInt(1, nuevo.getID_cliente());
            ps.setString(2, nuevo.getNombre());
            if(ps.executeUpdate()>0){
            return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
        MysqlConexion.cerrar();
        }
        }
        
    return false;
    }
    public boolean update(Cliente item){
        PreparedStatement ps;
        if(con!=null){
        try {
             ps= con.prepareStatement(SQL_UPDATE);
             ps.setString(1, item.getNombre());
             ps.setInt(2,item.getID_cliente());
             if(ps.executeUpdate()>0){
            return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        MysqlConexion.cerrar();
        }
        }
        
    return false;
    }
    
    public boolean delete(Cliente item){
        PreparedStatement ps;
        if(con!=null){
            try {
            ps= con.prepareStatement(SQL_DELETE);
            ps.setInt(1, item.getID_cliente());
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
    public Cliente read(Cliente filtro){
        Cliente objRes=null;
        
        PreparedStatement ps;
        //codigo para consultar el cliente
        return objRes;
    }
      public Cliente login(Cliente nuevo){
        Cliente objRes = null;
        PreparedStatement ps;
        if(con!=null){
        try {
            ps= con.prepareStatement(SQL_LOGIN);
            ps.setInt(1, nuevo.getID_cliente());
            ResultSet rs= ps.executeQuery();
           while(rs.next()){
                    objRes = new Cliente(
                            rs.getInt("id_cliente"),
                            rs.getString("nombre"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return objRes;
    }
}
