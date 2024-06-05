package visao;

import dao.AmigoDAO;
import modelo.Amigo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Classe responsável pela interface gráfica de gerenciador de amigo.
 */
public class FrmGerenciadorAmigo extends javax.swing.JFrame {

    private Amigo objetoamigo;

    /**
     * Construtor da classe FrmGerenciadorDeAmigo.
     */
    public FrmGerenciadorAmigo() {
        initComponents(); // Inicializa os componentes da interface gráfica
        this.objetoamigo = new Amigo(); //Carrega objetoamigo de Amigo
        this.carregaTabela(); // Inicializa a Tabela

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableAmigos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        JTFNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JTFTelefone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JBCancelar = new javax.swing.JButton();
        JBApagar = new javax.swing.JButton();
        JBEditar = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel2.setText("Gerenciador De Ferramentas");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador de Amigos");

        JTableAmigos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Telefone"
            }
        ));
        JTableAmigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableAmigosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableAmigos);
        if (JTableAmigos.getColumnModel().getColumnCount() > 0) {
            JTableAmigos.getColumnModel().getColumn(0).setMinWidth(50);
            JTableAmigos.getColumnModel().getColumn(0).setPreferredWidth(50);
            JTableAmigos.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel3.setText("Gerenciador De Amigos");

        JTFNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNomeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nome:");

        JTFTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JTFTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFTelefoneActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Telefone:");

        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JBApagar.setText("Apagar");
        JBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBApagarActionPerformed(evt);
            }
        });

        JBEditar.setText("Editar");
        JBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(JBApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTFNome)
                                    .addComponent(jLabel1)
                                    .addComponent(JTFTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                    .addComponent(jLabel4)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel3)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JBEditar)
                            .addComponent(JBApagar)
                            .addComponent(JBCancelar))
                        .addGap(45, 45, 45))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFTelefoneActionPerformed

    }//GEN-LAST:event_JTFTelefoneActionPerformed

    private void JTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNomeActionPerformed

    }//GEN-LAST:event_JTFNomeActionPerformed

    // Método executado quando ocorre um clique na tabela de amigos
    private void JTableAmigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableAmigosMouseClicked

        // Verifica se algum amigo foi selecionado na tabela
        if (this.JTableAmigos.getSelectedRow() != -1) {
            String nome = this.JTableAmigos.getValueAt(this.JTableAmigos.getSelectedRow(), 1).toString();
            String telefone = this.JTableAmigos.getValueAt(this.JTableAmigos.getSelectedRow(), 2).toString();

            // Preenche os campos de texto com os dados do amigo selecionado
            this.JTFNome.setText(nome);
            this.JTFTelefone.setText(telefone);

        }

    }//GEN-LAST:event_JTableAmigosMouseClicked

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed

        try {
            int id = 0;
            String nome = "";
            int telefone = 0;

            // Verifica se algum amigo foi selecionado na tabela
            if (this.JTableAmigos.getSelectedRow() == -1) {
                throw new Mensagem("Selecione um Amigo para apagar primeiro");
            } else {
                // Obtém o ID do amigo selecionado
                id = Integer.parseInt(this.JTableAmigos.getValueAt(this.JTableAmigos.getSelectedRow(), 0).toString());
            }

            // Pergunta ao usuário se ele tem certeza que deseja apagar o amigo
            int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar este Amigo?");

            // Se o usuário confirmar a exclusão, prossegue com a exclusão
            if (respostaUsuario == 0) {
                // Apaga o amigo do banco de dados
                if (this.objetoamigo.deleteAmigoBD(id)) {
                    // Limpa os campos de texto e exibe uma mensagem de sucesso
                    this.JTFNome.setText("");
                    this.JTFTelefone.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Amigo Apagado com Sucesso.");
                }
            }

            // Exibe a lista atualizada de amigos após a exclusão
            System.out.println(this.objetoamigo.getListaAmigo().toString());
        } catch (Mensagem erro) {
            // Exibe mensagem de erro se houver algum problema
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            // Recarrega a tabela de amigos após a exclusão (mesmo que não tenha sido realizada)
            carregaTabela();

        }
    }//GEN-LAST:event_JBApagarActionPerformed

    private void JBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEditarActionPerformed

        try {
            int id = 0;
            String nome = "";
            int telefone = 0;

            // Verifica se o campo de nome está preenchido
            if (this.JTFNome.getText().length() < 1) {
                throw new Mensagem("Nome deve conter ao menos 1 caracteres.");
            } else {
                // Obtém o nome do amigo a ser editado
                nome = this.JTFNome.getText();
            }

            // Verifica se o campo de telefone está preenchido corretamente
            if (this.JTFTelefone.getText().length() < 9 && this.JTFTelefone.getText().length() < 10) {
                throw new Mensagem("O Telefone deve ter 9 digitos.");
            } else {
                // Obtém o telefone do amigo a ser editado
                telefone = Integer.parseInt(this.JTFTelefone.getText());
            }

            // Verifica se algum amigo foi selecionado na tabela
            if (this.JTableAmigos.getSelectedRow() == -1) {
                throw new Mensagem("Escolha um Amigo para Editar Primeiro");
            } else {
                // Obtém o ID do amigo selecionado
                id = Integer.parseInt(this.JTableAmigos.getValueAt(this.JTableAmigos.getSelectedRow(), 0).toString());
            }

            // Realiza a edição do amigo no banco de dados
            if (this.objetoamigo.updateAmigoBD(nome, id, telefone)) {
                // Limpa os campos de texto e exibe uma mensagem de sucesso
                this.JTFNome.setText("");
                this.JTFTelefone.setText("");
                JOptionPane.showMessageDialog(null, "Amigo Editado com sucesso.");
            }

            // Exibe a lista atualizada de amigos após a edição
            System.out.println(this.objetoamigo.getListaAmigo().toString());
        } catch (Mensagem erro) {
            // Exibe mensagem de erro se houver algum problema
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            // Exibe mensagem de erro se o telefone informado não for um número válido
            JOptionPane.showMessageDialog(null, "Informe um número válido.");
        } finally {
            // Recarrega a tabela de amigos após a edição (mesmo que não tenha sido realizada)
            carregaTabela();
        }
    }//GEN-LAST:event_JBEditarActionPerformed

    public void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.JTableAmigos.getModel();
        modelo.setNumRows(0);
        ArrayList<Amigo> minhaLista = objetoamigo.getListaAmigo(); //Obtem lista de amigos do DAO
        for (Amigo a : minhaLista) {
            modelo.addRow(new Object[]{
                a.getid(),
                a.getNome(),
                a.getTelefone(),});
        }
    }

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
            java.util.logging.Logger.getLogger(FrmGerenciadorAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciadorAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciadorAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciadorAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGerenciadorAmigo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBApagar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBEditar;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTextField JTFTelefone;
    private javax.swing.JTable JTableAmigos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
