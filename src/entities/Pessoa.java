package entities;

public class Pessoa {
    private int codigo;
    private String email;
    private Cep cep; //atributo codigo fk da classe Cep
    private String logradouro;
    private String numeroCasa;

    public Pessoa(){
        codigo = 0;
        email = new String();
        cep = new Cep();
        logradouro = new String();
        numeroCasa = new String();
    }

        public Pessoa(int codigo, String email, Cep cep, String logradouro, String numeroCasa){
        codigo = 0;
        email = new String();
        cep = new Cep();
        logradouro = new String();
        numeroCasa = new String();
    }
}
