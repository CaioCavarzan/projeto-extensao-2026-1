package entities;

public class Pecas {
    private int codigo;
    OrdensServico os; //atributo codigo fk da classe Os;
    Tintas tinta; //atributo codigo fk da classe Tintas;
    TiposServico servico; //atributo codigo fk da classe Servicos;
    Funcionarios funcionario; //atributo codigo fk da classe Funcionarios;
    private String descricaoPeca;
    private int qtdTotal;
    private String dataEntrada;
    private String urgencia;
    private String prazoEntrega;
    private String dataLimite;
    private float valorItem;
    private String dataFinalizacao;
    private String numeroOse;
    private float scorePrioridade;
    
    //VERIFICAR TIPAGEM DAS DATAS PORQUE OS ATRIBUTOS FORAM CRIADOS COM STRING

    public Pecas(){
        codigo = 0;
        os = new OrdensServico();
        tinta = new Tintas();
        servico = new TiposServico();
        funcionario = new Funcionarios();
        descricaoPeca = new String();
        qtdTotal = 0;
        dataEntrada = new String();
        urgencia = new String();
        prazoEntrega = new String();
        dataLimite = new String();
        valorItem = 0;
        dataFinalizacao = new String();
        numeroOse = new String();
        scorePrioridade = 0;
    }

    public Pecas(int codigo, OrdensServico os, Tintas tinta, TiposServico servico, Funcionarios funcionario, String descricaoPeca, int qtdTotal, String dataEntrada, String urgencia, String prazoEntrega, String dataLimite, float valorItem, String dataFinalizacao, String numeroOse, float scorePrioridade){
        this.codigo = codigo;
        this.os = os;
        this.tinta = tinta;
        this.servico = servico;
        this.funcionario = funcionario;
        this.descricaoPeca = descricaoPeca;
        this.qtdTotal = qtdTotal;
        this.dataEntrada =dataEntrada;
        this.urgencia =urgencia;
        this.prazoEntrega =prazoEntrega;
        this.dataLimite =dataLimite;
        this.valorItem = valorItem;
        this.dataFinalizacao =dataFinalizacao;
        this.numeroOse =numeroOse;
        this.scorePrioridade = scorePrioridade;
    }

}
