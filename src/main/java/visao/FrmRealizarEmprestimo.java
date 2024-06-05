package visao;

import static dao.AmigoDAO.ListaAmigo;
import dao.EmprestimoDAO;
import static dao.EmprestimoDAO.ListaEmprestimo;
import static dao.FerramentaDAO.ListaFerramenta;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Emprestimo;
import modelo.Ferramenta;

public class FrmRealizarEmprestimo extends javax.swing.JFrame {

    private EmprestimoDAO emprestimoDAO;

    public FrmRealizarEmprestimo() {
        initComponents();
         this.emprestimoDAO = new EmprestimoDAO(); //Carrega objetoemprestimo de Emprestimos
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTFNomeAmigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTFIdFerramenta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JBCancelar = new javax.swing.JButton();
        JBConfirmar = new javax.swing.JButton();
        JTFDataEmprestimo = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Empréstimos");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Empréstimo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Nome do amigo:");

        JTFNomeAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNomeAmigoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Id da Ferramenta:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Data:");

        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JBConfirmar.setText("Confirmar");
        JBConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBConfirmarActionPerformed(evt);
            }
        });

        JTFDataEmprestimo.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(251, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTFDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JBConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JTFIdFerramenta)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(JTFNomeAmigo))
                        .addGap(239, 239, 239))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(273, 273, 273))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFNomeAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFIdFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(JTFDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFNomeAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNomeAmigoActionPerformed

    }//GEN-LAST:event_JTFNomeAmigoActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBConfirmarActionPerformed

        //Atualiza a conexao do banco de dados 
        FrmRelatorioEmprestimo relatorio = new FrmRelatorioEmprestimo();
        relatorio.setVisible (false);
        
        
        String ProcurarNome = JTFNomeAmigo.getText();  //Cria uma variável com o nome excrito na JTF
boolean encontrado = false;       //Variável para armazenar se o nome foi encontrado

for (int i = 0; i < ListaAmigo.size(); i++) {
    if (ListaAmigo.get(i).getNome().equals(ProcurarNome)) {
        encontrado = true;
        break;  //Quebra o loop quando encontra o nome
    }
}

String ProcurarIdFerramenta = JTFIdFerramenta.getText();
boolean encontrada = false;
Ferramenta ferramentaEncontrada = null;

for (Ferramenta ferramenta : ListaFerramenta) {
    if (ferramenta.getId() == Integer.parseInt(ProcurarIdFerramenta)) {
        encontrada = true;
        ferramentaEncontrada = ferramenta;
        break;
    }
}

String NomeF = "";
if(encontrada){
 NomeF = ListaFerramenta.get( Integer.parseInt(ProcurarIdFerramenta)- 1).getNome();
}
boolean encontradoL = true;
for (int i = 0; i < ListaEmprestimo.size(); i++) {
    if (ListaEmprestimo.get(i).getNomeDaFerramenta().equals(NomeF)) {
        encontradoL = false;
        break;      }
}


if (encontrada && encontrado && encontradoL) {
    try {
        String nome = JTFNomeAmigo.getText();
        Date dataSelecionada = JTFDataEmprestimo.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataTexto = sdf.format(dataSelecionada);
        int idFerramenta = Integer.parseInt(JTFIdFerramenta.getText());
        String nomeFerramenta = ferramentaEncontrada.getNome(); // Obter o nome real da ferramenta

        Emprestimo novoEmprestimo = new Emprestimo();
        novoEmprestimo.setNomeAmigo(nome);
        novoEmprestimo.setData(dataTexto);
        novoEmprestimo.setNomeDaFerramenta(nomeFerramenta); // Ajuste para usar o nome real da ferramenta
        novoEmprestimo.setIdFerramenta(idFerramenta);

        EmprestimoDAO dao = new EmprestimoDAO();
        boolean inserido = dao.insertEmprestimoBD(novoEmprestimo);

        if (inserido) {
            JOptionPane.showMessageDialog(this, "Empréstimo registrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao registrar empréstimo.");
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
    }
} 
else if (encontrada && encontrado)
{
    JOptionPane.showMessageDialog(this, "Ferramenta já está emprestada.");
}
else 
{
    JOptionPane.showMessageDialog(this, "Amigo ou ferramenta não encontrados.");
}

    }//GEN-LAST:event_JBConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRealizarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRealizarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRealizarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRealizarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRealizarEmprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBConfirmar;
    private com.toedter.calendar.JDateChooser JTFDataEmprestimo;
    private javax.swing.JTextField JTFIdFerramenta;
    private javax.swing.JTextField JTFNomeAmigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
