package visao;

import javax.swing.JOptionPane;

public class FrmMenuPrincipal extends javax.swing.JFrame {

    public FrmMenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastrar = new javax.swing.JMenu();
        jMenuCadastroAmigo = new javax.swing.JMenuItem();
        jMenuCadastroFerramenta = new javax.swing.JMenuItem();
        jMenuMovimento = new javax.swing.JMenu();
        jMenuEmprestimo = new javax.swing.JMenuItem();
        jMenuGerenciador = new javax.swing.JMenu();
        jMenuGerenciarAmigos = new javax.swing.JMenuItem();
        jMenuGerenciarFerramentas = new javax.swing.JMenuItem();
        jMenuRelatório = new javax.swing.JMenu();
        jMenuRelatorio = new javax.swing.JMenuItem();
        jMenuHistorico = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();

        jMenuItem5.setText("jMenuItem5");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenu1.setText("jMenu1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem4.setText("jMenuItem4");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 80)); // NOI18N
        jLabel1.setText("Bem Vindo");

        jMenuCadastrar.setText("Cadastrar");

        jMenuCadastroAmigo.setText("Cadastrar Amigo");
        jMenuCadastroAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroAmigoActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuCadastroAmigo);

        jMenuCadastroFerramenta.setText("Cadastrar Ferramenta");
        jMenuCadastroFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroFerramentaActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuCadastroFerramenta);

        jMenuBar1.add(jMenuCadastrar);

        jMenuMovimento.setText("Movimento");
        jMenuMovimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMovimentoActionPerformed(evt);
            }
        });

        jMenuEmprestimo.setText("Empréstimo");
        jMenuEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEmprestimoActionPerformed(evt);
            }
        });
        jMenuMovimento.add(jMenuEmprestimo);

        jMenuBar1.add(jMenuMovimento);

        jMenuGerenciador.setText("Gerenciador");

        jMenuGerenciarAmigos.setText("Gerenciar Amigos");
        jMenuGerenciarAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGerenciarAmigosActionPerformed(evt);
            }
        });
        jMenuGerenciador.add(jMenuGerenciarAmigos);

        jMenuGerenciarFerramentas.setText("Gerenciar Ferramentas");
        jMenuGerenciarFerramentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGerenciarFerramentasActionPerformed(evt);
            }
        });
        jMenuGerenciador.add(jMenuGerenciarFerramentas);

        jMenuBar1.add(jMenuGerenciador);

        jMenuRelatório.setText("Relatório");
        jMenuRelatório.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRelatórioActionPerformed(evt);
            }
        });

        jMenuRelatorio.setText("Relatório de Empréstimos");
        jMenuRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRelatorioActionPerformed(evt);
            }
        });
        jMenuRelatório.add(jMenuRelatorio);

        jMenuHistorico.setText("Histórico de Empréstimos");
        jMenuHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuHistoricoActionPerformed(evt);
            }
        });
        jMenuRelatório.add(jMenuHistorico);

        jMenuBar1.add(jMenuRelatório);

        jMenuSobre.setText("Sobre");
        jMenuSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSobreMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel1)
                .addContainerGap(192, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuCadastroAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroAmigoActionPerformed
        //Deixa o menu de cadastro de amigo visível
        FrmCadastrarAmigo amigo = new FrmCadastrarAmigo();

        amigo.setVisible(true);
    }//GEN-LAST:event_jMenuCadastroAmigoActionPerformed

    private void jMenuGerenciarAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGerenciarAmigosActionPerformed
        //Deixa o gerenciador de amigos visível
        FrmGerenciadorAmigo amigo = new FrmGerenciadorAmigo();

        amigo.setVisible(true);
    }//GEN-LAST:event_jMenuGerenciarAmigosActionPerformed

    private void jMenuCadastroFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroFerramentaActionPerformed
        //Deixa o menu de cadastro de ferramenta visível
        FrmCadastrarFerramenta ferramenta = new FrmCadastrarFerramenta();

        ferramenta.setVisible(true);
    }//GEN-LAST:event_jMenuCadastroFerramentaActionPerformed

    private void jMenuGerenciarFerramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGerenciarFerramentasActionPerformed
       //Deixa o gerenciador de ferramentas visível
        FrmGerenciadorFerramenta ferramenta = new FrmGerenciadorFerramenta();

        ferramenta.setVisible(true);
    }//GEN-LAST:event_jMenuGerenciarFerramentasActionPerformed

    private void jMenuEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEmprestimoActionPerformed
       //Deixa o menu de emprestimos visível
        FrmRealizarEmprestimo menu = new FrmRealizarEmprestimo();
        menu.setVisible (true);
        FrmGerenciadorAmigo amigo = new FrmGerenciadorAmigo();
        amigo.setVisible(false);
        FrmGerenciadorFerramenta ferramenta = new FrmGerenciadorFerramenta();
        ferramenta.setVisible(false);
    }//GEN-LAST:event_jMenuEmprestimoActionPerformed

    private void jMenuRelatórioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRelatórioActionPerformed
        
    }//GEN-LAST:event_jMenuRelatórioActionPerformed

    private void jMenuRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRelatorioActionPerformed
       //Deixa o menu de relatorio de empréstimos  visível
        FrmRelatorioEmprestimo menu = new FrmRelatorioEmprestimo();
        menu.setVisible (true);
    }//GEN-LAST:event_jMenuRelatorioActionPerformed

    private void jMenuSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSobreMouseClicked
        JOptionPane.showMessageDialog(null,"Bem-vindo ao Software de Empréstimo de Ferramentas!\n\n" +
                          "Este projeto foi desenvolvido por alunos da Unisul,\n" +
                          "como parte do Trabalho A3 da disciplina de Programação de Soluções Computacionais.\n\n" +
                          "A equipe é composta pelos alunos Kevin Nunes, Ian Akira, Henrique Bento," +
                          " Victor Rodrigues e Gabriel Cordeiro, \nque se dedicaram a criar uma solução prática e eficiente " +
                          "para gerenciar o empréstimo de ferramentas.\n\n" +
                          "Explore as funcionalidades do nosso software:\n\n" +
                   "1. Cadastre seus amigos com seus nomes e números de telefone.\n" +
                   "2. Registre suas ferramentas, incluindo nome, marca e custo.\n" +
                   "3. Gerencie facilmente os empréstimos realizados.\n" +
                   "4. Consulte os dados de amigos e ferramentas salvos.\n" +
                   "5. Altere informações de amigos e ferramentas conforme necessário.\n" +
                   "6. Exclua registros de amigos e ferramentas quando apropriado.\n" +
                   "7. Registre empréstimos de ferramentas para amigos cadastrados.\n" +
                   "8. Marque a devolução das ferramentas emprestadas.\n" +
                   "9. Acesse relatórios detalhados sobre os empréstimos realizados.\n" +
                   "10. Consulte o histórico completo de empréstimos realizados.\n\n" +
                   "Com esses recursos, você terá controle total sobre quem pegou emprestado suas ferramentas e quando!\n\n"+
                          "Obrigado por escolher nosso software !!");
    }//GEN-LAST:event_jMenuSobreMouseClicked

    private void jMenuHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuHistoricoActionPerformed
 FrmHistoricoDeEmprestimos menu = new FrmHistoricoDeEmprestimos();
        menu.setVisible (true);
    }//GEN-LAST:event_jMenuHistoricoActionPerformed

    private void jMenuMovimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMovimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuMovimentoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastrar;
    private javax.swing.JMenuItem jMenuCadastroAmigo;
    private javax.swing.JMenuItem jMenuCadastroFerramenta;
    private javax.swing.JMenuItem jMenuEmprestimo;
    private javax.swing.JMenu jMenuGerenciador;
    private javax.swing.JMenuItem jMenuGerenciarAmigos;
    private javax.swing.JMenuItem jMenuGerenciarFerramentas;
    private javax.swing.JMenuItem jMenuHistorico;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenu jMenuMovimento;
    private javax.swing.JMenuItem jMenuRelatorio;
    private javax.swing.JMenu jMenuRelatório;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    // End of variables declaration//GEN-END:variables
}
