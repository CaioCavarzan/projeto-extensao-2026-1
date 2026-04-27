package entities;

public class HistoricoStatusCronograma {
    private Cronograma cronograma; //Atributo codigo fk da classe Cronograma
    private StatusCronograma statusCronograma; //Atributo codigo fk da classe StatusCronograma
    private String dataHora;
    private String observacao;

    //VERIFICAR TIPAGEM DAS DATAS PORQUE OS ATRIBUTOS FORAM CRIADOS COM STRING
    
    public HistoricoStatusCronograma(){
        cronograma = new Cronograma();
        statusCronograma = new StatusCronograma();
        dataHora = new String();
        observacao = new String();
    }

    public HistoricoStatusCronograma(Cronograma cronograma, StatusCronograma statusCronograma, String dataHora, String observacao){
        this.cronograma = cronograma;
        this.statusCronograma = statusCronograma;
        this.dataHora = dataHora;
        this.observacao = observacao;
    }
}
