public class Estante {
    private String codigo;
    private String andar;

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo.toUpperCase(); // para colocar UpperCase, temos de colocar tanto no set, tanto no construtor
    }
    public String getAndar() {
        return andar;
    }
    public void setAndar(String andar) {
        this.andar = andar;
    }
    public Estante(String codigo, String andar) {
        //this.codigo = codigo.toUpperCase(); // para colocar UpperCase, temos de colocar tanto no set, tanto no construtor
        this.codigo = this.getCodigo(); // ou então podemos definir o construtor para buscar o valor que está no set, que já tem o UpperCase
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
