package entities;

import java.util.ArrayList;

public class Peca {
    private int codigo;
    OrdemServico os; //atributo codigo fk da classe Os;
    Tinta tinta; //atributo codigo fk da classe Tinta;
    ArrayList<TipoServico> servicos; 
    Funcionario funcionarioCadastrou; //atributo codigo fk da classe Funcionario;
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
    Funcionario funcionarioAlterou; //atributo codigo fk da classe Funcionario;
    ArrayList<Peca_StatusPeca> historico;
    ArrayList<Foto> Foto;
    Producao producao;
    //VERIFICAR TIPAGEM DAS DATAS PORQUE OS ATRIBUTOS FORAM CRIADOS COM STRING

    public Peca(){
        codigo = 0;
        os = new OrdemServico();
        tinta = new Tinta();
        servicos = new ArrayList<>();
        funcionarioCadastrou = new Funcionario();
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
        funcionarioAlterou = new Funcionario();
    }

    public Peca(int codigo, OrdemServico os, Tinta tinta, ArrayList<TipoServico> servicos, Funcionario funcionarioCadastrou, String descricaoPeca, int qtdTotal, String dataEntrada, String urgencia, String prazoEntrega, float valorItem, String dataFinalizacao, String numeroOse, float scorePrioridade, String ultimaAlteracao, Funcionario funcionarioAlterou){
        this.codigo = codigo;
        this.os = os;
        this.tinta = tinta;
        this.servicos = servicos;
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
