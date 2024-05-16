class Telemovel extends DispositivoMovel{
  
    String serialNumber = "UFHAU";

    public Telemovel() {
        this.tipo = "Telemovel";
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
