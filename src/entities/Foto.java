package entities;

public class Foto {
    private int codigo;
    private Peca peca; //atributo codigo fk da classe Peca;
    private String foto;

    public Foto(){
        codigo = 0;
        peca = new Peca();
        foto = new String();
    }

    public Foto(int codigo, Peca peca, String foto){
        this.codigo = codigo;
        this.peca = peca;
        this.foto = foto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
