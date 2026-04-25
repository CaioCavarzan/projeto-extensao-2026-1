package entities;

import java.util.ArrayList;

public class Pecas {
    private int codigo;
    OrdensServico os; //atributo codigo fk da classe Os;
    Tintas tinta; //atributo codigo fk da classe Tintas;
    ArrayList<TiposServico> servicos; //atributo codigo fk da classe Servicos;
    Funcionarios funcionarioCadastrou; //atributo codigo fk da classe Funcionarios;
    private String descricaoPeca;
    private int qtdTotal;
    private String dataEntrada;
    private String urgencia;
    private String prazoEntrega;
    private float valorItem;
    private String dataFinalizacao;
    private String numeroOse;
    private float scorePrioridade;
    private String ultimaAlteracao;
    Funcionarios funcionarioAlterou; //atributo codigo fk da classe Funcionarios;
    ArrayList<Pecas_StatusPecas> historico;
    ArrayList<Fotos> fotos;
    Producoes producao;
    //VERIFICAR TIPAGEM DAS DATAS PORQUE OS ATRIBUTOS FORAM CRIADOS COM STRING

    public Pecas(){
        codigo = 0;
        os = new OrdensServico();
        tinta = new Tintas();
        servico = new TiposServico();
        funcionarioCadastrou = new Funcionarios();
        descricaoPeca = new String();
        qtdTotal = 0;
        dataEntrada = new String();
        urgencia = new String();
        prazoEntrega = new String();
        valorItem = 0;
        dataFinalizacao = new String();
        numeroOse = new String();
        scorePrioridade = 0;
        ultimaAlteracao = new String();
        funcionarioAlterou = new Funcionarios();
    }

    public Pecas(int codigo, OrdensServico os, Tintas tinta, TiposServico servico, Funcionarios funcionarioCadastrou, String descricaoPeca, int qtdTotal, String dataEntrada, String urgencia, String prazoEntrega, float valorItem, String dataFinalizacao, String numeroOse, float scorePrioridade, String ultimaAlteracao, Funcionarios funcionarioAlterou){
        this.codigo = codigo;
        this.os = os;
        this.tinta = tinta;
        this.servico = servico;
        this.funcionarioCadastrou = funcionarioCadastrou;
        this.descricaoPeca = descricaoPeca;
        this.qtdTotal = qtdTotal;
        this.dataEntrada =dataEntrada;
        this.urgencia =urgencia;
        this.prazoEntrega =prazoEntrega;
        this.valorItem = valorItem;
        this.dataFinalizacao =dataFinalizacao;
        this.numeroOse =numeroOse;
        this.scorePrioridade = scorePrioridade;
        this.ultimaAlteracao = ultimaAlteracao;
        this.funcionarioAlterou = funcionarioAlterou;
    }

}
