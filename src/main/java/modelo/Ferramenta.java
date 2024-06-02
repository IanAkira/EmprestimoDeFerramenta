package modelo;

/**
 * Classe que representa uma ferramenta.
 */
public class Ferramenta {

    // Atributos da Ferramenta
    private int Id;
    private String Nome;
    private String Marca;
    private int Valor;

    // Construtores
    public Ferramenta() {
        this(0, "", "", 0);
    }

    /**
     * Construtor para criar uma nova Ferramenta.
     */
    public Ferramenta(int Id, String Nome, String Marca, int Valor) {
        this.Id = Id;
        this.Nome = Nome;
        this.Marca = Marca;
        this.Valor = Valor;
    }

    // Getters and Setters
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }
}
