/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;



import java.net.URL;

/**
 * Powered by Ing. Diego Ariza
 * @Email : diego.ariza2@gmail.com
 * @author n0rf3n
 * @version 1.0
 */

public class pruebawebservice {


  
    
    public static void main(String[] args) {
        
     
        
       System.out.println(consultar("karen"));
       
       System.out.println(guardar("alvaro", "alvaro", "alvaro", "alvaro"));
        
        
    }

    private static String consultar(java.lang.String nombre) {
        WebService.AgendaService service = new WebService.AgendaService();
        WebService.Agenda port = service.getAgendaPort();
        return port.consultar(nombre);
    }

    private static String guardar(java.lang.String nombres, java.lang.String apellidos, java.lang.String telefono, java.lang.String mail) {
        WebService.AgendaService service = new WebService.AgendaService();
        WebService.Agenda port = service.getAgendaPort();
        return port.guardar(nombres, apellidos, telefono, mail);
    }
    

  
    
    
}
