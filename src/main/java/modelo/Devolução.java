package modelo;

import dao.DevoluçãoDAO;
import java.util.ArrayList;

public class Devolução {

    //Atributos de Devolução
    private String nomeAmigo;
    private int idFerramenta;
    private String data;
    private int id;
    private String NomeDaFerrmentaD;
    //Construtores
    public Devolução() {
        this.nomeAmigo = "";
        this.idFerramenta = 0;
        this.data = "";
        this.id = 0;
        this.NomeDaFerrmentaD = "";
    }

    public Devolução(String nomeAmigo, int idFerramenta, String data, int id,String NomeDaFerrmentaD) {
        this.nomeAmigo = nomeAmigo;
        this.idFerramenta = idFerramenta;
        this.data = data;
        this.id = id;
        this.NomeDaFerrmentaD = NomeDaFerrmentaD;
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
        public String getNomeDaFerrmentaD() {
        return NomeDaFerrmentaD;
    }

    public void setNomeDaFerrmentaD(String NomeDaFerrmentaD) {
        this.NomeDaFerrmentaD = NomeDaFerrmentaD;
    }

    public ArrayList<Devolução> getListaDevolução() {
        return DevoluçãoDAO.getListaDevolução();
    }

    public boolean insertDevoluçãoBD(String nomeAmigo, int idFerramenta, String data,String NomeDaFerrmentaD) {
        int id = this.maiorID() + 1;
        Devolução objeto = new Devolução(nomeAmigo, idFerramenta, data, id,NomeDaFerrmentaD);
        DevoluçãoDAO.ListaDevolução.add(objeto);
        return true;
    }

    public boolean deleteDevoluçãoBD(int id) {
        int indice = this.procuraIndice(id);
        if (indice >= 0) {
            DevoluçãoDAO.ListaDevolução.remove(indice);
            return true;
        }
        return false;
    }

    private int procuraIndice(int id) {
        for (int i = 0; i < DevoluçãoDAO.ListaDevolução.size(); i++) {
            if (DevoluçãoDAO.ListaDevolução.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public Devolução carregaDevolução(int id) {
        int indice = this.procuraIndice(id);
        if (indice >= 0) {
            return DevoluçãoDAO.ListaDevolução.get(indice);
        }
        return null;
    }

    public int maiorID() {
        return DevoluçãoDAO.maiorID();
    }
}
