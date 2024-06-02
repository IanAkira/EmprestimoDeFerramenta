package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Devolucao;

/**
 * Classe que define as operações de acesso a dados para a entidade de
 * Devolucao.
 */
public class DevolucaoDAO {

    /**
     * Lista para armazenar objetos de Devolucao recuperados do banco de dados.
     */
    public static ArrayList<Devolucao> listaDevolucao = new ArrayList<>();

    /**
     * Método para obter a lista de devoluções do banco de dados.
     */
    public ArrayList<Devolucao> getListaDevolucao() {
        listaDevolucao.clear();
        try {
            Statement stmt = getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_devolucao");
            while (res.next()) {
                int id = res.getInt("id");
                String nomeAmigo = res.getString("nomeAmigo");
                String data = res.getString("data");
                String nomeDaFerramenta = res.getString("nomeDaFerramenta");
                int idFerramenta = res.getInt("idFerramenta");

                Devolucao devolucao = new Devolucao(nomeAmigo, idFerramenta, data, id, nomeDaFerramenta);
                listaDevolucao.add(devolucao);
            }
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        }
        return listaDevolucao;
    }

    /**
     * Método para obter o maior ID de devolução do banco de dados.
     */
    public int maiorID() {
        int maiorID = 0;
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) AS id FROM tb_devolucao");
            if (res.next()) {
                maiorID = res.getInt("id");
            }
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        }
        return maiorID;
    }

    /**
     * Método para obter uma conexão com o banco de dados.
     */
    public Connection getConexao() {
        Connection connection = null;
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            String server = "localhost";
            String database = "emprestimodeferramentas";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "root";

            connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: NÃO CONECTADO!");
            }
            return connection;

        } catch (ClassNotFoundException e) {
            System.out.println("O driver nao foi encontrado. " + e.getMessage());
            return null;
        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar...");
            return null;
        }
    }

    /**
     * Método para inserir uma devolução no banco de dados.
     */
    public boolean insertDevolucaoBD(Devolucao objeto) {
        String sql = "INSERT INTO tb_devolucao(nomeAmigo, idFerramenta, nomeDaFerramenta, data) VALUES(?, ?, ?, ?)";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            System.out.println("Inserindo Devolução: " + objeto);  // Adicione esta linha para debug
            stmt.setString(1, objeto.getNomeAmigo());
            stmt.setInt(2, objeto.getIdFerramenta());
            stmt.setString(3, objeto.getNomeDaFerramenta());
            stmt.setString(4, objeto.getData());

            stmt.execute();
            stmt.close();

            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            throw new RuntimeException(erro);
        }
    }
}
