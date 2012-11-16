/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import baseDatos.Conexion;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import rmi.InterfaceRmi;

/**
 * Powered by Ing. Diego Ariza
 * @Email : diego.ariza2@gmail.com
 * @author n0rf3n
 * @version 1.0
 * 
 * hector.soto@docentes.umd.edu.co
 */
public class Estudiante extends UnicastRemoteObject implements InterfaceRmi {
    
    
    public Conexion con;
    public String estadoConexion;
    

    public Estudiante () throws RemoteException{
        super();
        con = new Conexion();
        estadoConexion = con.infoConexion;
       
    }
    

    @Override
    public Object[][] NotasEstudiante(String cod) throws RemoteException {
        int registros = 0;

      try{
          
         Statement stm = con.getConnection().createStatement();
         PreparedStatement pstm = con.getConnection().prepareStatement("SELECT count(1) as cont" +
            " FROM asignatura a " +
            " inner join nota n on a.asi_codigo = n.asi_codigo" +
            " where n.est_codigo = ? ");

         pstm.setString(1, cod);
         ResultSet res = pstm.executeQuery();

         res.next();
         registros = res.getInt("cont");
         res.close();
      }catch(SQLException e){
         System.out.println(e);
      }
      
      Object [][] data = new Object[registros][5];
      try{
         Statement stm = con.getConnection().createStatement();
         PreparedStatement pstm = con.getConnection().prepareStatement("SELECT n.asi_codigo, " +
            " a.asi_nombre, " +
            " n.nota " +
            " FROM asignatura a " +
            " inner join nota n on a.asi_codigo = n.asi_codigo " +
            " where n.est_codigo = ? order by n.asi_codigo ");

         pstm.setString(1, cod);
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            String asiCodigo = res.getString("asi_codigo");
            String asiNombre = res.getString("asi_nombre");
            Double asiNota = res.getDouble("nota");

            data[i][0] = asiCodigo;
            data[i][1] = asiNombre;
            data[i][2] = asiNota;
            i++;
         }
         res.close();
      }catch(SQLException e){
         System.out.println(e);
      }
      return data;
    }
    
    

    @Override
    public Object[][] Estudiantes() throws RemoteException {
       
        int registros = 0;
      try{
         Statement stm = con.getConnection().createStatement();
         PreparedStatement pstm = con.getConnection().prepareStatement("SELECT count(1) as cont" +
            " FROM estudiante ");

         ResultSet res = pstm.executeQuery();
         res.next();
         registros = res.getInt("cont");
         res.close();
      }catch(SQLException e){
         System.out.println(e);
      }

      Object [][] data = new Object[registros][5];
      try{
         Statement stm = con.getConnection().createStatement();
         PreparedStatement pstm = con.getConnection().prepareStatement("SELECT est_codigo, " +
            " est_nombre " +
            " FROM estudiante " +
            " ORDER BY est_codigo ");


         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            String estCodigo = res.getString("est_codigo");
            String estNombre = res.getString("est_nombre");

            data[i][0] = estCodigo;
            data[i][1] = estNombre;
            i++;
         }
         res.close();
      }catch(SQLException e){
         System.out.println(e);
      }
      return data;
   
    }

    public String getEstadoConexion() {
        return estadoConexion;
    }

}
