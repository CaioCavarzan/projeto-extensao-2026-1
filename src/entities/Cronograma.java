package entities;

import java.util.ArrayList;

public class Cronograma {
    private int codigo;
    private String dataPlanejada;
    private int qtdPlanejada;
    private Funcionario funcionarioCadastrou; //Atributo codigo fk da classe Funcionario
    private String observacao;
    private int prioridade;
    private String dataCriacao;
    private String ultimaAlteracao;
    private Funcionario funcionarioAlterou; //Atributo codigo fk da classe Funcionario
    private ServicoAplicadoPeca servicoAplicadoPeca;
    private ArrayList<HistoricoStatusCronograma> historico;

    //VERIFICAR TIPAGEM DAS DATAS PORQUE OS ATRIBUTOS FORAM CRIADOS COM STRING
    
    public Cronograma(){
        codigo = 0;
        dataPlanejada = new String();
        qtdPlanejada = 0;
        funcionarioCadastrou = new Funcionario();
        observacao = new String();
        prioridade = 0;
        dataCriacao = new String();
        ultimaAlteracao = new String();
        funcionarioAlterou = new Funcionario();
        servicoAplicadoPeca = new ServicoAplicadoPeca();
        historico = new ArrayList<>();
    }

    public Cronograma(int codigo, String dataPlanejada, int qtdPlanejada, Funcionario funcionarioCadastrou, String observacao, int prioridade, String dataCriacao, String ultimaAlteracao, Funcionario funcionarioAlterou, ServicoAplicadoPeca servicoAplicadoPeca, ArrayList<HistoricoStatusCronograma> historico){
        this.codigo = codigo;
        this.dataPlanejada = dataPlanejada;
        this.qtdPlanejada = qtdPlanejada;
        this.funcionarioCadastrou = funcionarioCadastrou;
        this.observacao = observacao;
        this.prioridade = prioridade;
        this.dataCriacao = dataCriacao;
        this.ultimaAlteracao = ultimaAlteracao;
        this.funcionarioAlterou = funcionarioAlterou;
        this.servicoAplicadoPeca = servicoAplicadoPeca;
        this.historico = historico;
    }
}
