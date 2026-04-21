package entities;

public class Telefones {
    private String numero;
    Pessoas pessoa; //atributo código da classe Pessoas;
    
    public Telefones(){
        numero = new String();
        pessoa = new Pessoas();
    }
    
    public Telefones(String numero, Pessoas pessoa){
        this.numero = numero;
        this.pessoa = pessoa;
    }

}
