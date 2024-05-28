package modelo;

public class Devolucao {

    //Atributos de Devolução
    private String nomeAmigo;
    private int idFerramenta;
    private String data;
    private int id;
    private String NomeDaFerramenta;

    //Construtores
    public Devolucao() {
        this.nomeAmigo = "";
        this.idFerramenta = 0;
        this.data = "";
        this.id = 0;
        this.NomeDaFerramenta = "";
    }

    public Devolucao(String nomeAmigo, int idFerramenta, String data, int id, String NomeDaFerrmentaD) {
        this.nomeAmigo = nomeAmigo;
        this.idFerramenta = idFerramenta;
        this.data = data;
        this.id = id;
        this.NomeDaFerramenta = NomeDaFerrmentaD;
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

}
