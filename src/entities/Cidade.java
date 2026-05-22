package entities;

public class Cidade {
    private String codigo;
    private String nome;
    private Uf uf; //atributo codigo fk da classe Uf

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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Uf getUf() {
        return uf;
    }

    public void setUf(Uf uf) {
        this.uf = uf;
    }

}
