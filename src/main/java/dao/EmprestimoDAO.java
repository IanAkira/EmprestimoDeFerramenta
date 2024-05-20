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

    public static void setListaEmprestimo(ArrayList<Emprestimo> ListaEmprestimo) {
        EmprestimoDAO.ListaEmprestimos = ListaEmprestimo;
    }

    public static int maiorID() {
        int maiorID = 0;
        for (int i = 0; i < ListaEmprestimos.size(); i++) {
            if (ListaEmprestimos.get(i).getId() > maiorID) {
                maiorID = ListaEmprestimos.get(i).getId();
            }
        }
        return maiorID;
    }
}