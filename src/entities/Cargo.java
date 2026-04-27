package entities;

public class Cargo {
    private int codigo;
    private String nome;
    private String descricao;


    public Cargo(){
        codigo = 0;
        nome = new String();
        descricao = new String();
    }

    public Cargo(int codigo, String nome, String descricao){
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
    }
}
