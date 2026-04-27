package entities;

public class StatusPeca {
    private int codigo;
    private String status;
    
    public StatusPeca(){
        codigo = 0;
        status = new String();
    }
    
    public StatusPeca(int codigo, String status){
        this.codigo = codigo;
        this.status = status;
    }

}
