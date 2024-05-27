package modelo;

import dao.EmprestimoDAO;
import java.util.ArrayList;

public class Emprestimo {

    //Atributos do Emprestimo
    private String nomeAmigo;
    private int idFerramenta;
    private String data;
    private int id;
    private String NomeDaFerramenta;

    //Construtores
    public Emprestimo() {
        this.nomeAmigo = "";
        this.idFerramenta = 0;
        this.data = "";
        this.id = 0;
        this.NomeDaFerramenta = "";
    }

    public Emprestimo(String nomeAmigo, int idFerramenta, String data, int id, String NomeDaFerramenta) {
        this.nomeAmigo = nomeAmigo;
        this.idFerramenta = idFerramenta;
        this.data = data;
        this.id = id;
        this.NomeDaFerramenta = NomeDaFerramenta;
    }

    //Getters e Setters
    public String getNomeAmigo() {
        return nomeAmigo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
        public String getNomeDaFerramenta() {
        return NomeDaFerramenta;
    }

    public void setNomeDaFerramenta(String NomeDaFerramenta) {
        this.NomeDaFerramenta = NomeDaFerramenta;
    }

    public ArrayList<Emprestimo> getListaEmprestimo() {
        return EmprestimoDAO.getListaEmprestimo();
    }

    public boolean insertEmprestimoBD(String nomeAmigo, int idFerramenta, String data, String NomeDaFerramenta) {
        int id = this.maiorID() + 1;
        Emprestimo objeto = new Emprestimo(nomeAmigo, idFerramenta, data, id, NomeDaFerramenta);
        EmprestimoDAO.ListaEmprestimos.add(objeto);
        return true;
    }

    public boolean deleteEmprestimoBD(int id) {
        int indice = this.procuraIndice(id);
        if (indice >= 0) {
            EmprestimoDAO.ListaEmprestimos.remove(indice);
            return true;
        }
        return false;
    }

    private int procuraIndice(int id) {
        for (int i = 0; i < EmprestimoDAO.ListaEmprestimos.size(); i++) {
            if (EmprestimoDAO.ListaEmprestimos.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public Emprestimo carregaEmprestimo(int id) {
        int indice = this.procuraIndice(id);
        if (indice >= 0) {
            return EmprestimoDAO.ListaEmprestimos.get(indice);
        }
        return null;
    }

    public int maiorID() {
        return EmprestimoDAO.maiorID();
    }
}