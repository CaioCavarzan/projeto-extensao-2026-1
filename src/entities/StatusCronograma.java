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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
