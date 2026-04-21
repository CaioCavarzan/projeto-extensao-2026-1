package entities;

public class Pecas_TiposServicos {
    TiposServico tiposServico; //Atributo código fk da classe TiposServico
    Pecas peca; //Atributo código fk da classe Pecas

    //VERIFICAR SE ESSA CLASSE DE RELAÇÃO N PARA N ESTÁ CORRETA (nome e atributos)
    
    public Pecas_TiposServicos(){
        tiposServico = new TiposServico();
        peca = new Pecas();
    }

    public Pecas_TiposServicos(TiposServico tiposServico, Pecas peca){
        this.tiposServico = tiposServico;
        this.peca = peca;
    }

}