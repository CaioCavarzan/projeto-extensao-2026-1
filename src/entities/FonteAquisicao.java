package entities;

public class FonteAquisicao {
    private int codigo;
    private String descricao;

    public FonteAquisicao(){
        codigo = 0;
        descricao = new String();
    }

    public FonteAquisicao(int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
