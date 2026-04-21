package entities;

public class Tintas {
    private int codigo;
    Fornecedores fornecedor; //atributo codigo fk da classe Fornecedores;
    private String descricao;
    private String cor;
    private String tipo;
    private String acabamento;
    private String referenciaFornecedor;
    private int estoque;
    private float valorUnitario;

    public Tintas(){
        codigo = 0;
        fornecedor = new Fornecedores();
        descricao = new String();
        cor = new String();
        tipo = new String();
        acabamento = new String();
        referenciaFornecedor = new String();
        estoque = 0;
        valorUnitario = 0;
    }
    
    public Tintas(int codigo, Fornecedores fornecedor, String descricao, String cor, String tipo, String acabamento, String referenciaFornecedor, int estoque, float valorUnitario){
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
