package modelo;

import dao.EmprestimoDAO;
import java.util.ArrayList;

public class Emprestimo {

    //Atributos do Emprestimo
    private String nomeAmigo;
    private int idFerramenta;
    private String Data;
    
    //Construtores
    public Emprestimo (){
        this ("",0,"");
    }

    public Emprestimo(String nomeAmigo, int idFerramenta, String Data) {
        this.nomeAmigo = nomeAmigo;
        this.idFerramenta = idFerramenta;
        this.Data = Data;
    }

    //Getters e Setters
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
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }
    
      public ArrayList<Emprestimo> getListaEmprestimo() {
        return EmprestimoDAO.getListaEmprestimo();
    }
      
         public boolean insertEmprestimoBD(String nomeAmigo, int idFerramenta, String data) {
        Emprestimo objeto = new Emprestimo(nomeAmigo, idFerramenta, data);
        EmprestimoDAO.ListaEmprestimos.add(objeto);
        return true;
    } 
      
      
}