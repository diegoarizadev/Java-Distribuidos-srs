/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexiones;

import Clases.ClienteEchoAuxiliar1;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Powered by Ing. Diego Ariza
 * @Email : diego.ariza2@gmail.com
 * @author n0rf3n
 * @version 1.0
 */
public class ConexionClienteEcho implements Runnable {

    static final String mensajeFin = ".";
    public String servidor;
    public int puerto;
    public String mensaje;
    public JTextArea jf;
    public JTextField jt;

    public ConexionClienteEcho(String servidor, int puerto, JTextArea jf, JTextField jt) {
        this.servidor = servidor;
        this.puerto = puerto;
        this.jf = jf;
        this.jt = jt;
    }

    @Override
    public void run() {
        try {
            ClienteEchoAuxiliar1 auxiliar = new ClienteEchoAuxiliar1(servidor, String.valueOf(puerto));
            boolean hecho = false;
            String eco;
            while (!hecho) {

                mensaje = jt.getText();
               
                    eco = auxiliar.obtenerEco(mensaje);
                    System.out.println(eco);
                    jf.setText(eco);

               // }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
