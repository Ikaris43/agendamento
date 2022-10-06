/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.senai.sp.jandira.ui;

import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 22282204
 */
public class HomeJFrame extends javax.swing.JFrame {

    public HomeJFrame() {
        initComponents();
        preencherTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTítulo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        buttonAgenda = new javax.swing.JButton();
        buttonPaciente = new javax.swing.JButton();
        buttonMedico = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        buttonPlanoDeSaude = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        panelListaDeEspecialidades = new javax.swing.JPanel();
        scrollEspecialidades = new javax.swing.JScrollPane();
        tableEspecialidades = new javax.swing.JTable();
        buttonCriarEspecialidade = new javax.swing.JButton();
        buttonEditarEspecialidade = new javax.swing.JButton();
        buttonApagarEspecialidade = new javax.swing.JButton();
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
        buttonAgenda.setBounds(20, 100, 110, 42);

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
        buttonPaciente.setBounds(140, 100, 120, 42);

        buttonMedico.setBackground(new java.awt.Color(153, 153, 153));
        buttonMedico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonMedico.setForeground(new java.awt.Color(255, 204, 51));
        buttonMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/medico.png"))); // NOI18N
        buttonMedico.setText("Médico");
        buttonMedico.setToolTipText("Cadastro De Médico");
        buttonMedico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(buttonMedico);
        buttonMedico.setBounds(270, 100, 120, 42);

        buttonEspecialidades.setBackground(new java.awt.Color(153, 153, 153));
        buttonEspecialidades.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonEspecialidades.setForeground(new java.awt.Color(255, 204, 51));
        buttonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/lista-de-desejos (1).png"))); // NOI18N
        buttonEspecialidades.setText("Especialidades");
        buttonEspecialidades.setToolTipText("Cadastro De Especialidade");
        buttonEspecialidades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(buttonEspecialidades);
        buttonEspecialidades.setBounds(400, 100, 150, 42);

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
        buttonPlanoDeSaude.setBounds(560, 100, 160, 42);

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

        panelListaDeEspecialidades.setBackground(new java.awt.Color(51, 51, 51));
        panelListaDeEspecialidades.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Especialidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 0, 12), new java.awt.Color(255, 204, 51))); // NOI18N
        panelListaDeEspecialidades.setForeground(new java.awt.Color(51, 51, 51));
        panelListaDeEspecialidades.setLayout(null);

        scrollEspecialidades.setForeground(new java.awt.Color(51, 51, 51));

        tableEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollEspecialidades.setViewportView(tableEspecialidades);

        panelListaDeEspecialidades.add(scrollEspecialidades);
        scrollEspecialidades.setBounds(10, 20, 860, 260);

        buttonCriarEspecialidade.setBackground(new java.awt.Color(0, 204, 153));
        buttonCriarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar-botao.png"))); // NOI18N
        buttonCriarEspecialidade.setToolTipText("Criar Nova Especialidade");
        buttonCriarEspecialidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelListaDeEspecialidades.add(buttonCriarEspecialidade);
        buttonCriarEspecialidade.setBounds(800, 300, 50, 50);

        buttonEditarEspecialidade.setBackground(new java.awt.Color(255, 204, 51));
        buttonEditarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png"))); // NOI18N
        buttonEditarEspecialidade.setToolTipText("Editar Especialidade Selecionada");
        buttonEditarEspecialidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelListaDeEspecialidades.add(buttonEditarEspecialidade);
        buttonEditarEspecialidade.setBounds(720, 300, 50, 50);

        buttonApagarEspecialidade.setBackground(new java.awt.Color(255, 51, 0));
        buttonApagarEspecialidade.setForeground(new java.awt.Color(204, 0, 0));
        buttonApagarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/backspace.png"))); // NOI18N
        buttonApagarEspecialidade.setToolTipText("Apagar Especialidade Selecionada");
        buttonApagarEspecialidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelListaDeEspecialidades.add(buttonApagarEspecialidade);
        buttonApagarEspecialidade.setBounds(640, 300, 50, 50);

        getContentPane().add(panelListaDeEspecialidades);
        panelListaDeEspecialidades.setBounds(10, 160, 880, 380);

        panelPlanoDeFundo.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout panelPlanoDeFundoLayout = new javax.swing.GroupLayout(panelPlanoDeFundo);
        panelPlanoDeFundo.setLayout(panelPlanoDeFundoLayout);
        panelPlanoDeFundoLayout.setHorizontalGroup(
            panelPlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        panelPlanoDeFundoLayout.setVerticalGroup(
            panelPlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        getContentPane().add(panelPlanoDeFundo);
        panelPlanoDeFundo.setBounds(0, 0, 910, 550);

        setSize(new java.awt.Dimension(917, 588));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacienteActionPerformed

    }//GEN-LAST:event_buttonPacienteActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed

    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanoDeSaudeActionPerformed

    }//GEN-LAST:event_buttonPlanoDeSaudeActionPerformed

    private void buttonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgendaActionPerformed

    }//GEN-LAST:event_buttonAgendaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonApagarEspecialidade;
    private javax.swing.JButton buttonCriarEspecialidade;
    private javax.swing.JButton buttonEditarEspecialidade;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonMedico;
    private javax.swing.JButton buttonPaciente;
    private javax.swing.JButton buttonPlanoDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelListaDeEspecialidades;
    private javax.swing.JPanel panelPlanoDeFundo;
    private javax.swing.JPanel panelTítulo;
    private javax.swing.JScrollPane scrollEspecialidades;
    private javax.swing.JTable tableEspecialidades;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {
        String[][] dados = {
            {"100","Jandira","SP"},
            {"200","Itapevi","SP"},
            {"300","Osasco","SP"},
            {"400","Barueri","SP"},
            {"500","Fortaleza","SP"},
            {"500","Fortaleza","SP"},
            {"500","Fortaleza","SP"},
            {"500","Fortaleza","SP"},
            {"500","Fortaleza","SP"},
            {"500","Fortaleza","SP"},
            {"500","Fortaleza","SP"},
            {"500","Fortaleza","SP"},
            {"500","Fortaleza","SP"},
            {"500","Fortaleza","SP"},
            {"500","Fortaleza","SP"},
            {"500","Fortaleza","SP"},
            {"500","Fortaleza","SP"}
        };
        
        String[] titulos = {"CODIGO", "NOME DA CIDADE", "ESTADO"};
        
        DefaultTableModel modelo = new DefaultTableModel(dados, titulos);
        
        tableEspecialidades.setModel(modelo);
        
    }

}
