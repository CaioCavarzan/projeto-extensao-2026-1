package entities;

public class StatusProducao {
    private int codigo;
    private String status;

    public StatusProducao(){
        codigo = 0;
        status = new String();
    }
    
    public StatusProducao(int codigo, String status){
        this.codigo = codigo;
        this.status = status;
    }

}
