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

    public Fornecedor(int codigo, String email, Cep cep, String logradouro, String numeroCasa, String telefone, String cnpj, boolean status, String prazoPagamento){
        super(codigo, email, cep, logradouro, numeroCasa, telefone);
        this.cnpj = cnpj;
        this.status = status;
        this.prazoPagamento = prazoPagamento;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getPrazoPagamento() {
        return prazoPagamento;
    }

    public void setPrazoPagamento(String prazoPagamento) {
        this.prazoPagamento = prazoPagamento;
    }
}
