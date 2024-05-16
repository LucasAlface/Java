package MiniTeste;

public class Main {

    public static void main (String[] args) {

    Casa apartamento = new Casa("Apartamento", 4, 3, 2, 50.45, 36.50);
    Casa Vivenda = new Casa("Vivenda", 2, 5, 3, 20.70, 15.40);

    apartamento.mostraInfo();
    Vivenda.mostraInfo();
    }      
}
