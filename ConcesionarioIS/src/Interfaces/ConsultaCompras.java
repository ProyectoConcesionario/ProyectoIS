/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ConsultasFacturas.java
 *
 * Created on 16-abr-2013, 7:44:21
 */
package Interfaces;

import Conexion.conectar;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.*;
import javax.swing.JOptionPane;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class ConsultaCompras extends javax.swing.JInternalFrame {

    /** Creates new form ConsultasFacturas */
    public ConsultaCompras() {
        initComponents();
        cargartodasfacturas();
        this.setLocation(25,15 );
        jDateChooser1.setEnabled(false);
       
    }
    void cargartodasfacturas()
    {
        DefaultTableModel tabla= new DefaultTableModel();
        String []titulos={"#FACTURA","ID RESPONSABLE","CED PROVEEDOR","FECHA","TOTAL",};
        tabla.setColumnIdentifiers(titulos);
        this.tbfacturas.setModel(tabla);
        String consulta= "SELECT * FROM COMPRAS";
        String []Datos= new String [5];
        try {
            Statement st = cn.createStatement();
            ResultSet rs= st.executeQuery(consulta);
            while(rs.next())
            {
                Datos[0]=rs.getString("ID_COMP");
                Datos[1]=rs.getString("CED_PRO_COMP");
                Datos[2]=rs.getString("CED_EJEC_COMP");
                Datos[3]=rs.getString("FEC_COM");
                Datos[4]=rs.getString("TOTAL_COMP");
              
                
                tabla.addRow(Datos);
            }
        } catch (SQLException ex) {
//            Logger.getLogger(ConsultasProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        mnver = new javax.swing.JMenuItem();
        mneliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        rdbnnumero = new javax.swing.JRadioButton();
        rdbbnfecha = new javax.swing.JRadioButton();
        rdbntodos = new javax.swing.JRadioButton();
        txtnumero = new javax.swing.JTextField();
        btnbuscador = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbfacturas = new javax.swing.JTable();

        mnver.setText("Ver Detalle");
        mnver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnverActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnver);

        mneliminar.setText("Eliminar");
        mneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mneliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mneliminar);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CONSULTA DE FACTURAS");

        buttonGroup1.add(rdbnnumero);
        rdbnnumero.setSelected(true);
        rdbnnumero.setText("Mostrar  por Nº:");
        rdbnnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbnnumeroActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbbnfecha);
        rdbbnfecha.setText("Mostrar por Fecha");
        rdbbnfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbbnfechaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbntodos);
        rdbntodos.setText("Mostrar todas:");
        rdbntodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbntodosActionPerformed(evt);
            }
        });

        btnbuscador.setText("BUSCAR");
        btnbuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdbnnumero)
                                .addGap(27, 27, 27)
                                .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdbbnfecha)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addComponent(btnbuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rdbntodos))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdbnnumero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rdbbnfecha)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdbntodos))
                    .addComponent(btnbuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        tbfacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbfacturas.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tbfacturas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 674, 308);
    }// </editor-fold>//GEN-END:initComponents

private void btnbuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscadorActionPerformed
// TODO add your handling code here:
    
      
    
    String num=txtnumero.getText();
    
    String consulta="";
    if(rdbnnumero.isSelected()==true)
    {
        consulta= "SELECT * FROM COMPRAS WHERE ID_COMP='"+num+"'";
    }
    if(rdbbnfecha.isSelected()==true)
    {
           Date fecha=jDateChooser1.getDate();
   SimpleDateFormat formatofecha= new SimpleDateFormat("YYYY/MM/dd");
String fec=""+formatofecha.format(fecha);
        consulta= "SELECT * FROM COMPRAS WHERE FEC_COM='"+fec+"'";
    }
    if(rdbntodos.isSelected()==true)
    {
        consulta= "SELECT * FROM COMPRAS ";
    }
        DefaultTableModel tabla= new DefaultTableModel();
        String []titulos={"NUMERO","PROVEEDOR","EJECUTIVO","FECHA","TOTAL"};
        tabla.setColumnIdentifiers(titulos);
        this.tbfacturas.setModel(tabla);
        
        String []Datos= new String [5];
        try {
            Statement st = cn.createStatement();
            ResultSet rs= st.executeQuery(consulta);
            while(rs.next())
            {
                Datos[0]=rs.getString("ID_COMP");
                Datos[1]=rs.getString("CED_PRO_COMP");
                Datos[2]=rs.getString("CED_EJEC_COMP");
                Datos[3]=rs.getString("FEC_COM");
                Datos[4]=rs.getString("TOTAL_COMP");
              
                
                tabla.addRow(Datos);
            }
        } catch (SQLException ex) {
//            Logger.getLogger(ConsultasProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
   
   
    
}//GEN-LAST:event_btnbuscadorActionPerformed

