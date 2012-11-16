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
public class MiSocketDatagramaServidor extends DatagramSocket {

    static final int MAX_ION = 100;

    public MiSocketDatagramaServidor(int numPuerto) throws SocketException {
        super(numPuerto);
    }

    public void enviaMensaje(InetAddress maquinaReceptora, int puertoReceptor, String mensaje) throws IOException {

        byte[] almacenEnvio = mensaje.getBytes();
        DatagramPacket datagrama = new DatagramPacket(almacenEnvio, almacenEnvio.length, maquinaReceptora, puertoReceptor);
        this.send(datagrama);

    }

    public String recibeMensaje() throws IOException {

        byte[] almacenRecepcion = new byte[MAX_ION];
        DatagramPacket datagrama = new DatagramPacket(almacenRecepcion, MAX_ION);
        String mensaje = new String(almacenRecepcion);
        return mensaje;

    }

    public MensajeDatagrama recibeMensajeYEmisor() throws IOException {

        byte[] almacenRecepcion = new byte[MAX_ION];
        DatagramPacket datagrama = new DatagramPacket(almacenRecepcion, MAX_ION);

        this.receive(datagrama);

        MensajeDatagrama valorDevuelto = new MensajeDatagrama();
        valorDevuelto.fijaValor(new String(almacenRecepcion), datagrama.getAddress(), datagrama.getPort());
        return valorDevuelto;
    }
}
