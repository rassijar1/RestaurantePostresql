/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author JULIAN
 */
public class login_encarga extends javax.swing.JFrame {

    /**
     * Creates new form login_encarga
     */
    public login_encarga() {
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

        jLabel1 = new javax.swing.JLabel();
        lbl_id_enca = new javax.swing.JLabel();
        lbl_nombre_en = new javax.swing.JLabel();
        txt_nombre_encargado = new javax.swing.JTextField();
        boton_ingreso_encargado = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        btn_cerrrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txt_id_encargado = new javax.swing.JTextField();
        lb_region = new javax.swing.JLabel();
        txt_region = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setText("Encargado");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 87, -1));

        lbl_id_enca.setText("Digite la ID del encargado:");
        getContentPane().add(lbl_id_enca, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 43, -1, -1));

        lbl_nombre_en.setText("Digite el nombre:");
        getContentPane().add(lbl_nombre_en, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 69, -1, -1));
        getContentPane().add(txt_nombre_encargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 70, -1));

        boton_ingreso_encargado.setText("Ingresar");
        getContentPane().add(boton_ingreso_encargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/encargado.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btn_cerrrar.setText("Cerrar");
        getContentPane().add(btn_cerrrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 230));
        getContentPane().add(txt_id_encargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 70, -1));

        lb_region.setText("Digite la ID de la región:");
        getContentPane().add(lb_region, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        txt_region.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_regionActionPerformed(evt);
            }
        });
        getContentPane().add(txt_region, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 70, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_regionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_regionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_regionActionPerformed

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
            java.util.logging.Logger.getLogger(login_encarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_encarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_encarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_encarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_encarga().setVisible(true);
            }
        });
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JLabel getLb_region() {
        return lb_region;
    }

    public void setLb_region(JLabel lb_region) {
        this.lb_region = lb_region;
    }


    public JTextField getTxt_region() {
        return txt_region;
    }

    public void setTxt_region(JTextField txt_region) {
        this.txt_region = txt_region;
    }

    public JButton getBtn_cerrrar() {
        return btn_cerrrar;
    }

    public void setBtn_cerrrar(JButton btn_cerrrar) {
        this.btn_cerrrar = btn_cerrrar;
    }

    public JButton getBoton_ingreso_encargado() {
        return boton_ingreso_encargado;
    }

    public void setBoton_ingreso_encargado(JButton boton_ingreso_encargado) {
        this.boton_ingreso_encargado = boton_ingreso_encargado;
    }

    public JLabel getFondo() {
        return fondo;
    }

    public void setFondo(JLabel fondo) {
        this.fondo = fondo;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getLbl_id_enca() {
        return lbl_id_enca;
    }

    public void setLbl_id_enca(JLabel lbl_id_enca) {
        this.lbl_id_enca = lbl_id_enca;
    }

    public JLabel getLbl_nombre_en() {
        return lbl_nombre_en;
    }

    public void setLbl_nombre_en(JLabel lbl_nombre_en) {
        this.lbl_nombre_en = lbl_nombre_en;
    }

    public JTextField getTxt_id_encargado() {
        return txt_id_encargado;
    }

    public void setTxt_id_encargado(JTextField txt_id_encargado) {
        this.txt_id_encargado = txt_id_encargado;
    }

    public JTextField getTxt_nombre_encargado() {
        return txt_nombre_encargado;
    }

    public void setTxt_nombre_encargado(JTextField txt_nombre_encargado) {
        this.txt_nombre_encargado = txt_nombre_encargado;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_ingreso_encargado;
    private javax.swing.JButton btn_cerrrar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_region;
    private javax.swing.JLabel lbl_id_enca;
    private javax.swing.JLabel lbl_nombre_en;
    private javax.swing.JTextField txt_id_encargado;
    private javax.swing.JTextField txt_nombre_encargado;
    private javax.swing.JTextField txt_region;
    // End of variables declaration//GEN-END:variables
}