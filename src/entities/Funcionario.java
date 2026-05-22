package entities;

public class Funcionario extends Pessoa{
    private String cargo; 
    private float salario;

    public Funcionario(){
        super();
        cargo = new String();
        salario = 0;
    }

    public Funcionario(int codigo, String email, Cep cep, String logradouro, String numeroCasa, String telefone, String login, String senha, String cargo, float salario){
        super(codigo, email, cep, logradouro, numeroCasa, telefone);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
