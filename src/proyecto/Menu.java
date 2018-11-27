/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();
         this.setLocationRelativeTo(null);
        
    }

    public void Admin(){
        mnuClientes.setEnabled(true);
        mnuEmpleados.setEnabled(true);
        mnuUsuario.setEnabled(true);
        mnuFacturas.setEnabled(true);
        mnuInventario.setEnabled(true);
        mnuArticulos.setEnabled(true);
        mnuServicios.setEnabled(true);
        mnuEmpresa.setEnabled(true);
        mnuSucursales.setEnabled(true);
    }
    public void Empleado(){
        mnuClientes.setEnabled(true);
        mnuEmpleados.setEnabled(false);
        mnuUsuario.setEnabled(false);
        mnuFacturas.setEnabled(true);
        mnuInventario.setEnabled(false);
        mnuArticulos.setEnabled(true);
        mnuServicios.setEnabled(true);
        mnuEmpresa.setEnabled(false);
        mnuSucursales.setEnabled(true);
    }
    frmClientes abrir = new frmClientes();
    public void Cliente(){
        mnuClientes.setEnabled(true);
        mnuEmpleados.setEnabled(false);
        mnuUsuario.setEnabled(false);
        mnuFacturas.setEnabled(false);
        mnuInventario.setEnabled(false);
        mnuArticulos.setEnabled(false);
        mnuServicios.setEnabled(false);
        mnuEmpresa.setEnabled(false);
        mnuSucursales.setEnabled(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        escritorio = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuSucursales1 = new javax.swing.JMenu();
        mnuClientes = new javax.swing.JMenu();
        mnuAgregarClientes = new javax.swing.JMenuItem();
        mnuEmpleados = new javax.swing.JMenu();
        mnuAgregarEmpleados = new javax.swing.JMenuItem();
        mnuFacturas = new javax.swing.JMenu();
        mnuAgregarFacturas = new javax.swing.JMenuItem();
        mnuInventario = new javax.swing.JMenu();
        mnuInventarizar = new javax.swing.JMenuItem();
        mnuArticulos = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuFacturas1 = new javax.swing.JMenu();
        mnuAgregarFacturas2 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnuAgregarFacturas3 = new javax.swing.JMenuItem();
        mnuAgregarFacturas4 = new javax.swing.JMenuItem();
        mnuInventarizar2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        mnuServicios = new javax.swing.JMenu();
        mnuAgregarServicios = new javax.swing.JMenuItem();
        mnuUsuario = new javax.swing.JMenu();
        mnuAgregarUsuarios = new javax.swing.JMenuItem();
        mnuEmpresa = new javax.swing.JMenu();
        mnuSucursales = new javax.swing.JMenu();

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

        mnuSucursales1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/nuevo personal.png"))); // NOI18N
        mnuSucursales1.setText("Mantenimiento");

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

        mnuSucursales1.add(mnuClientes);

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

        mnuSucursales1.add(mnuEmpleados);

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

        mnuSucursales1.add(mnuFacturas);

        mnuInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/inventario2.png"))); // NOI18N
        mnuInventario.setText("Inventario ");

        mnuInventarizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/inventario1.png"))); // NOI18N
        mnuInventarizar.setText("Inventario");
        mnuInventarizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInventarizarActionPerformed(evt);
            }
        });
        mnuInventario.add(mnuInventarizar);

        mnuSucursales1.add(mnuInventario);

        mnuArticulos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/articulo.png"))); // NOI18N
        mnuArticulos.setText("Productos");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/articulo+.png"))); // NOI18N
        jMenuItem1.setText("Productos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuArticulos.add(jMenuItem1);

        mnuSucursales1.add(mnuArticulos);

        jMenuBar1.add(mnuSucursales1);

        mnuFacturas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buscar factura.png"))); // NOI18N
        mnuFacturas1.setText("Consulltas");

        mnuAgregarFacturas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cliente.png"))); // NOI18N
        mnuAgregarFacturas2.setText("Clientes");
        mnuAgregarFacturas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAgregarFacturas2ActionPerformed(evt);
            }
        });
        mnuFacturas1.add(mnuAgregarFacturas2);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/empleadoIcono.png"))); // NOI18N
        jMenuItem2.setText("Empleados");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnuFacturas1.add(jMenuItem2);

        mnuAgregarFacturas3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fctra.png"))); // NOI18N
        mnuAgregarFacturas3.setText("Facturas");
        mnuAgregarFacturas3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAgregarFacturas3ActionPerformed(evt);
            }
        });
        mnuFacturas1.add(mnuAgregarFacturas3);

        mnuAgregarFacturas4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fctra.png"))); // NOI18N
        mnuAgregarFacturas4.setText("Detalle Facturas");
        mnuAgregarFacturas4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAgregarFacturas4ActionPerformed(evt);
            }
        });
        mnuFacturas1.add(mnuAgregarFacturas4);

        mnuInventarizar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/inventario1.png"))); // NOI18N
        mnuInventarizar2.setText("Inventario");
        mnuInventarizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInventarizar2ActionPerformed(evt);
            }
        });
        mnuFacturas1.add(mnuInventarizar2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/articulo+.png"))); // NOI18N
        jMenuItem3.setText("Productos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnuFacturas1.add(jMenuItem3);

        jMenuBar1.add(mnuFacturas1);

        mnuServicios.setBackground(new java.awt.Color(255, 255, 255));
        mnuServicios.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mnuServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/factura.png"))); // NOI18N
        mnuServicios.setText("Reportes");

        mnuAgregarServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buscar factura.png"))); // NOI18N
        mnuAgregarServicios.setText("Reportes");
        mnuAgregarServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAgregarServiciosActionPerformed(evt);
            }
        });
        mnuServicios.add(mnuAgregarServicios);

        jMenuBar1.add(mnuServicios);

        mnuUsuario.setBackground(new java.awt.Color(255, 255, 255));
        mnuUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mnuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/usuarioIcono.png"))); // NOI18N
        mnuUsuario.setText("Seguridad");

        mnuAgregarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/nuevo personal.png"))); // NOI18N
        mnuAgregarUsuarios.setText("Usuarios");
        mnuAgregarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAgregarUsuariosActionPerformed(evt);
            }
        });
        mnuUsuario.add(mnuAgregarUsuarios);

        jMenuBar1.add(mnuUsuario);

        mnuEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/informacion.png"))); // NOI18N
        mnuEmpresa.setText("Ayuda");
        jMenuBar1.add(mnuEmpresa);

        mnuSucursales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/anterior.png"))); // NOI18N
        mnuSucursales.setText("Cerrar Sesion ");
        jMenuBar1.add(mnuSucursales);

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

    private void mnuAgregarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAgregarUsuariosActionPerformed
        frmUsuarios abrir=new frmUsuarios();
        this.escritorio.add(abrir);
        abrir.show(true);
    }//GEN-LAST:event_mnuAgregarUsuariosActionPerformed

    private void mnuAgregarServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAgregarServiciosActionPerformed
        frmServicios abrir=new frmServicios();
        this.escritorio.add(abrir);
        abrir.show(true);
    }//GEN-LAST:event_mnuAgregarServiciosActionPerformed

    private void mnuInventarizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInventarizarActionPerformed
       frmInventario abrir=new frmInventario();
       this.escritorio.add(abrir);
       abrir.show(true);
    }//GEN-LAST:event_mnuInventarizarActionPerformed

    private void mnuAgregarFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAgregarFacturasActionPerformed
        frmFacturas abrir=new frmFacturas();
        this.escritorio.add(abrir);
        abrir.show(true);
    }//GEN-LAST:event_mnuAgregarFacturasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        frmProducto abrir=new frmProducto();
        this.escritorio.add(abrir);
        abrir.show(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnuInventarizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInventarizar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuInventarizar2ActionPerformed

    private void mnuAgregarFacturas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAgregarFacturas2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuAgregarFacturas2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void mnuAgregarFacturas3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAgregarFacturas3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuAgregarFacturas3ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void mnuAgregarFacturas4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAgregarFacturas4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuAgregarFacturas4ActionPerformed

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
    javax.swing.JMenuItem jMenuItem1;
    javax.swing.JMenuItem jMenuItem2;
    javax.swing.JMenuItem jMenuItem3;
    javax.swing.JMenuItem mnuAgregarClientes;
    javax.swing.JMenuItem mnuAgregarEmpleados;
    javax.swing.JMenuItem mnuAgregarFacturas;
    javax.swing.JMenuItem mnuAgregarFacturas2;
    javax.swing.JMenuItem mnuAgregarFacturas3;
    javax.swing.JMenuItem mnuAgregarFacturas4;
    javax.swing.JMenuItem mnuAgregarServicios;
    javax.swing.JMenuItem mnuAgregarUsuarios;
    javax.swing.JMenu mnuArticulos;
    javax.swing.JMenu mnuClientes;
    javax.swing.JMenu mnuEmpleados;
    javax.swing.JMenu mnuEmpresa;
    javax.swing.JMenu mnuFacturas;
    javax.swing.JMenu mnuFacturas1;
    javax.swing.JMenu mnuInventario;
    javax.swing.JMenuItem mnuInventarizar;
    javax.swing.JMenuItem mnuInventarizar2;
    javax.swing.JMenu mnuServicios;
    javax.swing.JMenu mnuSucursales;
    javax.swing.JMenu mnuSucursales1;
    javax.swing.JMenu mnuUsuario;
    // End of variables declaration//GEN-END:variables
}
