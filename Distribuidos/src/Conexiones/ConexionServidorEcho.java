/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexiones;

import Clases.MensajeDatagrama;
import Clases.MiSocketDatagramaServidor;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Powered by Ing. Diego Ariza
 * @Email : diego.ariza2@gmail.com
 * @author n0rf3n
 * @version 1.0
 */
public class ConexionServidorEcho implements Runnable {

    public MiSocketDatagramaServidor miSocket;
    public MensajeDatagrama peticion;
    static int contador = 0;
    public String Conexion = "Servidor Contador listo";
    public JTextArea jt;
    public int puertoServidor;

    public ConexionServidorEcho(MiSocketDatagramaServidor miSocket, MensajeDatagrama peticion, int puertoServidor) {
        this.miSocket = miSocket;
        this.peticion = peticion;
        this.puertoServidor = puertoServidor;
    }

    public ConexionServidorEcho(int puertoServidor, JTextArea jt) {
        this.puertoServidor = puertoServidor;
        this.jt = jt;
    }

    @Override
    public void run() {

        try {

            miSocket = new MiSocketDatagramaServidor(puertoServidor);
            jt.setText("Servidor ECHO listo");
            System.out.println("Servidor ECHO listo \n");
            // while (true) {

            peticion = miSocket.recibeMensajeYEmisor();
            jt.setText("Peticion recibida");
            System.out.println("Peticion recibida \n");
            
            String mensaje = peticion.obtieneMensaje();

            jt.setText("Mensaje recibido :" + mensaje+ "\n");
            System.out.println("Mensaje recibido :" + mensaje);

            miSocket.enviaMensaje(peticion.obtieneDireccion(), peticion.obtienePuerto(), mensaje);

            //}
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public String getConexion() {
        return Conexion;
    }

    public void setConexion(String Conexion) {
        this.Conexion = Conexion;
    }

    public static int getContador() {
        return contador;
    }

    public MiSocketDatagramaServidor getMiSocket() {
        return miSocket;
    }

    public void setMiSocket(MiSocketDatagramaServidor miSocket) {
        this.miSocket = miSocket;
    }

    public MensajeDatagrama getPeticion() {
        return peticion;
    }

    public void setPeticion(MensajeDatagrama peticion) {
        this.peticion = peticion;
    }

    public int getPuertoServidor() {
        return puertoServidor;
    }

    public void setPuertoServidor(int puertoServidor) {
        this.puertoServidor = puertoServidor;
    }
}
