package entities;

public class Usuario extends Pessoa {
    private String login;
    private String senha;

    public Usuario(){
        super();
        login = new String();
        senha = new String();
    }

    public Usuario(int codigo, String email, Cep cep, String logradouro, String numeroCasa, String telefone, String login, String senha){
        super(codigo, email, cep, logradouro, numeroCasa, telefone);
        this.login = login;
        this.senha = senha;
    }
}
