package modelo;

import dao.AmigoDAO;
import java.util.ArrayList;

public class Amigo {

    private String nome;
    private int Id;
    
    private int telefone;

    //Construtores
    public Amigo() {
        this("", 0, 0);
    }

    public Amigo(String nome, int Id, int telefone) {
        this.nome = nome;
        this.Id = Id;
        
        this.telefone = telefone;
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Amigo> getListaAmigo() {
        return AmigoDAO.getListaAmigo();
    }

    //Cadastrar nova ferramenta
    public boolean insertAmigoBD(String Nome, int Id, int telefone) {
        Id = this.maiorID() + 1;
        Amigo objeto = new Amigo(Nome, Id, telefone);
        AmigoDAO.ListaAmigo.add(objeto);
        return true;
    }

    //Deleta uma ferramenta
    public boolean deleteAmigoBD(int id) {
        int indice = this.procuraIndice(id);
        AmigoDAO.ListaAmigo.remove(indice);
        return true;
    }

    //Editar ferramenta
    public boolean updateAmigoBD(int Id, String Nome, int telefone) {
        Amigo objeto = new Amigo(Nome, Id,  telefone);
        int indice = this.procuraIndice(Id);
        AmigoDAO.ListaAmigo.set(indice, objeto);
        return true;
    }

    //Procura o INDICE de objeto da ListaFerramenta que contem o ID enviado.
    private int procuraIndice(int id) {
        int indice = -1;
        for (int i = 0; i < AmigoDAO.ListaAmigo.size(); i++) {
            if (AmigoDAO.ListaAmigo.get(i).getId() == id) {
                indice = i;
            }
        }
        return indice;
    }

    //Carrega dados de uma ferramenta especÍfica pelo seu ID
    public Amigo carregaAmigo(int id) {
        int indice = this.procuraIndice(id);
        return AmigoDAO.ListaAmigo.get(indice);
    }

    //Retorna o maior ID da base de dados
    public int maiorID() {
        return AmigoDAO.maiorID();

    }
}
