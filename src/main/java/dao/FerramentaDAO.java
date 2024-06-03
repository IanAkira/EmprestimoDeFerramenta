package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Ferramenta;
import static dao.AmigoDAO.getConexao;

/**
 * Classe que define as operações de acesso a dados para a entidade Ferramenta.
 */
public class FerramentaDAO {

    //Cria ArrayList de Ferramentas
    public static ArrayList<Ferramenta> ListaFerramenta = new ArrayList<>();

    /**
     * Método para obter a lista de ferramentas do banco de dados.
     */
    public ArrayList<Ferramenta> getListaFerramenta() {
        ListaFerramenta.clear();
        try {
            Statement stmt = getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * from tb_ferramentas");
            while (res.next()) {
                int id = res.getInt("id");
                String nome = res.getString("nome");
                String marca = res.getString("marca");
                int valor = res.getInt("valor");

                Ferramenta objeto = new Ferramenta(id, nome, marca, valor);
                ListaFerramenta.add(objeto);
            }
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro" + ex);
        }
        return ListaFerramenta;
    }

    /**
     * Método para definir a lista de ferramentas.
     */
    public void setListaFerramenta(ArrayList<Ferramenta> ListaFerramenta) {
        this.ListaFerramenta = ListaFerramenta;
    }

    /**
     * Método para obter o maior ID de ferramenta do banco de dados.
     */
    public int maiorID() {
        int maiorID = 0;
        try {
            Statement stmt = getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM tb_ferramentas");
            res.next();
            maiorID = res.getInt("id");
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro:" + ex);
        }
        return maiorID;
    }

    /**
     * Método para inserir uma ferramenta no banco de dados.
     */
    public boolean insertFerramentaBD(Ferramenta objeto) {
        String sql = "INSERT INTO tb_ferramentas(id, nome, marca, valor) VALUES (?, ?, ?, ?)";
        try {
            Connection connection = getConexao();
            if (connection == null) {
                throw new SQLException("Não foi possível conectar ao banco de dados.");
            }

            // Consulta para obter o último ID utilizado
            String sqlUltimoId = "SELECT MAX(id) AS max_id FROM tb_ferramentas";
            Statement stmtUltimoId = connection.createStatement();
            ResultSet rsUltimoId = stmtUltimoId.executeQuery(sqlUltimoId);
            int ultimoId = 0;
            if (rsUltimoId.next()) {
                ultimoId = rsUltimoId.getInt("max_id");
            }
            rsUltimoId.close();
            stmtUltimoId.close();

            // Incrementa o último ID para obter o próximo ID
            int novoId = ultimoId + 1;

            // Prepara a declaração SQL para inserir o novo registro
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, novoId);
            stmt.setString(2, objeto.getNome());
            stmt.setString(3, objeto.getMarca());
            stmt.setInt(4, objeto.getValor());

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
     * Método para excluir uma ferramenta do banco de dados.
     */
    public boolean deleteFerramentaBD(int id) {
        try {
            Statement stmt = getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_ferramentas WHERE id = " + id);
            stmt.close();

        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
        }
        return true;
    }

    /**
     * Método para atualizar uma ferramenta no banco de dados.
     */
    public boolean updateFerramentaBD(int id, String nome, String marca, int valor) {
        String sql = "UPDATE tb_ferramentas SET nome = ?, marca = ?, valor = ? WHERE id = ?";
        try {
            PreparedStatement stmt = getConexao().prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, marca);
            stmt.setInt(3, valor);
            stmt.setInt(4, id);
            stmt.executeUpdate();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }

    /**
     * Método para carregar uma ferramenta do banco de dados com base no ID.
     */
    public Ferramenta carregaFerramenta(int id) {
        Ferramenta objeto = new Ferramenta();
        objeto.setId(id);
        try {
            Statement stmt = getConexao().createStatement();

            ResultSet res = stmt.executeQuery("SELECT * FROM tb_ferramentas WHERE id = " + id);
            res.next();

            objeto.setNome(res.getString("nome"));
            objeto.setMarca(res.getString("marca"));
            objeto.setValor(res.getInt("valor"));

            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
        }
        return objeto;
    }
}
