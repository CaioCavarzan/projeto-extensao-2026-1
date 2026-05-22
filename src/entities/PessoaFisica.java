package entities;

public class PessoaFisica extends Cliente{
    private String cpf;
    private String nome;

    public PessoaFisica(){
        super();
        cpf = new String();
        nome = new String();
    }

    public PessoaFisica(int codigo, String email, Cep cep, String logradouro, String numeroImovel, String telefone, FonteAquisicao fonte, String observacao, String complemento, int prioridade, String cpf, String nome){
        super(codigo, email, cep, logradouro, numeroImovel, telefone, fonte, observacao, complemento, prioridade);
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
