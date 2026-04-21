package entities;

public class Fornecedores extends Pessoas {
    private String cnpj;
    
    public Fornecedores(){
        super();
        cnpj = new String();
    }

    public Fornecedores(int codigo, String email, Ceps cep, String logradouro, String numeroCasa, String cnpj){
        super(codigo, email, cep, logradouro, numeroCasa);
        this.cnpj = cnpj;
    }
}
