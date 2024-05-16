class Tablet extends DispositivoMovel{

    String serialNumber = "G678-1";

    public Tablet() {
        this.tipo = "Tablet";
    }

    public void setSerialNumber() {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public void mostraInfo() {
        System.out.println("Telefone do Aluno: " + this.getSerialNumber());
    }
  
}
    

