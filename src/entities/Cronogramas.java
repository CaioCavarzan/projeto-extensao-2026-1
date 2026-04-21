package entities;

public class Cronogramas {
    private int codigo;
    private String dataPlanejada;
    private int qtdPlanejada;
    Funcionarios funcionario; //Atributo codigo fk da classe Funcionarios
    private String observacao;
    private int prioridade;

    //VERIFICAR TIPAGEM DAS DATAS PORQUE OS ATRIBUTOS FORAM CRIADOS COM STRING

    public Cronogramas(){
        codigo = 0;
        dataPlanejada = new String();
        qtdPlanejada = 0;
        funcionario = new Funcionarios();
        observacao = new String();
        prioridade = 0;
    }

    public Cronogramas(int codigo, String dataPlanejada, int qtdPlanejada, Funcionarios funcionario, String observacao, int prioridade){
        this.codigo = codigo;
        this.dataPlanejada = dataPlanejada;
        this.qtdPlanejada = qtdPlanejada;
        this.funcionario = funcionario;
        this.observacao = observacao;
        this.prioridade = prioridade;
    }
}
