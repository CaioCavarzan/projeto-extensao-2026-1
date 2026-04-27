package entities;

public class ServicoAplicadoPeca {
    private TipoServico tipoServico; //Atributo código fk da classe TipoServico
    private Peca peca; //Atributo código fk da classe Peca

    //VERIFICAR SE ESSA CLASSE DE RELAÇÃO N PARA N ESTÁ CORRETA (nome e atributos)
    
    public ServicoAplicadoPeca(){
        tipoServico = new TipoServico();
        peca = new Peca();
    }

    public ServicoAplicadoPeca(TipoServico tipoServico, Peca peca){
        this.tipoServico = tipoServico;
        this.peca = peca;
    }

}