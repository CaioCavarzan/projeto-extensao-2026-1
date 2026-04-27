package entities;

public class OrdemServico_StatusOs {
    OrdemServico os; //Atributo codigo fk da classe OrdemServico
    StatusOs status; //Atributo codigo fk da classe StatusOs
    private String dataHora;

    //VERIFICAR TIPAGEM DAS DATAS PORQUE OS ATRIBUTOS FORAM CRIADOS COM STRING
    //VERIFICAR SE ESSA CLASSE DE RELAÇÃO N PARA N ESTÁ CORRETA (nome e atributos)

    public OrdemServico_StatusOs(){
        os = new OrdemServico();
        status = new StatusOs();
        dataHora = new String();
    }

    public OrdemServico_StatusOs(OrdemServico os, StatusOs status, String dataHora){
        this.os = os;
        this.status = status;
        this.dataHora = dataHora;
    }

}
