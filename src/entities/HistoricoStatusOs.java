package entities;

public class HistoricoStatusOs {
    private OrdemServico os; //Atributo codigo fk da classe OrdemServico
    private StatusOs status; //Atributo codigo fk da classe StatusOs
    private String dataHora;

    //VERIFICAR TIPAGEM DAS DATAS PORQUE OS ATRIBUTOS FORAM CRIADOS COM STRING

    public HistoricoStatusOs(){
        os = new OrdemServico();
        status = new StatusOs();
        dataHora = new String();
    }

    public HistoricoStatusOs(OrdemServico os, StatusOs status, String dataHora){
        this.os = os;
        this.status = status;
        this.dataHora = dataHora;
    }

}
