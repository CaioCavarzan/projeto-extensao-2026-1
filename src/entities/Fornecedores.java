package entities;

public class Fornecedores extends Pessoas {
    private String cnpj;
    private boolean status;
    private String prazoPagamento;
    
    public Fornecedores(){
        super();
        cnpj = new String();
        status = true;
        prazoPagamento = new String();
    }

    public Fornecedores(int codigo, String email, Ceps cep, String logradouro, String numeroCasa, String cnpj, boolean status, String prazoPagamento){
        super(codigo, email, cep, logradouro, numeroCasa);
        this.cnpj = cnpj;
        this.status = status;
        this.prazoPagamento = prazoPagamento;
    }
}
