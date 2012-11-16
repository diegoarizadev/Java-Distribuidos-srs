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

public class ClienteContadorAuxiliar1 {

    public static int obtenerContador(String nombreMaquina, String numPuerto) {

        int contador = 0;
        String mensaje = "";
        try {
            InetAddress maquinaServidora = InetAddress.getByName(nombreMaquina);
            int puertoServidor = Integer.parseInt(numPuerto);
            // instancia un socket datagrama para enviar
            // y recibir datos.
            MiSocketDatagramaCliente miSocket = new MiSocketDatagramaCliente();
            miSocket.enviarMensaje(maquinaServidora, puertoServidor, "");
            // ahora recibe el valor del contador
            mensaje = miSocket.recibeMensaje();
            System.out.println("Mensaje recibido: " + mensaje);
            contador = Integer.parseInt(mensaje.trim());
            miSocket.close();

        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return contador;
    }

    
}
