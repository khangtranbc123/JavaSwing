/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.demoduan1.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author Admin
 */
public class TrangChuJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public TrangChuJFrame() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTime = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemHocVien = new javax.swing.JMenuItem();
        jMenuItemNguoiHoc = new javax.swing.JMenuItem();
        jMenuItemKhoaHoc = new javax.swing.JMenuItem();
        jMenuItemChuyenDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FPT POLYTECHNIC");

        txtTime.setText("jLabel1");

        jMenu1.setText("Hệ thống");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lý");

        jMenuItemHocVien.setText("Học viên");
        jMenuItemHocVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHocVienActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemHocVien);

        jMenuItemNguoiHoc.setText("Người học");
        jMenuItemNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNguoiHocActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemNguoiHoc);

        jMenuItemKhoaHoc.setText("Khóa học");
        jMenu2.add(jMenuItemKhoaHoc);

        jMenuItemChuyenDe.setText("Chuyên đề");
        jMenuItemChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemChuyenDeActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemChuyenDe);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(498, Short.MAX_VALUE)
                .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 299, Short.MAX_VALUE)
                .addComponent(txtTime))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemHocVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHocVienActionPerformed
        // TODO add your handling code here:
        this.open();
    }//GEN-LAST:event_jMenuItemHocVienActionPerformed

    private void jMenuItemNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNguoiHocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemNguoiHocActionPerformed

    private void jMenuItemChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemChuyenDeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemChuyenDeActionPerformed

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
            java.util.logging.Logger.getLogger(TrangChuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChuJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemChuyenDe;
    private javax.swing.JMenuItem jMenuItemHocVien;
    private javax.swing.JMenuItem jMenuItemKhoaHoc;
    private javax.swing.JMenuItem jMenuItemNguoiHoc;
    private javax.swing.JLabel txtTime;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setLocationRelativeTo(null);
        new LoadingJDialog(this, true).setVisible(true);
        new DangNhapJDialog(this, true).setVisible(true);
        new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date date = new Date();
                SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");
                String now = format.format(date);
                txtTime.setText(now);
            }
        }).start();
    }

    private void open() {
          new QLNguoiHocJDialog(this, true).setVisible(true);
    }
}
