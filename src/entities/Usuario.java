package entities;

public class Usuario {
    private Funcionario funcionario; //atributo codigo fk da classe Funcionario; 
    private String login;
    private String senha;
    private String tipoAcesso;

    public Usuario(){
        funcionario = new Funcionario();
        login = new String();
        senha = new String();
        tipoAcesso = new String();
    }

    public Usuario(Funcionario funcionario, String login, String senha, String tipoAcesso){
        this.funcionario = funcionario;
        this.login = login;
        this.senha = senha;
        this.tipoAcesso = tipoAcesso;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipoAcesso() {
        return tipoAcesso;
    }

    public void setTipoAcesso(String tipoAcesso) {
        this.tipoAcesso = tipoAcesso;
    }
}
