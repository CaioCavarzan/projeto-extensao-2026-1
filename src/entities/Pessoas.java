package entities;

public class Pessoas {
    private int codigo;
    private String email;
    Ceps cep; //atributo codigo fk da classe Ceps
    private String logradouro;
    private String numeroCasa;

    public Pessoas(){
        codigo = 0;
        email = new String();
        cep = new Ceps();
        logradouro = new String();
        numeroCasa = new String();
    }

        public Pessoas(int codigo, String email, Ceps cep, String logradouro, String numeroCasa){
        codigo = 0;
        email = new String();
        cep = new Ceps();
        logradouro = new String();
        numeroCasa = new String();
    }
}
