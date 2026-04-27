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
}
