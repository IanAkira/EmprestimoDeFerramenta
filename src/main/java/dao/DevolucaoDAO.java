
package dao;

import java.util.ArrayList;
import modelo.Devolucao;

public class DevolucaoDAO {
    
      //Cria ArrayList da Devolução
    public static ArrayList<Devolucao> ListaDevolução = new ArrayList<>();

    //Métodos Getter e Setter da ArrayList de Devolução
    public static ArrayList<Devolucao> getListaDevolução() {
        return ListaDevolução;
    }

    public static void setListaDevolução(ArrayList<Devolucao> ListaDevolução) {
        DevolucaoDAO.ListaDevolução = ListaDevolução;
    }

    public static int maiorID() {
        int maiorID = 0;
        for (int i = 0; i < ListaDevolução.size(); i++) {
            if (ListaDevolução.get(i).getId() > maiorID) {
                maiorID = ListaDevolução.get(i).getId();
            }
        }
        return maiorID;
    }
}
    

