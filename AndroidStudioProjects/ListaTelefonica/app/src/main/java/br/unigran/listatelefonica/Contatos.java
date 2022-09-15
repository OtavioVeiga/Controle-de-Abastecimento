package br.unigran.listatelefonica;

public class Contatos {
    private String nome;
    private Integer id;
    private String datanasc;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Contatos{" +
                "nome='" + nome + '\'' +
                ", id='" + id + '\'' +
                ", datanasc='" + datanasc + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
