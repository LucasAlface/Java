import java.time.LocalDate;
import java.time.Period;
public class Veiculo {
    // ATRIBUTOS
    private String matricula; // 02-xx-24
    private LocalDate dataDaMatricula; // 22/02/2004
    private String marca; // Opel
    private String modelo; // Astra
    private int numeroRodas; // 4
    private double iuc; // 10.00€
    private String tipoDeVeiculo; // carro
    private String combustivel; // diesel
    private int kms; // 300000

     // GETTERS & SETTERS     
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public LocalDate getDataDaMatricula() {
        return dataDaMatricula;
    }
    public void setDataDaMatricula(LocalDate dataDaMatricula) {
        this.dataDaMatricula = dataDaMatricula;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getNumeroRodas() {
        return numeroRodas;
    }
    public void setNumeroRodas(int numeroRodas) {
        this.numeroRodas = numeroRodas;
    }
    public double getIuc() {
        return iuc;
    }
    public void setIuc(double iuc) {
        this.iuc = iuc;
    }
    public String getTipoDeVeiculo() {
        return tipoDeVeiculo;
    }
    public void setTipoDeVeiculo(String tipoDeVeiculo) {
        this.tipoDeVeiculo = tipoDeVeiculo;
    }
    public String getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    public int getKms() {
        return kms;
    }
    public void setKms(int kms) {
        this.kms = kms;
    }

    // CONSTRUTORES
    // construtor vazio
    public Veiculo() {
        this.matricula = "";
        this.dataDaMatricula = null;
        this.marca = "";
        this.modelo = "";
        this.numeroRodas = 0;
        this.iuc = 0.00;
        this.tipoDeVeiculo = "";
        this.combustivel = "";
        this.kms = 0;
    }
    // construtor que recebe parâmetros
    public Veiculo(String matricula, LocalDate dataDaMatricula, String marca, String modelo, int numeroRodas, double iuc,
            String tipoDeVeiculo, String combustivel, int kms) {
        this.matricula = matricula;
        this.dataDaMatricula = dataDaMatricula;
        this.marca = marca;
        this.modelo = modelo;
        this.numeroRodas = numeroRodas;
        this.iuc = iuc;
        this.tipoDeVeiculo = tipoDeVeiculo;
        this.combustivel = combustivel;
        this.kms = kms;
    }
    // TO STRING
    @Override
    public String toString() {
        return "Veiculo [matricula=" + matricula + ", dataDaMatricula=" + dataDaMatricula + ", marca=" + marca
                + ", modelo=" + modelo + ", numeroRodas=" + numeroRodas + ", iuc=" + iuc + ", tipoDeVeiculo="
                + tipoDeVeiculo + ", combustivel=" + combustivel + ", kms=" + kms + "]";
    }
    // METODOS
    // método que devolve a idade correta do veículo
    public int getIdadeVeiculo() {
        LocalDate dataAtual = LocalDate.now(); // pega data atual
        Period periodo = Period.between(dataDaMatricula, dataAtual); // verifica o periodo de tempo entre as 2 datas
        return periodo.getYears(); // pega nos anos retirados do periodo de tempo
    }
}