/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * Powered by Ing. Diego Ariza
 * @Email : diego.ariza2@gmail.com
 * @author n0rf3n
 * @version 1.0
 */
class MiSocketDatagramaCliente extends DatagramSocket {
    static final int MAX_LON = 100;

    public MiSocketDatagramaCliente() throws SocketException {
        super();
    }

    public MiSocketDatagramaCliente(int numPuerto) throws SocketException {
        super(numPuerto);
    }
    
    public void enviarMensaje(InetAddress maquinaReceptora, int puertoReceptor, String mensaje)throws IOException {
      byte [] almacenEnvio = mensaje.getBytes();
      DatagramPacket datagrama = new DatagramPacket(almacenEnvio, almacenEnvio.length, maquinaReceptora , puertoReceptor);
      this.send(datagrama);
    }
    public String recibeMensaje()
            throws IOException{
         byte [] almacenRecepcion = new byte [MAX_LON];
         DatagramPacket datagram= new DatagramPacket(almacenRecepcion, MAX_LON);
         this.receive(datagram);
         String mensaje = new String (almacenRecepcion);
         return mensaje;
    }
     
    
}
