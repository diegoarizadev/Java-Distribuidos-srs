/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import Clases.Estudiante;
import java.net.InetAddress;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Powered by Ing. Diego Ariza
 * @Email : diego.ariza2@gmail.com
 * @author n0rf3n
 * @version 1.0
 */
public class Servidor {

    private String ipServidor;
    private Registry registro;
    private int puertoServidor;
    public String infoServidorRMI;
    public String infoconexionBD;
    private Estudiante estudent;

    public Servidor() {

        try {

            ipServidor = (InetAddress.getLocalHost()).toString();
            puertoServidor = 3232;
            infoServidorRMI = "Esta es la ip " + ipServidor + " Este es el puerto de conexion " + puertoServidor;
            registro = LocateRegistry.createRegistry(puertoServidor);
            estudent = new Estudiante();
            InterfaceRmi objeto = estudent;
            infoconexionBD = estudent.estadoConexion;
            registro.rebind("rmiServidor", objeto);


        } catch (Exception e) {
            System.out.println("Mensaje del servidor : " + e.getMessage());

        }

    }

    public String getIpServidor() {
        return ipServidor;
    }

    public void setIpServidor(String ipServidor) {
        this.ipServidor = ipServidor;
    }

    public int getPuertoServidor() {
        return puertoServidor;
    }

    public void setPuertoServidor(int puertoServidor) {
        this.puertoServidor = puertoServidor;
    }

    public String getInfoServidorRMI() {
        return infoServidorRMI;
    }

    public void setInfoServidorRMI(String infoServidorRMI) {
        this.infoServidorRMI = infoServidorRMI;
    }

    public String getInfoconexionBD() {
        return infoconexionBD;
    }

    public void setInfoconexionBD(String infoconexionBD) {
        this.infoconexionBD = infoconexionBD;
    }
    
    
}