/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;

/**
 * Powered by Ing. Diego Ariza
 * @Email : diego.ariza2@gmail.com
 * @author n0rf3n
 * @version 1.0
 */
public class MiSocketStream extends Socket {

    private Socket socket;
    private BufferedReader entrada;
    private PrintWriter salida;

    public MiSocketStream(String maquinaAceptadora,
            int puertoAceptador) throws SocketException, IOException {

        socket = new Socket(maquinaAceptadora, puertoAceptador);
        establecerFlujos();

    }

    public MiSocketStream(Socket socket) throws IOException {
        this.socket = socket;
        establecerFlujos();
    }

    private void establecerFlujos() throws IOException {

        InputStream flujoEntrada = socket.getInputStream();
        entrada = new BufferedReader(new InputStreamReader(flujoEntrada));
        OutputStream flujoSalida = socket.getOutputStream();
        salida = new PrintWriter(flujoSalida);
    }
    
    
    public void enviaMensaje(String mensaje) throws IOException{
        
        salida.print(mensaje);
        salida.flush();
    }
    
    
    public String recibeMensaje()throws IOException{
        
        String mensaje = entrada.readLine();
        return mensaje;
        
    }
}
