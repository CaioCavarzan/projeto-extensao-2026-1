package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Peca {
    private int codigo;
    private OrdemServico os; //atributo codigo fk da classe Os;
    private Tinta tinta; //atributo codigo fk da classe Tinta;
    private ArrayList<TipoServico> servicos;
    private String descricaoPeca;
    private int qtdTotal;
    private LocalDateTime dataEntrada;
    private String urgencia;
    private String prazoEntrega;
    private float valorTotalPeca;
    private LocalDate dataFinalizacao;
    private String numeroOse;
    private float scorePrioridade;
    private LocalDateTime ultimaAlteracao;
    private ArrayList<HistoricoStatusPeca> historico;
    private ArrayList<Foto> fotos;

    //Verificar se iremos remover os atributos de 'usuario' daqui

    public Peca(){
        codigo = 0;
        os = new OrdemServico();
        tinta = new Tinta();
        servicos = new ArrayList<>();
        descricaoPeca = new String();
        qtdTotal = 0;
        dataEntrada = LocalDateTime.now();
        urgencia = new String();
        prazoEntrega = new String();
        valorTotalPeca = 0;
        dataFinalizacao = LocalDate.now();
        numeroOse = new String();
        scorePrioridade = 0;
        ultimaAlteracao = LocalDateTime.now();
        historico = new ArrayList<>();
        fotos = new ArrayList<>();
    }

    public Peca(int codigo, OrdemServico os, Tinta tinta, ArrayList<TipoServico> servicos, String descricaoPeca, int qtdTotal, LocalDateTime dataEntrada, String urgencia, String prazoEntrega, float valorTotalPeca, LocalDate dataFinalizacao, String numeroOse, float scorePrioridade, LocalDateTime ultimaAlteracao, ArrayList<HistoricoStatusPeca> historico, ArrayList<Foto> fotos){
        this.codigo = codigo;
        this.os = os;
        this.tinta = tinta;
        this.servicos = servicos;
        this.descricaoPeca = descricaoPeca;
        this.qtdTotal = qtdTotal;
        this.dataEntrada =dataEntrada;
        this.urgencia =urgencia;
        this.prazoEntrega =prazoEntrega;
        this.valorTotalPeca = valorTotalPeca;
        this.dataFinalizacao =dataFinalizacao;
        this.numeroOse =numeroOse;
        this.scorePrioridade = scorePrioridade;
        this.ultimaAlteracao = ultimaAlteracao;
        this.historico = historico;
        this.fotos = fotos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public OrdemServico getOs() {
        return os;
    }

    public void setOs(OrdemServico os) {
        this.os = os;
    }

    public Tinta getTinta() {
        return tinta;
    }

    public void setTinta(Tinta tinta) {
        this.tinta = tinta;
    }

    public ArrayList<TipoServico> getServicos() {
        return servicos;
    }

    public void setServicos(ArrayList<TipoServico> servicos) {
        this.servicos = servicos;
    }

    public String getDescricaoPeca() {
        return descricaoPeca;
    }

    public void setDescricaoPeca(String descricaoPeca) {
        this.descricaoPeca = descricaoPeca;
    }

    public int getQtdTotal() {
        return qtdTotal;
    }

    public void setQtdTotal(int qtdTotal) {
        this.qtdTotal = qtdTotal;
    }

    public LocalDateTime getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDateTime dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(String urgencia) {
        this.urgencia = urgencia;
    }

    public String getPrazoEntrega() {
        return prazoEntrega;
    }

    public void setPrazoEntrega(String prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    public float getValorTotalPeca() {
        return valorTotalPeca;
    }

    public void setValorTotalPeca(float valorTotalPeca) {
        this.valorTotalPeca = valorTotalPeca;
    }

    public LocalDate getDataFinalizacao() {
        return dataFinalizacao;
    }

    public void setDataFinalizacao(LocalDate dataFinalizacao) {
        this.dataFinalizacao = dataFinalizacao;
    }

    public String getNumeroOse() {
        return numeroOse;
    }

    public void setNumeroOse(String numeroOse) {
        this.numeroOse = numeroOse;
    }

    public float getScorePrioridade() {
        return scorePrioridade;
    }

    public void setScorePrioridade(float scorePrioridade) {
        this.scorePrioridade = scorePrioridade;
    }

    public LocalDateTime getUltimaAlteracao() {
        return ultimaAlteracao;
    }

    public void setUltimaAlteracao(LocalDateTime ultimaAlteracao) {
        this.ultimaAlteracao = ultimaAlteracao;
    }

    public ArrayList<HistoricoStatusPeca> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<HistoricoStatusPeca> historico) {
        this.historico = historico;
    }

    public ArrayList<Foto> getFotos() {
        return fotos;
    }

    public void setFotos(ArrayList<Foto> fotos) {
        this.fotos = fotos;
    }
}
