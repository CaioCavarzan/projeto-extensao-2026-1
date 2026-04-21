package entities;

public class OrdensServico_StatusOs {
    OrdensServico os; //Atributo codigo fk da classe OrdensServico
    StatusOs status; //Atributo codigo fk da classe StatusOs
    private String dataHora;

    //VERIFICAR TIPAGEM DAS DATAS PORQUE OS ATRIBUTOS FORAM CRIADOS COM STRING
    //VERIFICAR SE ESSA CLASSE DE RELAÇÃO N PARA N ESTÁ CORRETA (nome e atributos)

    public OrdensServico_StatusOs(){
        os = new OrdensServico();
        status = new StatusOs();
        dataHora = new String();
    }

    public OrdensServico_StatusOs(OrdensServico os, StatusOs status, String dataHora){
        this.os = os;
        this.status = status;
        this.dataHora = dataHora;
    }

}
