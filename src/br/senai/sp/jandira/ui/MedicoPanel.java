
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JTable;

public class MedicoPanel extends javax.swing.JPanel {

  
    public MedicoPanel() {
        initComponents();
        MedicoDAO.criarListaDeMedicos();
        preencherTabelaMedico();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        planoDeFundoMedico = new javax.swing.JPanel();
        painelDeMedicosPanel = new javax.swing.JScrollPane();
        tabelaDeMedicosTable = new javax.swing.JTable();
        buttonApagarMedico = new javax.swing.JButton();
        buttonEditarMedico = new javax.swing.JButton();
        buttonAdicionarMedico = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(880, 380));
        setLayout(null);

        planoDeFundoMedico.setBackground(new java.awt.Color(51, 51, 51));
        planoDeFundoMedico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Médicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 204, 0))); // NOI18N
        planoDeFundoMedico.setForeground(new java.awt.Color(51, 51, 51));
        planoDeFundoMedico.setMinimumSize(new java.awt.Dimension(880, 380));
        planoDeFundoMedico.setLayout(null);

        tabelaDeMedicosTable.setModel(new javax.swing.table.DefaultTableModel(
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
        painelDeMedicosPanel.setViewportView(tabelaDeMedicosTable);

        planoDeFundoMedico.add(painelDeMedicosPanel);
        painelDeMedicosPanel.setBounds(10, 20, 860, 260);

        buttonApagarMedico.setBackground(new java.awt.Color(255, 51, 0));
        buttonApagarMedico.setForeground(new java.awt.Color(204, 0, 0));
        buttonApagarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/backspace.png"))); // NOI18N
        buttonApagarMedico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonApagarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonApagarMedicoActionPerformed(evt);
            }
        });
        planoDeFundoMedico.add(buttonApagarMedico);
        buttonApagarMedico.setBounds(640, 300, 50, 50);

        buttonEditarMedico.setBackground(new java.awt.Color(255, 204, 51));
        buttonEditarMedico.setForeground(new java.awt.Color(204, 0, 0));
        buttonEditarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png"))); // NOI18N
        buttonEditarMedico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonEditarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarMedicoActionPerformed(evt);
            }
        });
        planoDeFundoMedico.add(buttonEditarMedico);
        buttonEditarMedico.setBounds(720, 300, 50, 50);

        buttonAdicionarMedico.setBackground(new java.awt.Color(0, 204, 153));
        buttonAdicionarMedico.setForeground(new java.awt.Color(204, 0, 0));
        buttonAdicionarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar-botao.png"))); // NOI18N
        buttonAdicionarMedico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonAdicionarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarMedicoActionPerformed(evt);
            }
        });
        planoDeFundoMedico.add(buttonAdicionarMedico);
        buttonAdicionarMedico.setBounds(800, 300, 50, 50);

        add(planoDeFundoMedico);
        planoDeFundoMedico.setBounds(0, 0, 880, 380);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEditarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarMedicoActionPerformed
       
    }//GEN-LAST:event_buttonEditarMedicoActionPerformed

    private void buttonAdicionarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarMedicoActionPerformed
        MedicoDialog medicoDialog = new MedicoDialog(null, true, OperacaoEnum.ADICIONAR);
        medicoDialog.setVisible(true);
        preencherTabelaMedico();
        
    }//GEN-LAST:event_buttonAdicionarMedicoActionPerformed

    private void buttonApagarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonApagarMedicoActionPerformed
        
    }//GEN-LAST:event_buttonApagarMedicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarMedico;
    private javax.swing.JButton buttonApagarMedico;
    private javax.swing.JButton buttonEditarMedico;
    private javax.swing.JScrollPane painelDeMedicosPanel;
    private javax.swing.JPanel planoDeFundoMedico;
    private javax.swing.JTable tabelaDeMedicosTable;
    // End of variables declaration//GEN-END:variables

    private void ajustarTabelaMedico () {
        tabelaDeMedicosTable.getTableHeader().setReorderingAllowed(false);
        tabelaDeMedicosTable.setDefaultEditor(Object.class, null);
        
        tabelaDeMedicosTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabelaDeMedicosTable.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabelaDeMedicosTable.getColumnModel().getColumn(1).setPreferredWidth(250);
        tabelaDeMedicosTable.getColumnModel().getColumn(2).setPreferredWidth(400);
    }

    private void preencherTabelaMedico () {
       
        tabelaDeMedicosTable.setModel(MedicoDAO.getMedicoModel());
        ajustarTabelaMedico();
    }
}
