public class Turma {
    // ATRIBUTOS DA CLASSE
    private String codigo; // Ex.: DF24334, GT12345, ...
    private String nomeCurso; // Ex.: Programador de Informática, ...
    private int anoInicio; // Ex.: 2023, 2022 ,...
    private int anoFim; // Ex.: 2026, 2025 ,...

    // GETTERS & SETTERS

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo.toUpperCase(); // devolve a string em CAPS LOCK
    }

    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso.toUpperCase(); // devolve a string em CAPS LOCK
    }

    public int getAnoInicio() {
        return anoInicio;
    }
    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }

    public int getAnoFim() {
        return anoFim;
    }
    public void setAnoFim(int anoFim) {
        this.anoFim = anoFim;
    }

    // CONSTRUTORES
    // construtor vazio
    public Turma() {
        this.codigo = "";
        this.nomeCurso = "";
        this.anoInicio = 0;
        this.anoFim = 0;
    }

    // construtor que recebe parâmetros
    public Turma(String codigo, String nomeCurso, int anoInicio, int anoFim) {
        this.codigo = codigo.toUpperCase(); // devolve a string em CAPS LOCK
        this.nomeCurso = nomeCurso.toUpperCase(); // devolve a string em CAPS LOCK
        this.anoInicio = anoInicio;
        this.anoFim = anoFim;
    }

    // TO STRING
    @Override
    public String toString() {
        return "Turma [codigo=" + codigo + ", nomeCurso=" + nomeCurso + ", anoInicio=" + anoInicio + ", anoFim="
                + anoFim + "]";
    }

    // método que devolve a informação da turma tratada
    public String getInfoTurma() {
        String aux = "";

        aux += "Codigo da turma: " + this.getCodigo(); 
        aux += "\n";
        aux += "Nome do curso: " + this.getNomeCurso(); 
        aux += "\n";
        aux += "Ano de inicio do curso: " + this.getAnoInicio();
        aux += "\n";
        aux += "Ano de fim do curso: " + this.getAnoFim();

        return aux;
    }   
}
