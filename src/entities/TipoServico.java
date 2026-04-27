package entities;

public class TipoServico {
    private int codigo;
    private String tipo;

    public TipoServico(){
        codigo = 0;
        tipo = new String();
    }
    
    public TipoServico(int codigo, String tipo){
        this.codigo = codigo;
        this.tipo = tipo;
    }
}
