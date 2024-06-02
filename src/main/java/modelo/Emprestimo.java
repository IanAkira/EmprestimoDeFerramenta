package modelo;

/**
 * Classe que representa um empréstimo.
 */
public class Emprestimo {

    private int id;
    private String nomeAmigo;
    private String data;
    private String nomeDaFerramenta;
    private int idFerramenta;

    /**
     * Construtor padrão.
     */
    public Emprestimo() {
    }

    /**
     * Construtor para criar um objeto Emprestimo.
     */
    public Emprestimo(int id, String nomeAmigo, String data, String nomeDaFerramenta, int idFerramenta) {
        this.id = id;
        this.nomeAmigo = nomeAmigo;
        this.data = data;
        this.nomeDaFerramenta = nomeDaFerramenta;
        this.idFerramenta = idFerramenta;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeAmigo() {
        return nomeAmigo;
    }

    public void setNomeAmigo(String nomeAmigo) {
        this.nomeAmigo = nomeAmigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNomeDaFerramenta() {
        return nomeDaFerramenta;
    }

    public void setNomeDaFerramenta(String nomeDaFerramenta) {
        this.nomeDaFerramenta = nomeDaFerramenta;
    }

    public int getIdFerramenta() {
        return idFerramenta;
    }

    public void setIdFerramenta(int idFerramenta) {
        this.idFerramenta = idFerramenta;
    }
}
