
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;


public class MedicoDialog extends javax.swing.JDialog {

    private Medico medico;
    private OperacaoEnum operacao;
    Medico novoMedico = new Medico();
    
   
    public MedicoDialog(java.awt.Frame parent, boolean modal, OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPlanoDeFundoMedico = new javax.swing.JPanel();
        panelPlanoDeFundoTitulo = new javax.swing.JPanel();
        labelIconeETitulo = new javax.swing.JLabel();
        labelFundoIcone = new javax.swing.JPanel();
        panelDetalhesMedico = new javax.swing.JPanel();
        labelCodigoMedico = new javax.swing.JLabel();
        textFieldCodigoMedico = new javax.swing.JTextField();
        labelCrmDoMedico = new javax.swing.JLabel();
        textFieldCrmDoMedico = new javax.swing.JTextField();
        labelNomeMedico = new javax.swing.JLabel();
        textFieldNomeDoMedico = new javax.swing.JTextField();
        labelTelefoneDoMedico = new javax.swing.JLabel();
        textFieldTelefoneDoMedico = new javax.swing.JTextField();
        labelEmailDoMedico = new javax.swing.JLabel();
        textFieldEmailDoMedico = new javax.swing.JTextField();
        labelDataDeNascimentoDoMedico = new javax.swing.JLabel();
        textFieldDataDeNascimentoDoMedico = new javax.swing.JTextField();
        labelListaDeEspecialidades = new javax.swing.JLabel();
        scrollPaneListaDeEspecialidades = new javax.swing.JScrollPane();
        labelListaDeEspecialidadesDoMedico = new javax.swing.JLabel();
        scrollPaneEspecialidadesDoMédico = new javax.swing.JScrollPane();
        buttonAdicionarEspecialidadeAoMedico = new javax.swing.JButton();
        buttonRemoverEspecialidadeDoMedico = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 615));
        setPreferredSize(new java.awt.Dimension(828, 590));
        setResizable(false);
        getContentPane().setLayout(null);

        panelPlanoDeFundoMedico.setBackground(new java.awt.Color(102, 102, 102));
        panelPlanoDeFundoMedico.setMinimumSize(new java.awt.Dimension(828, 568));
        panelPlanoDeFundoMedico.setPreferredSize(new java.awt.Dimension(828, 568));
        panelPlanoDeFundoMedico.setLayout(null);

        panelPlanoDeFundoTitulo.setBackground(new java.awt.Color(51, 51, 51));
        panelPlanoDeFundoTitulo.setLayout(null);

        labelIconeETitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelIconeETitulo.setForeground(new java.awt.Color(255, 204, 0));
        labelIconeETitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar-botao.png"))); // NOI18N
        labelIconeETitulo.setText("  Medicos - ADICIONAR");
        panelPlanoDeFundoTitulo.add(labelIconeETitulo);
        labelIconeETitulo.setBounds(50, 20, 320, 30);

        labelFundoIcone.setBackground(new java.awt.Color(0, 204, 153));
        labelFundoIcone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout labelFundoIconeLayout = new javax.swing.GroupLayout(labelFundoIcone);
        labelFundoIcone.setLayout(labelFundoIconeLayout);
        labelFundoIconeLayout.setHorizontalGroup(
            labelFundoIconeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        labelFundoIconeLayout.setVerticalGroup(
            labelFundoIconeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        panelPlanoDeFundoTitulo.add(labelFundoIcone);
        labelFundoIcone.setBounds(40, 10, 50, 50);

        panelPlanoDeFundoMedico.add(panelPlanoDeFundoTitulo);
        panelPlanoDeFundoTitulo.setBounds(0, 0, 850, 70);

        panelDetalhesMedico.setBackground(new java.awt.Color(51, 51, 51));
        panelDetalhesMedico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes Do(a) Médico(a)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 204, 0))); // NOI18N
        panelDetalhesMedico.setLayout(null);

        labelCodigoMedico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCodigoMedico.setForeground(new java.awt.Color(255, 204, 0));
        labelCodigoMedico.setText("Código:");
        panelDetalhesMedico.add(labelCodigoMedico);
        labelCodigoMedico.setBounds(40, 40, 60, 20);

        textFieldCodigoMedico.setEditable(false);
        textFieldCodigoMedico.setBackground(new java.awt.Color(204, 204, 204));
        textFieldCodigoMedico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelDetalhesMedico.add(textFieldCodigoMedico);
        textFieldCodigoMedico.setBounds(40, 70, 90, 30);

        labelCrmDoMedico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCrmDoMedico.setForeground(new java.awt.Color(255, 204, 0));
        labelCrmDoMedico.setText("CRM:");
        panelDetalhesMedico.add(labelCrmDoMedico);
        labelCrmDoMedico.setBounds(150, 40, 50, 20);

        textFieldCrmDoMedico.setBackground(new java.awt.Color(102, 102, 102));
        textFieldCrmDoMedico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textFieldCrmDoMedico.setForeground(new java.awt.Color(204, 204, 204));
        textFieldCrmDoMedico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textFieldCrmDoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCrmDoMedicoActionPerformed(evt);
            }
        });
        panelDetalhesMedico.add(textFieldCrmDoMedico);
        textFieldCrmDoMedico.setBounds(150, 70, 80, 30);

        labelNomeMedico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNomeMedico.setForeground(new java.awt.Color(255, 204, 0));
        labelNomeMedico.setText("Nome Do(a) Médico(a):");
        panelDetalhesMedico.add(labelNomeMedico);
        labelNomeMedico.setBounds(260, 40, 170, 20);

        textFieldNomeDoMedico.setBackground(new java.awt.Color(102, 102, 102));
        textFieldNomeDoMedico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textFieldNomeDoMedico.setForeground(new java.awt.Color(204, 204, 204));
        textFieldNomeDoMedico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textFieldNomeDoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeDoMedicoActionPerformed(evt);
            }
        });
        panelDetalhesMedico.add(textFieldNomeDoMedico);
        textFieldNomeDoMedico.setBounds(260, 70, 530, 30);

        labelTelefoneDoMedico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTelefoneDoMedico.setForeground(new java.awt.Color(255, 204, 0));
        labelTelefoneDoMedico.setText("Telefone:");
        panelDetalhesMedico.add(labelTelefoneDoMedico);
        labelTelefoneDoMedico.setBounds(40, 120, 70, 20);

        textFieldTelefoneDoMedico.setBackground(new java.awt.Color(102, 102, 102));
        textFieldTelefoneDoMedico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textFieldTelefoneDoMedico.setForeground(new java.awt.Color(204, 204, 204));
        textFieldTelefoneDoMedico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textFieldTelefoneDoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTelefoneDoMedicoActionPerformed(evt);
            }
        });
        panelDetalhesMedico.add(textFieldTelefoneDoMedico);
        textFieldTelefoneDoMedico.setBounds(40, 150, 170, 30);

        labelEmailDoMedico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelEmailDoMedico.setForeground(new java.awt.Color(255, 204, 0));
        labelEmailDoMedico.setText("E-Mail:");
        panelDetalhesMedico.add(labelEmailDoMedico);
        labelEmailDoMedico.setBounds(250, 120, 70, 20);

        textFieldEmailDoMedico.setBackground(new java.awt.Color(102, 102, 102));
        textFieldEmailDoMedico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textFieldEmailDoMedico.setForeground(new java.awt.Color(204, 204, 204));
        textFieldEmailDoMedico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textFieldEmailDoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmailDoMedicoActionPerformed(evt);
            }
        });
        panelDetalhesMedico.add(textFieldEmailDoMedico);
        textFieldEmailDoMedico.setBounds(250, 150, 360, 30);

        labelDataDeNascimentoDoMedico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelDataDeNascimentoDoMedico.setForeground(new java.awt.Color(255, 204, 0));
        labelDataDeNascimentoDoMedico.setText("Data De Nascimento:");
        panelDetalhesMedico.add(labelDataDeNascimentoDoMedico);
        labelDataDeNascimentoDoMedico.setBounds(640, 120, 150, 20);

        textFieldDataDeNascimentoDoMedico.setBackground(new java.awt.Color(102, 102, 102));
        textFieldDataDeNascimentoDoMedico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textFieldDataDeNascimentoDoMedico.setForeground(new java.awt.Color(204, 204, 204));
        textFieldDataDeNascimentoDoMedico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textFieldDataDeNascimentoDoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDataDeNascimentoDoMedicoActionPerformed(evt);
            }
        });
        panelDetalhesMedico.add(textFieldDataDeNascimentoDoMedico);
        textFieldDataDeNascimentoDoMedico.setBounds(640, 150, 100, 30);

        labelListaDeEspecialidades.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelListaDeEspecialidades.setForeground(new java.awt.Color(255, 204, 0));
        labelListaDeEspecialidades.setText("Lista De Especialidades:");
        panelDetalhesMedico.add(labelListaDeEspecialidades);
        labelListaDeEspecialidades.setBounds(30, 210, 160, 20);

        scrollPaneListaDeEspecialidades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelDetalhesMedico.add(scrollPaneListaDeEspecialidades);
        scrollPaneListaDeEspecialidades.setBounds(30, 240, 200, 140);

        labelListaDeEspecialidadesDoMedico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelListaDeEspecialidadesDoMedico.setForeground(new java.awt.Color(255, 204, 0));
        labelListaDeEspecialidadesDoMedico.setText("Lista De Especialidades Do Médico:");
        panelDetalhesMedico.add(labelListaDeEspecialidadesDoMedico);
        labelListaDeEspecialidadesDoMedico.setBounds(330, 210, 250, 20);

        scrollPaneEspecialidadesDoMédico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelDetalhesMedico.add(scrollPaneEspecialidadesDoMédico);
        scrollPaneEspecialidadesDoMédico.setBounds(330, 240, 200, 140);

        buttonAdicionarEspecialidadeAoMedico.setBackground(new java.awt.Color(0, 204, 153));
        buttonAdicionarEspecialidadeAoMedico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonAdicionarEspecialidadeAoMedico.setForeground(new java.awt.Color(0, 0, 0));
        buttonAdicionarEspecialidadeAoMedico.setText("-> ");
        buttonAdicionarEspecialidadeAoMedico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonAdicionarEspecialidadeAoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarEspecialidadeAoMedicoActionPerformed(evt);
            }
        });
        panelDetalhesMedico.add(buttonAdicionarEspecialidadeAoMedico);
        buttonAdicionarEspecialidadeAoMedico.setBounds(250, 270, 60, 30);

        buttonRemoverEspecialidadeDoMedico.setBackground(new java.awt.Color(255, 51, 51));
        buttonRemoverEspecialidadeDoMedico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonRemoverEspecialidadeDoMedico.setForeground(new java.awt.Color(0, 0, 0));
        buttonRemoverEspecialidadeDoMedico.setText("<-");
        buttonRemoverEspecialidadeDoMedico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelDetalhesMedico.add(buttonRemoverEspecialidadeDoMedico);
        buttonRemoverEspecialidadeDoMedico.setBounds(250, 330, 60, 30);

        panelPlanoDeFundoMedico.add(panelDetalhesMedico);
        panelDetalhesMedico.setBounds(10, 110, 810, 400);

        buttonCancelar.setBackground(new java.awt.Color(51, 51, 51));
        buttonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonCancelar.setForeground(new java.awt.Color(255, 0, 51));
        buttonCancelar.setText("Cancelar");
        buttonCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        panelPlanoDeFundoMedico.add(buttonCancelar);
        buttonCancelar.setBounds(550, 530, 100, 30);

        buttonSalvar.setBackground(new java.awt.Color(51, 51, 51));
        buttonSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSalvar.setForeground(new java.awt.Color(0, 204, 204));
        buttonSalvar.setText("Salvar");
        buttonSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        panelPlanoDeFundoMedico.add(buttonSalvar);
        buttonSalvar.setBounds(700, 530, 100, 30);

        getContentPane().add(panelPlanoDeFundoMedico);
        panelPlanoDeFundoMedico.setBounds(0, 0, 850, 580);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldDataDeNascimentoDoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDataDeNascimentoDoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDataDeNascimentoDoMedicoActionPerformed

    private void textFieldEmailDoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEmailDoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEmailDoMedicoActionPerformed

    private void textFieldTelefoneDoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTelefoneDoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTelefoneDoMedicoActionPerformed

    private void textFieldCrmDoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCrmDoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCrmDoMedicoActionPerformed

    private void buttonAdicionarEspecialidadeAoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarEspecialidadeAoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAdicionarEspecialidadeAoMedicoActionPerformed

    private void textFieldNomeDoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeDoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeDoMedicoActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
       dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
         if (textFieldNomeDoMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O nome não pode estar vazia!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            textFieldNomeDoMedico.grabFocus();
        
        } else if (textFieldTelefoneDoMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O telefone não pode estar vazia!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            textFieldTelefoneDoMedico.grabFocus();
            
        } else if (textFieldEmailDoMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O Email não pode estar vazio!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            textFieldEmailDoMedico.grabFocus();
            
        } else if (textFieldCrmDoMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O Crm não pode estar vazia!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            textFieldCrmDoMedico.grabFocus();
            
        } else { 
            if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed
    
    }
   
   
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarEspecialidadeAoMedico;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonRemoverEspecialidadeDoMedico;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel labelCodigoMedico;
    private javax.swing.JLabel labelCrmDoMedico;
    private javax.swing.JLabel labelDataDeNascimentoDoMedico;
    private javax.swing.JLabel labelEmailDoMedico;
    private javax.swing.JPanel labelFundoIcone;
    private javax.swing.JLabel labelIconeETitulo;
    private javax.swing.JLabel labelListaDeEspecialidades;
    private javax.swing.JLabel labelListaDeEspecialidadesDoMedico;
    private javax.swing.JLabel labelNomeMedico;
    private javax.swing.JLabel labelTelefoneDoMedico;
    private javax.swing.JPanel panelDetalhesMedico;
    private javax.swing.JPanel panelPlanoDeFundoMedico;
    private javax.swing.JPanel panelPlanoDeFundoTitulo;
    private javax.swing.JScrollPane scrollPaneEspecialidadesDoMédico;
    private javax.swing.JScrollPane scrollPaneListaDeEspecialidades;
    private javax.swing.JTextField textFieldCodigoMedico;
    private javax.swing.JTextField textFieldCrmDoMedico;
    private javax.swing.JTextField textFieldDataDeNascimentoDoMedico;
    private javax.swing.JTextField textFieldEmailDoMedico;
    private javax.swing.JTextField textFieldNomeDoMedico;
    private javax.swing.JTextField textFieldTelefoneDoMedico;
    // End of variables declaration//GEN-END:variables

    private void preencherTitulo() {
        labelIconeETitulo.setText("Médicos - " + operacao);
        
        if (operacao == OperacaoEnum.EDITAR) {
            labelIconeETitulo.setIcon(
                    new javax.swing.ImageIcon(
                                    getClass()
                                            .getResource("/br/senai/sp/jandira/imagens/editar.png")));
        } else {
            labelIconeETitulo.setIcon(
                    new javax.swing.ImageIcon(
                            getClass()
                .getResource("/br/senai/sp/jandira/imagens/adicionar-botao.png")));
        }
        
        
    }

    private void adicionar() {
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        novoMedico.setNome(textFieldNomeDoMedico.getText());
        novoMedico.setTelefone(textFieldTelefoneDoMedico.getText());
        novoMedico.setEmail(textFieldEmailDoMedico.getText());
        novoMedico.setCrm(textFieldCrmDoMedico.getText());
        
        
        MedicoDAO.gravar(novoMedico);
        
        dispose();
        
    }

    private void editar() {
        
    }
}
