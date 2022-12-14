/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author acer
 */
public class PilihGambarComboBox extends javax.swing.JFrame {

 

    /**
     * Creates new form PilihGambarButton
     */
    public PilihGambarComboBox() {
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

        pCardLayout = new javax.swing.JPanel();
        Glassfish = new javax.swing.JLabel();
        JavaEE = new javax.swing.JLabel();
        PostgreSQL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pilihan = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pCardLayout.setLayout(new java.awt.CardLayout());

        Glassfish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Glassfish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/glassfish.jpg"))); // NOI18N
        pCardLayout.add(Glassfish, "0");

        JavaEE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JavaEE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/javaee.jpg"))); // NOI18N
        pCardLayout.add(JavaEE, "1");

        PostgreSQL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PostgreSQL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/postgreSQL.jpg"))); // NOI18N
        pCardLayout.add(PostgreSQL, "2");

        jLabel1.setText("Pilih Gambar");

        pilihan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Glassfish", "JavaEE", "PostgreSQL" }));
        pilihan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pilihanItemStateChanged(evt);
            }
        });
        pilihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pCardLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pilihan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pilihan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pCardLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pilihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pilihanActionPerformed

    private void pilihanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pilihanItemStateChanged
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(pCardLayout.getLayout());
        cl.show(pCardLayout, String.valueOf(pilihan.getSelectedIndex()));
    }//GEN-LAST:event_pilihanItemStateChanged

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
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihGambarComboBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Glassfish;
    private javax.swing.JLabel JavaEE;
    private javax.swing.JLabel PostgreSQL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pCardLayout;
    private javax.swing.JComboBox<String> pilihan;
    // End of variables declaration//GEN-END:variables
}
