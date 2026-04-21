package entities;

public class Cidades {
    private String codigo;
    private String nome;
    Ufs uf; //atributo codigo fk da classe Uf

    public Cidades(){
        codigo = new String();
        nome = new String();
        uf = new Ufs();
    }

    public Cidades(String codigo, String nome, Ufs uf){
        this.codigo = codigo;
        this.nome = nome;
        this.uf = uf;
    }

}
