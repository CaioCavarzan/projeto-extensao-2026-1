package entities;

public class Peca_TipoServico {
    TipoServico TipoServico; //Atributo código fk da classe TipoServico
    Peca peca; //Atributo código fk da classe Peca

    //VERIFICAR SE ESSA CLASSE DE RELAÇÃO N PARA N ESTÁ CORRETA (nome e atributos)
    
    public Peca_TipoServico(){
        TipoServico = new TipoServico();
        peca = new Peca();
    }

    public Peca_TipoServico(TipoServico TipoServico, Peca peca){
        this.TipoServico = TipoServico;
        this.peca = peca;
    }

}