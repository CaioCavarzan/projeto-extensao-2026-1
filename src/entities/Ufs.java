package entities;

public class Ufs {
    private String sigla;
    private String nome;

    public Ufs(){
        sigla = new String();
        nome = new String();
    }

    public Ufs(String sigla, String nome){
        this.sigla = sigla;
        this.nome = nome;
    }
}
