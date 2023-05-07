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

import modelo.DTO.Administrador;

/**
 *
 * @author User
 */
public class AdministradorDAO {
    
    private static final String SQL_READ_ALL= "select * from administrador";
    private static final String SQL_INSERT="insert into administrador values (?,?)";
    private static final String SQL_UPDATE="update administrador set Nombre where id_administrador=?";
    private static final String SQL_DELETE= "delete from administrador where id_p=?";
    private static final String SQL_LOGIN="select * from administrador where id_administrador=?";
    
    Connection con= MysqlConexion.ObtenerConexion();
    
    public List<Administrador> getAdministrador(){
    List<Administrador> listAdministrador= null;
    if(con!=null){
        
        
     PreparedStatement psmt;
    
        try {
            psmt = con.prepareStatement(SQL_READ_ALL);
            ResultSet rs= psmt.executeQuery();
            listAdministrador = new ArrayList<>();
            
            while(rs.next()){
            Administrador obj= new Administrador(rs.getInt("id_administrado"),rs.getString("Nombre"));
            
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
    public boolean create(Administrador nuevo){
        if(con!=null){
        try {
            PreparedStatement ps= con.prepareStatement(SQL_INSERT);
            ps.setInt(1, nuevo.getID());
            ps.setString(2, nuevo.getNombre());
            if(ps.executeUpdate()>0){
            return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
        MysqlConexion.cerrar();
        }
        }
        
    return false;
    }
    
    public boolean update(Administrador item){
        PreparedStatement ps;
        if(con!=null){
        try {
             ps= con.prepareStatement(SQL_UPDATE);
             ps.setString(1, item.getNombre());
             ps.setInt(2,item.getID());
             if(ps.executeUpdate()>0){
            return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        MysqlConexion.cerrar();
        }
        }
        
    return false;
    }
    
    public boolean delete(Administrador item){
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
    public Administrador read(Administrador filtro){
        Administrador objRes=null;
        
        PreparedStatement ps;
        //codigo para consultar el producto
        return objRes;
    } 
    
    public Administrador login(Administrador nuevo){
        Administrador objRes = null;
        PreparedStatement ps;
        if(con!=null){
        try {
            ps= con.prepareStatement(SQL_LOGIN);
            ps.setInt(1, nuevo.getID());
            ResultSet rs= ps.executeQuery();
           while(rs.next()){
                    objRes = new Administrador(
                            rs.getInt("id_administrador"),
                            rs.getString("Nombre"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return objRes;
    }
    
  
}