private void rdbnnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbnnumeroActionPerformed
// TODO add your handling code here:
    if(rdbnnumero.isSelected()==true)
    {
        txtnumero.setEnabled(true);
        txtnumero.requestFocus();
        jDateChooser1.setDate(null);
        jDateChooser1.setEnabled(false);
        
        
    }
}//GEN-LAST:event_rdbnnumeroActionPerformed

private void rdbbnfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbbnfechaActionPerformed
// TODO add your handling code here:
    if(rdbbnfecha.isSelected()==true)
    {
        jDateChooser1.setEnabled(true);
        txtnumero.setEnabled(false);
        txtnumero.setText("");
        
    }
}//GEN-LAST:event_rdbbnfechaActionPerformed

private void rdbntodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbntodosActionPerformed
// TODO add your handling code here:
    if(rdbntodos.isSelected()==true)
    {
        jDateChooser1.setEnabled(false);
        jDateChooser1.setDate(null);
        txtnumero.setText("");
        txtnumero.setEnabled(false);
        cargartodasfacturas();
    }
    
    
}//GEN-LAST:event_rdbntodosActionPerformed

private void mnverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnverActionPerformed
// TODO add your handling code here:
    int filasele= tbfacturas.getSelectedRow();
    if(filasele==-1)
    {
        JOptionPane.showMessageDialog(null, "No Seleciono ninguna fila");
    }
    else
    {
           DetalleFactura detalle = new DetalleFactura();
    ventanaadmin.jdpescritorio.add(detalle);
    detalle.toFront();
    detalle.setVisible(true);
        String numfac=tbfacturas.getValueAt(filasele, 0).toString();
        String cod=tbfacturas.getValueAt(filasele, 1).toString();
        String ruc=tbfacturas.getValueAt(filasele, 2).toString();
        String subtotal=tbfacturas.getValueAt(filasele, 3).toString();
        String igv=tbfacturas.getValueAt(filasele, 4).toString();
        String total=tbfacturas.getValueAt(filasele, 5).toString();
        String fecha=tbfacturas.getValueAt(filasele, 6).toString();
        DetalleFactura.txtfac.setText(numfac);
        DetalleFactura.txtcod.setText(cod);
        DetalleFactura.txtruc.setText(ruc);
        DetalleFactura.txtsub.setText(subtotal);
        DetalleFactura.txtigv.setText(igv);
        DetalleFactura.txttot.setText(total);
        DetalleFactura.txtfecha.setText(fecha);
        DefaultTableModel model = (DefaultTableModel) DetalleFactura.tbdetalle.getModel();
        String ver="SELECT * FROM COMPRAS_DETALLE WHERE ID_COMP_DC='"+numfac+"'";
        String []datos= new String[5]   ;
        try {
                Statement st = cn.createStatement();
                ResultSet rs= st.executeQuery(ver);
                while(rs.next())
                {
                    datos[0]=rs.getString("ID_VEH_DC");
                    datos[1]=rs.getString("CANTIDAD_C");
                    datos[2]=rs.getString("COSTO_U_VEH_C");
                    datos[3]=rs.getString("COSTO_TOTAL_C");
                   
                    model.addRow(datos);
                    
                }
                DetalleFactura.tbdetalle.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(ConsultaCompras.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        
        
        
  
    }
}//GEN-LAST:event_mnverActionPerformed

private void mneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mneliminarActionPerformed
// TODO add your handling code here:
//        int fila=tbfacturas.getSelectedRow();
//    if(fila>=0)
//    {
//        String cod=tbfacturas.getValueAt(fila, 0).toString();
//            try {
//                PreparedStatement pst = cn.prepareStatement("DELETE FROM COMPRA WHERE ID_COMP='"+cod+"'");
//                pst.executeUpdate();
//            } catch (SQLException ex) {
//                Logger.getLogger(ConsultasBoletas.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            cargartodasfacturas();
//        
//    }
//    else
//    {
//        JOptionPane.showMessageDialog(this, "Seleccione alguna fila");
//    }
}//GEN-LAST:event_mneliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscador;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mneliminar;
    private javax.swing.JMenuItem mnver;
    private javax.swing.JRadioButton rdbbnfecha;
    private javax.swing.JRadioButton rdbnnumero;
    private javax.swing.JRadioButton rdbntodos;
    public static javax.swing.JTable tbfacturas;
    private javax.swing.JTextField txtnumero;
    // End of variables declaration//GEN-END:variables
conectar cc= new conectar();
Connection cn= cc.conexion();

}
