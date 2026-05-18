package entities;

import java.time.LocalDateTime;

public class HistoricoStatusPeca {
    private Peca peca; //Atributo codigo fk da classe Peca
    private StatusPeca statusPeca; //Atributo codigo fk da classe StatusPeca
    private LocalDateTime dataHora;

    public HistoricoStatusPeca(){
        peca = new Peca();
        statusPeca = new StatusPeca();
        dataHora = LocalDateTime.now(); 
    }

    public HistoricoStatusPeca(Peca peca, StatusPeca statusPeca, LocalDateTime dataHora){
        this.peca = peca;
        this.statusPeca = statusPeca;
        this.dataHora = dataHora; 
    }

}
