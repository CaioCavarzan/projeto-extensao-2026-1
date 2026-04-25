package entities;

public class Clientes extends Pessoas {
    private FonteAquisicao fonte; //atributo codigo fk da classe FonteAquisicao
    private String observacao;
    private String complemento;
    private int prioridade;


    public Clientes(){
        super();
        fonte = new FonteAquisicao();
        observacao = new String();
        complemento = new String();
        prioridade = 0;
    }
    
    public Clientes(int codigo, String email, Ceps cep, String logradouro, String numeroCasa, FonteAquisicao fonte, String observacao, String complemento, int prioridade){
        super(codigo, email, cep, logradouro, numeroCasa);
        this.fonte = fonte;
        this.observacao = observacao;
        this.complemento = complemento;
        this.prioridade = prioridade;
    }
}
