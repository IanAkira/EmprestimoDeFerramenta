package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Devolucao;
import static dao.AmigoDAO.getConexao;

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
     * Método para inserir uma devolução no banco de dados.
     */
    public boolean insertDevolucaoBD(Devolucao objeto) {
        String sql = "INSERT INTO tb_devolucao(nomeAmigo, idFerramenta, nomeDaFerramenta, data,id) VALUES(?,?, ?, ?, ?)";
        try {
            String sqlUltimoId = "SELECT MAX(id) AS max_id FROM tb_devolucao";
            Statement stmtUltimoId = getConexao().createStatement();
            ResultSet rsUltimoId = stmtUltimoId.executeQuery(sqlUltimoId);
            PreparedStatement stmt = getConexao().prepareStatement(sql);
            int ultimoId = 0;
            
            if (rsUltimoId.next()) {
                ultimoId = rsUltimoId.getInt("max_id");
            }
            rsUltimoId.close();
            stmtUltimoId.close();

            int novoId = ultimoId + 1;

            System.out.println("Inserindo Devolução: " + objeto);  // Adicione esta linha para debug
            stmt.setString(1, objeto.getNomeAmigo());
            stmt.setInt(2, objeto.getIdFerramenta());
            stmt.setString(3, objeto.getNomeDaFerramenta());
            stmt.setString(4, objeto.getData());
            stmt.setInt(5, novoId);

            stmt.execute();
            stmt.close();

            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            throw new RuntimeException(erro);
        }
    }

    public int contarEmprestimosPorPessoa(String nomeAmigo) {
        int count = 0;
        for (Devolucao devolucao : listaDevolucao) {
            if (devolucao.getNomeAmigo().equals(nomeAmigo)) {
                count++;
            }
        }
        return count;
    }
}
