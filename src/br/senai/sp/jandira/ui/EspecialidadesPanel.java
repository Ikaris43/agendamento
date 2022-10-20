package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class EspecialidadesPanel extends javax.swing.JPanel {

    private int linha;

    public EspecialidadesPanel() {
        initComponents();
        EspecialidadeDAO.criarListaDeEspecialidaddes();
        ajustarTabela();
        preencherTabela();
    }

    private int getLinha() {
        linha = tableEspecialidades.getSelectedRow();
        return linha;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelListaDeEspecialidades = new javax.swing.JPanel();
        scrollEspecialidades = new javax.swing.JScrollPane();
        tableEspecialidades = new javax.swing.JTable();
        buttonCriarEspecialidade = new javax.swing.JButton();
        buttonEditarEspecialidade = new javax.swing.JButton();
        buttonApagarEspecialidade = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(880, 380));
        setLayout(null);

        panelListaDeEspecialidades.setBackground(new java.awt.Color(51, 51, 51));
        panelListaDeEspecialidades.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista De Especialidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 204, 51))); // NOI18N
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
        tableEspecialidades.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scrollEspecialidades.setViewportView(tableEspecialidades);

        panelListaDeEspecialidades.add(scrollEspecialidades);
        scrollEspecialidades.setBounds(10, 20, 860, 260);

        buttonCriarEspecialidade.setBackground(new java.awt.Color(0, 204, 153));
        buttonCriarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/adicionar-botao.png"))); // NOI18N
        buttonCriarEspecialidade.setToolTipText("Criar Nova Especialidade");
        buttonCriarEspecialidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonCriarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCriarEspecialidadeActionPerformed(evt);
            }
        });
        panelListaDeEspecialidades.add(buttonCriarEspecialidade);
        buttonCriarEspecialidade.setBounds(800, 300, 50, 50);

        buttonEditarEspecialidade.setBackground(new java.awt.Color(255, 204, 51));
        buttonEditarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png"))); // NOI18N
        buttonEditarEspecialidade.setToolTipText("Editar Especialidade Selecionada");
        buttonEditarEspecialidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonEditarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarEspecialidadeActionPerformed(evt);
            }
        });
        panelListaDeEspecialidades.add(buttonEditarEspecialidade);
        buttonEditarEspecialidade.setBounds(720, 300, 50, 50);

        buttonApagarEspecialidade.setBackground(new java.awt.Color(255, 51, 0));
        buttonApagarEspecialidade.setForeground(new java.awt.Color(204, 0, 0));
        buttonApagarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/backspace.png"))); // NOI18N
        buttonApagarEspecialidade.setToolTipText("Apagar Especialidade Selecionada");
        buttonApagarEspecialidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonApagarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonApagarEspecialidadeActionPerformed(evt);
            }
        });
        panelListaDeEspecialidades.add(buttonApagarEspecialidade);
        buttonApagarEspecialidade.setBounds(640, 300, 50, 50);

        add(panelListaDeEspecialidades);
        panelListaDeEspecialidades.setBounds(0, 0, 880, 380);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCriarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCriarEspecialidadeActionPerformed
        EspecialidadeDialog especialidadeDialog
                = new EspecialidadeDialog(
                        null,
                        true,
                        OperacaoEnum.ADICIONAR);
        especialidadeDialog.setVisible(true);

        preencherTabela();
    }//GEN-LAST:event_buttonCriarEspecialidadeActionPerformed

    private void buttonApagarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonApagarEspecialidadeActionPerformed

        if (getLinha() != -1) {
            excluirEspecialidade();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Selecione uma linha de especialidade!",
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buttonApagarEspecialidadeActionPerformed

    private void buttonEditarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarEspecialidadeActionPerformed

        if (getLinha() != -1) {
            editarEspecialidade();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Selecione uma linha",
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buttonEditarEspecialidadeActionPerformed

    private void editarEspecialidade() {

        Especialidade especialidade
                = EspecialidadeDAO.
                        getEspecialidade(
                                getCodigo());

        EspecialidadeDialog especialidadeDialog
                = new EspecialidadeDialog(
                        null,
                        true,
                        especialidade,
                        OperacaoEnum.EDITAR);
        especialidadeDialog.setVisible(true);
        preencherTabela();
    }

    private Integer getCodigo() {
        String codigoStr = tableEspecialidades.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }

    private void excluirEspecialidade() {

        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Você confirma a exclusão? ",
                "Atenção",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            EspecialidadeDAO.excluir(getCodigo());

            preencherTabela();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonApagarEspecialidade;
    private javax.swing.JButton buttonCriarEspecialidade;
    private javax.swing.JButton buttonEditarEspecialidade;
    private javax.swing.JPanel panelListaDeEspecialidades;
    private javax.swing.JScrollPane scrollEspecialidades;
    private javax.swing.JTable tableEspecialidades;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {

        tableEspecialidades.setModel(EspecialidadeDAO.getEspecialidadesModel());
        ajustarTabela();

    }

    private void ajustarTabela() {
        //Impedir que o usuario movimente as colunas
        tableEspecialidades.getTableHeader().setReorderingAllowed(false);

        //Bloquear a edição das células da tabela
        tableEspecialidades.setDefaultEditor(Object.class, null);

        tableEspecialidades.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableEspecialidades.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableEspecialidades.getColumnModel().getColumn(1).setPreferredWidth(250);
        tableEspecialidades.getColumnModel().getColumn(2).setPreferredWidth(480);
    }

}
