package modelo;

import dao.AmigoDAO;
import java.util.ArrayList;

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

    //Chama a lista de amigos
    public ArrayList<Amigo> getListaAmigo() {
        return dao.getListaAmigo();
    }

    //Cadastrar novo amigo
    public boolean insertAmigoBD(String Nome, int id, int telefone) {
        id = this.maiorID() + 1;
        Amigo objeto = new Amigo(Nome, id, telefone);
        dao.insertAmigoBD(objeto);
        return true;
    }

    //Deletar um amigo
    public boolean deleteAmigoBD(int id) {
        dao.deleteAmigoBD(id);
        return true;
    }

    public boolean updateAmigoBD(String nome, int id, int telefone) {
        Amigo objeto = new Amigo(nome, id, telefone);
        dao.updateAmigoBD(objeto);
        return true;
    }

    //Carrega dados de uma amigo especÍfica pelo seu ID
    public Amigo carregaAmigo(int id) {
        return dao.carregaAmigo(id);
    }

    //Retorna o maior ID da base de dados
    public int maiorID() {
        return dao.maiorID();

    }
}
