public class Main {
    public static void main (String[] args) {
        DispositivoMovel dp = new DispositivoMovel();
        System.out.println("Tipo de dispositivo #1: " + dp.getTipo());

        Telemovel tlm1 = new Telemovel();
        System.out.println("Tipo do tlm #1: " + tlm1.getTipo());

        Portatil port1 = new Portatil();
        System.out.println("Tipo do tlm #1: " + port1.getTipo());

        Tablet tab1 = new Tablet();
        System.out.println("Tipo do tlm #1: " + tab1.getTipo());

        port1.mostraInfo();
        tlm1.mostraInfo();
        tab1.mostraInfo();
    }
}