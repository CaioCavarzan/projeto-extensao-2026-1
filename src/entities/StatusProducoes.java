package entities;

public class StatusProducoes {
    private int codigo;
    private String status;

    public StatusProducoes(){
        codigo = 0;
        status = new String();
    }
    
    public StatusProducoes(int codigo, String status){
        this.codigo = codigo;
        this.status = status;
    }

}
