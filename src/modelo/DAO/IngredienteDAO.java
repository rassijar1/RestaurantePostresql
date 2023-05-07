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

import modelo.DTO.Ingrediente;
import modelo.DTO.Receta;

/**
 *
 * @author User
 */
public class IngredienteDAO {
    
    private static final String SQL_READ_ALL= "select * from Ingrediente";
    private static final String SQL_INSERT="insert into Ingrediente values (?,?,?,?)";
    private static final String SQL_UPDATE="update Ingrediente set nombre where id_ingrediente=?";
    private static final String SQL_DELETE= "delete from Ingrediente where id_ingrediente=?";
    
    Connection con= MysqlConexion.ObtenerConexion();
    
    public List<Ingrediente> getinIngrediente(){
    List<Ingrediente> listAdministrador= null;
    if(con!=null){
        
        
     PreparedStatement psmt;
    
        try {
            psmt = con.prepareStatement(SQL_READ_ALL);
            ResultSet rs= psmt.executeQuery();
            listAdministrador = new ArrayList<>();
            
            while(rs.next()){
            Ingrediente obj= new Ingrediente(rs.getInt("id_ingrediente"),rs.getString("nombre"),rs.getString("medida"),rs.getInt("cantidad"));
            
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
    public boolean create(Ingrediente nuevo){
        if(con!=null){
        try {
            PreparedStatement ps= con.prepareStatement(SQL_INSERT);
            ps.setInt(1, nuevo.getId_ingrediente());
            ps.setString(2, nuevo.getNombre());
            ps.setString(3, nuevo.getMedida());
            ps.setInt(4, nuevo.getCantidad());
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
    public boolean update(Ingrediente item){
        PreparedStatement ps;
        if(con!=null){
        try {
             ps= con.prepareStatement(SQL_UPDATE);
             ps.setInt(1, item.getId_ingrediente());
            ps.setString(2, item.getNombre());
            ps.setString(3, item.getMedida());
            ps.setInt(4, item.getCantidad());
             if(ps.executeUpdate()>0){
            return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Ingrediente.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        MysqlConexion.cerrar();
        }
        }
        
    return false;
    }
    
    public boolean delete(Ingrediente item){
        PreparedStatement ps;
        if(con!=null){
            try {
            ps= con.prepareStatement(SQL_DELETE);
            ps.setInt(1, item.getId_ingrediente());
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
    public Ingrediente read(Ingrediente filtro){
        Ingrediente objRes=null;
        
        PreparedStatement ps;
        //codigo para consultar el producto
        return objRes;
    }
}
