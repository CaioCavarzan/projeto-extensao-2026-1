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

}
