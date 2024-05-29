public class Professor {
    // ATRIBUTOS DA CLASSE

    private String numero; // Ex.: 14581, 14469, ... 
    private String nomeProprio; // Ex.: Lucas, Paulo, ... 
    private String nomeApelido; // Ex.: Soares, Machado, ... 
    private int anoNascimento; // Ex.: 2008, 1984, ... 
    private String area; // Ex.: Programação, Multimédia, ... 
    
    // GETTERS & SETTERS    

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
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

    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }

    // CONSTRUTORES
    // construtor vazio
    public Professor() {
        this.numero = "";
        this.nomeProprio = "";
        this.nomeApelido = "";
        this.anoNascimento = 0;
        this.area = "";
    }

    // construtor que recebe parâmetros
    public Professor(String numero, String nomeProprio, String nomeApelido, int anoNascimento, String area) {
        this.numero = numero;
        this.nomeProprio = nomeProprio;
        this.nomeApelido = nomeApelido;
        this.anoNascimento = anoNascimento;
        this.area = area;
    }

    // TO STRING
    @Override
    public String toString() {
        return "Professor [numero=" + numero + ", nomeProprio=" + nomeProprio + ", nomeApelido=" + nomeApelido
                + ", anoNascimento=" + anoNascimento + ", area=" + area + "]";
    }

    // Método que devolve o Nome Proprio e o Apelido
    public String getNomeCompleto() {
        String nomeCompleto = "";

        nomeCompleto += "Nome completo professor: ";
        nomeCompleto += this.nomeProprio;
        nomeCompleto += " ";
        nomeCompleto += this.nomeApelido;

        return nomeCompleto;
    } 
}
