package entities;

public class FuncionarioExecutor {
    private Producao producao; //Atributo código fk da classe Producao
    private Funcionario funcionario; //Atributo código fk da classe Funcionario
    private String funcao; 

    public FuncionarioExecutor(){
        producao = new Producao();
        funcionario = new Funcionario();
        funcao = new String();
    }

    public FuncionarioExecutor(Producao producao, Funcionario funcionario, String funcao){
        this.producao = producao;
        this.funcionario = funcionario;
        this.funcao = funcao;
    }

}
