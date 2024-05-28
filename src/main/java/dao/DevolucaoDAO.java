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
            Statement stmt = getConexão().createStatement();
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

    public Connection getConexão() {
        Connection conexão = null;
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            String server = "localhost";
            String database = "emprestimosdeferramentas";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "root";

            conexão = DriverManager.getConnection(url, user, password);
            if (conexão != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: NÃO CONECTADO!");
            }
            return conexão;
        } catch (ClassNotFoundException e) {
            System.out.println("O driver não foi encontrado. " + e.getMessage());
            return null;
        } catch (SQLException e) {
            System.out.println("Não foi possível conectar...");
            return null;
        }
    }

    public boolean insertDevolucaoBD(Devolucao devolucao) {
        String sql = "INSERT INTO tb_devolucao (nomeAmigo, idFerramenta, data, id, nomeDaFerramenta) VALUES (?, ?, ?, ?, ?)";
        try {
            Connection conexão = this.getConexão();
            if (conexão == null) {
                throw new SQLException("Não foi possível conectar ao banco de dados.");
            }

            PreparedStatement stmt = conexão.prepareStatement(sql);
            stmt.setString(1, devolucao.getNomeAmigo());
            stmt.setInt(2, devolucao.getIdFerramenta());
            stmt.setString(3, devolucao.getData());
            stmt.setInt(4, devolucao.getId());
            stmt.setString(5, devolucao.getNomeDaFerramenta());

            stmt.executeUpdate();
            stmt.close();
            conexão.close();
            
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
}
