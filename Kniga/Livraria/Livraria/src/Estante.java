public class Estante {
    private String codigo;
    private String andar;
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getAndar() {
        return andar;
    }
    public void setAndar(String andar) {
        this.andar = andar;
    }
    public Estante(String codigo, String andar) {
        this.codigo = codigo;
        this.andar = andar;
    }
    public Estante() {
        this.codigo = "";
        this.andar = "";
    }
    @Override
    public String toString() {
        return "Estante [codigo=" + codigo + ", andar=" + andar + "]";
    }

    
}
