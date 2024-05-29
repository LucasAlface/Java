public class Carro extends Veiculo {
    // ATRIBUTOS
    private boolean classico; // sim ou nao
    private int numeroLugares; // 2, 3, 4...

    // GETTERS & SETTERS
    public boolean isClassico() {
        return classico;
    }
    public void setClassico(boolean classico) {
        this.classico = classico;
    }
    public int getNumeroLugares() {
        return numeroLugares;
    }
    public void setNumeroLugares(int numeroLugares) {
        this.numeroLugares = numeroLugares;
    }

    // CONSTRUTORES
    // construtor vazio
    public Carro() {
        this.classico = false;
        this.numeroLugares = 0;
    }
    // construtor que recebe parâmetros
    public Carro(boolean classico, int numeroLugares) {
        this.classico = classico;
        this.numeroLugares = numeroLugares;
    }

    // TO STRING
    @Override
    public String toString() {
        return "Carro [classico=" + classico + ", numeroLugares=" + numeroLugares + "]";
    }

    // MÉTODOS
    // método que devolve a informação tratada
    public String getInfoTurma() {
        String aux = "";

        aux += "E classcio?: " + this.isClassico(); 
        aux += "\n";
        aux += "Numero de lugares: " + this.getNumeroLugares(); 

        return aux;
    } 
}
