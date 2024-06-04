package modelo;

import dao.DevolucaoDAO;
import java.util.ArrayList;

/**
 * Classe que representa uma devolução.
 */
public class Devolucao {

    // Atributos de Devolução
    private String nomeAmigo;
    private int idFerramenta;
    private String data;
    private int id;
    private String nomeDaFerramenta;

    private DevolucaoDAO dao;

    // Construtores
    public Devolucao() {
        this("", 0, "", 0, "");
    }

    /**
     * Construtor para criar um objeto Devolução.
     */
    public Devolucao(String nomeAmigo, int idFerramenta, String data, int id, String nomeDaFerramenta) {
        this.nomeAmigo = nomeAmigo;
        this.idFerramenta = idFerramenta;
        this.data = data;
        this.id = id;
        this.nomeDaFerramenta = nomeDaFerramenta;
        this.dao = new DevolucaoDAO();
    }

    // Getters e Setters
    public String getNomeAmigo() {
        return nomeAmigo;
    }

    public void setNomeAmigo(String nomeAmigo) {
        this.nomeAmigo = nomeAmigo;
    }

    public int getIdFerramenta() {
        return idFerramenta;
    }

    public void setIdFerramenta(int idFerramenta) {
        this.idFerramenta = idFerramenta;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDaFerramenta() {
        return nomeDaFerramenta;
    }

    public void setNomeDaFerramenta(String nomeDaFerramenta) {
        this.nomeDaFerramenta = nomeDaFerramenta;
    }

    /**
     * Método para obter a lista de devoluções.
     */
    public ArrayList<Devolucao> getListaDevolucao() {
        return dao.getListaDevolucao();
    }

    /**
     * Método para inserir uma devolução no banco de dados.
     */
    public boolean insertDevolucaoBD(String nomeAmigo, int idFerramenta, String data, String nomeDaFerramenta) {
        Devolucao objeto = new Devolucao(nomeAmigo, idFerramenta, data, 0, nomeDaFerramenta); // O ID será gerado pelo BD
        dao.insertDevolucaoBD(objeto);
        return true;
    }

   
    
}
