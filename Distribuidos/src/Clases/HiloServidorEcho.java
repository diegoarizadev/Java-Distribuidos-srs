/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JTextArea;

/**
 * Powered by Ing. Diego Ariza
 * @Email : diego.ariza2@gmail.com
 * @author n0rf3n
 * @version 1.0
 */
public class HiloServidorEcho implements Runnable {

    static final String mensajeFin = ".";
    private JTextArea jt;
    MiSocketStream miSocketDatos;

   public HiloServidorEcho(MiSocketStream miSocketDatos, JTextArea jt) {
        this.miSocketDatos = miSocketDatos;
        this.jt = jt;

    }

    @Override
    public void run() {

        boolean hecho = false;
        String mensaje;

        try {
            while (!hecho) {
                mensaje = miSocketDatos.recibeMensaje();
                System.out.println("mensaje recibido: " + mensaje);
                jt.setText("mensaje recibido: " + mensaje);
                if ((mensaje.trim()).equals(mensajeFin)) {
                    jt.setText("Final de la sesión.");

                    miSocketDatos.close();
                    hecho = true;
                } else {


                    miSocketDatos.enviaMensaje(mensaje);


                }

            }
        } catch (Exception ex) {
            System.out.println("Excepción capturada en hilo: " + ex);
           jt.setText("Excepción capturada en hilo: " + ex);

        }
    }
}
