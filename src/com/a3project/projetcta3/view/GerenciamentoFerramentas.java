package com.a3project.projetcta3.view;

import com.a3project.projetcta3.model.Ferramentas;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import com.a3project.projetcta3.DAO.FerramentasDAO;
import com.a3project.projetcta3.model.Amigos;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class GerenciamentoFerramentas extends javax.swing.JFrame {

    private Ferramentas objferramenta; // cria o vínculo com o objferramenta

    public GerenciamentoFerramentas() {
        initComponents();
        this.objferramenta = new Ferramentas(); // carrega objferramenta de Ferramentas
        this.carregaTabela();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFerramentas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabelM = new javax.swing.JLabel();
        jLabelV = new javax.swing.JLabel();
        jLabelFerramenta = new javax.swing.JTextField();
        jLabelValor = new javax.swing.JTextField();
        jLabelMarca = new javax.swing.JTextField();
        jLabelF = new javax.swing.JLabel();
        jButtonAlterar = new javax.swing.JButton();
        jButtonApagar = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setTitle("Gerenciamento de Ferramentas");
        setAlwaysOnTop(true);

        jTableFerramentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Ferramenta", "Valor", "Marca"
            }
        ));
        jTableFerramentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFerramentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFerramentas);

        jLabel3.setFont(new java.awt.Font("Helvetica", 1, 20)); // NOI18N
        jLabel3.setText("Gerenciamento de Ferramentas");

        jLabelM.setText("Marca");

        jLabelV.setText("Valor");

        jLabelFerramenta.setToolTipText("");
        jLabelFerramenta.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jLabelFerramentaInputMethodTextChanged(evt);
            }
        });
        jLabelFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLabelFerramentaActionPerformed(evt);
            }
        });

        jLabelValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLabelValorActionPerformed(evt);
            }
        });

        jLabelMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLabelMarcaActionPerformed(evt);
            }
        });

        jLabelF.setText("Ferramenta");

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonApagar.setBackground(new java.awt.Color(255, 0, 0));
        jButtonApagar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonApagar.setText("Apagar");
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelF)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelV, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelM, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelValor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMarca, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelV)
                    .addComponent(jLabelValor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelM))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLabelFerramentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelFerramentaActionPerformed

    private void jLabelValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLabelValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelValorActionPerformed

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed
        try {
            // validando dados da interface gráfica.
            int id_ferramenta = 0;
            if (this.jTableFerramentas.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione uma Ferramenta para APAGAR");
            } else {
                id_ferramenta = Integer.parseInt(this.jTableFerramentas.getValueAt(this.jTableFerramentas.getSelectedRow(), 0).toString());
            }

            // retorna 0 -> primeiro botão | 1 -> segundo botão | 2 -> terceiro botão
            JDialog camada = new JDialog();
            camada.setAlwaysOnTop(true);
            int resposta_usuario = JOptionPane.showConfirmDialog(camada, "Tem certeza que deseja APAGAR esta Ferramenta ?");
            if (resposta_usuario == 0) {// clicou em SIM

                // envia os dados para a ferramenta processar
                if (this.objferramenta.DeleteFerramentaBD(id_ferramenta)) {

                    // limpa os campos
                    this.jLabelFerramenta.setText("");
                    this.jLabelValor.setText("");
                    this.jLabelMarca.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Ferramenta apagada com Sucesso!");

                }

            }

            System.out.println(this.objferramenta.getMinhaLista().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            // atualiza a tabela.
            carregaTabela();
        }


    }//GEN-LAST:event_jButtonApagarActionPerformed

    @SuppressWarnings("unchecked")
    public void carregaTabela() {

        DefaultTableModel modelo = (DefaultTableModel) this.jTableFerramentas.getModel();
        modelo.setNumRows(0);

        ArrayList<Ferramentas> minhalista = new ArrayList<>();
        minhalista = objferramenta.getMinhaLista();

        for (Ferramentas a : minhalista) {
            modelo.addRow(new Object[]{
                a.getId_Ferramenta(),
                a.getNome_Ferramenta(),
                a.getValor(),
                a.getMarca()

            });
        }
    }
    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed

        try {
            // recebendo e validando dados da interface gráfica.
            int id_ferramenta = 0;
            String nomeF = "";
            double valor = 0.0;
            String marca = "";

            if (this.jLabelFerramenta.getText().length() <= 3) {
                throw new Mensagens("O nome da ferramenta deve conter ao menos 3 caracteres.");
            } else {
                nomeF = this.jLabelFerramenta.getText();
            }

            if (this.jLabelValor.getText().length() <= 0) {
                throw new Mensagens("Valor deve ser maior que zero");
            } else {
                valor = Double.parseDouble(this.jLabelValor.getText());
            }

            marca = this.jLabelMarca.getText();

            if (this.jTableFerramentas.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione uma Ferramenta para Alterar");
            } else {
                id_ferramenta = Integer.parseInt(this.jTableFerramentas.getValueAt(this.jTableFerramentas.getSelectedRow(), 0).toString());
            }

            // envia os dados para o Aluno processar
            if (this.objferramenta.UpdateFerramentaBD(id_ferramenta, nomeF, valor, marca)) {

                // limpa os campos
                this.jLabelFerramenta.setText("");
                this.jLabelValor.setText("");
                this.jLabelMarca.setText("");

                JOptionPane.showMessageDialog(rootPane, "Ferramenta alterada com Sucesso!");

            }
            System.out.println(this.objferramenta.getMinhaLista().toString());
        } catch (Mensagens erro) {

        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um n�mero.");
        } finally {
            carregaTabela(); // atualiza a tabela.
        }


    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed

        setVisible(false);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jTableFerramentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFerramentasMouseClicked

        if (this.jTableFerramentas.getSelectedRow() != -1) {

            String nomeF = this.jTableFerramentas.getValueAt(this.jTableFerramentas.getSelectedRow(), 1).toString();
            String valor = this.jTableFerramentas.getValueAt(this.jTableFerramentas.getSelectedRow(), 2).toString();
            String marca = this.jTableFerramentas.getValueAt(this.jTableFerramentas.getSelectedRow(), 3).toString();

            this.jLabelFerramenta.setText(nomeF);
            this.jLabelValor.setText(valor);
            this.jLabelMarca.setText(marca);

        }


    }//GEN-LAST:event_jTableFerramentasMouseClicked

    private void jLabelMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLabelMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelMarcaActionPerformed

    private void jLabelFerramentaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jLabelFerramentaInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelFerramentaInputMethodTextChanged

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
            java.util.logging.Logger.getLogger(GerenciamentoFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciamentoFerramentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelF;
    private javax.swing.JTextField jLabelFerramenta;
    private javax.swing.JLabel jLabelM;
    private javax.swing.JTextField jLabelMarca;
    private javax.swing.JLabel jLabelV;
    private javax.swing.JTextField jLabelValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFerramentas;
    // End of variables declaration//GEN-END:variables
}
