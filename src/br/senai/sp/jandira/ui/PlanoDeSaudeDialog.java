
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.awt.Color;
import java.time.LocalDate;
import javax.swing.JOptionPane;


public class PlanoDeSaudeDialog extends javax.swing.JDialog {

    private OperacaoEnum operacao;
    private PlanoDeSaude planosDeSaude;
    private Boolean check;
    PlanoDeSaude novoPlanoDeSaude = new PlanoDeSaude();
    private LocalDate vall = LocalDate.of(2022, 10, 20);
    
    public PlanoDeSaudeDialog(
            java.awt.Frame parent,
            boolean modal, OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
    }
    
    public PlanoDeSaudeDialog(
            java.awt.Frame parent, 
            boolean modal, PlanoDeSaude planosDeSaude, OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        
        
        this.planosDeSaude = planosDeSaude;
        this.operacao = operacao;
        preecherFormulario();
        preencherTitulo();
        
        
    }
    
    private void preecherFormulario() {
        
        textFieldCodigo.setText(planosDeSaude.getCodigo().toString());
        textFieldCategoria.setText(planosDeSaude.getCategoria());
        textFieldNumero.setText(planosDeSaude.getNumero());
        textFieldOperadora.setText(planosDeSaude.getOperadora());
        textFieldValidade.setText(planosDeSaude.getValidade().toString());
        
    }
    
    private void preencherTitulo () {
        labelTitulo.setText("Especialidades - " + operacao);
        
        if (operacao == OperacaoEnum.EDITAR) {
            labelTitulo.setIcon(
                    new javax.swing.ImageIcon(
                                    getClass()
                                            .getResource("/br/senai/sp/jandira/imagens/editar.png")));
            panelFundoDoIcone.setBackground(new Color (255,204,51));
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
        panelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelFundoDoIcone = new javax.swing.JPanel();
        panelDetalhesDoPlanoDeSaude = new javax.swing.JPanel();
        labelCodigoPlanoDeSaude = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        labelOperadoraPlanoDeSaude = new javax.swing.JLabel();
        textFieldOperadora = new javax.swing.JTextField();
        labelCategoriaPlanoDeSaude = new javax.swing.JLabel();
        textFieldCategoria = new javax.swing.JTextField();
        labelValidadePlanoDeSaude = new javax.swing.JLabel();
        textFieldValidade = new javax.swing.JTextField();
        labelNumeroPlanoDeSaude = new javax.swing.JLabel();
        textFieldNumero = new javax.swing.JTextField();
        buttonCancelarPlanoDeSaude = new javax.swing.JButton();
        buttonSalvarPlanoDeSaude = new javax.swing.JButton();
        panelLinhaDoTitulo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        panelPlanoDeFundo.setBackground(new java.awt.Color(102, 102, 102));
        panelPlanoDeFundo.setLayout(null);

        panelTitulo.setBackground(new java.awt.Color(51, 51, 51));
        panelTitulo.setMinimumSize(new java.awt.Dimension(830, 70));
        panelTitulo.setPreferredSize(new java.awt.Dimension(830, 70));
        panelTitulo.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 204, 0));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar-botao.png"))); // NOI18N
        labelTitulo.setText("  Especialidades - ADICIONAR");
        panelTitulo.add(labelTitulo);
        labelTitulo.setBounds(50, 20, 390, 32);

