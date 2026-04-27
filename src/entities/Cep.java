package entities;

public class Cep{
    private int numero;
    Cidade cidade; //atributo codigo fk da classe Cidade
    
    public Cep(){
        numero = 0;
        cidade = new Cidade(); 
    }

    public Cep(int numero, Cidade cidade){
        this.numero = numero;
        this.cidade = cidade; 
    }
}   
