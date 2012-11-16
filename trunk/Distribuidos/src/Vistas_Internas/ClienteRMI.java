/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas_Internas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * Powered by Ing. Diego Ariza
 * @Email : diego.ariza2@gmail.com
 * @author n0rf3n
 * @version 1.0
 */
public class ClienteRMI extends javax.swing.JInternalFrame {

    
    JFrame frame;
    JScrollPane jsEstudiantes, jsNotas;
    DefaultTableModel dtmEstudiantes, dtmNotas;
    JTable jtbEstudiantes, jtbNotas;
    JPanel pnlEstudiantes;
    JLabel lblCodigo, lblNombre;
    JTextField txtCodigo, txtNombre;
    Object[][] dtEstudiantes;
    Object[][] dtNotas;
    int fila = -1;
    
    
    
    //variables necesarias para la conexion con el Servidor
    private static Registry registro;
    private static String direccionServidor = "127.0.0.1";
    private static String puertoServidor = "3232";
    public rmi.InterfaceRmi objetoRemoto = null;
    
    
    public ClienteRMI() throws RemoteException{
        
       // initComponents();
        
        
         iniciarRMI();
        
        frame = new JFrame("Notas de estudiantes - RMI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        dtEstudiantes = objetoRemoto.Estudiantes();

        String[] columNames = {"Codigo", "Estudiante"};
        dtmEstudiantes = new DefaultTableModel(dtEstudiantes, columNames);

        String[] columNamesNotas = {"Codigo", "Asignatura", "Nota"};
        dtmNotas = new DefaultTableModel(dtNotas, columNamesNotas);

        jtbEstudiantes = new JTable(dtmEstudiantes);
        jtbEstudiantes.setPreferredScrollableViewportSize(new Dimension(500, 120));

        jtbNotas = new JTable(dtmNotas);
        jtbNotas.setPreferredScrollableViewportSize(new Dimension(500, 80));

        jsEstudiantes = new JScrollPane(jtbEstudiantes);
        jsNotas = new JScrollPane(jtbNotas);

        lblCodigo = new JLabel("Codigo");
        lblNombre = new JLabel("Nombre");

        txtCodigo = new JTextField(10);
        txtNombre = new JTextField(10);

        pnlEstudiantes = new JPanel(new GridLayout(2, 2));
        pnlEstudiantes.add(lblCodigo);
        pnlEstudiantes.add(txtCodigo);
        pnlEstudiantes.add(lblNombre);
        pnlEstudiantes.add(txtNombre);

        jtbEstudiantes.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                fila = jtbEstudiantes.rowAtPoint(e.getPoint());
                int columna = jtbEstudiantes.columnAtPoint(e.getPoint());
                if ((fila > -1) && (columna > -1)) {
                    try {
                        txtCodigo.setText(String.valueOf(jtbEstudiantes.getValueAt(fila, 0)));
                        txtNombre.setText(String.valueOf(jtbEstudiantes.getValueAt(fila, 1)));

                        dtNotas = objetoRemoto.NotasEstudiante(String.valueOf(jtbEstudiantes.getValueAt(fila, 0)));
                        int contRows = dtmNotas.getRowCount();
                        for (int i = 0; i < contRows; i++) {
                            dtmNotas.removeRow(0);
                        }
                        for (int i = 0; i < dtNotas.length; i++) {
                            Object[] newRow = {dtNotas[i][0], dtNotas[i][1], dtNotas[i][2]};
                            dtmNotas.addRow(newRow);
                        }
                    } catch (RemoteException ex) {
                        Logger.getLogger(ClienteRMI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });

        frame.getContentPane().add(jsEstudiantes, BorderLayout.NORTH);
        frame.getContentPane().add(pnlEstudiantes, BorderLayout.CENTER);
        frame.getContentPane().add(jsNotas, BorderLayout.SOUTH);

        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(frame.getParent());
        frame.setVisible(true);
        
        
        
    }
    
    
    
            private void iniciarRMI (){
        
        //iniciar la conexion con el servidor RMI
        try {
            registro = LocateRegistry.getRegistry(direccionServidor, (new Integer(puertoServidor)).intValue());
            objetoRemoto = (rmi.InterfaceRmi) (registro.lookup("rmiServidor"));

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cliente RMI");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
