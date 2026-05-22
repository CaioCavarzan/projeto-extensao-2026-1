package entities;

public class Pessoa {
    private int codigo;
    private String email;
    private Cep cep; //atributo codigo fk da classe Cep
    private String logradouro;
    private String numeroImovel;
    private String telefone;

    public Pessoa(){
        codigo = 0;
        email = new String();
        cep = new Cep();
        logradouro = new String();
        numeroImovel = new String();
        telefone = new String();
    }

        public Pessoa(int codigo, String email, Cep cep, String logradouro, String numeroImovel, String telefone){
        this.codigo = codigo;
        this.email = email;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numeroImovel = numeroImovel;
        this.telefone = telefone;
    }

        public int getCodigo() {
            return codigo;
        }

        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Cep getCep() {
            return cep;
        }

        public void setCep(Cep cep) {
            this.cep = cep;
        }

        public String getLogradouro() {
            return logradouro;
        }

        public void setLogradouro(String logradouro) {
            this.logradouro = logradouro;
        }

        public String getNumeroImovel() {
            return numeroImovel;
        }

        public void setNumeroImovel(String numeroImovel) {
            this.numeroImovel = numeroImovel;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }
}