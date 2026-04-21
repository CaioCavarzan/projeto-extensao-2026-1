package entities;

public class StatusPecas {
    private int codigo;
    private String status;
    
    public StatusPecas(){
        codigo = 0;
        status = new String();
    }
    
    public StatusPecas(int codigo, String status){
        this.codigo = codigo;
        this.status = status;
    }

}
