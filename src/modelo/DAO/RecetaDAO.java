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

import modelo.DTO.Receta;

/**
 *
 * @author User
 */
public class RecetaDAO {
    
    private static final String SQL_READ_ALL= "select * from Receta";
    private static final String SQL_INSERT="insert into Receta values (?,?)";
    private static final String SQL_UPDATE="update Receta set descripcion where id_receta=?";
    private static final String SQL_DELETE= "delete from Receta where id_receta=?";
    
    Connection con= MysqlConexion.ObtenerConexion();
    
    public List<Receta> getReceta(){
    List<Receta> listAdministrador= null;
    if(con!=null){
        
        
     PreparedStatement psmt;
    
        try {
            psmt = con.prepareStatement(SQL_READ_ALL);
            ResultSet rs= psmt.executeQuery();
            listAdministrador = new ArrayList<>();
            
            while(rs.next()){
            Receta obj= new Receta(rs.getInt("id_receta"),rs.getString("descripcion"));
            
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
    public boolean create(Receta nuevo){
        if(con!=null){
        try {
            PreparedStatement ps= con.prepareStatement(SQL_INSERT);
            ps.setInt(1, nuevo.getId_receta());
            ps.setString(2, nuevo.getDescripccion());
            if(ps.executeUpdate()>0){
            return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Receta.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
        MysqlConexion.cerrar();
        }
        }
        
    return false;
    }
    
    public boolean update(Receta item){
        PreparedStatement ps;
        if(con!=null){
        try {
             ps= con.prepareStatement(SQL_UPDATE);
            ps.setInt(1, item.getId_receta());
            ps.setString(2, item.getDescripccion());
             if(ps.executeUpdate()>0){
            return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Receta.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        MysqlConexion.cerrar();
        }
        }
        
    return false;
    }
    
    public boolean delete(Receta item){
        PreparedStatement ps;
        if(con!=null){
            try {
            ps= con.prepareStatement(SQL_DELETE);
            ps.setInt(1, item.getId_receta());
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
    public Receta read(Receta filtro){
        Receta objRes=null;
        
        PreparedStatement ps;
        //codigo para consultar el producto
        return objRes;
    }
}
