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

    public PessoaJuridica(int codigo, String email, Cep cep, String logradouro, String numeroCasa, String telefone, FonteAquisicao fonte, String observacao, String complemento, int prioridade, String cnpj, String razaoSocial, String nomeFantasia,int inscricaoEstadual ){
        super(codigo, email, cep, logradouro, numeroCasa, telefone, fonte, observacao, complemento, prioridade);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.inscricaoEstadual = inscricaoEstadual;
    
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public int getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(int inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
}