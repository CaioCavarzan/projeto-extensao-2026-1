package entities;

public class ServicoAplicadoPeca {
    private TipoServico tipoServico; //Atributo código fk da classe TipoServico
    private Peca peca; //Atributo código fk da classe Peca
    
    public ServicoAplicadoPeca(){
        tipoServico = new TipoServico();
        peca = new Peca();
    }

    public ServicoAplicadoPeca(TipoServico tipoServico, Peca peca){
        this.tipoServico = tipoServico;
        this.peca = peca;
    }

    public TipoServico getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }
}