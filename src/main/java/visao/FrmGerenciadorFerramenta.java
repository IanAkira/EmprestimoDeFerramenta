package visao;

import dao.FerramentaDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Ferramenta;

/**
 * Classe responsável pela interface gráfica do gerenciador de ferramentas.
 */
public class FrmGerenciadorFerramenta extends javax.swing.JFrame {

    private FerramentaDAO ferramentaDAO; // Objeto para interação com a classe FerramentaDAO

    /**
     * Construtor da classe FrmGerenciadorFerramenta.
     */
    public FrmGerenciadorFerramenta() {
        initComponents(); // Inicializa os componentes da interface gráfica
        this.ferramentaDAO = new FerramentaDAO(); // Cria uma instância da classe FerramentaDAO
        this.carregaTabela(); // Inicializa a tabela
        this.calculaValorTotal(); // Calcula o valor total das ferramentas exibidas
    }

    /**
     * Calcula o valor total das ferramentas exibidas na tabela.
     */
    public void calculaValorTotal() {
        double total = 0;
        for (int i = 0; i < JTableFerramenta.getRowCount(); i++) {
            total += Double.parseDouble(JTableFerramenta.getValueAt(i, 3).toString());
        }
        jLabelTotal.setText("R$ " + String.format("%.2f", total));
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
        jLabel5 = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador de Ferramentas");

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

        jLabel5.setText("Valor total:");

        jLabelTotal.setText("jLabel6");
        jLabelTotal.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabelTotalAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
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
                        .addGap(18, 18, 18)
                        .addComponent(JBApagar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTFMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(JTFNome, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(JTFValor, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                        .addComponent(jLabel5)
                        .addGap(11, 11, 11)
                        .addComponent(jLabelTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

            // Verifica se alguma ferramenta foi selecionada na tabela
            if (this.JTableFerramenta.getSelectedRow() == -1) {
                throw new Mensagem("Selecione uma ferramenta para apagar primeiro");
            } else {
                // Obtém o ID da ferramenta selecionada na tabela
                id = Integer.parseInt(this.JTableFerramenta.getValueAt(this.JTableFerramenta.getSelectedRow(), 0).toString());
            }

            // Pede confirmação ao usuário antes de apagar a ferramenta
            int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar esta Ferramenta?");

            if (respostaUsuario == 0) {
                // Se o usuário confirmar a exclusão
                // Chama o método deleteFerramentaBD na classe FerramentaDAO
                FerramentaDAO ferramentaDAO = new FerramentaDAO();
                if (ferramentaDAO.deleteFerramentaBD(id)) {
                    // Limpa os campos de texto da interface
                    this.JTFNome.setText("");
                    this.JTFMarca.setText("");
                    this.JTFValor.setText("");
                    // Exibe uma mensagem de sucesso
                    JOptionPane.showMessageDialog(rootPane, "Ferramenta Apagada com Sucesso.");
                }
            }

            // Exibe a lista de ferramentas após a operação de exclusão
            FerramentaDAO ferramentaDAO = new FerramentaDAO();
            System.out.println(ferramentaDAO.getListaFerramenta().toString());
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            // Chama o método carregaTabela para atualizar a tabela de ferramentas
            carregaTabela();
            // Recalcula o valor total
            calculaValorTotal();
        }

    }//GEN-LAST:event_JBApagarActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    // Método executado quando ocorre um clique na tabela de ferramentas
    private void JTableFerramentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableFerramentaMouseClicked

        // Verifica se alguma ferramenta foi selecionado na tabela
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

            // Verifica se foi inserido um nome válido
            if (this.JTFNome.getText().length() < 1) {
                throw new Mensagem("Nome deve conter ao menos 1 caractere.");
            } else {
                nome = this.JTFNome.getText();
            }

            // Verifica se foi inserida uma marca válida
            if (this.JTFMarca.getText().length() < 1) {
                throw new Mensagem("A marca deve conter ao menos 1 caractere.");
            } else {
                marca = this.JTFMarca.getText();
            }

            // Verifica se foi inserido um valor válido
            if (this.JTFValor.getText().length() < 1) {
                throw new Mensagem("O valor deve conter ao menos 1 número.");
            } else {
                valor = Integer.parseInt(this.JTFValor.getText());
            }

            // Verifica se uma ferramenta foi selecionada na tabela
            if (this.JTableFerramenta.getSelectedRow() == -1) {
                throw new Mensagem("Escolha uma Ferramenta para Editar Primeiro");
            } else {
                // Obtém o ID da ferramenta selecionada na tabela
                id = Integer.parseInt(this.JTableFerramenta.getValueAt(this.JTableFerramenta.getSelectedRow(), 0).toString());
            }

            // Atualiza a ferramenta no banco de dados
            FerramentaDAO ferramentaDAO = new FerramentaDAO();
            if (ferramentaDAO.updateFerramentaBD(id, nome, marca, valor)) {
                // Limpa os campos de texto da interface
                this.JTFNome.setText("");
                this.JTFMarca.setText("");
                this.JTFValor.setText("");
                // Exibe uma mensagem de sucesso
                JOptionPane.showMessageDialog(null, "Ferramenta Editada com sucesso.");
            }

            // Exibe a lista de ferramentas após a operação de edição
            System.out.println(ferramentaDAO.getListaFerramenta().toString());
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número válido.");
        } finally {
            // Chama o método carregaTabela para atualizar a tabela de ferramentas
            carregaTabela();
            // Recalcula o valor total
            calculaValorTotal();
        }
    }//GEN-LAST:event_JBEditarActionPerformed

    private void jLabelTotalAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabelTotalAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelTotalAncestorAdded

    public void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.JTableFerramenta.getModel();
        modelo.setNumRows(0);
        FerramentaDAO ferramentaDAO = new FerramentaDAO(); // Criar uma instância de FerramentaDAO
        ArrayList<Ferramenta> minhaLista = ferramentaDAO.getListaFerramenta(); // Obtem lista de ferramentas do DAO
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
