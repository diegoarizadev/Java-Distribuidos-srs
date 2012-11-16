/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ServidorEcho.java
 *
 * Created on 11-sep-2012, 12:47:35
 */
package Vistas_Internas;

import Conexiones.ConexionServidorEcho;
import Clases.MensajeDatagrama;
import Clases.MiSocketDatagramaServidor;


/**
 * Powered by Ing. Diego Ariza
 * @Email : diego.ariza2@gmail.com
 * @author n0rf3n
 * @version 1.0
 */

public class ServidorEcho3 extends javax.swing.JInternalFrame {

    public MiSocketDatagramaServidor miSocket;
    public MensajeDatagrama peticion;
    static int contador = 0;
    public String Conexion = "Servidor Contador listo";
    public int pServidor;

    /** Creates new form ServidorEcho */
    public ServidorEcho3() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPuertoServidor = new javax.swing.JTextField();
        ButtonLanzarServidorEcho = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblEstadoServicio = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblPuertoServicio = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNotificacion = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Servidor ECHO");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("SERVIDOR CONCURRENTE");

        jLabel2.setText("Puerto : ");

        ButtonLanzarServidorEcho.setText("Iniciar Servicio");
        ButtonLanzarServidorEcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLanzarServidorEchoActionPerformed(evt);
            }
        });

        jLabel3.setText("Estado del servidor : ");

        lblEstadoServicio.setForeground(new java.awt.Color(0, 153, 0));

        jLabel4.setText("Puerto del servicio : ");

        lblPuertoServicio.setForeground(new java.awt.Color(153, 0, 0));

        txtNotificacion.setColumns(20);
        txtNotificacion.setRows(5);
        jScrollPane1.setViewportView(txtNotificacion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPuertoServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblEstadoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblPuertoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 296, Short.MAX_VALUE)
                                .addComponent(ButtonLanzarServidorEcho)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPuertoServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblEstadoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblPuertoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonLanzarServidorEcho)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void ButtonLanzarServidorEchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLanzarServidorEchoActionPerformed

    int puerto = Integer.parseInt(txtPuertoServidor.getText());
    ConexionServidorEcho con = new ConexionServidorEcho(puerto, txtNotificacion );
    lblEstadoServicio.setText(con.getConexion());
    lblPuertoServicio.setText(""+puerto);
    
    Thread hilo = new Thread(con);
    hilo.start();


}//GEN-LAST:event_ButtonLanzarServidorEchoActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLanzarServidorEcho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEstadoServicio;
    private javax.swing.JLabel lblPuertoServicio;
    private javax.swing.JTextArea txtNotificacion;
    private javax.swing.JTextField txtPuertoServidor;
    // End of variables declaration//GEN-END:variables
}
