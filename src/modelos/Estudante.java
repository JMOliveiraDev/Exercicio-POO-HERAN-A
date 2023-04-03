package modelos;

public class Estudante extends Pessoa {

    //atributos
    protected String matricula;
    protected String curso;
    protected String campus;

    public Estudante(String matricula, String curso, String campus) {
        super();
        this.matricula = matricula;
        this.curso = curso;
        this.campus = campus;
    }

    public Estudante(String matricula, String curso, String campus, String nome, String endereco, int telefone, String email) {
        super(nome, endereco, telefone, email);
        this.matricula = matricula;
        this.curso = curso;
        this.campus = campus;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
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
        return "\nEstudante{" + "\nmatricula=" + matricula + ", \ncurso=" + curso + ", \ncampus=" + campus + "\n}";
    }

    
}
