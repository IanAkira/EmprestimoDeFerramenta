package dao;

import java.util.ArrayList;
import modelo.Emprestimo;

public class EmprestimoDAO {
    
    //Cria ArrayList dos Emprestimos
    public static ArrayList<Emprestimo> ListaEmprestimos = new ArrayList<>();

    //Métodos Getter e Setter da ArrayList de Emprestimos
    public static ArrayList<Emprestimo> getListaEmprestimo() {
        return ListaEmprestimos;
    }

    public static void setListaEmprestimo(ArrayList<Emprestimo> ListaAmigo) {
        EmprestimoDAO.ListaEmprestimos = ListaEmprestimos;
        
    }
}