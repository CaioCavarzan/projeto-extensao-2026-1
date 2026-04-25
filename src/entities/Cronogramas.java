package entities;

public class Cronogramas {
    private int codigo;
    private String dataPlanejada;
    private int qtdPlanejada;
    Funcionarios funcionarioCadastrou; //Atributo codigo fk da classe Funcionarios
    private String observacao;
    private int prioridade;
    private String dataCriacao;
    private String ultimaAlteracao;
    Funcionarios funcionarioAlterou; //Atributo codigo fk da classe Funcionarios
Pecas_TiposServicos servicopeca;

    //VERIFICAR TIPAGEM DAS DATAS PORQUE OS ATRIBUTOS FORAM CRIADOS COM STRING
    
    public Cronogramas(){
        codigo = 0;
        //VERIFICAR A NECESSIDADE DE PUXAR FK DE Pecas_TiposServicos
        dataPlanejada = new String();
        qtdPlanejada = 0;
        funcionarioCadastrou = new Funcionarios();
        observacao = new String();
        prioridade = 0;
        dataCriacao = new String();
        ultimaAlteracao = new String();
        funcionarioAlterou = new Funcionarios();
    }

    public Cronogramas(int codigo, String dataPlanejada, int qtdPlanejada, Funcionarios funcionarioCadastrou, String observacao, int prioridade, String dataCriacao, String ultimaAlteracao, Funcionarios funcionarioAlterou){
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
