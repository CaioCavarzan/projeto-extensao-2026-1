package entities;

public class Cronograma_StatusCronograma {
    Cronograma cronograma; //Atributo codigo fk da classe Cronograma
    StatusCronograma statusCronograma; //Atributo codigo fk da classe StatusCronograma
    private String dataHora;
    private String observacao;

    //VERIFICAR TIPAGEM DAS DATAS PORQUE OS ATRIBUTOS FORAM CRIADOS COM STRING
    //VERIFICAR SE ESSA CLASSE DE RELAÇÃO N PARA N ESTÁ CORRETA (nome e atributos)
    
    public Cronograma_StatusCronograma(){
        cronograma = new Cronograma();
        statusCronograma = new StatusCronograma();
        dataHora = new String();
    }

    public Cronograma_StatusCronograma(Cronograma cronograma, StatusCronograma statusCronograma, String dataHora){
        this.cronograma = cronograma;
        this.statusCronograma = statusCronograma;
        this.dataHora = dataHora;
    }
}
