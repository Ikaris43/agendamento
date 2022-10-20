
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;


public class PlanoDeSaudePanel extends javax.swing.JPanel {

    public PlanoDeSaudePanel() {
        initComponents();
        PlanoDeSaudeDAO.criarListaDePlanosDeSaude();
        preencherTabela();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPlanoDeFundoPlanos = new javax.swing.JPanel();
        scrollPlanosDeSaude = new javax.swing.JScrollPane();
        tablePlanosDeSaude = new javax.swing.JTable();
        buttonApagarPlanoDeSaude = new javax.swing.JButton();
        buttonEditarPlanoDeSaude = new javax.swing.JButton();
        buttonCriarPlanoDeSaude = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(880, 380));
        setLayout(null);

        panelPlanoDeFundoPlanos.setBackground(new java.awt.Color(51, 51, 51));
        panelPlanoDeFundoPlanos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Planos De Saude", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 204, 0))); // NOI18N
        panelPlanoDeFundoPlanos.setLayout(null);

        scrollPlanosDeSaude.setForeground(new java.awt.Color(51, 51, 51));

        tablePlanosDeSaude.setModel(new javax.swing.table.DefaultTableModel(
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
        tablePlanosDeSaude.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scrollPlanosDeSaude.setViewportView(tablePlanosDeSaude);

        panelPlanoDeFundoPlanos.add(scrollPlanosDeSaude);
        scrollPlanosDeSaude.setBounds(10, 20, 860, 260);

        buttonApagarPlanoDeSaude.setBackground(new java.awt.Color(255, 51, 0));
        buttonApagarPlanoDeSaude.setForeground(new java.awt.Color(204, 0, 0));
        buttonApagarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/backspace.png"))); // NOI18N
        buttonApagarPlanoDeSaude.setToolTipText("Apagar Especialidade Selecionada");
        buttonApagarPlanoDeSaude.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonApagarPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonApagarPlanoDeSaudeActionPerformed(evt);
            }
        });
        panelPlanoDeFundoPlanos.add(buttonApagarPlanoDeSaude);
        buttonApagarPlanoDeSaude.setBounds(640, 300, 50, 50);

        buttonEditarPlanoDeSaude.setBackground(new java.awt.Color(255, 204, 51));
        buttonEditarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png"))); // NOI18N
        buttonEditarPlanoDeSaude.setToolTipText("Editar Especialidade Selecionada");
        buttonEditarPlanoDeSaude.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonEditarPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarPlanoDeSaudeActionPerformed(evt);
            }
        });
        panelPlanoDeFundoPlanos.add(buttonEditarPlanoDeSaude);
        buttonEditarPlanoDeSaude.setBounds(720, 300, 50, 50);

        buttonCriarPlanoDeSaude.setBackground(new java.awt.Color(0, 204, 153));
        buttonCriarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar-botao.png"))); // NOI18N
        buttonCriarPlanoDeSaude.setToolTipText("Criar Nova Especialidade");
        buttonCriarPlanoDeSaude.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonCriarPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCriarPlanoDeSaudeActionPerformed(evt);
            }
        });
        panelPlanoDeFundoPlanos.add(buttonCriarPlanoDeSaude);
        buttonCriarPlanoDeSaude.setBounds(800, 300, 50, 50);

        add(panelPlanoDeFundoPlanos);
        panelPlanoDeFundoPlanos.setBounds(0, 0, 880, 380);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonApagarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonApagarPlanoDeSaudeActionPerformed

       
    }//GEN-LAST:event_buttonApagarPlanoDeSaudeActionPerformed

    private void buttonEditarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarPlanoDeSaudeActionPerformed

      
    }//GEN-LAST:event_buttonEditarPlanoDeSaudeActionPerformed

    private void buttonCriarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCriarPlanoDeSaudeActionPerformed
       
    }//GEN-LAST:event_buttonCriarPlanoDeSaudeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonApagarPlanoDeSaude;
    private javax.swing.JButton buttonCriarPlanoDeSaude;
    private javax.swing.JButton buttonEditarPlanoDeSaude;
    private javax.swing.JPanel panelPlanoDeFundoPlanos;
    private javax.swing.JScrollPane scrollPlanosDeSaude;
    private javax.swing.JTable tablePlanosDeSaude;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela () {
        tablePlanosDeSaude.setModel(PlanoDeSaudeDAO.getPlanosDeSaudeModel());
    }



}
