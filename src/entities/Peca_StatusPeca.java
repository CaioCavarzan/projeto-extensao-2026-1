package entities;

public class Peca_StatusPeca {
    Peca peca; //Atributo codigo fk da classe Peca
    StatusPeca statusPeca; //Atributo codigo fk da classe StatusPeca
    private String dataHora;

    //VERIFICAR TIPAGEM DAS DATAS PORQUE OS ATRIBUTOS FORAM CRIADOS COM STRING
    //VERIFICAR SE ESSA CLASSE DE RELAÇÃO N PARA N ESTÁ CORRETA (nome e atributos)

    public Peca_StatusPeca(){
        peca = new Peca();
        statusPeca = new StatusPeca();
        dataHora = new String(); 
    }

    public Peca_StatusPeca(Peca peca, StatusPeca statusPeca, String dataHora){
        this.peca = peca;
        this.statusPeca = statusPeca;
        this.dataHora = dataHora; 
    }

}
