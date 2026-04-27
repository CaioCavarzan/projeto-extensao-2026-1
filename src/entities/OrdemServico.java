package entities;

import java.util.ArrayList;

public class OrdemServico {
    private int numero;
    Cliente cliente; //atributo codigo fk da classe Cliente;
    Funcionario funcionarioCadastrou; //atributo codigo fk da classe Funcionario;
    private String dataEntrada;
    private float valorOS;
    private String prioridade;
    private String dataCriacao;
    private String ultimaAlteracao;
    Funcionario funcionarioAlterou; //atributo codigo fk da classe Funcionario;
    ArrayList<Peca> listaPeca;
    ArrayList<OrdemServico_StatusOs> historico;

    //VERIFICAR TIPAGEM DAS DATAS PORQUE OS ATRIBUTOS FORAM CRIADOS COM STRING
    //VERIFICAR ATRIBUTO 'funcionario_alteracao' DO BANCO. NÃO O CRIEI AQUI

    public OrdemServico(){
        numero = 0;
        cliente = new Cliente();
        funcionarioCadastrou = new Funcionario();
        dataEntrada = new String();
        valorOS = 0;
        prioridade = new String();
        ultimaAlteracao = new String();
        funcionarioAlterou = new Funcionario();
    }
    
    public OrdemServico(int numero, Cliente cliente, Funcionario funcionarioCadastrou, String dataEntrada, float valorOS, String prioridade, String ultimaAlteracao, Funcionario funcionarioAlterou){
        this.numero = numero;
        this.cliente = cliente;
        this.funcionarioCadastrou = funcionarioCadastrou;
        this.dataEntrada = dataEntrada;
        this.valorOS = valorOS;
        this.prioridade = prioridade;
        this.ultimaAlteracao = ultimaAlteracao;
        this.funcionarioAlterou = funcionarioAlterou;
    }
}
