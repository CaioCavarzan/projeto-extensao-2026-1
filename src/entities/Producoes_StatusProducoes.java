package entities;

public class Producoes_StatusProducoes {
    Producoes producao; //Atributo codigo fk da classe Producoes
    StatusProducoes statusProducao; //Atributo codigo fk da classe StatusProducoes
    private String dataHora;

    //VERIFICAR TIPAGEM DAS DATAS PORQUE OS ATRIBUTOS FORAM CRIADOS COM STRING
    //VERIFICAR SE ESSA CLASSE DE RELAÇÃO N PARA N ESTÁ CORRETA (nome e atributos)
    
    public Producoes_StatusProducoes(){
        producao = new Producoes();
        statusProducao = new StatusProducoes();
        dataHora = new String();
    }
    
    public Producoes_StatusProducoes(Producoes producao, StatusProducoes statusProducao, String dataHora){
        this.producao = producao;
        this.statusProducao = statusProducao;
        this.dataHora = dataHora;
    }

}
