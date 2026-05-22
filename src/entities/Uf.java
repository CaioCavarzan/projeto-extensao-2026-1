package entities;

public class Uf {
    private String sigla;
    private String nome;

    public Uf(){
        sigla = new String();
        nome = new String();
    }

    public Uf(String sigla, String nome){
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
