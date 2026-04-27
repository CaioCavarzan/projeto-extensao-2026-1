package entities;

public class Foto {
    private int codigo;
    private Peca peca; //atributo codigo fk da classe Peca;
    private String foto;

    //VERIFICAR O TIPO DE ATRIBUTO PARA FOTO

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
}