        panelFundoDoIcone.setBackground(new java.awt.Color(0, 204, 153));
        panelFundoDoIcone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelFundoDoIconeLayout = new javax.swing.GroupLayout(panelFundoDoIcone);
        panelFundoDoIcone.setLayout(panelFundoDoIconeLayout);
        panelFundoDoIconeLayout.setHorizontalGroup(
            panelFundoDoIconeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        panelFundoDoIconeLayout.setVerticalGroup(
            panelFundoDoIconeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        panelTitulo.add(panelFundoDoIcone);
        panelFundoDoIcone.setBounds(40, 10, 50, 50);

        panelPlanoDeFundo.add(panelTitulo);
        panelTitulo.setBounds(0, 0, 830, 70);

        panelDetalhesDoPlanoDeSaude.setBackground(new java.awt.Color(51, 51, 51));
        panelDetalhesDoPlanoDeSaude.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes Do Plano De Saude", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 204, 0))); // NOI18N
        panelDetalhesDoPlanoDeSaude.setLayout(null);

        labelCodigoPlanoDeSaude.setForeground(new java.awt.Color(255, 204, 0));
        labelCodigoPlanoDeSaude.setText("Código");
        panelDetalhesDoPlanoDeSaude.add(labelCodigoPlanoDeSaude);
        labelCodigoPlanoDeSaude.setBounds(40, 30, 50, 16);

        textFieldCodigo.setEditable(false);
        textFieldCodigo.setBackground(new java.awt.Color(204, 204, 204));
        textFieldCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelDetalhesDoPlanoDeSaude.add(textFieldCodigo);
        textFieldCodigo.setBounds(30, 50, 64, 18);

        labelOperadoraPlanoDeSaude.setForeground(new java.awt.Color(255, 204, 0));
        labelOperadoraPlanoDeSaude.setText("Operadora");
        panelDetalhesDoPlanoDeSaude.add(labelOperadoraPlanoDeSaude);
        labelOperadoraPlanoDeSaude.setBounds(30, 110, 70, 16);

        textFieldOperadora.setBackground(new java.awt.Color(102, 102, 102));
        textFieldOperadora.setForeground(new java.awt.Color(204, 204, 204));
        textFieldOperadora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textFieldOperadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldOperadoraActionPerformed(evt);
            }
        });
        panelDetalhesDoPlanoDeSaude.add(textFieldOperadora);
        textFieldOperadora.setBounds(30, 140, 260, 20);

        labelCategoriaPlanoDeSaude.setForeground(new java.awt.Color(255, 204, 0));
        labelCategoriaPlanoDeSaude.setText("Categoria");
        panelDetalhesDoPlanoDeSaude.add(labelCategoriaPlanoDeSaude);
        labelCategoriaPlanoDeSaude.setBounds(30, 190, 60, 16);

        textFieldCategoria.setBackground(new java.awt.Color(102, 102, 102));
        textFieldCategoria.setForeground(new java.awt.Color(204, 204, 204));
        textFieldCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelDetalhesDoPlanoDeSaude.add(textFieldCategoria);
        textFieldCategoria.setBounds(30, 230, 260, 20);

        labelValidadePlanoDeSaude.setForeground(new java.awt.Color(255, 204, 0));
        labelValidadePlanoDeSaude.setText("Validade");
        panelDetalhesDoPlanoDeSaude.add(labelValidadePlanoDeSaude);
        labelValidadePlanoDeSaude.setBounds(630, 30, 50, 16);

        textFieldValidade.setBackground(new java.awt.Color(102, 102, 102));
        textFieldValidade.setForeground(new java.awt.Color(204, 204, 204));
        textFieldValidade.setText("00/00/0000");
        textFieldValidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textFieldValidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldValidadeActionPerformed(evt);
            }
        });
        panelDetalhesDoPlanoDeSaude.add(textFieldValidade);
        textFieldValidade.setBounds(620, 50, 70, 20);

        labelNumeroPlanoDeSaude.setForeground(new java.awt.Color(255, 204, 0));
        labelNumeroPlanoDeSaude.setText("Número");
        panelDetalhesDoPlanoDeSaude.add(labelNumeroPlanoDeSaude);
        labelNumeroPlanoDeSaude.setBounds(340, 30, 50, 16);

        textFieldNumero.setBackground(new java.awt.Color(102, 102, 102));
        textFieldNumero.setForeground(new java.awt.Color(204, 204, 204));
        textFieldNumero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelDetalhesDoPlanoDeSaude.add(textFieldNumero);
        textFieldNumero.setBounds(330, 50, 64, 20);

        buttonCancelarPlanoDeSaude.setBackground(new java.awt.Color(255, 51, 51));
        buttonCancelarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/contrato.png"))); // NOI18N
        buttonCancelarPlanoDeSaude.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelDetalhesDoPlanoDeSaude.add(buttonCancelarPlanoDeSaude);
        buttonCancelarPlanoDeSaude.setBounds(620, 330, 50, 40);

        buttonSalvarPlanoDeSaude.setBackground(new java.awt.Color(0, 204, 204));
        buttonSalvarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/salve-.png"))); // NOI18N
        buttonSalvarPlanoDeSaude.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonSalvarPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarPlanoDeSaudeActionPerformed(evt);
            }
        });
        panelDetalhesDoPlanoDeSaude.add(buttonSalvarPlanoDeSaude);
        buttonSalvarPlanoDeSaude.setBounds(710, 330, 50, 40);

        panelPlanoDeFundo.add(panelDetalhesDoPlanoDeSaude);
        panelDetalhesDoPlanoDeSaude.setBounds(10, 110, 810, 400);

        panelLinhaDoTitulo.setBackground(new java.awt.Color(255, 204, 0));
        panelLinhaDoTitulo.setMinimumSize(new java.awt.Dimension(830, 5));
        panelLinhaDoTitulo.setPreferredSize(new java.awt.Dimension(830, 5));

        javax.swing.GroupLayout panelLinhaDoTituloLayout = new javax.swing.GroupLayout(panelLinhaDoTitulo);
        panelLinhaDoTitulo.setLayout(panelLinhaDoTituloLayout);
        panelLinhaDoTituloLayout.setHorizontalGroup(
            panelLinhaDoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        panelLinhaDoTituloLayout.setVerticalGroup(
            panelLinhaDoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelPlanoDeFundo.add(panelLinhaDoTitulo);
        panelLinhaDoTitulo.setBounds(0, 70, 830, 2);

        getContentPane().add(panelPlanoDeFundo);
        panelPlanoDeFundo.setBounds(0, 0, 830, 570);

        setSize(new java.awt.Dimension(844, 576));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldValidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldValidadeActionPerformed

    private void buttonSalvarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarPlanoDeSaudeActionPerformed
        if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
        }
       
        
    }//GEN-LAST:event_buttonSalvarPlanoDeSaudeActionPerformed

    private void textFieldOperadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldOperadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldOperadoraActionPerformed

    private void adicionar () {
        
        
        novoPlanoDeSaude.setOperadora(textFieldOperadora.getText());
        novoPlanoDeSaude.setCategoria(textFieldCategoria.getText());
        novoPlanoDeSaude.setNumero(textFieldNumero.getText());
        novoPlanoDeSaude.setValidade(vall);
        
         
        
        if (novoPlanoDeSaude.GetCheckFalso() == false) {
            
            
        }
        if (novoPlanoDeSaude.getCheckVerdadeiro() == true) {
             
             PlanoDeSaudeDAO.gravar(novoPlanoDeSaude);
        }
   
        dispose();
    }
    
  
  
   
        
  
  
  
  
  
    private void editar () {
        planosDeSaude.setOperadora(textFieldOperadora.getText());
        planosDeSaude.setCategoria(textFieldCategoria.getText());
        planosDeSaude.setNumero(textFieldNumero.getText());
        planosDeSaude.setValidade(LocalDate.EPOCH);
        PlanoDeSaudeDAO.atualizar(planosDeSaude);
        
        JOptionPane.showMessageDialog(null, "Especialidade Atualizada!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelarPlanoDeSaude;
    private javax.swing.JButton buttonSalvarPlanoDeSaude;
    private javax.swing.JLabel labelCategoriaPlanoDeSaude;
    private javax.swing.JLabel labelCodigoPlanoDeSaude;
    private javax.swing.JLabel labelNumeroPlanoDeSaude;
    private javax.swing.JLabel labelOperadoraPlanoDeSaude;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelValidadePlanoDeSaude;
    private javax.swing.JPanel panelDetalhesDoPlanoDeSaude;
    private javax.swing.JPanel panelFundoDoIcone;
    private javax.swing.JPanel panelLinhaDoTitulo;
    private javax.swing.JPanel panelPlanoDeFundo;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTextField textFieldCategoria;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldNumero;
    private javax.swing.JTextField textFieldOperadora;
    private javax.swing.JTextField textFieldValidade;
    // End of variables declaration//GEN-END:variables
}
