/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configurafacil.Presentation;

import configurafacil.Business.Componente;
import configurafacil.Business.ConfiguraFacil;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mercy
 */
public class ConfiguracaoFinal extends javax.swing.JDialog {
    private ConfiguraFacil configura;
    DefaultTableModel model;
    private int row = 0;
    private Componente componente;
    private String nomeComponente;
    private EscolherCarro parent2;
    //Encomenda novo;
    /**
     * Creates new form ConfiguracaoFinal
     */
    public ConfiguracaoFinal(javax.swing.JDialog parent, javax.swing.JDialog parent2, boolean modal, ConfiguraFacil c) {
        super(parent, modal);
        initComponents();
        this.configura = c;
        this.parent2 = (EscolherCarro) parent2;
        System.out.println(this.parent2.encomenda);
        insereConfigTabela();
        
    }
    /*
    public Encomenda teste(){
        Encomenda e = new Encomenda(132,"Mercedes",0, new ArrayList<>());
        List<Componente> comps = new ArrayList<>();
        comps.add(new Componente("Motor A",2000,new ArrayList<>(),new ArrayList<>()));
        comps.add(new Componente("Jantes B",490,new ArrayList<>(),new ArrayList<>()));
        comps.add(new Componente("Rodas C",750,new ArrayList<>(),new ArrayList<>()));
        e.setConfig(comps);
        return e;
    }*/
    
    public void insereConfigTabela(){
        model =  (DefaultTableModel) jTable1.getModel();
        List<Componente> configFinal = this.parent2.encomenda.getConfig();
        //List<Componente> configFinal = novo.getConfig();
        Object rowData[] = new Object[configFinal.size()];
        for(Componente s : configFinal){
            rowData[0] = s.getNome();
            rowData[1] = s.getPreco();
            model.addRow(rowData);
            
        }
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Componente", "Preço"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Remover");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Fechar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Configuração Final");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(142, 142, 142)
                            .addComponent(jLabel1))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        model =  (DefaultTableModel) jTable1.getModel();
        this.parent2.encomenda.removeDaConfiguracao(componente);
        //this.novo.removeDaConfiguracao(componente);
        model.removeRow(row);
        /*
        List<Componente> configFinal = novo.getConfig();
        for(Componente s : configFinal)
            System.out.println(s.getNome());*/
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        row = jTable1.getSelectedRow();
        nomeComponente = (String)model.getValueAt(row, 0);
        List<Componente> config = this.parent2.encomenda.getConfig();
        //List<Componente> config = novo.getConfig();
        for(Componente c : config)
            if(c.getNome().equals(nomeComponente))
                componente = c;
    }//GEN-LAST:event_jTable1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
