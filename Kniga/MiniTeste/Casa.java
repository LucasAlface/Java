package MiniTeste;

public class Casa {
    private String tipoDeCasa;
    private int numAndares;
    private int numQuartos;
    private int numWCs;
    private double areaBruta;
    private double areaUtil; 
    
    // SET & GET Tipo de Casa
    public void setTipoDeCasa(String tipoDeCasa) {
        this.tipoDeCasa = tipoDeCasa; // o obj.x fica com o valor do numero enviado
    }

    public String getTipoDeCasa() {
        return this.tipoDeCasa ; // retorna valor do x
    }
    
    // SET & GET Numero Quartos
    public void setNumAndares(int numAndares) {
        this.numAndares = numAndares; // o obj.x fica com o valor do numero enviado
    }

    public int getNumAndares() {
        return this.numAndares ; // retorna valor do x
    }
    
    // SET & GET Numero Quartos
    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos; // o obj.x fica com o valor do numero enviado
    }

    public int getNumQuartos() {
        return this.numQuartos ; // retorna valor do x
    }
    
    // SET & GET Num WC´s
    public void setNumWCs(int numWCs) {
        this.numWCs = numWCs; // o obj.x fica com o valor do numero enviado
    }

    public int getNumWCs() {
        return this.numWCs ; // retorna valor do x
    }
    
    // SET & GET Area Bruta
    public void setAreaBruta(double areaBruta) {
        this.areaBruta = areaBruta; // o obj.x fica com o valor do numero enviado
    }

    public double getAreaBruta() {
        return this.areaBruta ; // retorna valor do x
    }
    
    // SET & GET Area Util
    public void setAreaUtil(double areaUtil) {
        this.areaUtil = areaUtil; // o obj.x fica com o valor do numero enviado
    }

    public double getAreaUtil() {
        return this.areaUtil ; // retorna valor do x
    }

    // MOSTRAR INFORMAÇÃO
    public void mostraInfo() {
        System.out.println("\n\nTipo de casa: " + this.getTipoDeCasa());
        System.out.println("Numero de andares: " + this.getNumAndares());
        System.out.println("Numero de quartos: " + this.getNumQuartos());
        System.out.println("Numero de WCs: " + this.getNumWCs());
        System.out.println("Area bruta da casa: " + this.getAreaBruta() + " metros quadrados");
        System.out.println("Area util da casa: " + this.getAreaUtil()+ " metros quadrados");
    }

    // CONSTRUTOR
    public Casa(String tipoDeCasaX, int numAndaresX, int numQuartosX, int numWCsX, double areaBrutaX, double areaUtilX) {
        this.tipoDeCasa = tipoDeCasaX;
        this.numAndares = numAndaresX;
        this.numQuartos = numQuartosX;
        this.numWCs = numWCsX;
        this.areaBruta = areaBrutaX;
        this.areaUtil = areaUtilX;
    }

    public static void main(String[] args) {
        
    }
    
}
