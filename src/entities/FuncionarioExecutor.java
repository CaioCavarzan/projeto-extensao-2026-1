package entities;

public class FuncionarioExecutor {
    private Producao producao; //Atributo código fk da classe Producao
    private Funcionario funcionario; //Atributo código fk da classe Funcionario

    public FuncionarioExecutor(){
        producao = new Producao();
        funcionario = new Funcionario();
    }

    public FuncionarioExecutor(Producao producao, Funcionario funcionario, String funcao){
        this.producao = producao;
        this.funcionario = funcionario;
    }

    public Producao getProducao() {
        return producao;
    }

    public void setProducao(Producao producao) {
        this.producao = producao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
