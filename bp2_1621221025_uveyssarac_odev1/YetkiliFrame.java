/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_1621221025_uveyssarac_odev1;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Üveys SARAÇ
 */
public class YetkiliFrame extends javax.swing.JFrame {

    /**
     * Creates new form YetkiliFrame
     */
    public static ArrayList<Kullanici> Kullanıcılar = new ArrayList();
    DefaultTableModel dtm = new DefaultTableModel();
    Object row[] = new Object[4];

    public YetkiliFrame() {
        initComponents();
        dtm.setColumnIdentifiers(new String[]{"İSİM", "SOYİSİM", "T.C. NO", "SUÇLAR"});
        jTable1.setModel(dtm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        eklebtn = new javax.swing.JButton();
        txtadi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtsoyadi = new javax.swing.JTextField();
        txttcno = new javax.swing.JTextField();
        cbcinayet = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        cbhırsızlık = new javax.swing.JCheckBox();
        cbdolandırıcılık = new javax.swing.JCheckBox();
        cbyaralama = new javax.swing.JCheckBox();
        cbuyusturucu = new javax.swing.JCheckBox();
        cbsilah = new javax.swing.JCheckBox();
        cmbcinsiyet = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtsifre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        silbtn = new javax.swing.JButton();
        sucsil = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        sucekle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        eklebtn.setText("EKLE");
        eklebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eklebtnActionPerformed(evt);
            }
        });

        txtadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtadiActionPerformed(evt);
            }
        });

        jLabel1.setText("T.C. NO");

        jLabel2.setText("İSİM");

        jLabel3.setText("SOYİSİM");

        cbcinayet.setText("CİNAYET");

        jLabel4.setText("                           İŞLEDİĞİ SUÇ VEYA SUÇLAR");

        cbhırsızlık.setText("HIRSIZLIK");

        cbdolandırıcılık.setText("DOLANDIRICILIK");

        cbyaralama.setText("YARALAMA");

        cbuyusturucu.setText("UYUŞTURUCU TİCARETİ");

        cbsilah.setText("SİLAH TİCARETİ");

        cmbcinsiyet.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ERKEK", "KADIN" }));

        jLabel5.setText("CİNSİYET");

        jLabel6.setText("ŞİFRE");

        jButton1.setText("ÇIKIŞ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        silbtn.setText("SİL");
        silbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silbtnActionPerformed(evt);
            }
        });

        sucsil.setText("SUÇU SİL");
        sucsil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sucsilActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cinayet", "Yaralama", "Uyuşturucu Ticareti", "Hırsızlık", "Dolandırıcılık", "Silah Ticareti" }));

        sucekle.setText("SUÇU EKLE");
        sucekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sucekleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbcinsiyet, 0, 115, Short.MAX_VALUE)
                                .addComponent(txtsoyadi)
                                .addComponent(txtadi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                .addComponent(txttcno, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(txtsifre, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbcinayet, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cbuyusturucu)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbhırsızlık, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbyaralama, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbdolandırıcılık, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbsilah, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sucsil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(eklebtn, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(silbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sucekle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(jButton1))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbcinayet)
                                    .addComponent(cbyaralama))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbuyusturucu)
                                    .addComponent(cbhırsızlık))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbdolandırıcılık)
                                    .addComponent(cbsilah)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtadi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtsoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txttcno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtsifre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbcinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eklebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(silbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sucekle, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(sucsil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eklebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eklebtnActionPerformed
        // TODO add your handling code here:
        Kullanici k = new Kullanici();
        k.adi = txtadi.getText();
        k.soyadi = txtsoyadi.getText();
        k.tcno = txttcno.getText();

        if (k.tcno.length() == 11 ) {
            try {
                for (int i = 0; i < 11; i++) {
                    int ctrl = Integer.parseInt(k.tcno.substring(i, i + 1));
                }
                if (cbcinayet.isSelected()) {
                    k.suclar.add("Cinayet");
                }
                if (cbyaralama.isSelected()) {
                    k.suclar.add("Yaralama");
                }
                if (cbdolandırıcılık.isSelected()) {
                    k.suclar.add("Dolandırıcılık");
                }
                if (cbuyusturucu.isSelected()) {
                    k.suclar.add("Uyuşturu Ticareti");
                }
                if (cbsilah.isSelected()) {
                    k.suclar.add("Silah Ticareti");
                }
                if (cbhırsızlık.isSelected()) {
                    k.suclar.add("Hırsızlık");
                }
                k.cinsiyet = cmbcinsiyet.getSelectedItem().toString();
                Kullanıcılar.add(k);
                row[0] = k.adi;
                row[1] = k.soyadi;
                row[2] = k.tcno;
                row[3] = k.suclar;
                dtm.addRow(row);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "T.C. no sayılardan oluşabilir!", null, JOptionPane.PLAIN_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "T.C. no'yu eksik veya hatalı girdiniz!", null, JOptionPane.PLAIN_MESSAGE);
        }
        txtadi.setText(null);
        txtsoyadi.setText(null);
        txttcno.setText(null);
        txtsifre.setText(null);
    }//GEN-LAST:event_eklebtnActionPerformed

    private void txtadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtadiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtadiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        GirisFrame gf=new GirisFrame();
        gf.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void silbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silbtnActionPerformed
        // TODO add your handling code here:
        if(jTable1.getSelectedRow()>=0){
        Kullanıcılar.remove(jTable1.getSelectedRow());
        dtm.removeRow(jTable1.getSelectedRow());
        }
    }//GEN-LAST:event_silbtnActionPerformed

    private void sucsilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sucsilActionPerformed
        // TODO add your handling code here:
        if(jTable1.getSelectedRow()>=0){
            for (Kullanici k : Kullanıcılar) {
            String a=dtm.getValueAt(jTable1.getSelectedRow(), 2).toString();
            if(a.equals(k.tcno)){
                
               k.suclar.remove(jComboBox1.getSelectedItem());
            }
                jTable1.setValueAt(k.suclar,jTable1.getSelectedRow(), 3);
            }
            
        }
    }//GEN-LAST:event_sucsilActionPerformed

    private void sucekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sucekleActionPerformed
        // TODO add your handling code here:
       if(jTable1.getSelectedRow()>=0){
           for (Kullanici k : Kullanıcılar) {
               if(!(jComboBox1.getSelectedItem().equals(k.suclar))){
                   k.suclar.add("jComboBox1.getSelectedItem()");
               }
           }
       } 
            
              
    }//GEN-LAST:event_sucekleActionPerformed

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
            java.util.logging.Logger.getLogger(YetkiliFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YetkiliFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YetkiliFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YetkiliFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YetkiliFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbcinayet;
    private javax.swing.JCheckBox cbdolandırıcılık;
    private javax.swing.JCheckBox cbhırsızlık;
    private javax.swing.JCheckBox cbsilah;
    private javax.swing.JCheckBox cbuyusturucu;
    private javax.swing.JCheckBox cbyaralama;
    private javax.swing.JComboBox cmbcinsiyet;
    private javax.swing.JButton eklebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton silbtn;
    private javax.swing.JButton sucekle;
    private javax.swing.JButton sucsil;
    private javax.swing.JTextField txtadi;
    private javax.swing.JTextField txtsifre;
    private javax.swing.JTextField txtsoyadi;
    private javax.swing.JTextField txttcno;
    // End of variables declaration//GEN-END:variables
}
