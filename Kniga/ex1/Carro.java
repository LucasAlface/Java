class Viatura {
    protected String bradn = "Ford";

    // método para buzinar
    public void buzinar() {
        System.out.println("BEEP, BEEP");
    }
}


public class Carro extends Viatura {
    // atributos da classe
    private String marca;
    private String modelo;
    private String matricula;
    private int ano;
    private double kms;   

    // MARCA
    public void setMarca(String marca) {
        this.marca = marca; // o obj.x fica com o valor do numero enviado
    }

    public String getMarca() {
        return this.marca ; // retorna valor do x
    }

    // MODELO
    public void setModelo(String modelo) {
        this.modelo = modelo; // o obj.x fica com o valor do numero enviado
    }

    public String getModelo() {
        return this.modelo ; // retorna valor do x
    }

    // MATRICULA
    public void setMatricula(String matricula) {
        this.matricula = matricula; // o obj.x fica com o valor do numero enviado
    }

    public String getMatricula() {
        return this.matricula ; // retorna valor do x
    }

    // ANO
    public void setAno(int ano) {
        this.ano = ano; // o obj.x fica com o valor do numero enviado
    }

    public int getAno() {
        return this.ano ; // retorna valor do x
    }

    // KILOMETROS
    public void setKms(double kms) {
        this.kms = kms; // o obj.x fica com o valor do numero enviado
    }

    public double getKms() {
        return this.kms ; // retorna valor do x
    }
    
    // MOSTRAR INFORMAÇÃO
    public void mostraInfo() {
        System.out.println("\n\nMarca do Carro: " + this.getMarca());
        System.out.println("Modelo do Carro: " + this.getModelo());
        System.out.println("Matricula do Carro: " + this.getMatricula());
        System.out.println("Ano do Carro: " + this.getAno());
        System.out.println("Kilometros do Carro: " + this.getKms());
    }

    // CONSTRUTOR
    public Carro(String marcaX, String modeloX, String matriculaX, int anoX, double kmsX) {
        this.marca = marcaX;
        this.modelo = modeloX;
        this.matricula = matriculaX;
        this.ano = anoX;
        this.kms = kmsX;
    }

    public static void main(String[] args) {

        /*Carro1.setMarca("Opel");
        
        Carro1.setModelo("Astra 16GTI");
        
        Carro1.setMatricula("01-OP-82");
        
        Carro1.setAno(2014);
        
        Carro1.setKms(76852);
*/
        
    }
}