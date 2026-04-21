package entities;

public class PessoaFisica extends Clientes{
    private String cpf;
    private String nome;
    private String observacao;

    public PessoaFisica(){
        super();
        cpf = new String();
        nome = new String();
    }

    public PessoaFisica(int codigo, String email, Ceps cep, String logradouro, String numeroCasa, FonteAquisicao fonte, String observacao, String complemento, int prioridade, String cpf, String nome){
        super(codigo, email, cep, logradouro, numeroCasa, fonte, observacao, complemento, prioridade);
        this.cpf = cpf;
        this.nome = nome;
    }
}
