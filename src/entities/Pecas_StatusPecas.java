package entities;

public class Pecas_StatusPecas {
    Pecas peca; //Atributo codigo fk da classe Pecas
    StatusPecas statusPeca; //Atributo codigo fk da classe StatusPecas
    private String dataHora;

    //VERIFICAR TIPAGEM DAS DATAS PORQUE OS ATRIBUTOS FORAM CRIADOS COM STRING
    //VERIFICAR SE ESSA CLASSE DE RELAÇÃO N PARA N ESTÁ CORRETA (nome e atributos)

    public Pecas_StatusPecas(){
        peca = new Pecas();
        statusPeca = new StatusPecas();
        dataHora = new String(); 
    }

    public Pecas_StatusPecas(Pecas peca, StatusPecas statusPeca, String dataHora){
        this.peca = peca;
        this.statusPeca = statusPeca;
        this.dataHora = dataHora; 
    }

}
