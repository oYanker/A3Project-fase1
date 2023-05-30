package com.a3project.projetcta3.view;

import com.a3project.projetcta3.model.Amigos;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class GerenciamentoAmigos extends javax.swing.JFrame {

    private Amigos objamigo; // cria o vínculo com o objferramenta

    public GerenciamentoAmigos() {
        initComponents();
        this.objamigo = new Amigos(); // carrega objamigos
        this.carregaTabelaAmigos();

        jTableAmigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAmigosMouseClicked(evt);
            }
        });
    }

    @SuppressWarnings("unchecked")
    public void carregaTabelaAmigos() {

        DefaultTableModel modelo = (DefaultTableModel) this.jTableAmigos.getModel();
        modelo.setNumRows(0);

        ArrayList<Amigos> minhalista = new ArrayList<>();
        minhalista = objamigo.getMinhaListaAmigos();

        for (Amigos a : minhalista) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getTelefone(),
                a.getEmail()

            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAmigos = new javax.swing.JTable();
        jButtonAlterar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JTextField();

        jButton1.setText("Cancelar");
        jButton1.setMinimumSize(new java.awt.Dimension(100, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 51, 0));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Apagar");
        jButton5.setMinimumSize(new java.awt.Dimension(100, 30));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica", 1, 20)); // NOI18N
        jLabel3.setText("Gerenciamento de Amigos");

        jLabel1.setText("Nome");

        jLabel2.setText("Telefone");

        jLabelTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLabelTelefoneActionPerformed(evt);
            }
        });

        jTableAmigos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Telefone", "E-mail"
            }
        ));
        jScrollPane1.setViewportView(jTableAmigos);

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setMinimumSize(new java.awt.Dimension(100, 30));
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jLabel4.setText("E-mail");

        jLabelEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLabelEmailActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelNome)
                            .addComponent(jLabelTelefone)
                            .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel3)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel3)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            // validando dados da interface gráfica.
            int id = 0;
            if (this.jTableAmigos.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um Amigo para APAGAR");
            } else {
                id = Integer.parseInt(this.jTableAmigos.getValueAt(this.jTableAmigos.getSelectedRow(), 0).toString());
            }

            // retorna 0 -> primeiro botão | 1 -> segundo botão | 2 -> terceiro botão
            JDialog camada1 = new JDialog();
            camada1.setAlwaysOnTop(true);
            int resposta_usuario1 = JOptionPane.showConfirmDialog(camada1, "Tem certeza que deseja APAGAR este Amigo ?");
            if (resposta_usuario1 == 0) {// clicou em SIM

                // envia os dados para o Amigo processar
                if (this.objamigo.DeleteAmigosBD(id)) {

                    // limpa os campos
                    this.jLabelNome.setText("");
                    this.jLabelTelefone.setText("");
                    this.jLabelEmail.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Amigo apagado com Sucesso!");

                }

            }

            System.out.println(this.objamigo.getMinhaListaAmigos().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            // atualiza a tabela.
            carregaTabelaAmigos();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabelTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLabelTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelTelefoneActionPerformed

    private void jTableAmigosMouseClicked(java.awt.event.MouseEvent evt) {

        if (this.jTableAmigos.getSelectedRow() != -1) {

            String nome = this.jTableAmigos.getValueAt(this.jTableAmigos.getSelectedRow(), 1).toString();
            String telefone = this.jTableAmigos.getValueAt(this.jTableAmigos.getSelectedRow(), 2).toString();
            String email = this.jTableAmigos.getValueAt(this.jTableAmigos.getSelectedRow(), 3).toString();

            this.jLabelNome.setText(nome);
            this.jLabelTelefone.setText(telefone);
            this.jLabelEmail.setText(email);

        }

    }
    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed

        try {
            // recebendo e validando dados da interface gráfica.
            int id = 0;
            String nome = "";
            int telefone = 0;
            String email = "";

            if (this.jLabelNome.getText().length() <= 3) {
                throw new Mensagens("O nome do Amigo deve conter ao menos 3 caracteres.");
            } else {
                nome = this.jLabelNome.getText();
            }

            if (this.jLabelTelefone.getText().length() <= 8) {
                throw new Mensagens("Telefone deve ser numero válido de 9 digitos");
            } else {
                telefone = Integer.parseInt(this.jLabelTelefone.getText());
            }

            email = this.jLabelEmail.getText();

            if (this.jTableAmigos.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um Amigo para Alterar");
            } else {
                id = Integer.parseInt(this.jTableAmigos.getValueAt(this.jTableAmigos.getSelectedRow(), 0).toString());
            }

            // envia os dados do Amigo para processar
            if (this.objamigo.UpdateAmigosBD(id, nome, telefone, email)) {

                // limpa os campos
                this.jLabelNome.setText("");
                this.jLabelTelefone.setText("");
                this.jLabelEmail.setText("");

                JOptionPane.showMessageDialog(rootPane, "Amigo Alterado com Sucesso!");

            }
            System.out.println(this.objamigo.getMinhaListaAmigos().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage()); // Exibe a mensagem de erro
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número.");
        } finally {
            carregaTabelaAmigos(); // atualiza a tabela.
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jLabelEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLabelEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelEmailActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(GerenciamentoAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciamentoAmigos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jLabelEmail;
    private javax.swing.JTextField jLabelNome;
    private javax.swing.JTextField jLabelTelefone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAmigos;
    // End of variables declaration//GEN-END:variables
}
