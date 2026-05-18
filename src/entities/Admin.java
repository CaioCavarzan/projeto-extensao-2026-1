package entities;

public class Admin extends Usuario {
    private String cargo;

    public Admin(){
        super();
        cargo = new String();
    }

    public Admin(int codigo, String email, Cep cep, String logradouro, String numeroCasa, String telefone, String login, String senha, String cargo){
        super(codigo, email, cep, logradouro, numeroCasa, telefone, login, senha);
        this.cargo = cargo;
    }
}
