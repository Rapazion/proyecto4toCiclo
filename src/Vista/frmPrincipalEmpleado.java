/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Dimension;
import javax.swing.JInternalFrame;

/**
 *
 * @author CESAR
 */
public class frmPrincipalEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal2
     */
    public frmPrincipalEmpleado() {
        initComponents();
        
        this.setExtendedState(WIDTH);
        this.setExtendedState(frmPrincipalEmpleado.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jDesktopPanePrincipal = new javax.swing.JDesktopPane();
        jMenuBarMenu = new javax.swing.JMenuBar();
        jMenuMenu = new javax.swing.JMenu();
        jMenuItemAyuda = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuVenta = new javax.swing.JMenu();
        jMenuItemRegistrar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuMantenimiento = new javax.swing.JMenu();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItemProducto = new javax.swing.JMenuItem();
        jMenuReporte = new javax.swing.JMenu();
        jMenuItemReporteVenta = new javax.swing.JMenuItem();
        JMenuItemReporteFactura = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MenuProveedores = new javax.swing.JMenuItem();
        MenuAsistencia = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPanePrincipal.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDesktopPanePrincipalLayout = new javax.swing.GroupLayout(jDesktopPanePrincipal);
        jDesktopPanePrincipal.setLayout(jDesktopPanePrincipalLayout);
        jDesktopPanePrincipalLayout.setHorizontalGroup(
            jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 896, Short.MAX_VALUE)
        );
        jDesktopPanePrincipalLayout.setVerticalGroup(
            jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenuMenu.setBackground(new java.awt.Color(255, 255, 255));
        jMenuMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/3643769-building-home-house-main-menu-start_113416.png"))); // NOI18N
        jMenuMenu.setText("Menu");

        jMenuItemAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/preview_search_find_locate_1551.png"))); // NOI18N
        jMenuItemAyuda.setText("Ayuda");
        jMenuMenu.add(jMenuItemAyuda);

        jMenuItemSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/off_downnearexit_apagado_abajo_6017.png"))); // NOI18N
        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuMenu.add(jMenuItemSalir);

        jMenuBarMenu.add(jMenuMenu);

        jMenuVenta.setBackground(new java.awt.Color(255, 255, 255));
        jMenuVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buy_cart_icon_183797.png"))); // NOI18N
        jMenuVenta.setText("Venta");

        jMenuItemRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cash-register_icon-icons.com_56386.png"))); // NOI18N
        jMenuItemRegistrar.setText("Registrar Boleta");
        jMenuItemRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistrarActionPerformed(evt);
            }
        });
        jMenuVenta.add(jMenuItemRegistrar);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cash-register_icon-icons.com_60704.png"))); // NOI18N
        jMenuItem1.setText("Registrar Factura");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuVenta.add(jMenuItem1);

        jMenuBarMenu.add(jMenuVenta);

        jMenuMantenimiento.setBackground(new java.awt.Color(255, 255, 255));
        jMenuMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/website_maintenance_settings_window_icon_193867.png"))); // NOI18N
        jMenuMantenimiento.setText("Mantenimiento");

        jMenuItemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        jMenuItemCliente.setText("Cliente");
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        jMenuMantenimiento.add(jMenuItemCliente);

        jMenuItemProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/business_package_box_accept_productorpackagetoaccept_negocio_paquet_2334.png"))); // NOI18N
        jMenuItemProducto.setText("Producto");
        jMenuItemProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProductoActionPerformed(evt);
            }
        });
        jMenuMantenimiento.add(jMenuItemProducto);

        jMenuBarMenu.add(jMenuMantenimiento);

        jMenuReporte.setBackground(new java.awt.Color(255, 255, 255));
        jMenuReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/3709751-complaint-dissatisfaction-expression-feedback-report_108092.png"))); // NOI18N
        jMenuReporte.setText("Reporte");

        jMenuItemReporteVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/business_salesreport_salesreport_negocio_2353.png"))); // NOI18N
        jMenuItemReporteVenta.setText("ReporteVentasBoleta");
        jMenuItemReporteVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReporteVentaActionPerformed(evt);
            }
        });
        jMenuReporte.add(jMenuItemReporteVenta);

        JMenuItemReporteFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/business_salesreport_salesreport_negocio_2353.png"))); // NOI18N
        JMenuItemReporteFactura.setText("ReporteVentaFactura");
        JMenuItemReporteFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemReporteFacturaActionPerformed(evt);
            }
        });
        jMenuReporte.add(JMenuItemReporteFactura);

        jMenuBarMenu.add(jMenuReporte);

        jMenu3.setBackground(new java.awt.Color(255, 255, 255));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/admin_lock_padlock_icon_205893.png"))); // NOI18N
        jMenu3.setText("Administrador");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        MenuProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/3592854-add-user-business-man-employee-general-human-member-office_107767.png"))); // NOI18N
        MenuProveedores.setText("Proveedores");
        MenuProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProveedoresActionPerformed(evt);
            }
        });
        jMenu3.add(MenuProveedores);

        MenuAsistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bluecarddestinationuser_azul_tarjeta_dedestin_12437.png"))); // NOI18N
        MenuAsistencia.setText("Asistencia");
        MenuAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAsistenciaActionPerformed(evt);
            }
        });
        jMenu3.add(MenuAsistencia);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/business_salesreport_salesreport_negocio_2353.png"))); // NOI18N
        jMenuItem2.setText("Finanzas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBarMenu.add(jMenu3);

        setJMenuBar(jMenuBarMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanePrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanePrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistrarActionPerformed
        frmBoleta b = new frmBoleta();
        CentrarVentana(b);
    }//GEN-LAST:event_jMenuItemRegistrarActionPerformed

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        frmCliente c = new frmCliente();
        CentrarVentana(c);
    }//GEN-LAST:event_jMenuItemClienteActionPerformed

    private void jMenuItemProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProductoActionPerformed
        Productos p = new Productos();
        CentrarVentana(p);
    }//GEN-LAST:event_jMenuItemProductoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        frmFactura b = new frmFactura();
        CentrarVentana(b);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void MenuProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProveedoresActionPerformed
       frmProveedores p = new frmProveedores();
       CentrarVentana(p);
    }//GEN-LAST:event_MenuProveedoresActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
       
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void MenuAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAsistenciaActionPerformed
         frmAsistencia a = new frmAsistencia();
        CentrarVentana(a);
    }//GEN-LAST:event_MenuAsistenciaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        frmFinanzas f = new frmFinanzas();
        CentrarVentana(f);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItemReporteVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReporteVentaActionPerformed
        frmDetalledeBoleta f = new frmDetalledeBoleta();
        CentrarVentana(f);
    }//GEN-LAST:event_jMenuItemReporteVentaActionPerformed

    private void JMenuItemReporteFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemReporteFacturaActionPerformed
        frmDetalledeFactura a = new frmDetalledeFactura();
        CentrarVentana(a);
    }//GEN-LAST:event_JMenuItemReporteFacturaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipalEmpleado().setVisible(true);
            }
        });
    }
    
    void CentrarVentana(JInternalFrame form) {
        jDesktopPanePrincipal.add(form);
        Dimension dimensionPrincipal = jDesktopPanePrincipal.getSize();
        Dimension dimensionVentasForm = form.getSize();
        form.setLocation((dimensionPrincipal.width - dimensionVentasForm.width) / 2, (dimensionPrincipal.height - dimensionVentasForm.height) / 2);
        form.show();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMenuItemReporteFactura;
    private javax.swing.JMenuItem MenuAsistencia;
    private javax.swing.JMenuItem MenuProveedores;
    public static javax.swing.JDesktopPane jDesktopPanePrincipal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBarMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemAyuda;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemProducto;
    private javax.swing.JMenuItem jMenuItemRegistrar;
    private javax.swing.JMenuItem jMenuItemReporteVenta;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenu jMenuMantenimiento;
    private javax.swing.JMenu jMenuMenu;
    private javax.swing.JMenu jMenuReporte;
    private javax.swing.JMenu jMenuVenta;
    // End of variables declaration//GEN-END:variables
}