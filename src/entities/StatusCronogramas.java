package entities;

public class StatusCronogramas {
    private int codigo;
    private String status;

    public StatusCronogramas(){
        codigo = 0;
        status = new String();
    }
    
    public StatusCronogramas(int codigo, String status){
        this.codigo = codigo;
        this.status = status;
    }

}
