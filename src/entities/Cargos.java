package entities;

public class Cargos {
    private int codigo;
    private String nome;
    private String descricao;


    public Cargos(){
        codigo = 0;
        nome = new String();
        descricao = new String();
    }

    public Cargos(int codigo, String nome, String descricao){
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
    }
}
