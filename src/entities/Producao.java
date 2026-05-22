package entities;

import java.time.LocalDateTime;

public class Producao {
    private int codigo;
    private Cronograma cronograma; //Atributo código fk da classe Cronograma 
    private ServicoAplicadoPeca servicoAplicadoPeca; //Atributo código fk da classe ServicoAplicadoPeca
    private Usuario usuarioCadastrou;
    private LocalDateTime dataExecucao;
    private int qtdProduzida;
    private int qtdDefeito;
    private String observacao;

    public Producao(){
        codigo = 0;
        cronograma = new Cronograma();
        servicoAplicadoPeca = new ServicoAplicadoPeca();
        usuarioCadastrou = new Usuario();
        dataExecucao = LocalDateTime.now();
        qtdProduzida = 0;
        qtdDefeito = 0;
        observacao = new String();
    }
    
    public Producao(int codigo, Cronograma cronograma, ServicoAplicadoPeca servicoAplicadoPeca, Usuario usuarioCadastrou, LocalDateTime dataExecucao, int qtdProduzida, int qtdDefeito, String observacao){
        this.codigo = codigo;
        this.cronograma = cronograma;
        this.servicoAplicadoPeca = servicoAplicadoPeca;
        this.usuarioCadastrou = usuarioCadastrou;
        this.dataExecucao = dataExecucao;
        this.qtdProduzida = qtdProduzida;
        this.qtdDefeito = qtdDefeito;
        this.observacao = observacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cronograma getCronograma() {
        return cronograma;
    }

    public void setCronograma(Cronograma cronograma) {
        this.cronograma = cronograma;
    }

    public ServicoAplicadoPeca getServicoAplicadoPeca() {
        return servicoAplicadoPeca;
    }

    public void setServicoAplicadoPeca(ServicoAplicadoPeca servicoAplicadoPeca) {
        this.servicoAplicadoPeca = servicoAplicadoPeca;
    }

    public Usuario getUsuarioCadastrou() {
        return usuarioCadastrou;
    }

    public void setUsuarioCadastrou(Usuario usuarioCadastrou) {
        this.usuarioCadastrou = usuarioCadastrou;
    }

    public LocalDateTime getDataExecucao() {
        return dataExecucao;
    }

    public void setDataExecucao(LocalDateTime dataExecucao) {
        this.dataExecucao = dataExecucao;
    }

    public int getQtdProduzida() {
        return qtdProduzida;
    }

    public void setQtdProduzida(int qtdProduzida) {
        this.qtdProduzida = qtdProduzida;
    }

    public int getQtdDefeito() {
        return qtdDefeito;
    }

    public void setQtdDefeito(int qtdDefeito) {
        this.qtdDefeito = qtdDefeito;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
