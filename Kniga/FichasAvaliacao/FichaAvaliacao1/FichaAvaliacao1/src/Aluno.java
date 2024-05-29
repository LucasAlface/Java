import java.util.Calendar;
public class Aluno {
    // ATRIBUTOS
    private String codigo; // Ex.: 14581, 14469, ...
    private String nomeProprio; // Ex.: Lucas, António, ...
    private String nomeApelido; // Ex.: Soares, Pinto, ...
    private int anoNascimento; // Ex.: 2008, 2002, ...
    private Turma turma; // este atributo recebe um objeto da classe turma

    // GETTERS & SETTERS
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeProprio() {
        return nomeProprio;
    }
    public void setNomeProprio(String nomeProprio) {
        this.nomeProprio = nomeProprio;
    }

    public String getNomeApelido() {
        return nomeApelido;
    }
    public void setNomeApelido(String nomeApelido) {
        this.nomeApelido = nomeApelido;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public Turma getTurma() {
        return turma;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    // CONSTRUTORES
    // construtor vazio
    public Aluno() {
        this.codigo = "";
        this.nomeProprio = "";
        this.nomeApelido = "";
        this.anoNascimento = 0;
        this.turma = null;
    }

    // construtor que recebe parâmetros
    public Aluno(String codigo, String nomeProprio, String nomeApelido, int anoNascimento, Turma turma) {
        this.codigo = codigo;
        this.nomeProprio = nomeProprio;
        this.nomeApelido = nomeApelido;
        this.anoNascimento = anoNascimento;
        this.turma = turma;
    }

    // TO STRING
    @Override
    public String toString() {
        return "Aluno [codigo=" + codigo + ", nomeProprio=" + nomeProprio + ", nomeApelido=" + nomeApelido
                + ", anoNascimento=" + anoNascimento + ", turma=" + turma + "]";
    }

    // Método que devolve o Nome Proprio e o Apelido
    public String getNomeCompleto() {
        String nomeCompleto = "";

        nomeCompleto += "Nome completo do aluno: ";
        nomeCompleto += getNomeProprio();
        nomeCompleto += " ";
        nomeCompleto += getNomeApelido();

        return nomeCompleto;
    }

    // método que devolve a idade do aluno
    public int getIdade() {
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        int idade = 0;

        idade = anoAtual - getAnoNascimento();

        return idade;
    }

    

    

    

    
    
}
