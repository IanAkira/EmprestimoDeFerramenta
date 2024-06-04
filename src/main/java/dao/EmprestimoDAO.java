package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Emprestimo;
import static dao.AmigoDAO.getConexao;

/**
 * Classe que define as operações de acesso a dados para a entidade de
 * Emprestimo.
 */
public class EmprestimoDAO {

    //Cria ArrayList dos Emprestimos
    public static ArrayList<Emprestimo> ListaEmprestimo = new ArrayList<>();

    /**
     * Método para obter a lista de empréstimos do banco de dados.
     */
    public ArrayList<Emprestimo> getListaEmprestimo() {
        ListaEmprestimo.clear();
        try {
            Statement stmt = getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_emprestimos");
            while (res.next()) {
                int id = res.getInt("id");
                String nomeAmigo = res.getString("nome");
                String data = res.getString("data");
                String nomeDaFerramenta = res.getString("nomeDaFerramenta");
                int idFerramenta = res.getInt("idFerramenta");

                Emprestimo objeto = new Emprestimo(id, nomeAmigo, data, nomeDaFerramenta, idFerramenta);
                ListaEmprestimo.add(objeto);
            }
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro" + ex);
        }
        return ListaEmprestimo;
    }

    /**
     * Método para definir a lista de empréstimos.
     */
    public void setListaEmprestimo(ArrayList<Emprestimo> ListaEmprestimo) {
        this.ListaEmprestimo = ListaEmprestimo;
    }

   
    

    /**
     * Método para inserir um empréstimo no banco de dados.
     */
    public boolean insertEmprestimoBD(Emprestimo objeto) {
        String sql = "INSERT INTO tb_emprestimos (id, nome, data, nomeDaFerramenta, idFerramenta) VALUES (?, ?, ?, ?, ?)";
        try {
            Connection connection = getConexao();
            if (connection == null) {
                throw new SQLException("Não foi possível conectar ao banco de dados.");
            }
            String sqlUltimoId = "SELECT MAX(id) AS max_id FROM tb_emprestimos";
            Statement stmtUltimoId = connection.createStatement();
            ResultSet rsUltimoId = stmtUltimoId.executeQuery(sqlUltimoId);
            
            int ultimoId = 0;
            if (rsUltimoId.next()) {
                ultimoId = rsUltimoId.getInt("max_id");
            }
            rsUltimoId.close();
            stmtUltimoId.close();

            int novoId = ultimoId + 1;

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, novoId);
            stmt.setString(2, objeto.getNomeAmigo());
            stmt.setString(3, objeto.getData());
            stmt.setString(4, objeto.getNomeDaFerramenta());
            stmt.setInt(5, objeto.getIdFerramenta());

            stmt.executeUpdate();
            stmt.close();
            connection.close();

            return true;
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }

    /**
     * Método para excluir um empréstimo do banco de dados.
     */
    public boolean deleteEmprestimoBD(int id) {
        try {
            Statement stmt = getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_emprestimos WHERE id = " + id);
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
        }
        return true;
    }

    /**
     * Método para carregar um empréstimo do banco de dados com base no ID.
     */
    public Emprestimo carregaEmprestimo(int id) {
        Emprestimo objeto = new Emprestimo();
        objeto.setId(id);
        try {
            Statement stmt = getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_emprestimos WHERE id = " + id);
            res.next();

            objeto.setNomeAmigo(res.getString("nome"));
            objeto.setData(res.getString("data"));
            objeto.setNomeDaFerramenta(res.getString("nomeDaFerramenta"));
            objeto.setIdFerramenta(res.getInt("idFerramenta"));

            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
        }
        return objeto;
    }
}
