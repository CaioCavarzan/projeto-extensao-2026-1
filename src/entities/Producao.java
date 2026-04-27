package entities;

public class Producao {
    private int codigo;
    Cronograma cronograma; //Atributo código fk da classe Cronograma
    Peca peca; //Atributo código fk da classe Peca
    private String dataExecucao;
    private int qtdProduzida;
    private int qtdDefeito;
    private String observacao;

    //VERIFICAR TIPAGEM DAS DATAS PORQUE OS ATRIBUTOS FORAM CRIADOS COM STRING

    public Producao(){
        codigo = 0;
        cronograma = new Cronograma();
        peca = new Peca();
        dataExecucao = new String();
        qtdProduzida = 0;
        qtdDefeito = 0;
        observacao = new String();
    }
    
    public Producao(int codigo, Cronograma cronograma, Peca peca, String dataExecucao, int qtdProduzida, int qtdDefeito, String observacao){
        this.codigo = codigo;
        this.cronograma = cronograma;
        this.peca = peca;
        this.dataExecucao = dataExecucao;
        this.qtdProduzida = qtdProduzida;
        this.qtdDefeito = qtdDefeito;
        this.observacao = observacao;
    }

}
