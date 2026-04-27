package entities;

import java.util.ArrayList;

public class Producao {
    private int codigo;
    private Cronograma cronograma; //Atributo código fk da classe Cronograma
    private Peca peca; //Atributo código fk da classe Peca
    private String dataExecucao;
    private int qtdProduzida;
    private int qtdDefeito;
    private String observacao;
    private ArrayList<HistoricoStatusProducao> historico;

    //VERIFICAR TIPAGEM DAS DATAS PORQUE OS ATRIBUTOS FORAM CRIADOS COM STRING

    public Producao(){
        codigo = 0;
        cronograma = new Cronograma();
        peca = new Peca();
        dataExecucao = new String();
        qtdProduzida = 0;
        qtdDefeito = 0;
        observacao = new String();
        historico = new ArrayList<>();
    }
    
    public Producao(int codigo, Cronograma cronograma, Peca peca, String dataExecucao, int qtdProduzida, int qtdDefeito, String observacao, ArrayList<HistoricoStatusProducao> historico){
        this.codigo = codigo;
        this.cronograma = cronograma;
        this.peca = peca;
        this.dataExecucao = dataExecucao;
        this.qtdProduzida = qtdProduzida;
        this.qtdDefeito = qtdDefeito;
        this.observacao = observacao;
        this.historico = historico;
    }

}
