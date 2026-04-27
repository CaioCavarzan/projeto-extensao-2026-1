package entities;

public class Cronograma {
    private int codigo;
    private String dataPlanejada;
    private int qtdPlanejada;
    Funcionario funcionarioCadastrou; //Atributo codigo fk da classe Funcionario
    private String observacao;
    private int prioridade;
    private String dataCriacao;
    private String ultimaAlteracao;
    Funcionario funcionarioAlterou; //Atributo codigo fk da classe Funcionario
    Peca_TipoServico servicopeca;

    //VERIFICAR TIPAGEM DAS DATAS PORQUE OS ATRIBUTOS FORAM CRIADOS COM STRING
    
    public Cronograma(){
        codigo = 0;
        //VERIFICAR A NECESSIDADE DE PUXAR FK DE Peca_TipoServico
        dataPlanejada = new String();
        qtdPlanejada = 0;
        funcionarioCadastrou = new Funcionario();
        observacao = new String();
        prioridade = 0;
        dataCriacao = new String();
        ultimaAlteracao = new String();
        funcionarioAlterou = new Funcionario();
    }

    public Cronograma(int codigo, String dataPlanejada, int qtdPlanejada, Funcionario funcionarioCadastrou, String observacao, int prioridade, String dataCriacao, String ultimaAlteracao, Funcionario funcionarioAlterou){
        this.codigo = codigo;
        this.dataPlanejada = dataPlanejada;
        this.qtdPlanejada = qtdPlanejada;
        this.funcionarioCadastrou = funcionarioCadastrou;
        this.observacao = observacao;
        this.prioridade = prioridade;
        this.dataCriacao = dataCriacao;
        this.ultimaAlteracao = ultimaAlteracao;
        this.funcionarioAlterou = funcionarioAlterou;
    }
}
