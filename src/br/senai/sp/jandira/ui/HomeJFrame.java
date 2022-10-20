/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 22282204
 */
public class HomeJFrame extends javax.swing.JFrame {
    
    private EspecialidadesPanel especialidadesPanel;
    private PlanoDeSaudePanel planosDeSaudePanel;
    private final int POS_X = 10;
    private final int POS_Y = 160;
    private final int LARGURA = 880;
    private final int ALTURA = 380;

    public HomeJFrame() {
        initComponents();
        initPanels();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTítulo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        buttonSair = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        buttonAgenda = new javax.swing.JButton();
        buttonPaciente = new javax.swing.JButton();
        buttonMedico = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        buttonPlanoDeSaude = new javax.swing.JButton();
        buttonHome = new javax.swing.JButton();
        panelPlanoDeFundo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema De Agendamento");
        setResizable(false);
        getContentPane().setLayout(null);

        panelTítulo.setBackground(new java.awt.Color(51, 51, 51));
        panelTítulo.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/timetable (2).png"))); // NOI18N
        jLabel2.setText("Agenda de Consultas");
        panelTítulo.add(jLabel2);
        jLabel2.setBounds(80, 10, 370, 70);

        getContentPane().add(panelTítulo);
        panelTítulo.setBounds(0, 0, 910, 90);

        buttonSair.setBackground(new java.awt.Color(255, 51, 51));
        buttonSair.setForeground(new java.awt.Color(255, 102, 102));
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/logout.png"))); // NOI18N
        buttonSair.setToolTipText("Sair Do Sistema");
        buttonSair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSair);
        buttonSair.setBounds(810, 100, 50, 50);

        panelHome.setBackground(new java.awt.Color(51, 51, 51));
        panelHome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelHome.setForeground(new java.awt.Color(51, 51, 51));
        panelHome.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 2));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("KIASCON");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 140, 40);

        panelHome.add(jPanel1);
        jPanel1.setBounds(350, 20, 170, 60);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Sistema De Agendamento de Consultas");
        panelHome.add(jLabel3);
        jLabel3.setBounds(330, 90, 220, 16);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SUPORTE TÉCNICO");
        panelHome.add(jLabel4);
        jLabel4.setBounds(40, 130, 130, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("E-mail: log4304.016@gmail.com");
        panelHome.add(jLabel5);
        jLabel5.setBounds(60, 160, 180, 16);

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelHome.add(jPanel2);
        jPanel2.setBounds(0, 112, 880, 2);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telefone: (11) 94542-6819");
        panelHome.add(jLabel6);
        jLabel6.setBounds(60, 180, 150, 16);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("www.kiascon.com.br");
        panelHome.add(jLabel7);
        jLabel7.setBounds(60, 200, 130, 16);

        getContentPane().add(panelHome);
        panelHome.setBounds(10, 160, 880, 380);

        buttonAgenda.setBackground(new java.awt.Color(153, 153, 153));
        buttonAgenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonAgenda.setForeground(new java.awt.Color(255, 204, 51));
        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agenda.png"))); // NOI18N
        buttonAgenda.setText("Agenda");
        buttonAgenda.setToolTipText("Novo Agendamento");
        buttonAgenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAgenda);
        buttonAgenda.setBounds(80, 100, 110, 42);

        buttonPaciente.setBackground(new java.awt.Color(153, 153, 153));
        buttonPaciente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonPaciente.setForeground(new java.awt.Color(255, 204, 51));
        buttonPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/paciente.png"))); // NOI18N
        buttonPaciente.setText("Paciente");
        buttonPaciente.setToolTipText("Cadastro De Paciente");
        buttonPaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPaciente);
        buttonPaciente.setBounds(200, 100, 120, 42);

        buttonMedico.setBackground(new java.awt.Color(153, 153, 153));
        buttonMedico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonMedico.setForeground(new java.awt.Color(255, 204, 51));
        buttonMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/medico.png"))); // NOI18N
        buttonMedico.setText("Médico");
        buttonMedico.setToolTipText("Cadastro De Médico");
        buttonMedico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(buttonMedico);
        buttonMedico.setBounds(330, 100, 120, 42);

        buttonEspecialidades.setBackground(new java.awt.Color(153, 153, 153));
        buttonEspecialidades.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonEspecialidades.setForeground(new java.awt.Color(255, 204, 51));
        buttonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/lista-de-desejos (1).png"))); // NOI18N
        buttonEspecialidades.setText("Especialidades");
        buttonEspecialidades.setToolTipText("Cadastro De Especialidade");
        buttonEspecialidades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidades);
        buttonEspecialidades.setBounds(460, 100, 150, 42);

        buttonPlanoDeSaude.setBackground(new java.awt.Color(153, 153, 153));
        buttonPlanoDeSaude.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonPlanoDeSaude.setForeground(new java.awt.Color(255, 204, 51));
        buttonPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/plano-de-saude (1).png"))); // NOI18N
        buttonPlanoDeSaude.setText("Plano De Saúde");
        buttonPlanoDeSaude.setToolTipText("Cadastro De Plano De Saúde");
        buttonPlanoDeSaude.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanoDeSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanoDeSaude);
        buttonPlanoDeSaude.setBounds(620, 100, 160, 42);

        buttonHome.setBackground(new java.awt.Color(153, 153, 153));
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/botao-home.png"))); // NOI18N
        buttonHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonHome.setPreferredSize(new java.awt.Dimension(50, 34));
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(20, 100, 40, 40);

        panelPlanoDeFundo.setBackground(new java.awt.Color(102, 102, 102));
        panelPlanoDeFundo.setRequestFocusEnabled(false);
        panelPlanoDeFundo.setLayout(null);
        getContentPane().add(panelPlanoDeFundo);
        panelPlanoDeFundo.setBounds(0, 0, 910, 550);

        setSize(new java.awt.Dimension(917, 588));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacienteActionPerformed

    }//GEN-LAST:event_buttonPacienteActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        JOptionPane.showConfirmDialog(this, "Fechando", "Kiascon", JOptionPane.OK_CANCEL_OPTION);
        
        dispose();
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanoDeSaudeActionPerformed

    }//GEN-LAST:event_buttonPlanoDeSaudeActionPerformed

    private void buttonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgendaActionPerformed

    }//GEN-LAST:event_buttonAgendaActionPerformed

    private void buttonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesActionPerformed
        buttonEspecialidades.setBackground(new Color(102,102,102));
        buttonHome.setBackground(new Color(153,153,153));
        panelHome.setVisible(false);
        especialidadesPanel.setVisible(true);

        
    }//GEN-LAST:event_buttonEspecialidadesActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        buttonEspecialidades.setBackground(new Color(153,153,153));
        buttonHome.setBackground(new Color(102,102,102));
        panelHome.setVisible(true);
        especialidadesPanel.setVisible(false);
    }//GEN-LAST:event_buttonHomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedico;
    private javax.swing.JButton buttonPaciente;
    private javax.swing.JButton buttonPlanoDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelPlanoDeFundo;
    private javax.swing.JPanel panelTítulo;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
        
        especialidadesPanel = new EspecialidadesPanel();
        especialidadesPanel.setBounds(POS_X, POS_Y, LARGURA, ALTURA);
        panelPlanoDeFundo.add(especialidadesPanel);
        
        planosDeSaudePanel = new PlanoDeSaudePanel();
        planosDeSaudePanel.setBounds(POS_X, POS_Y, LARGURA, ALTURA);
        panelPlanoDeFundo.add(planosDeSaudePanel);
        
    
    }

}
