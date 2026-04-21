package entities;

public class Fotos {
    private int codigo;
    Pecas peca; //atributo codigo fk da classe Pecas;
    private String foto;

    //VERIFICAR O TIPO DE ATRIBUTO PARA FOTO

    public Fotos(){
        codigo = 0;
        peca = new Pecas();
        foto = new String();
    }

    public Fotos(int codigo, Pecas peca, String foto){
        this.codigo = codigo;
        this.peca = peca;
        this.foto = foto;
    }
}
