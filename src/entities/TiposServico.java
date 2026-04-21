package entities;

public class TiposServico {
    private int codigo;
    private String tipo;

    public TiposServico(){
        codigo = 0;
        tipo = new String();
    }
    
    public TiposServico(int codigo, String tipo){
        this.codigo = codigo;
        this.tipo = tipo;
    }
}
