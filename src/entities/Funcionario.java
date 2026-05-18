package entities;

public class Funcionario extends Usuario{
    private String cargo; 
    private float salario;

    public Funcionario(){
        super();
        cargo = new String();
        salario = 0;
    }

    public Funcionario(int codigo, String email, Cep cep, String logradouro, String numeroCasa, String telefone, String login, String senha, String cargo, float salario){
        super(codigo, email, cep, logradouro, numeroCasa, telefone, login, senha);
        this.cargo = cargo;
        this.salario = salario;
    }

}
