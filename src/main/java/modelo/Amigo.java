package modelo;

import dao.AmigoDAO;
import java.util.ArrayList;

/**
 * Classe que representa um Amigo.
 */
public class Amigo {

    //Atributos de Amigo
    private String nome;
    private int id;
    private int telefone;

    private AmigoDAO dao;

    //Construtores
    public Amigo() {
        this("", 0, 0);
    }

    /**
     * Construtor para criar um objeto Amigo.
     */
    public Amigo(String nome, int id, int telefone) {
        this.nome = nome;
        this.id = id;
        this.telefone = telefone;
        this.dao = new AmigoDAO();
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /**
     * Método para obter a lista de amigos.
     */
    public ArrayList<Amigo> getListaAmigo() {
        return dao.getListaAmigo();
    }

    /**
     * Método para cadastrar um novo amigo no banco de dados.
     */
    public boolean insertAmigoBD(String Nome, int id, int telefone) {
        id = this.maiorID() + 1;
        Amigo objeto = new Amigo(Nome, id, telefone);
        dao.insertAmigoBD(objeto);
        return true;
    }

    /**
     * Método para deletar um amigo do banco de dados.
     */
    public boolean deleteAmigoBD(int id) {
        dao.deleteAmigoBD(id);
        return true;
    }

    /**
     * Método para atualizar um amigo no banco de dados.
     */
    public boolean updateAmigoBD(String nome, int id, int telefone) {
        Amigo objeto = new Amigo(nome, id, telefone);
        dao.updateAmigoBD(objeto);
        return true;
    }

    /**
     * Método para carregar dados de um amigo específico pelo seu ID.
     */
    public Amigo carregaAmigo(int id) {
        return dao.carregaAmigo(id);
    }

    /**
     * Método para retornar o maior ID da base de dados.
     */
    public int maiorID() {
        return dao.maiorID();
    }
}
