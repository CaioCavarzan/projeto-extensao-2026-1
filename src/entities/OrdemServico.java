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
    private ArrayList<Peca> listaPeca;
    private ArrayList<HistoricoStatusOs> historico;

    public OrdemServico(){
        numero = 0;
        cliente = new Cliente();
        usuarioCadastrou = new Usuario();
        dataEntrada = LocalDateTime.now();
        valorOS = 0;
        prioridade = new String();
        listaPeca = new ArrayList<>();
        historico = new ArrayList<>();
    }
    
    public OrdemServico(int numero, Cliente cliente, Usuario usuarioCadastrou, LocalDateTime dataEntrada, float valorOS, String prioridade, ArrayList<Peca> listaPeca, ArrayList<HistoricoStatusOs> historico){
        this.numero = numero;
        this.cliente = cliente;
        this.usuarioCadastrou = usuarioCadastrou;
        this.dataEntrada = dataEntrada;
        this.valorOS = valorOS;
        this.prioridade = prioridade;
        this.listaPeca = listaPeca;
        this.historico = historico;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuarioCadastrou() {
        return usuarioCadastrou;
    }

    public void setUsuarioCadastrou(Usuario usuarioCadastrou) {
        this.usuarioCadastrou = usuarioCadastrou;
    }

    public LocalDateTime getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDateTime dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public float getValorOS() {
        return valorOS;
    }

    public void setValorOS(float valorOS) {
        this.valorOS = valorOS;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public ArrayList<Peca> getListaPeca() {
        return listaPeca;
    }

    public void setListaPeca(ArrayList<Peca> listaPeca) {
        this.listaPeca = listaPeca;
    }

    public ArrayList<HistoricoStatusOs> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<HistoricoStatusOs> historico) {
        this.historico = historico;
    }
}
