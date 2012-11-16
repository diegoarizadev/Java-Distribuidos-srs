/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * Powered by Ing. Diego Ariza
 * @Email : diego.ariza2@gmail.com
 * @author n0rf3n
 * @version 1.0
 */
public class ClienteEchoAuxiliar1 {

    private MiSocketDatagramaCliente miSocket;
    private InetAddress maquinaServidora;
    private int puertoServidor;

    public ClienteEchoAuxiliar1(String nombreMaquina, String numPuerto)
            throws SocketException, UnknownHostException {
        this.maquinaServidora = InetAddress.getByName(nombreMaquina);
        this.puertoServidor = Integer.parseInt(numPuerto);

        this.miSocket = new MiSocketDatagramaCliente();

    }

    public String obtenerEco(String mensaje)
            throws SocketException, IOException {
        String eco = "";
        miSocket.enviarMensaje(maquinaServidora, puertoServidor, mensaje);

        eco = miSocket.recibeMensaje();
        return eco;


    }

    public void hecho() throws SocketException {
        miSocket.close();

    }
}
