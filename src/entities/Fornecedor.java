package entities;

public class Fornecedor extends Pessoa {
    private String cnpj;
    private boolean status;
    private String prazoPagamento;
    
    public Fornecedor(){
        super();
        cnpj = new String();
        status = true;
        prazoPagamento = new String();
    }

    public Fornecedor(int codigo, String email, Cep cep, String logradouro, String numeroCasa, String cnpj, boolean status, String prazoPagamento){
        super(codigo, email, cep, logradouro, numeroCasa);
        this.cnpj = cnpj;
        this.status = status;
        this.prazoPagamento = prazoPagamento;
    }
}
