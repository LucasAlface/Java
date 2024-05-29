public class Mota extends Veiculo {
    private boolean pagaIUC; // sim ou não
    private String suporteMalas; // Malas laterais, top case, ...

    // GETTERS & SETTERS
    public boolean isPagaIUC() {
        return pagaIUC;
    }
    public void setPagaIUC(boolean pagaIUC) {
        this.pagaIUC = pagaIUC;
        if (pagaIUC == false) this.setIuc(0.00);
    }
    public String getSuporteMalas() {
        return suporteMalas;
    }
    public void setSuporteMalas(String suporteMalas) {
        this.suporteMalas = suporteMalas; 
    }

    // CONSTRUTORES
    // construtor vazio
    public Mota() {
        this.pagaIUC = false;
        this.suporteMalas = "";
    }
    // construtor que recebe parâmetros
    public Mota(boolean pagalUC, String suporteMalas) {
        this.pagaIUC = pagalUC;
        this.suporteMalas = suporteMalas; 
    }

    // TO STRING
    @Override
    public String toString() {
        return "Carro [classico=" + pagaIUC + ", numeroLugares=" + suporteMalas + "]";
    }

    // MÉTODOS
    // método que devolve a informação tratada
    public String getInfoTurma() {
        String aux = "";

        aux += "E classcio?: " + this.isPagaIUC(); 
        aux += "\n";
        aux += "Numero de lugares: " + suporteMalas.toUpperCase(); // devolve em CAPS LOCK

        return aux;
    } 
    
    
}
