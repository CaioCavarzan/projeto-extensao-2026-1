package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Producao {
    private int codigo;
    private Cronograma cronograma; //Atributo código fk da classe Cronograma (VERIFICAR ESSE ATRIBUTO PORQUE NO DER CONSTA QUE É 1:1)
    private Peca peca; //Atributo código fk da classe Peca (VERIFICAR ESSE ATRIBUTO PORQUE NO DER NÃO CONSTA MAIS CONEXÃO DESSA ENTIDADE COM 'PECA')
    private LocalDateTime dataExecucao;
    private int qtdProduzida;
    private int qtdDefeito;
    private String observacao;

    public Producao(){
        codigo = 0;
        cronograma = new Cronograma();
        peca = new Peca();
        dataExecucao = LocalDateTime.now();
        qtdProduzida = 0;
        qtdDefeito = 0;
        observacao = new String();
    }
    
    public Producao(int codigo, Cronograma cronograma, Peca peca, LocalDateTime dataExecucao, int qtdProduzida, int qtdDefeito, String observacao){
        this.codigo = codigo;
        this.cronograma = cronograma;
        this.peca = peca;
        this.dataExecucao = dataExecucao;
        this.qtdProduzida = qtdProduzida;
        this.qtdDefeito = qtdDefeito;
        this.observacao = observacao;
    }

}
