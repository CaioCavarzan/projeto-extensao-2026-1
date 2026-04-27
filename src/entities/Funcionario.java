package entities;

public class Funcionario extends Pessoa{
    Cargo cargo; //atributo codigo fk da classe Cargo
    private float salario;

    public Funcionario(){
        super();
        cargo = new Cargo();
        salario = 0;
    }

    public Funcionario(int codigo, String email, Cep cep, String logradouro, String numeroCasa, Cargo cargo, float salario){
        super(codigo, email, cep, logradouro, numeroCasa);
        this.cargo = cargo;
        this.salario = salario;
    }

}
