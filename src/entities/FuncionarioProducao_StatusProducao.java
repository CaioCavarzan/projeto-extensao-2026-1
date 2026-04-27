package entities;

public class FuncionarioProducao_StatusProducao {
    Producao producao; //Atributo codigo fk da classe Producao
    StatusProducao statusProducao; //Atributo codigo fk da classe StatusProducao
    private String dataHora;

    //VERIFICAR TIPAGEM DAS DATAS PORQUE OS ATRIBUTOS FORAM CRIADOS COM STRING
    //VERIFICAR SE ESSA CLASSE DE RELAÇÃO N PARA N ESTÁ CORRETA (nome e atributos)
    
    public FuncionarioProducao_StatusProducao(){
        producao = new Producao();
        statusProducao = new StatusProducao();
        dataHora = new String();
    }
    
    public FuncionarioProducao_StatusProducao(Producao producao, StatusProducao statusProducao, String dataHora){
        this.producao = producao;
        this.statusProducao = statusProducao;
        this.dataHora = dataHora;
    }

}
