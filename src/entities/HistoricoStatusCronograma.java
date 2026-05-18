package entities;

import java.time.LocalDateTime;

public class HistoricoStatusCronograma {
    private Cronograma cronograma; //Atributo codigo fk da classe Cronograma
    private StatusCronograma statusCronograma; //Atributo codigo fk da classe StatusCronograma
    private LocalDateTime dataHora;
    private String observacao;
    
    public HistoricoStatusCronograma(){
        cronograma = new Cronograma();
        statusCronograma = new StatusCronograma();
        dataHora = LocalDateTime.now();
        observacao = new String();
    }

    public HistoricoStatusCronograma(Cronograma cronograma, StatusCronograma statusCronograma, LocalDateTime dataHora, String observacao){
        this.cronograma = cronograma;
        this.statusCronograma = statusCronograma;
        this.dataHora = dataHora;
        this.observacao = observacao;
    }
}
