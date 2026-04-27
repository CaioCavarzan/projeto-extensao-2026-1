package entities;

public class Tinta {
    private int codigo;
    Fornecedor fornecedor; //atributo codigo fk da classe Fornecedor;
    private String descricao;
    private String cor;
    private String tipo;
    private String acabamento;
    private String referenciaFornecedor;
    private int estoque;
    private float valorUnitario;

    public Tinta(){
        codigo = 0;
        fornecedor = new Fornecedor();
        descricao = new String();
        cor = new String();
        tipo = new String();
        acabamento = new String();
        referenciaFornecedor = new String();
        estoque = 0;
        valorUnitario = 0;
    }
    
    public Tinta(int codigo, Fornecedor fornecedor, String descricao, String cor, String tipo, String acabamento, String referenciaFornecedor, int estoque, float valorUnitario){
        this.codigo = codigo;
        this.fornecedor = fornecedor;
        this.descricao = descricao;
        this.cor = cor;
        this.tipo = tipo;
        this.acabamento = acabamento;
        this.referenciaFornecedor = referenciaFornecedor;
        this.estoque = estoque;
        this.valorUnitario = valorUnitario;
    }
}
