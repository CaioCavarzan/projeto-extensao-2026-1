package entities;

public class PessoaJuridica extends Cliente{
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;
    private int inscricaoEstadual;

    public PessoaJuridica(){
        super();
        cnpj = new String();
        razaoSocial = new String();
        nomeFantasia = new String();
        inscricaoEstadual = 0;
    }

    public PessoaJuridica(int codigo, String email, Cep cep, String logradouro, String numeroCasa, String telefone, FonteAquisicao fonte, String observacao, String complemento, int prioridade, String cnpj, String razaoSocial, String nomeFantasia,int inscricaoestadual ){
        super(codigo, email, cep, logradouro, numeroCasa, telefone, fonte, observacao, complemento, prioridade);
        cnpj = new String();
        razaoSocial = new String();
        nomeFantasia = new String();
        inscricaoEstadual = 0;
    }
    
}
