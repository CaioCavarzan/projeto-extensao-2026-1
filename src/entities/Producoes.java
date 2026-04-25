package entities;

public class Producoes {
    private int codigo;
    Cronogramas cronograma; //Atributo código fk da classe Cronogramas
    Pecas peca; //Atributo código fk da classe Pecas
    private String dataExecucao;
    private int qtdProduzida;
    private int qtdDefeito;
    private String observacao;

    //VERIFICAR TIPAGEM DAS DATAS PORQUE OS ATRIBUTOS FORAM CRIADOS COM STRING

    public Producoes(){
        codigo = 0;
        cronograma = new Cronogramas();
        peca = new Pecas();
        dataExecucao = new String();
        qtdProduzida = 0;
        qtdDefeito = 0;
        observacao = new String();
    }
    
    public Producoes(int codigo, Cronogramas cronograma, Pecas peca, String dataExecucao, int qtdProduzida, int qtdDefeito, String observacao){
        this.codigo = codigo;
        this.cronograma = cronograma;
        this.peca = peca;
        this.dataExecucao = dataExecucao;
        this.qtdProduzida = qtdProduzida;
        this.qtdDefeito = qtdDefeito;
        this.observacao = observacao;
    }

}
