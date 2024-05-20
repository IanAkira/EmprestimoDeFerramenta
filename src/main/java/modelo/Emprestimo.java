package modelo;

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
}