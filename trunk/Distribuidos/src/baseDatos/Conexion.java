/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

/**
 * Powered by Ing. Diego Ariza
 * @Email : diego.ariza2@gmail.com
 * @author n0rf3n
 * @version 1.0
 */
import java.sql.*;

public class Conexion {
    
   static String basedatos = "clase";
   static String usuario = "root";
   static String contrasena = "123456";
   static String driver = "jdbc:mysql://172.16.196.128/"+basedatos;
   /*
    * Windows 127.0.0.1 o localhost
    */
   public String infoConexion;

   Connection conexionbd = null;

   
   public Conexion() {
      try{
         
         Class.forName("com.mysql.jdbc.Driver");
         
         conexionbd = DriverManager.getConnection(driver,usuario,contrasena);
         
         if (conexionbd!=null){
            //System.out.println("la conección con la base de datos "+basedatos+", fu Exitosa.!!");
            infoConexion = "La conexión con la base de datos "+basedatos+", fu Exitosa.!!";
         }
         
      }catch(SQLException e){
         System.out.println(e);
      }catch(ClassNotFoundException e){
         System.out.println(e);
      }
   }
   
   
   public Connection getConnection(){
      return conexionbd;
   }

   public void desconectar(){
      conexionbd = null;
   }

    public String getInfoConexion() {
        return infoConexion;
    }

}