/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author JULIAN
 */
public class Login_clien extends javax.swing.JFrame {

    /**
     * Creates new form Login_clien
     */
    public Login_clien() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtidcl = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        btningresocl = new javax.swing.JButton();
        btnregistrocliente = new javax.swing.JButton();
        fondo_cliente = new javax.swing.JLabel();
        lbcli = new javax.swing.JLabel();
        lbidcl = new javax.swing.JLabel();
        lbnombrecl = new javax.swing.JLabel();
        btn_cerrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtidcl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidclActionPerformed(evt);
            }
        });
        getContentPane().add(txtidcl, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 192, 151, -1));

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 223, 151, -1));

        btningresocl.setText("Ingresar");
        getContentPane().add(btningresocl, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 254, -1, -1));

        btnregistrocliente.setText("¿No está registrado?, click aqui!");
        btnregistrocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistroclienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnregistrocliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 288, 366, -1));

        fondo_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cliente.png"))); // NOI18N
        getContentPane().add(fondo_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 59, -1, -1));

        lbcli.setForeground(new java.awt.Color(0, 0, 204));
        lbcli.setText("BIENBENIDO CLIENTE");
        getContentPane().add(lbcli, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 11, 150, 42));

        lbidcl.setText("Digite ID:");
        getContentPane().add(lbidcl, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 195, -1, -1));

        lbnombrecl.setText("Digite nombre:");
        getContentPane().add(lbnombrecl, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 226, -1, -1));

        btn_cerrar.setText("Cerrar");
        getContentPane().add(btn_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 11, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidclActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidclActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void btnregistroclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistroclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnregistroclienteActionPerformed

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
            java.util.logging.Logger.getLogger(Login_clien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_clien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_clien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_clien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_clien().setVisible(true);
            }
        });
    }

    public JButton getBtn_cerrar() {
        return btn_cerrar;
    }

    public void setBtn_cerrar(JButton btn_cerrar) {
        this.btn_cerrar = btn_cerrar;
    }

    public JButton getBtningresocl() {
        return btningresocl;
    }

    public void setBtningresocl(JButton btningresocl) {
        this.btningresocl = btningresocl;
    }

    public JButton getBtnregistrocliente() {
        return btnregistrocliente;
    }

    public void setBtnregistrocliente(JButton btnregistrocliente) {
        this.btnregistrocliente = btnregistrocliente;
    }

    public JLabel getFondo_cliente() {
        return fondo_cliente;
    }

    public void setFondo_cliente(JLabel fondo_cliente) {
        this.fondo_cliente = fondo_cliente;
    }

    public JLabel getLbcli() {
        return lbcli;
    }

    public void setLbcli(JLabel lbcli) {
        this.lbcli = lbcli;
    }

    public JLabel getLbidcl() {
        return lbidcl;
    }

    public void setLbidcl(JLabel lbidcl) {
        this.lbidcl = lbidcl;
    }

    public JLabel getLbnombrecl() {
        return lbnombrecl;
    }

    public void setLbnombrecl(JLabel lbnombrecl) {
        this.lbnombrecl = lbnombrecl;
    }

    public JTextField getTxtidcl() {
        return txtidcl;
    }

    public void setTxtidcl(JTextField txtidcl) {
        this.txtidcl = txtidcl;
    }

    public JTextField getTxtnombre() {
        return txtnombre;
    }

    public void setTxtnombre(JTextField txtnombre) {
        this.txtnombre = txtnombre;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btningresocl;
    private javax.swing.JButton btnregistrocliente;
    private javax.swing.JLabel fondo_cliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbcli;
    private javax.swing.JLabel lbidcl;
    private javax.swing.JLabel lbnombrecl;
    private javax.swing.JTextField txtidcl;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}