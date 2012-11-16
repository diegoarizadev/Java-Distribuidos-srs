/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.sql.DataSource;

/**
 * Powered by Ing. Diego Ariza
 * @Email : diego.ariza2@gmail.com
 * @author n0rf3n
 * @version 1.0
 */
@WebService()
public class Agenda {

    @Resource(name = "icloud")
    private DataSource icloud;

    @WebMethod(operationName = "consultar")
    public String consultar(@WebParam(name = "nombre") String nombre) {
        
        String consulta ="";
        
        try {
            
            
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://172.16.196.128:3306/icloud",
                    "root", "123456");
                 
            
            Statement instruccionSQL = (Statement) con.createStatement();
            ResultSet resultadosConsulta = instruccionSQL.executeQuery("SELECT * FROM  `contactos` WHERE  `nombres` LIKE  '%" + nombre + "%'");

            while (resultadosConsulta.next()) {

                consulta = "Nombre = " + resultadosConsulta.getObject("nombres") + " " + resultadosConsulta.getObject("apellidos") + ", Numero de Telefono = " + resultadosConsulta.getObject("telefono") + ", Correo = " + resultadosConsulta.getObject("mail");

            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }


        return consulta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "guardar")
    public String guardar(@WebParam(name = "nombres") String nombres, @WebParam(name = "apellidos") String apellidos, @WebParam(name = "telefono") String telefono, @WebParam(name = "mail") String mail) {

         try {
            
            
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://172.16.196.128:3306/icloud",
                    "root", "123456");

            
            Statement instruccionSQL = (Statement) con.createStatement();
            int val = instruccionSQL.executeUpdate("INSERT INTO icloud.contactos (idContacto, nombres, apellidos, telefono, mail) VALUES (NULL, '" + nombres + "', '" + apellidos + "', '" + telefono + "', '" + mail + "')");
            instruccionSQL.close();            
            
            
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());

        } catch (ClassNotFoundException ex) {
            System.out.print(ex.getMessage());
        }


        

        return "Se ha guardado el contacto "+nombres+" en la nube..!!";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "prueba")
    public String prueba() {
      String x = "Web service en funcionamiento..!!";
        return x;
    }
}
