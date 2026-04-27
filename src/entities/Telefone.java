package entities;

public class Telefone {
    private String numero;
    Pessoa pessoa; //atributo código da classe Pessoa;
    
    public Telefone(){
        numero = new String();
        pessoa = new Pessoa();
    }
    
    public Telefone(String numero, Pessoa pessoa){
        this.numero = numero;
        this.pessoa = pessoa;
    }

}
