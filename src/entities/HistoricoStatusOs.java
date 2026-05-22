package entities;

import java.time.LocalDateTime;

public class HistoricoStatusOs {
    private OrdemServico os; //Atributo codigo fk da classe OrdemServico
    private StatusOs status; //Atributo codigo fk da classe StatusOs
    private LocalDateTime dataHora;

    public HistoricoStatusOs(){
        os = new OrdemServico();
        status = new StatusOs();
        dataHora = LocalDateTime.now();
    }

    public HistoricoStatusOs(OrdemServico os, StatusOs status, LocalDateTime dataHora){
        this.os = os;
        this.status = status;
        this.dataHora = dataHora;
    }

    public OrdemServico getOs() {
        return os;
    }

    public void setOs(OrdemServico os) {
        this.os = os;
    }

    public StatusOs getStatus() {
        return status;
    }

    public void setStatus(StatusOs status) {
        this.status = status;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
