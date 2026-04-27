package entities;

public class StatusCronograma {
    private int codigo;
    private String status;

    public StatusCronograma(){
        codigo = 0;
        status = new String();
    }
    
    public StatusCronograma(int codigo, String status){
        this.codigo = codigo;
        this.status = status;
    }

}
