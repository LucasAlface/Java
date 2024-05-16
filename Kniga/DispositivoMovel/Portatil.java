class Portatil extends DispositivoMovel{

    String serialNumber = "014e5";

    public Portatil() {
        this.tipo = "Portatil";
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
