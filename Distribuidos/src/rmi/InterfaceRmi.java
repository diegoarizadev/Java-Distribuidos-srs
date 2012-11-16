/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Powered by Ing. Diego Ariza
 * @Email : diego.ariza2@gmail.com
 * @author n0rf3n
 * @version 1.0
 */
public interface InterfaceRmi extends Remote{
    
    
    public Object[][] NotasEstudiante(String cod) throws RemoteException;
    public Object[][] Estudiantes() throws RemoteException;
    
    
    //implemente un sistema remoto rmi 
    //que permita a un estudiante consultar 
    //las nota del examen de la asignatura o las asignaturas.
    
    
}
