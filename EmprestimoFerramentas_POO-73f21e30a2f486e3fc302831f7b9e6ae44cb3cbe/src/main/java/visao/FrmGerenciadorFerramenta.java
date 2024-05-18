package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Ferramenta;

public class FrmGerenciadorFerramenta extends javax.swing.JFrame {

    private Ferramenta objetoFerramenta;

    public FrmGerenciadorFerramenta() {
        initComponents();
        this.objetoFerramenta = new Ferramenta(); //Carrega objetoFerramenta de Ferramenta
        this.carregaTabela();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTableFerramenta = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTFValor = new javax.swing.JTextField();
        JTFNome = new javax.swing.JTextField();
        JTFMarca = new javax.swing.JTextField();
        JBApagar = new javax.swing.JButton();
        JBEditar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTableFerramenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Marca", "Valor"
            }
        ));
        JTableFerramenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableFerramentaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableFerramenta);
        if (JTableFerramenta.getColumnModel().getColumnCount() > 0) {
            JTableFerramenta.getColumnModel().getColumn(0).setMinWidth(50);
            JTableFerramenta.getColumnModel().getColumn(0).setPreferredWidth(50);
            JTableFerramenta.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Gerenciador de Ferramentas");

        jLabel2.setText("Nome:");

        jLabel3.setText("Marca:");

        jLabel4.setText("Valor:");

        JTFValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFValorActionPerformed(evt);
            }
        });

        JTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNomeActionPerformed(evt);
            }
        });

        JTFMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFMarcaActionPerformed(evt);
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

        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFValor, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(JBApagar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBCancelar)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFValor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JBApagar)
                            .addComponent(JBEditar)
                            .addComponent(JBCancelar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFValorActionPerformed

    }//GEN-LAST:event_JTFValorActionPerformed

    private void JTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNomeActionPerformed

    }//GEN-LAST:event_JTFNomeActionPerformed

    private void JTFMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFMarcaActionPerformed

    }//GEN-LAST:event_JTFMarcaActionPerformed

    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed
        try {

            int id = 0;
            String nome = "";
            String marca = "";
            int valor = 0;

            if (this.JTableFerramenta.getSelectedRow() == -1) {
                throw new Mensagem("Selecione uma ferramenta para apagar primeiro");
            } else {
                id = Integer.parseInt(this.JTableFerramenta.getValueAt(this.JTableFerramenta.getSelectedRow(), 0).toString());
            }

            int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar este Ferramenta?");

            if (respostaUsuario == 0) {

                if (this.objetoFerramenta.deleteFerramentaBD(id)) {

                    this.JTFNome.setText("");
                    this.JTFMarca.setText("");
                    this.JTFValor.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Ferramenta Apagada com Sucesso.");
                }
            }

            System.out.println(this.objetoFerramenta.getListaFerramenta().toString());
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {

            carregaTabela();
        }
    }//GEN-LAST:event_JBApagarActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JTableFerramentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableFerramentaMouseClicked
        if (this.JTableFerramenta.getSelectedRow() != -1) {
            String nome = this.JTableFerramenta.getValueAt(this.JTableFerramenta.getSelectedRow(), 1).toString();
            String marca = this.JTableFerramenta.getValueAt(this.JTableFerramenta.getSelectedRow(), 2).toString();
            String valor = this.JTableFerramenta.getValueAt(this.JTableFerramenta.getSelectedRow(), 3).toString();

            this.JTFNome.setText(nome);
            this.JTFMarca.setText(marca);
            this.JTFValor.setText(valor);
        }
    }//GEN-LAST:event_JTableFerramentaMouseClicked

    private void JBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEditarActionPerformed
        try {

            int id = 0;
            String nome = "";
            String marca = "";
            int valor = 0;

            if (this.JTFNome.getText().length() < 1) {
                throw new Mensagem("Nome deve conter ao menos 1 caracteres.");
            } else {
                nome = this.JTFNome.getText();
            }

            if (this.JTFMarca.getText().length() < 1) {
                throw new Mensagem("A marca deve conter ao menos 1 caracteres.");
            } else {
                marca = (this.JTFMarca.getText());
            }
            if (this.JTFValor.getText().length() < 1) {
                throw new Mensagem("O valor deve conter ao menos 1 número.");
            } else {
                valor = Integer.parseInt(this.JTFValor.getText());
            }

            if (this.JTableFerramenta.getSelectedRow() == -1) {
                throw new Mensagem("Escolha uma Ferramenta para Editar Primeiro");
            } else {
                id = Integer.parseInt(this.JTableFerramenta.getValueAt(this.JTableFerramenta.getSelectedRow(), 0).toString());
            }

            if (this.objetoFerramenta.updateFerramentaBD(id, nome, marca, valor)) {

                this.JTFNome.setText("");
                this.JTFMarca.setText("");
                this.JTFValor.setText("");

                JOptionPane.showMessageDialog(null, "Ferramenta Editado com sucesso.");

            }
            System.out.println(this.objetoFerramenta.getListaFerramenta().toString());
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número válido.");
        } finally {
            carregaTabela();
        }
    }//GEN-LAST:event_JBEditarActionPerformed

    public void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.JTableFerramenta.getModel();
        modelo.setNumRows(0);
        ArrayList<Ferramenta> minhaLista = objetoFerramenta.getListaFerramenta();
        for (Ferramenta a : minhaLista) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getMarca(),
                a.getValor(),});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBApagar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBEditar;
    private javax.swing.JTextField JTFMarca;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTextField JTFValor;
    private javax.swing.JTable JTableFerramenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
