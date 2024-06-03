package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Amigo;

/**
 * Classe que define as operações de acesso a dados para a entidade Amigo.
 */
public class AmigoDAO {

    // Cria ArrayList de Amigos
    public static ArrayList<Amigo> ListaAmigo = new ArrayList<>();

    /**
     * Obtém a lista de amigos do banco de dados.
     */
    public ArrayList<Amigo> getListaAmigo() {
        ListaAmigo.clear();
        try {
            Statement stmt = getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * from tb_amigos");
            while (res.next()) {
                int id = res.getInt("id");
                String nome = res.getString("nome");
                int telefone = res.getInt("telefone");

                Amigo objeto = new Amigo(nome, id, telefone);
                ListaAmigo.add(objeto);
            }
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro" + ex);
        }
        return ListaAmigo;
    }

    /**
     * Define a lista de amigos.
     */
    public void setListaAmigo(ArrayList<Amigo> ListaAmigo) {
        this.ListaAmigo = ListaAmigo;
    }

    /**
     * Obtém o maior ID de amigo presente no banco de dados.
     */
    public int maiorID() {
        int maiorID = 0;
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM tb_amigos");
            res.next();
            maiorID = res.getInt("id");
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro:" + ex);
        }
        return maiorID;
    }

    /**
     * Obtém a conexão com o banco de dados.
     */
    public static Connection getConexao() {
        Connection connection = null; // instância da conexão
        try {
            // Carregamento do JDBC Driver
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            // Configurar a conexão
            String server = "localhost"; // caminho do MySQL
            String database = "emprestimodeferramentas";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "root";

            connection = DriverManager.getConnection(url, user, password);
            // Teste
            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: NÃO CONECTADO!");
            }
            return connection;

        } catch (ClassNotFoundException e) { // Driver não encontrado
            System.out.println("O driver nao foi encontrado. " + e.getMessage());
            return null;
        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar...");
            return null;
        }
    }

    /**
     * Insere um amigo no banco de dados.
     */
    public boolean insertAmigoBD(Amigo objeto) {
        String sql = "INSERT INTO tb_amigos(id,nome,telefone) VALUES(?,?,?)";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getid());
            stmt.setString(2, objeto.getNome());
            stmt.setInt(3, objeto.getTelefone());

            stmt.execute();
            stmt.close();

            return true;
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }

    /**
     * Exclui um amigo do banco de dados.
     */
    public boolean deleteAmigoBD(int id) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_amigos WHERE id = " + id);
            stmt.close();

        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
        }
        return true;
    }

    /**
     * Atualiza as informações de um amigo no banco de dados.
     */
    public boolean updateAmigoBD(Amigo objeto) {
        String sql = "UPDATE tb_amigos SET nome = ?, telefone = ? WHERE id = ?";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            stmt.setString(1, objeto.getNome());
            stmt.setInt(2, objeto.getTelefone());
            stmt.setInt(3, objeto.getid());
            stmt.executeUpdate();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }

    /**
     * Carrega as informações de um amigo do banco de dados.
     */
    public Amigo carregaAmigo(int id) {
        Amigo objeto = new Amigo();
        objeto.setid(id);
        try {
            Statement stmt = this.getConexao().createStatement();

            ResultSet res = stmt.executeQuery("SELECT * FROM tb_amigos WHERE id = " + id);
            res.next();

            objeto.setNome(res.getString("nome"));
            objeto.setTelefone(res.getInt("telefone"));

            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
        }
        return objeto;
    }
}
