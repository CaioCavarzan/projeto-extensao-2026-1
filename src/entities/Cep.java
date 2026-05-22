package entities;

public class Cep{
    private int numero;
    private Cidade cidade; //atributo codigo fk da classe Cidade
    
    public Cep(){
        numero = 0;
        cidade = new Cidade(); 
    }

    public Cep(int numero, Cidade cidade){
        this.numero = numero;
        this.cidade = cidade; 
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

}   
