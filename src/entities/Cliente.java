package entities;

public class Cliente extends Pessoa {
    private FonteAquisicao fonte; //atributo codigo fk da classe FonteAquisicao
    private String observacao;
    private int prioridade;


    public Cliente(){
        super();
        fonte = new FonteAquisicao();
        observacao = new String();
        prioridade = 0;
    }
    
    public Cliente(int codigo, String email, Cep cep, String logradouro, String numeroImovel, String telefone, FonteAquisicao fonte, String observacao, String complemento, int prioridade){
        super(codigo, email, cep, logradouro, numeroImovel, telefone);
        this.fonte = fonte;
        this.observacao = observacao;
        this.prioridade = prioridade;
    }

    public FonteAquisicao getFonte() {
        return fonte;
    }

    public void setFonte(FonteAquisicao fonte) {
        this.fonte = fonte;
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

}
