package modelos;

public class Pessoa {
    
    // atributos
    
    protected String nome;
    protected String endereco;
    protected int telefone;
    protected String email;
    
    // métodos 

    public Pessoa() {
    }

    public Pessoa(String nome, String endereco, int telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereco;
    }

    public void setEndereço(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nPessoa{" + "\nnome = " + nome + ", \nendereço = " + endereco + ", \ntelefone = " + telefone + ", \nemail = " + email + "\n}";
    }
    
    
}
