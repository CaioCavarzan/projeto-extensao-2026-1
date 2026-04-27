package entities;

import java.util.ArrayList;

public class OrdemServico {
    private int numero;
    private Cliente cliente; //atributo codigo fk da classe Cliente;
    private Funcionario funcionarioCadastrou; //atributo codigo fk da classe Funcionario;
    private String dataEntrada;
    private float valorOS;
    private String prioridade;
    private String ultimaAlteracao;
    private Funcionario funcionarioAlterou; //atributo codigo fk da classe Funcionario;
    private ArrayList<Peca> listaPeca;
    private ArrayList<HistoricoStatusOs> historico;

    //VERIFICAR TIPAGEM DAS DATAS PORQUE OS ATRIBUTOS FORAM CRIADOS COM STRING

    public OrdemServico(){
        numero = 0;
        cliente = new Cliente();
        funcionarioCadastrou = new Funcionario();
        dataEntrada = new String();
        valorOS = 0;
        prioridade = new String();
        ultimaAlteracao = new String();
        funcionarioAlterou = new Funcionario();
        listaPeca = new ArrayList<>();
        historico = new ArrayList<>();
    }
    
    public OrdemServico(int numero, Cliente cliente, Funcionario funcionarioCadastrou, String dataEntrada, float valorOS, String prioridade, String ultimaAlteracao, Funcionario funcionarioAlterou, ArrayList<Peca> listaPeca, ArrayList<HistoricoStatusOs> historico){
        this.numero = numero;
        this.cliente = cliente;
        this.funcionarioCadastrou = funcionarioCadastrou;
        this.dataEntrada = dataEntrada;
        this.valorOS = valorOS;
        this.prioridade = prioridade;
        this.ultimaAlteracao = ultimaAlteracao;
        this.funcionarioAlterou = funcionarioAlterou;
        this.listaPeca = listaPeca;
        this.historico = historico;
    }
}
