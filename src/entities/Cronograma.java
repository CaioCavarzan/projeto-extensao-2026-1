package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Cronograma {
    private int codigo;
    private LocalDate dataPlanejada;
    private int qtdPlanejada;
    private Usuario usuarioCadastrou; //Atributo codigo fk da classe Usuario
    private String observacao;
    private int prioridade;
    private LocalDateTime dataCriacao;
    private LocalDateTime ultimaAlteracao;
    private Usuario usuarioAlterou; //Atributo codigo fk da classe Usuario
    private ServicoAplicadoPeca servicoAplicadoPeca;
    private ArrayList<HistoricoStatusCronograma> historico;
    
    public Cronograma(){
        codigo = 0;
        dataPlanejada = LocalDate.now();
        qtdPlanejada = 0;
        usuarioCadastrou = new Usuario();
        observacao = new String();
        prioridade = 0;
        dataCriacao = LocalDateTime.now();
        ultimaAlteracao = LocalDateTime.now();
        usuarioAlterou = new Usuario();
        servicoAplicadoPeca = new ServicoAplicadoPeca();
        historico = new ArrayList<>();
    }

    public Cronograma(int codigo, LocalDate dataPlanejada, int qtdPlanejada, Usuario usuarioCadastrou, String observacao, int prioridade, LocalDateTime dataCriacao, LocalDateTime ultimaAlteracao, Usuario usuarioAlterou, ServicoAplicadoPeca servicoAplicadoPeca, ArrayList<HistoricoStatusCronograma> historico){
        this.codigo = codigo;
        this.dataPlanejada = dataPlanejada;
        this.qtdPlanejada = qtdPlanejada;
        this.usuarioCadastrou = usuarioCadastrou;
        this.observacao = observacao;
        this.prioridade = prioridade;
        this.dataCriacao = dataCriacao;
        this.ultimaAlteracao = ultimaAlteracao;
        this.usuarioAlterou = usuarioAlterou;
        this.servicoAplicadoPeca = servicoAplicadoPeca;
        this.historico = historico;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDataPlanejada() {
        return dataPlanejada;
    }

    public void setDataPlanejada(LocalDate dataPlanejada) {
        this.dataPlanejada = dataPlanejada;
    }

    public int getQtdPlanejada() {
        return qtdPlanejada;
    }

    public void setQtdPlanejada(int qtdPlanejada) {
        this.qtdPlanejada = qtdPlanejada;
    }

    public Usuario getUsuarioCadastrou() {
        return usuarioCadastrou;
    }

    public void setUsuarioCadastrou(Usuario usuarioCadastrou) {
        this.usuarioCadastrou = usuarioCadastrou;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getUltimaAlteracao() {
        return ultimaAlteracao;
    }

    public void setUltimaAlteracao(LocalDateTime ultimaAlteracao) {
        this.ultimaAlteracao = ultimaAlteracao;
    }

    public Usuario getUsuarioAlterou() {
        return usuarioAlterou;
    }

    public void setUsuarioAlterou(Usuario usuarioAlterou) {
        this.usuarioAlterou = usuarioAlterou;
    }

    public ServicoAplicadoPeca getServicoAplicadoPeca() {
        return servicoAplicadoPeca;
    }

    public void setServicoAplicadoPeca(ServicoAplicadoPeca servicoAplicadoPeca) {
        this.servicoAplicadoPeca = servicoAplicadoPeca;
    }

    public ArrayList<HistoricoStatusCronograma> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<HistoricoStatusCronograma> historico) {
        this.historico = historico;
    }

}
