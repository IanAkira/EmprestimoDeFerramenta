package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Devolucao;

public class DevolucaoDAO {
    
    public static ArrayList<Devolucao> listaDevolucao = new ArrayList<>();

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

    public Connection getConexao() {

        Connection connection = null;  //instância da conexão
        try {
            // Carregamento do JDBC Driver
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            // Configurar a conexão
            String server = "localhost"; //caminho do MySQL
            String database = "emprestimodeferramentas";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "root";

            connection = DriverManager.getConnection(url, user, password);
            // Testando..
            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: NÃO CONECTADO!");
            }
            return connection;

        } catch (ClassNotFoundException e) {  //Driver não encontrado
            System.out.println("O driver nao foi encontrado. " + e.getMessage());
            return null;
        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar...");
            return null;
        }
    }

   public boolean insertDevolucaoBD(Devolucao objeto) {
    String sql = "INSERT INTO tb_devolucao(id, nomeAmigo, idFerramenta, nomeDaFerramenta, data) VALUES(?, ?, ?, ?, ?)";
    try {
        PreparedStatement stmt = this.getConexao().prepareStatement(sql);

        stmt.setInt(1, objeto.getId());
        stmt.setString(2, objeto.getNomeAmigo());
        stmt.setInt(3, objeto.getIdFerramenta());
        stmt.setString(4, objeto.getNomeDaFerramenta());
        stmt.setString(5, objeto.getData());

        stmt.execute();
        stmt.close();

        return true;
    } catch (SQLException erro) {
        System.out.println("Erro:" + erro);
        throw new RuntimeException(erro);
    }
}}
   

