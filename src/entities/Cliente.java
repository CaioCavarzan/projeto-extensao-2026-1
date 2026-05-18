package entities;

public class Cliente extends Pessoa {
    private FonteAquisicao fonte; //atributo codigo fk da classe FonteAquisicao
    private String observacao; //VERIFICAR SE ESSE ATRIBUTO PERMANECE
    private String complemento;
    private int prioridade;


    public Cliente(){
        super();
        fonte = new FonteAquisicao();
        observacao = new String();
        complemento = new String();
        prioridade = 0;
    }
    
    public Cliente(int codigo, String email, Cep cep, String logradouro, String numeroCasa, String telefone, FonteAquisicao fonte, String observacao, String complemento, int prioridade){
        super(codigo, email, cep, logradouro, numeroCasa, telefone);
        this.fonte = fonte;
        this.observacao = observacao;
        this.complemento = complemento;
        this.prioridade = prioridade;
    }
}
