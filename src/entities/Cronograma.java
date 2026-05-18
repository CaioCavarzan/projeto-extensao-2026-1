package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Cronograma {
    private int codigo;
    private LocalDate dataPlanejada;
    private int qtdPlanejada;
    private Usuario usuarioCadastrou; //Atributo codigo fk da classe Usuario
    private String observacao;
    private int prioridade;
    private LocalDateTime dataCriacao;
    private LocalDateTime ultimaAlteracao;
    private Usuario usuarioAlterou; //Atributo codigo fk da classe Usuario
    private ServicoAplicadoPeca servicoAplicadoPeca;
    private ArrayList<HistoricoStatusCronograma> historico;
    
    public Cronograma(){
        codigo = 0;
        dataPlanejada = LocalDate.now();
        qtdPlanejada = 0;
        usuarioCadastrou = new Usuario();
        observacao = new String();
        prioridade = 0;
        dataCriacao = LocalDateTime.now();
        ultimaAlteracao = LocalDateTime.now();
        usuarioAlterou = new Usuario();
        servicoAplicadoPeca = new ServicoAplicadoPeca();
        historico = new ArrayList<>();
    }

    public Cronograma(int codigo, LocalDate dataPlanejada, int qtdPlanejada, Usuario usuarioCadastrou, String observacao, int prioridade, LocalDateTime dataCriacao, LocalDateTime ultimaAlteracao, Usuario usuarioAlterou, ServicoAplicadoPeca servicoAplicadoPeca, ArrayList<HistoricoStatusCronograma> historico){
        this.codigo = codigo;
        this.dataPlanejada = dataPlanejada;
        this.qtdPlanejada = qtdPlanejada;
        this.usuarioCadastrou = usuarioCadastrou;
        this.observacao = observacao;
        this.prioridade = prioridade;
        this.dataCriacao = dataCriacao;
        this.ultimaAlteracao = ultimaAlteracao;
        this.usuarioAlterou = usuarioAlterou;
        this.servicoAplicadoPeca = servicoAplicadoPeca;
        this.historico = historico;
    }
}
