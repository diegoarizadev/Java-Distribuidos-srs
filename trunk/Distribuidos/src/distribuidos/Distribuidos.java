/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuidos;

import distribuidos.Vistas.Principal;

/**
 * Powered by Ing. Diego Ariza
 * @Email : diego.ariza2@gmail.com
 * @author n0rf3n
 * @version 1.0
 */
public class Distribuidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Principal dis = new Principal();
        dis.setSize(dis.getToolkit().getScreenSize().width, dis.getToolkit().getScreenSize().height);
        dis.setExtendedState(100);
        dis.setVisible(true);
        dis.setLocationRelativeTo(null);

    }
}
