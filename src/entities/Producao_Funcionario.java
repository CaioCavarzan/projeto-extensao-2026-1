package entities;

public class Producao_Funcionario {
    Producao producao; //Atributo código fk da classe Producao
    Funcionario funcionario; //Atributo código fk da classe Funcionario
    private String funcao; 

    //VERIFICAR SE ESSA CLASSE DE RELAÇÃO N PARA N ESTÁ CORRETA (nome e atributos)

    public Producao_Funcionario(){
        producao = new Producao();
        funcionario = new Funcionario();
        funcao = new String();
    }

    public Producao_Funcionario(Producao producao, Funcionario funcionario, String funcao){
        this.producao = producao;
        this.funcionario = funcionario;
        this.funcao = funcao;
    }

}
