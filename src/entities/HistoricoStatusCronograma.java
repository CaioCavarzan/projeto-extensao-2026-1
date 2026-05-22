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

    public Cronograma getCronograma() {
        return cronograma;
    }

    public void setCronograma(Cronograma cronograma) {
        this.cronograma = cronograma;
    }

    public StatusCronograma getStatusCronograma() {
        return statusCronograma;
    }

    public void setStatusCronograma(StatusCronograma statusCronograma) {
        this.statusCronograma = statusCronograma;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
