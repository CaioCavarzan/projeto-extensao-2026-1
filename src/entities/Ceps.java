package entities;

public class Ceps {
    private int numero;
    Cidades cidade; //atributo codigo fk da classe Cidades
    
    public Ceps(){
        numero = 0;
        cidade = new Cidades(); 
    }

    public Ceps(int numero, Cidades cidade){
        this.numero = numero;
        this.cidade = cidade; 
    }
}   
