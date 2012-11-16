/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.net.InetAddress;

/**
 * Powered by Ing. Diego Ariza
 * @Email : diego.ariza2@gmail.com
 * @author n0rf3n
 * @version 1.0
 */
public class MensajeDatagrama {
    
    private String mensaje;
    private InetAddress direccionEmisor;
    private int puertoEmisor;
    
    
    public void fijaValor(String mensaje,InetAddress dir, int puerto ){
        
        this.mensaje = mensaje;
        this.direccionEmisor = dir;
        this.puertoEmisor = puerto;
    }
    
    
    public String obtieneMensaje(){
        return this.mensaje;
    }
    
     public InetAddress obtieneDireccion(){
        return this.direccionEmisor;
    }
     
      public int obtienePuerto(){
        return this.puertoEmisor;
    }
    
    
    
}
