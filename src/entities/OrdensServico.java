package entities;

public class OrdensServico {
    private int numero;
    Clientes cliente; //atributo codigo fk da classe Clientes;
    Funcionarios funcionario; //atributo codigo fk da classe Funcionarios;
    private String dataEntrada;
    private float valorOS;
    private String prioridade;
    private String dataCriacao;
    private String ultimaAlteracao;

    //VERIFICAR TIPAGEM DAS DATAS PORQUE OS ATRIBUTOS FORAM CRIADOS COM STRING
    //VERIFICAR ATRIBUTO 'funcionario_alteracao' DO BANCO. NÃO O CRIEI AQUI

    public OrdensServico(){
        numero = 0;
        cliente = new Clientes();
        funcionario = new Funcionarios();
        dataEntrada = new String();
        valorOS = 0;
        prioridade = new String();
        dataCriacao = new String();
        ultimaAlteracao = new String();
    }
    
    public OrdensServico(int numero, Clientes cliente, Funcionarios funcionario, String dataEntrada, float valorOS, String prioridade, String dataCriacao, String ultimaAlteracao){
        this.numero = numero;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.dataEntrada = dataEntrada;
        this.valorOS = valorOS;
        this.prioridade = prioridade;
        this.dataCriacao = dataCriacao;
        this.ultimaAlteracao = ultimaAlteracao;
    }
}
