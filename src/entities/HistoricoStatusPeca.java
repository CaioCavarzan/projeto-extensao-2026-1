package entities;

public class HistoricoStatusPeca {
    private Peca peca; //Atributo codigo fk da classe Peca
    private StatusPeca statusPeca; //Atributo codigo fk da classe StatusPeca
    private String dataHora;

    //VERIFICAR TIPAGEM DAS DATAS PORQUE OS ATRIBUTOS FORAM CRIADOS COM STRING

    public HistoricoStatusPeca(){
        peca = new Peca();
        statusPeca = new StatusPeca();
        dataHora = new String(); 
    }

    public HistoricoStatusPeca(Peca peca, StatusPeca statusPeca, String dataHora){
        this.peca = peca;
        this.statusPeca = statusPeca;
        this.dataHora = dataHora; 
    }

}
