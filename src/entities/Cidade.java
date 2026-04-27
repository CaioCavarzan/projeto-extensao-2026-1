package entities;

public class Cidade {
    private String codigo;
    private String nome;
    Uf uf; //atributo codigo fk da classe Uf

    public Cidade(){
        codigo = new String();
        nome = new String();
        uf = new Uf();
    }

    public Cidade(String codigo, String nome, Uf uf){
        this.codigo = codigo;
        this.nome = nome;
        this.uf = uf;
    }

}
