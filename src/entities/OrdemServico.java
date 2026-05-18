package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class OrdemServico {
    private int numero;
    private Cliente cliente; //atributo codigo fk da classe Cliente;
    private Usuario usuarioCadastrou; //atributo codigo fk da classe Usuario;
    private LocalDateTime dataEntrada;
    private float valorOS;
    private String prioridade;
    private LocalDateTime ultimaAlteracao;
    private Usuario usuarioAlterou; //atributo codigo fk da classe Usuario;
    private ArrayList<Peca> listaPeca;
    private ArrayList<HistoricoStatusOs> historico;

    //VERIFICAR TIPAGEM DAS DATAS PORQUE OS ATRIBUTOS FORAM CRIADOS COM STRING

    public OrdemServico(){
        numero = 0;
        cliente = new Cliente();
        usuarioCadastrou = new Usuario();
        dataEntrada = LocalDateTime.now();
        valorOS = 0;
        prioridade = new String();
        ultimaAlteracao = LocalDateTime.now();
        usuarioAlterou = new Usuario();
        listaPeca = new ArrayList<>();
        historico = new ArrayList<>();
    }
    
    public OrdemServico(int numero, Cliente cliente, Usuario usuarioCadastrou, LocalDateTime dataEntrada, float valorOS, String prioridade, LocalDateTime ultimaAlteracao, Usuario usuarioAlterou, ArrayList<Peca> listaPeca, ArrayList<HistoricoStatusOs> historico){
        this.numero = numero;
        this.cliente = cliente;
        this.usuarioCadastrou = usuarioCadastrou;
        this.dataEntrada = dataEntrada;
        this.valorOS = valorOS;
        this.prioridade = prioridade;
        this.ultimaAlteracao = ultimaAlteracao;
        this.usuarioAlterou = usuarioAlterou;
        this.listaPeca = listaPeca;
        this.historico = historico;
    }
}
