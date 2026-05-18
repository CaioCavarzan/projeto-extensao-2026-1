package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Peca {
    private int codigo;
    private OrdemServico os; //atributo codigo fk da classe Os;
    private Tinta tinta; //atributo codigo fk da classe Tinta;
    private ArrayList<TipoServico> servicos; 
    private Usuario usuarioCadastrou; //atributo codigo fk da classe Usuario; (ISSO JÁ NÃO É HERDADO DA OS?)
    private String descricaoPeca;
    private int qtdTotal;
    private LocalDateTime dataEntrada;
    private String urgencia;
    private String prazoEntrega;
    private float valorItem;
    private LocalDate dataFinalizacao;
    private String numeroOse;
    private float scorePrioridade;
    private LocalDateTime ultimaAlteracao;
    private Usuario usuarioAlterou; //atributo codigo fk da classe Usuario; (ISSO JÁ NÃO É HERDADO DA OS?)
    private ArrayList<HistoricoStatusPeca> historico;
    private ArrayList<Foto> fotos;
    //private Producao producao; CONFERIR DEPOIS COM MAIS CALMA

    public Peca(){
        codigo = 0;
        os = new OrdemServico();
        tinta = new Tinta();
        servicos = new ArrayList<>();
        usuarioCadastrou = new Usuario();
        descricaoPeca = new String();
        qtdTotal = 0;
        dataEntrada = LocalDateTime.now();
        urgencia = new String();
        prazoEntrega = new String();
        valorItem = 0;
        dataFinalizacao = LocalDate.now();
        numeroOse = new String();
        scorePrioridade = 0;
        ultimaAlteracao = LocalDateTime.now();
        usuarioAlterou = new Usuario();
        historico = new ArrayList<>();
        fotos = new ArrayList<>();
    }

    public Peca(int codigo, OrdemServico os, Tinta tinta, ArrayList<TipoServico> servicos, Usuario usuarioCadastrou, String descricaoPeca, int qtdTotal, LocalDateTime dataEntrada, String urgencia, String prazoEntrega, float valorItem, LocalDate dataFinalizacao, String numeroOse, float scorePrioridade, LocalDateTime ultimaAlteracao, Usuario usuarioAlterou, ArrayList<HistoricoStatusPeca> historico, ArrayList<Foto> fotos){
        this.codigo = codigo;
        this.os = os;
        this.tinta = tinta;
        this.servicos = servicos;
        this.usuarioCadastrou = usuarioCadastrou;
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
        this.usuarioAlterou = usuarioAlterou;
        this.historico = historico;
        this.fotos = fotos;
    }

}
