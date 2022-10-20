package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;


public class EspecialidadeDialog extends javax.swing.JDialog {

    private Especialidade especialidade;
    private OperacaoEnum operacao;
    
    public EspecialidadeDialog(
            java.awt.Frame parent, 
            boolean modal, OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
    }
    
    public EspecialidadeDialog(
            java.awt.Frame parent, 
            boolean modal, Especialidade especialidade, OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        
        this.especialidade = especialidade;
        this.operacao = operacao;
        
        preecherFormulario();
        preencherTitulo();
        
    }

    private void preecherFormulario() {
        
        labelTitulo.setBounds(57, 20, 390, 30);
        jPanel3.setBackground(new java.awt.Color(255, 204, 51));
        textFieldCodigo.setText(especialidade.getCodigo().toString());
        textFieldNomeDaEspecialidade.setText(especialidade.getNome());
        textFieldDescricaoDaEspecialidade.setText(especialidade.getDescricao());
        
    }
    
    private void preencherTitulo () {
        labelTitulo.setText("Especialidades - " + operacao);
        
        if (operacao == OperacaoEnum.EDITAR) {
            labelTitulo.setIcon(
                    new javax.swing.ImageIcon(
                                    getClass()
                                            .getResource("/br/senai/sp/jandira/imagens/editar.png")));
        } else {
            labelTitulo.setIcon(
                    new javax.swing.ImageIcon(
                            getClass()
                .getResource("/br/senai/sp/jandira/imagens/adicionar-botao.png")));
        }
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPlanoDeFundo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textFieldNomeDaEspecialidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textFieldDescricaoDaEspecialidade = new javax.swing.JTextField();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        panelPlanoDeFundo.setBackground(new java.awt.Color(102, 102, 102));
        panelPlanoDeFundo.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 204, 0));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar-botao.png"))); // NOI18N
        labelTitulo.setText("  Especialidades - ADICIONAR");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(50, 20, 390, 30);

        jPanel3.setBackground(new java.awt.Color(0, 204, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(40, 10, 50, 50);

        panelPlanoDeFundo.add(jPanel1);
        jPanel1.setBounds(0, 0, 830, 70);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes Da Especialidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 204, 0))); // NOI18N
        jPanel2.setLayout(null);

        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Código");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(44, 40, 39, 16);

        textFieldCodigo.setEditable(false);
        textFieldCodigo.setBackground(new java.awt.Color(204, 204, 204));
        textFieldCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldCodigo);
        textFieldCodigo.setBounds(40, 60, 100, 30);

        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Nome da Especialidade");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 140, 160, 16);

        textFieldNomeDaEspecialidade.setBackground(new java.awt.Color(102, 102, 102));
        textFieldNomeDaEspecialidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textFieldNomeDaEspecialidade.setForeground(new java.awt.Color(204, 204, 204));
        textFieldNomeDaEspecialidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textFieldNomeDaEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeDaEspecialidadeActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldNomeDaEspecialidade);
        textFieldNomeDaEspecialidade.setBounds(40, 160, 590, 30);

        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("Descrição da Especialidade");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(40, 230, 160, 16);

        textFieldDescricaoDaEspecialidade.setBackground(new java.awt.Color(102, 102, 102));
        textFieldDescricaoDaEspecialidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textFieldDescricaoDaEspecialidade.setForeground(new java.awt.Color(204, 204, 204));
        textFieldDescricaoDaEspecialidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(textFieldDescricaoDaEspecialidade);
        textFieldDescricaoDaEspecialidade.setBounds(40, 250, 590, 30);

        buttonSalvar.setBackground(new java.awt.Color(0, 204, 204));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/salve-.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar");
        buttonSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSalvar);
        buttonSalvar.setBounds(710, 330, 50, 40);

        buttonCancelar.setBackground(new java.awt.Color(255, 51, 51));
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/contrato.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar");
        buttonCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCancelar);
        buttonCancelar.setBounds(610, 330, 50, 40);

        panelPlanoDeFundo.add(jPanel2);
        jPanel2.setBounds(10, 110, 810, 400);

        getContentPane().add(panelPlanoDeFundo);
        panelPlanoDeFundo.setBounds(0, 0, 830, 570);

        setSize(new java.awt.Dimension(844, 576));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void textFieldNomeDaEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeDaEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeDaEspecialidadeActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        
        if (operacao == OperacaoEnum.ADICIONAR ) {
            adicionar();
        } else {
            editar();
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void adicionar () {
        //Criar objeto especialidade
        Especialidade novaEspecialidade = new Especialidade();
        novaEspecialidade.setNome(textFieldNomeDaEspecialidade.getText());
        novaEspecialidade.setDescricao(textFieldDescricaoDaEspecialidade.getText());
        
        //gravar o objeto com o DAO 
        EspecialidadeDAO.gravar(novaEspecialidade);
        JOptionPane.showMessageDialog(
                this, 
                "Especialidade gravada com sucesso", 
                "Especialidades", 
                JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }
    
    private void editar () {
        especialidade.setNome(textFieldNomeDaEspecialidade.getText());
        especialidade.setDescricao(textFieldDescricaoDaEspecialidade.getText());
        EspecialidadeDAO.atualizar(especialidade);
        
        JOptionPane.showMessageDialog(null, "Especialidade Atualizada!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }
    
    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCancelarActionPerformed

   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelPlanoDeFundo;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldDescricaoDaEspecialidade;
    private javax.swing.JTextField textFieldNomeDaEspecialidade;
    // End of variables declaration//GEN-END:variables
}
