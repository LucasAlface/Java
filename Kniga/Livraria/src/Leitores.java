public class Leitores {
    private String numero;
    private String nome;
    private String morada;
    private String telefone;
    private String email;
    private String genero;


    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMorada() {
        return morada;
    }
    public void setMorada(String morada) {
        this.morada = morada;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefoneString() {
        String aux = String.valueOf(telefone);
        String res = "";

        res += aux.substring(0, 3);
        res += " ";
        res += aux.substring(3, 6);
        res += " ";
        res += aux.substring(6, 9);
        return res;
    }

    public String getIniciais() {
        String[] aux = nome.split(" ");
        String res = "";
        for (String ch : aux ) {
            res += ch.substring(0, 1);
        }
        return res;
    }

    public String getNomeConta() {
        String[] aux = nome.split(" ");
        String nomeproprio = "";
        String nomeapelido = "";
        for (String ch : aux ) {
           if (nomeproprio != "") {
            nomeapelido = ch;
           }
           if (nomeproprio != "") {
            nomeproprio = ch.substring(0, 1);
           }
        }
        return "";
    }

    public Leitores(String numero, String nome, String morada, String telefone, String email, String genero) {
        this.numero = numero;
        this.nome = nome;
        this.morada = morada;
        this.telefone = telefone;
        this.email = email;
        this.genero = genero;
    }
    public Leitores() {
        this.numero = "";
        this.nome = "";
        this.morada = "";
        this.telefone = "";
        this.email = "";
        this.genero = "";
    }
    @Override
    public String toString() {
        return "Leitores [numero=" + numero + ", nome=" + nome + ", morada=" + morada + ", telefone=" + telefone
                + ", email=" + email + ", genero=" + genero + "]";
    }

    
    
}
