/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import proyecto.Mantenimiento.frmProducto;
import proyecto.Mantenimiento.frmEmpleados;
import proyecto.Mantenimiento.frmClientes;
import proyecto.Mantenimiento.frmFacturas;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import proyecto.Informes_y_usuarios.frmUsuarios;


public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();
         this.setLocationRelativeTo(null);
        
    }

//    public void Admin(){
//        mnuClientes.setEnabled(true);
//        mnuEmpleados.setEnabled(true);
//        mnuUsuario.setEnabled(true);
//        mnuFacturas.setEnabled(true);
//        mnuInventario.setEnabled(true);
//        mnuArticulos.setEnabled(true);
//        mnuReportes.setEnabled(true);
//        mnuAyuda.setEnabled(true);
//        mnuCerrar.setEnabled(true);
//    }
    public void Empleado(){
        mnuMantenimiento.setVisible(false);
        mnuUsuario.setVisible(false);
    }
    
    public void Admin(){
        
    }
    frmClientes abrir = new frmClientes();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        escritorio = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuMantenimiento = new javax.swing.JMenu();
        mnuClientes = new javax.swing.JMenu();
        mnuAgregarClientes = new javax.swing.JMenuItem();
        mnuEmpleados = new javax.swing.JMenu();
        mnuAgregarEmpleados = new javax.swing.JMenuItem();
        mnuFacturas = new javax.swing.JMenu();
        mnuAgregarFacturas = new javax.swing.JMenuItem();
        mnuArticulos = new javax.swing.JMenu();
        menuAgregarProductos = new javax.swing.JMenuItem();
        mnuConsultas = new javax.swing.JMenu();
        mnuConsultaClientes = new javax.swing.JMenuItem();
        mnuConsultaEmpleados = new javax.swing.JMenuItem();
        mnuConsultaFacturas = new javax.swing.JMenuItem();
        mnuConsultaInventario = new javax.swing.JMenuItem();
        mnuConsultarProductos = new javax.swing.JMenuItem();
        mnuReportes = new javax.swing.JMenu();
        mnuVerReportes = new javax.swing.JMenuItem();
        mnuUsuario = new javax.swing.JMenu();
        mnuAgregarUsuarios = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenu();
        mnuAgregarUsuarios1 = new javax.swing.JMenuItem();
        mnuCerrar = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 80)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("SISTEMA DE FACTURACION ZBILL'S");
        escritorio.add(jLabel4);
        jLabel4.setBounds(50, 10, 950, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MENU IMAGEN FACTURA.jpg"))); // NOI18N
        escritorio.add(jLabel1);
        jLabel1.setBounds(0, 0, 1300, 590);

        getContentPane().add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 630));

        jMenuBar1.setBackground(java.awt.SystemColor.activeCaption);
        jMenuBar1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 102)), null));
        jMenuBar1.setForeground(java.awt.SystemColor.activeCaption);

        mnuMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/nuevo personal.png"))); // NOI18N
        mnuMantenimiento.setText("Mantenimiento");

        mnuClientes.setBackground(new java.awt.Color(255, 255, 255));
        mnuClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mnuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cliente.png"))); // NOI18N
        mnuClientes.setText("Clientes ");

        mnuAgregarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/nuevo personal.png"))); // NOI18N
        mnuAgregarClientes.setText("Clientes");
        mnuAgregarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAgregarClientesActionPerformed(evt);
            }
        });
        mnuClientes.add(mnuAgregarClientes);

        mnuMantenimiento.add(mnuClientes);

        mnuEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        mnuEmpleados.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mnuEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/empleadoIcono.png"))); // NOI18N
        mnuEmpleados.setText("Empleados ");

        mnuAgregarEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/nuevo personal.png"))); // NOI18N
        mnuAgregarEmpleados.setText("Empleados");
        mnuAgregarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAgregarEmpleadosActionPerformed(evt);
            }
        });
        mnuEmpleados.add(mnuAgregarEmpleados);

        mnuMantenimiento.add(mnuEmpleados);

        mnuFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buscar factura.png"))); // NOI18N
        mnuFacturas.setText("Facturas");

        mnuAgregarFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fctra.png"))); // NOI18N
        mnuAgregarFacturas.setText("Facturas");
        mnuAgregarFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAgregarFacturasActionPerformed(evt);
            }
        });
        mnuFacturas.add(mnuAgregarFacturas);

        mnuMantenimiento.add(mnuFacturas);

        mnuArticulos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/articulo.png"))); // NOI18N
        mnuArticulos.setText("Productos");

        menuAgregarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/articulo+.png"))); // NOI18N
        menuAgregarProductos.setText("Productos");
        menuAgregarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgregarProductosActionPerformed(evt);
            }
        });
        mnuArticulos.add(menuAgregarProductos);

        mnuMantenimiento.add(mnuArticulos);

        jMenuBar1.add(mnuMantenimiento);

        mnuConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buscar factura.png"))); // NOI18N
        mnuConsultas.setText("Consulltas");

        mnuConsultaClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cliente.png"))); // NOI18N
        mnuConsultaClientes.setText("Clientes");
        mnuConsultaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultaClientesActionPerformed(evt);
            }
        });
        mnuConsultas.add(mnuConsultaClientes);

        mnuConsultaEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/empleadoIcono.png"))); // NOI18N
        mnuConsultaEmpleados.setText("Empleados");
        mnuConsultaEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultaEmpleadosActionPerformed(evt);
            }
        });
        mnuConsultas.add(mnuConsultaEmpleados);

        mnuConsultaFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fctra.png"))); // NOI18N
        mnuConsultaFacturas.setText("Detalle Facturas");
        mnuConsultaFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultaFacturasActionPerformed(evt);
            }
        });
        mnuConsultas.add(mnuConsultaFacturas);

        mnuConsultaInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/inventario1.png"))); // NOI18N
        mnuConsultaInventario.setText("Inventario");
        mnuConsultaInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultaInventarioActionPerformed(evt);
            }
        });
        mnuConsultas.add(mnuConsultaInventario);

        mnuConsultarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/articulo+.png"))); // NOI18N
        mnuConsultarProductos.setText("Productos");
        mnuConsultarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultarProductosActionPerformed(evt);
            }
        });
        mnuConsultas.add(mnuConsultarProductos);

        jMenuBar1.add(mnuConsultas);

        mnuReportes.setBackground(new java.awt.Color(255, 255, 255));
        mnuReportes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mnuReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/factura.png"))); // NOI18N
        mnuReportes.setText("Reportes");

        mnuVerReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buscar factura.png"))); // NOI18N
        mnuVerReportes.setText("Reportes");
        mnuVerReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVerReportesActionPerformed(evt);
            }
        });
        mnuReportes.add(mnuVerReportes);

        jMenuBar1.add(mnuReportes);

        mnuUsuario.setBackground(new java.awt.Color(255, 255, 255));
        mnuUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mnuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/usuarioIcono.png"))); // NOI18N
        mnuUsuario.setText("Configurar");

        mnuAgregarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/nuevo personal.png"))); // NOI18N
        mnuAgregarUsuarios.setText("Usuarios");
        mnuAgregarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAgregarUsuariosActionPerformed(evt);
            }
        });
        mnuUsuario.add(mnuAgregarUsuarios);

        jMenuBar1.add(mnuUsuario);

        mnuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/informacion.png"))); // NOI18N
        mnuAyuda.setText("Ayuda");

        mnuAgregarUsuarios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/informacion.png"))); // NOI18N
        mnuAgregarUsuarios1.setText("Ayuda");
        mnuAgregarUsuarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAgregarUsuarios1ActionPerformed(evt);
            }
        });
        mnuAyuda.add(mnuAgregarUsuarios1);

        jMenuBar1.add(mnuAyuda);

        mnuCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/anterior.png"))); // NOI18N
        mnuCerrar.setText("Cerrar Sesion ");
        jMenuBar1.add(mnuCerrar);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuAgregarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAgregarClientesActionPerformed
        frmClientes abrir=new frmClientes();
        this.escritorio.add(abrir);
        abrir.show(true);
    }//GEN-LAST:event_mnuAgregarClientesActionPerformed

    private void mnuAgregarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAgregarEmpleadosActionPerformed
        frmEmpleados abrir=new frmEmpleados();
        this.escritorio.add(abrir);
        abrir.show(true);
    }//GEN-LAST:event_mnuAgregarEmpleadosActionPerformed

    private void mnuVerReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVerReportesActionPerformed
        //frmServicios abrir=new frmServicios();
        this.escritorio.add(abrir);
        abrir.show(true);
    }//GEN-LAST:event_mnuVerReportesActionPerformed

    private void mnuAgregarFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAgregarFacturasActionPerformed
        frmFacturas abrir=new frmFacturas();
        this.escritorio.add(abrir);
        abrir.show(true);
    }//GEN-LAST:event_mnuAgregarFacturasActionPerformed

    private void menuAgregarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgregarProductosActionPerformed
        frmProducto abrir=new frmProducto();
        this.escritorio.add(abrir);
        abrir.show(true);
    }//GEN-LAST:event_menuAgregarProductosActionPerformed

    private void mnuConsultaInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultaInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuConsultaInventarioActionPerformed

    private void mnuConsultaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultaClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuConsultaClientesActionPerformed

    private void mnuConsultaEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultaEmpleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuConsultaEmpleadosActionPerformed

    private void mnuConsultarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultarProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuConsultarProductosActionPerformed

    private void mnuConsultaFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultaFacturasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuConsultaFacturasActionPerformed

    private void mnuAgregarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAgregarUsuariosActionPerformed
        // TODO add your handling code here:
        frmUsuarios abrir=new frmUsuarios();
        this.escritorio.add(abrir);
        abrir.show(true);
    }//GEN-LAST:event_mnuAgregarUsuariosActionPerformed

    private void mnuAgregarUsuarios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAgregarUsuarios1ActionPerformed
        // TODO add your handling code here:
        frmAyuda abrir=new frmAyuda();
        this.escritorio.add(abrir);
        abrir.show(true);
    }//GEN-LAST:event_mnuAgregarUsuarios1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JDesktopPane escritorio;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel4;
    javax.swing.JMenu jMenu1;
    javax.swing.JMenuBar jMenuBar1;
    javax.swing.JMenuItem menuAgregarProductos;
    javax.swing.JMenuItem mnuAgregarClientes;
    javax.swing.JMenuItem mnuAgregarEmpleados;
    javax.swing.JMenuItem mnuAgregarFacturas;
    javax.swing.JMenuItem mnuAgregarUsuarios;
    javax.swing.JMenuItem mnuAgregarUsuarios1;
    javax.swing.JMenu mnuArticulos;
    javax.swing.JMenu mnuAyuda;
    javax.swing.JMenu mnuCerrar;
    javax.swing.JMenu mnuClientes;
    javax.swing.JMenuItem mnuConsultaClientes;
    javax.swing.JMenuItem mnuConsultaEmpleados;
    javax.swing.JMenuItem mnuConsultaFacturas;
    javax.swing.JMenuItem mnuConsultaInventario;
    javax.swing.JMenuItem mnuConsultarProductos;
    javax.swing.JMenu mnuConsultas;
    javax.swing.JMenu mnuEmpleados;
    javax.swing.JMenu mnuFacturas;
    javax.swing.JMenu mnuMantenimiento;
    javax.swing.JMenu mnuReportes;
    javax.swing.JMenu mnuUsuario;
    javax.swing.JMenuItem mnuVerReportes;
    // End of variables declaration//GEN-END:variables
}
