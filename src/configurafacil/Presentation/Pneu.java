/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurafacil.Presentation;

/**
 *
 * @author utilizador
 */
public class Pneu extends javax.swing.JDialog {
    public static EscolherCarro c;
    private String pneu = "";
    /**
     * Creates new form Pneu
     */
    public Pneu(EscolherCarro parent, boolean modal) {
       this.c = parent;
       this.setModal(modal);
       initComponents();
       setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Pneu1 = new javax.swing.JRadioButton();
        Pneu2 = new javax.swing.JRadioButton();
        Pneu3 = new javax.swing.JRadioButton();
        Pneu4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonGroup1.add(Pneu1);
        Pneu1.setText("Bridgestone Turanza T005 205/55 R16 91V");
        Pneu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pneu1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Pneu2);
        Pneu2.setText("Continental ContiEcoContact 5 205/55 R16 91V");
        Pneu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pneu2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Pneu3);
        Pneu3.setText("Continental PremiumContact 6 205/55 R16 91H");
        Pneu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pneu3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Pneu4);
        Pneu4.setText("Firestone Roadhawk 205/55  R16 91H");
        Pneu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pneu4ActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Pneu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(38, 38, 38))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pneu4)
                            .addComponent(Pneu3)
                            .addComponent(Pneu2)
                            .addComponent(Pneu1))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Pneu1)
                .addGap(18, 18, 18)
                .addComponent(Pneu2)
                .addGap(18, 18, 18)
                .addComponent(Pneu3)
                .addGap(18, 18, 18)
                .addComponent(Pneu4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Pneu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pneu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pneu1ActionPerformed

    private void Pneu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pneu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pneu2ActionPerformed

    private void Pneu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pneu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pneu3ActionPerformed

    private void Pneu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pneu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pneu4ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if(Pneu1.isSelected()) this.pneu = "Bridgestone Turanza T005 205/55 R16 91V";
        if(Pneu2.isSelected()) this.pneu = "Continental ContiEcoContact 5 205/55 R16 91V";
        if(Pneu3.isSelected()) this.pneu = "Continental PremiumContact 6 205/55 R16 91H";
        if(Pneu4.isSelected()) this.pneu = "Firestone Roadhawk 205/55  R16 91H";
        if(this.pneu.equals("")){
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor escolha um pneu","Pneu não selecionado", 0);
        }
        else {
            c.encomenda.addToConfiguração(this.pneu);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Pneu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pneu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pneu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pneu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Pneu dialog = new Pneu(c, true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Pneu1;
    private javax.swing.JRadioButton Pneu2;
    private javax.swing.JRadioButton Pneu3;
    private javax.swing.JRadioButton Pneu4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
