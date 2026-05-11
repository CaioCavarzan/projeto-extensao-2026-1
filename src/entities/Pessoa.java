package entities;

public class Pessoa {
    private int codigo;
    private String email;
    private Cep cep; //atributo codigo fk da classe Cep
    private String logradouro;
    private String numeroCasa;
    private String telefone;

    public Pessoa(){
        codigo = 0;
        email = new String();
        cep = new Cep();
        logradouro = new String();
        numeroCasa = new String();
        telefone = new String();
    }

        public Pessoa(int codigo, String email, Cep cep, String logradouro, String numeroCasa, String telefone){
        this.codigo = codigo;
        this.email = email;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numeroCasa = numeroCasa;
        this.telefone = telefone;
    }
}