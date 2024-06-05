package visao;

import dao.DevolucaoDAO;
import dao.EmprestimoDAO;
import static dao.FerramentaDAO.ListaFerramenta;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Devolucao;
import modelo.Emprestimo;

/**
 * Classe responsável pela interface gráfica do relatório de empréstimos.
 */
public class FrmRelatorioEmprestimo extends javax.swing.JFrame {

    private EmprestimoDAO EmprestimoDAO; // Objeto para interação com a classe EmprestimoDAO
    private DevolucaoDAO DevolucaoDAO; // Objeto para interação com a classe DevolucaoDAO

    /**
     * Construtor da classe FrmRelatorioEmprestimo.
     */
    public FrmRelatorioEmprestimo() {
        initComponents(); // Inicializa os componentes da interface gráfica
        this.EmprestimoDAO = new EmprestimoDAO(); // Cria uma instância da classe EmprestimoDAO
        this.DevolucaoDAO = new DevolucaoDAO(); // Cria uma instância da classe DevolucaoDAO
        this.carregaTabela(); // Inicializa tabela
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableEmprestimoAtivo = new javax.swing.JTable();
        JBCancelar = new javax.swing.JButton();
        JBDevolucao = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Relatório de Emprestimos");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Relatório de Empréstimos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Empréstimos Ativos");

        JTableEmprestimoAtivo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Amigo", "Ferramenta", "Data"
            }
        ));
        jScrollPane1.setViewportView(JTableEmprestimoAtivo);
        if (JTableEmprestimoAtivo.getColumnModel().getColumnCount() > 0) {
            JTableEmprestimoAtivo.getColumnModel().getColumn(0).setMinWidth(50);
            JTableEmprestimoAtivo.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        JBCancelar.setText("Retornar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JBDevolucao.setText("Devolução");
        JBDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBDevolucaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(107, 107, 107))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))))
            .addGroup(layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(JBDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBDevolucaoActionPerformed
        try {
            int id = 0;

            // Verifica se alguma linha da tabela de empréstimos ativos está selecionada
            if (this.JTableEmprestimoAtivo.getSelectedRow() == -1) {
                throw new Mensagem("Selecione um empréstimo primeiro.");
            } else {

                // Obtém o ID do empréstimo selecionado na tabela
                id = Integer.parseInt(this.JTableEmprestimoAtivo.getValueAt(this.JTableEmprestimoAtivo.getSelectedRow(), 0).toString());
            }

            // Pergunta ao usuário se ele deseja encerrar o empréstimo selecionado
            int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja encerrar este empréstimo?");

            // Se o usuário confirmar a ação
            if (respostaUsuario == 0) {
                EmprestimoDAO emprestimoDAO = new EmprestimoDAO();

                // Deleta o empréstimo do banco de dados
                if (emprestimoDAO.deleteEmprestimoBD(id)) {
                    try {
                        String nomeAmigo = "";
                        String dataTexto = "";
                        int idFerramenta = 0;
                        String NomeDaFerramenta = "";

                        // Verifica se alguma linha da tabela de empréstimos ativos está selecionada novamente
                        if (this.JTableEmprestimoAtivo.getSelectedRow() == -1) {
                            throw new Mensagem("Selecione uma linha da tabela.");
                        }

                        int linhaSelecionada = this.JTableEmprestimoAtivo.getSelectedRow();
                        nomeAmigo = this.JTableEmprestimoAtivo.getValueAt(linhaSelecionada, 1).toString();
                        dataTexto = this.JTableEmprestimoAtivo.getValueAt(linhaSelecionada, 3).toString();
                        idFerramenta = Integer.parseInt(this.JTableEmprestimoAtivo.getValueAt(linhaSelecionada, 0).toString());
                        NomeDaFerramenta = this.JTableEmprestimoAtivo.getValueAt(linhaSelecionada, 2).toString();

                        // Cria uma instância da classe DevolucaoDAO para registrar a devolução da ferramenta
                        DevolucaoDAO devolucaoDAO = new DevolucaoDAO();
                        if (devolucaoDAO.insertDevolucaoBD(new Devolucao(nomeAmigo, idFerramenta, dataTexto, 0, NomeDaFerramenta))) {

                            // Atualiza o nome da ferramenta
                            int NovoIdFerramenta = idFerramenta - 1;
                            NomeDaFerramenta = ListaFerramenta.get(NovoIdFerramenta).getNome();

                            // Exibe uma mensagem de sucesso
                            JOptionPane.showMessageDialog(null, "Empréstimo encerrado com sucesso.");
                        }

                        // Exibe no console a lista de devoluções
                        System.out.println(devolucaoDAO.getListaDevolucao().toString());

                    } catch (Mensagem erro) {

                        // Exibe mensagens de erro ao usuário
                        JOptionPane.showMessageDialog(null, erro.getMessage());
                    } catch (NumberFormatException erro2) {

                        // Exibe uma mensagem de erro se o usuário informar um número inválido
                        JOptionPane.showMessageDialog(null, "Informe um número válido.");
                    }
                }

                // Exibe no console a lista de empréstimos após a ação
                System.out.println(emprestimoDAO.getListaEmprestimo().toString());
            }
        } catch (Mensagem erro) {

            // Exibe mensagens de erro ao usuário
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {

            // Carrega novamente a tabela de empréstimos ativos
            carregaTabela();
        }
    }//GEN-LAST:event_JBDevolucaoActionPerformed

    public void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.JTableEmprestimoAtivo.getModel();
        modelo.setNumRows(0);
        EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
        ArrayList<Emprestimo> minhaLista = emprestimoDAO.getListaEmprestimo();
        for (Emprestimo a : minhaLista) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNomeAmigo(),
                a.getNomeDaFerramenta(),
                a.getData()
            });
        }
    }

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FrmRelatorioEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorioEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorioEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorioEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRelatorioEmprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBDevolucao;
    private javax.swing.JTable JTableEmprestimoAtivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
