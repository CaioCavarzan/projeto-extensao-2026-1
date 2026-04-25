package entities;

import java.util.ArrayList;

public class OrdensServico {
    private int numero;
    Clientes cliente; //atributo codigo fk da classe Clientes;
    Funcionarios funcionarioCadastrou; //atributo codigo fk da classe Funcionarios;
    private String dataEntrada;
    private float valorOS;
    private String prioridade;
    private String dataCriacao;
    private String ultimaAlteracao;
    Funcionarios funcionarioAlterou; //atributo codigo fk da classe Funcionarios;
ArrayList<Pecas> listaPecas;
ArrayList<OrdensServico_StatusOs> historico;
    //VERIFICAR TIPAGEM DAS DATAS PORQUE OS ATRIBUTOS FORAM CRIADOS COM STRING
    //VERIFICAR ATRIBUTO 'funcionario_alteracao' DO BANCO. NÃO O CRIEI AQUI

    public OrdensServico(){
        numero = 0;
        cliente = new Clientes();
        funcionarioCadastrou = new Funcionarios();
        dataEntrada = new String();
        valorOS = 0;
        prioridade = new String();
        ultimaAlteracao = new String();
        funcionarioAlterou = new Funcionarios();
    }
    
    public OrdensServico(int numero, Clientes cliente, Funcionarios funcionarioCadastrou, String dataEntrada, float valorOS, String prioridade, String ultimaAlteracao, Funcionarios funcionarioAlterou){
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
