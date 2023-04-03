package modelos;

public class Graduado extends Estudante {

    // atributos
    protected int anoDaConclusao;
    protected int colacaoDeGrau;
    protected int numeroDoDiploma;

    // metodos
    public Graduado(int anoDaConclusao, int colacaoDeGrau, int numeroDoDiploma, String matricula, String curso, String campus) {
        super(matricula, curso, campus);
        this.anoDaConclusao = anoDaConclusao;
        this.colacaoDeGrau = colacaoDeGrau;
        this.numeroDoDiploma = numeroDoDiploma;
    }

    public Graduado(int anoDaConclusao, int colacaoDeGrau, int numeroDoDiploma, String matricula, String curso, String campus, String nome, String endereco, int telefone, String email) {
        super(matricula, curso, campus, nome, endereco, telefone, email);
        this.anoDaConclusao = anoDaConclusao;
        this.colacaoDeGrau = colacaoDeGrau;
        this.numeroDoDiploma = numeroDoDiploma;
    }

    public int getAnoDaConclusao() {
        return anoDaConclusao;
    }

    public void setAnoDaConclusao(int anoDaConclusao) {
        this.anoDaConclusao = anoDaConclusao;
    }

    public int getColacaoDeGrau() {
        return colacaoDeGrau;
    }

    public void setColacaoDeGrau(int colacaoDeGrau) {
        this.colacaoDeGrau = colacaoDeGrau;
    }

    public int getNumeroDoDiploma() {
        return numeroDoDiploma;
    }

    public void setNumeroDoDiploma(int numeroDoDiploma) {
        this.numeroDoDiploma = numeroDoDiploma;
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
        return "Graduado{" +  "\nanoDaConclusao=" + anoDaConclusao + ", \ncolacaoDeGrau = " + colacaoDeGrau + ", \nnumeroDoDiploma = " + numeroDoDiploma + "\n}";
    }

}
