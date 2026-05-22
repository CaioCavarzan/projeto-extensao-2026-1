package entities;

public class Tinta {
    private int codigo;
    private Fornecedor fornecedor; //atributo codigo fk da classe Fornecedor;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAcabamento() {
        return acabamento;
    }

    public void setAcabamento(String acabamento) {
        this.acabamento = acabamento;
    }

    public String getReferenciaFornecedor() {
        return referenciaFornecedor;
    }

    public void setReferenciaFornecedor(String referenciaFornecedor) {
        this.referenciaFornecedor = referenciaFornecedor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
