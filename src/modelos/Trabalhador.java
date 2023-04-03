package modelos;

public class Trabalhador extends Pessoa{
    
    
    // atributos
    
    protected String funcao;
    protected String departamento;
    protected float salario;
    
    // metodos

    public Trabalhador(String funcao, String departamento, float salario) {
        super();
        this.funcao = funcao;
        this.departamento = departamento;
        this.salario = salario;
    }

    public Trabalhador(String funcao, String departamento, float salario, String nome, String endereco, int telefone, String email) {
        super(nome, endereco, telefone, email);
        this.funcao = funcao;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
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
        return "\nTrabalhador{" + "\nfuncao=" + funcao + ", \ndepartamento=" + departamento + ", \nsalario = R$ " + salario + "\n}";
    }
    
    
}
