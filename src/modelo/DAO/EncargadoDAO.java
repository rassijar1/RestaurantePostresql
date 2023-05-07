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

import modelo.DTO.Encargado;

/**
 *
 * @author User
 */
public class EncargadoDAO {
    
    private static final String SQL_READ_ALL= "select * from encargado";
    private static final String SQL_INSERT="insert into encargado values (?,?,?,?)";
    private static final String SQL_UPDATE="update encargado set nombre where id_encargado=?";
    private static final String SQL_DELETE= "delete from encargado where id_encargado=?";
     private static final String SQL_LOGIN="select * from encargado where id_encargado=?";
     
    Connection con= MysqlConexion.ObtenerConexion();
    public List<Encargado> getEncargado(){
    List<Encargado> listAdministrador= null;
    if(con!=null){
        
        
     PreparedStatement psmt;
    
        try {
            psmt = con.prepareStatement(SQL_READ_ALL);
            ResultSet rs= psmt.executeQuery();
            listAdministrador = new ArrayList<>();
            
            while(rs.next()){
            Encargado obj= new Encargado(rs.getInt("id_encargado"),rs.getString("nombre"),rs.getInt("Id_region_FK"),rs.getInt("id_administrador_fk"));
            
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
    public boolean create(Encargado nuevo){
        if(con!=null){
        try {
            PreparedStatement ps= con.prepareStatement(SQL_INSERT);
            ps.setInt(1, nuevo.getID());
            ps.setString(2, nuevo.getNombre());
            ps.setInt(3, nuevo.getID_region());
            ps.setInt(4, nuevo.getID_administrador());
            if(ps.executeUpdate()>0){
            return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Encargado.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
        MysqlConexion.cerrar();
        }
        }
        
    return false;
    }
    
    public boolean update(Encargado item){
        PreparedStatement ps;
        if(con!=null){
        try {
             ps= con.prepareStatement(SQL_UPDATE);
            ps.setInt(1, item.getID());
            ps.setString(2, item.getNombre());
            ps.setInt(3, item.getID_region());
            ps.setInt(4, item.getID_administrador());
             if(ps.executeUpdate()>0){
            return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Encargado.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        MysqlConexion.cerrar();
        }
        }
        
    return false;
    }
    
    public boolean delete(Encargado item){
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
    public Encargado read(Encargado filtro){
        Encargado objRes=null;
        
        PreparedStatement ps;
        //codigo para consultar el producto
        return objRes;
    }
      public Encargado login(Encargado nuevo){
        Encargado objRes = null;
        PreparedStatement ps;
        if(con!=null){
        try {
            ps= con.prepareStatement(SQL_LOGIN);
            ps.setInt(1, nuevo.getID());
            ResultSet rs= ps.executeQuery();
           while(rs.next()){
                    objRes = new Encargado(
                            rs.getInt("id_encargado"),
                            rs.getString("nombre"),
                            rs.getInt("Id_region_FK"),
                            rs.getInt("id_administrador_fk"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return objRes;
    }
}
