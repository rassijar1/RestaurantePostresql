/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class MysqlConexion {
    
    private static Connection cnx = null;
     public static  synchronized Connection  ObtenerConexion(){
         if(cnx==null){
             try {
                 
                  Class.forName("org.postgresql.Driver");
                 cnx=DriverManager.getConnection("jdbc:postgresql://localhost:5432/rambo","postgres","1234");
             } catch (ClassNotFoundException  |SQLException ex) {
                 
                 System.out.println(" error "+ex);
                            
             } 
         }
         return cnx;
         
     }
     
     public static void cerrar(){
     
        try {
            if(cnx!=null){
            cnx.close();
            }
            cnx=null;
        } catch (SQLException ex) {
            Logger.getLogger(MysqlConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
}
