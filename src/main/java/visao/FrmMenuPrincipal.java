package visao;

public class FrmMenuPrincipal extends javax.swing.JFrame {

    public FrmMenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem5 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jCadastrarFerramenta = new javax.swing.JMenu();
        jMenuCadastroAmigo = new javax.swing.JMenuItem();
        jMenuCadastroFerramenta = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuEmprestimo = new javax.swing.JMenuItem();
        jMenuDevolucao = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuGerenciarAmigos = new javax.swing.JMenuItem();
        jMenuGerenciarFerramentas = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 80)); // NOI18N
        jLabel1.setText("Bem Vindo");

        jCadastrarFerramenta.setText("Cadastrar");

        jMenuCadastroAmigo.setText("Cadastrar Amigo");
        jMenuCadastroAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroAmigoActionPerformed(evt);
            }
        });
        jCadastrarFerramenta.add(jMenuCadastroAmigo);

        jMenuCadastroFerramenta.setText("Cadastrar Ferramenta");
        jMenuCadastroFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroFerramentaActionPerformed(evt);
            }
        });
        jCadastrarFerramenta.add(jMenuCadastroFerramenta);

        jMenuBar1.add(jCadastrarFerramenta);

        jMenu2.setText("Movimento");

        jMenuEmprestimo.setText("Empréstimo");
        jMenuEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEmprestimoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuEmprestimo);

        jMenuDevolucao.setText("Devolução");
        jMenu2.add(jMenuDevolucao);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatório");

        jMenuGerenciarAmigos.setText("Gerenciar Amigos");
        jMenuGerenciarAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGerenciarAmigosActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuGerenciarAmigos);

        jMenuGerenciarFerramentas.setText("Gerenciar Ferramentas");
        jMenuGerenciarFerramentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGerenciarFerramentasActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuGerenciarFerramentas);

        jMenuBar1.add(jMenu3);

        jMenuSobre.setText("Sobre");
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
        FrmCadastrarAmigo amigo = new FrmCadastrarAmigo();

        amigo.setVisible(true);
    }//GEN-LAST:event_jMenuCadastroAmigoActionPerformed

    private void jMenuGerenciarAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGerenciarAmigosActionPerformed
        FrmGerenciadorAmigo amigo = new FrmGerenciadorAmigo();

        amigo.setVisible(true);
    }//GEN-LAST:event_jMenuGerenciarAmigosActionPerformed

    private void jMenuCadastroFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroFerramentaActionPerformed
        FrmCadastrarFerramenta ferramenta = new FrmCadastrarFerramenta();

        ferramenta.setVisible(true);
    }//GEN-LAST:event_jMenuCadastroFerramentaActionPerformed

    private void jMenuGerenciarFerramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGerenciarFerramentasActionPerformed
        FrmGerenciadorFerramenta ferramenta = new FrmGerenciadorFerramenta();

        ferramenta.setVisible(true);
    }//GEN-LAST:event_jMenuGerenciarFerramentasActionPerformed

    private void jMenuEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEmprestimoActionPerformed
        FrmRealizarEmprestimo menu = new FrmRealizarEmprestimo();
        menu.setVisible (true);
    }//GEN-LAST:event_jMenuEmprestimoActionPerformed

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
    private javax.swing.JMenu jCadastrarFerramenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCadastroAmigo;
    private javax.swing.JMenuItem jMenuCadastroFerramenta;
    private javax.swing.JMenuItem jMenuDevolucao;
    private javax.swing.JMenuItem jMenuEmprestimo;
    private javax.swing.JMenuItem jMenuGerenciarAmigos;
    private javax.swing.JMenuItem jMenuGerenciarFerramentas;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenu jMenuSobre;
    // End of variables declaration//GEN-END:variables
}
