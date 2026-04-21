package entities;

public class Funcionarios extends Pessoas{
    Cargos cargo; //atributo codigo fk da classe Cargos
    private float salario;

    public Funcionarios(){
        super();
        cargo = new Cargos();
        salario = 0;
    }

    public Funcionarios(int codigo, String email, Ceps cep, String logradouro, String numeroCasa, Cargos cargo, float salario){
        super(codigo, email, cep, logradouro, numeroCasa);
        this.cargo = cargo;
        this.salario = salario;
    }

}
