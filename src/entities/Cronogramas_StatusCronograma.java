package entities;

public class Cronogramas_StatusCronograma {
    Cronogramas cronograma; //Atributo codigo fk da classe Cronogramas
    StatusCronogramas statusCronograma; //Atributo codigo fk da classe StatusCronogramas
    private String dataHora;
    private String observacao;

    //VERIFICAR TIPAGEM DAS DATAS PORQUE OS ATRIBUTOS FORAM CRIADOS COM STRING
    //VERIFICAR SE ESSA CLASSE DE RELAÇÃO N PARA N ESTÁ CORRETA (nome e atributos)
    
    public Cronogramas_StatusCronograma(){
        cronograma = new Cronogramas();
        statusCronograma = new StatusCronogramas();
        dataHora = new String();
    }

    public Cronogramas_StatusCronograma(Cronogramas cronograma, StatusCronogramas statusCronograma, String dataHora){
        this.cronograma = cronograma;
        this.statusCronograma = statusCronograma;
        this.dataHora = dataHora;
    }
}
