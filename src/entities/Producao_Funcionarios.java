package entities;

public class Producao_Funcionarios {
    Producoes producao; //Atributo código fk da classe Producoes
    Funcionarios funcionario; //Atributo código fk da classe Funcionarios
    private String funcao; 

    //VERIFICAR SE ESSA CLASSE DE RELAÇÃO N PARA N ESTÁ CORRETA (nome e atributos)

    public Producao_Funcionarios(){
        producao = new Producoes();
        funcionario = new Funcionarios();
        funcao = new String();
    }

    public Producao_Funcionarios(Producoes producao, Funcionarios funcionario, String funcao){
        this.producao = producao;
        this.funcionario = funcionario;
        this.funcao = funcao;
    }

}
