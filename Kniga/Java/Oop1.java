// java -cp . Main
public class Oop1 {

    // atributos da classe
    private int x = 5;
    int y = 10;

    // METODO ESTATICO
    static void metodoEstatico() {
        System.out.println("Metodo estatico");
    }

    // METODO PUBLICO
    public void metodoPublico() {
        System.out.println("Metodo publico");
    }

    public void setX(int numero) {
        this.x = numero; // o obj.x fica com o valor do numero enviado
    }

    public int getX() {
        return this.x ; // retorna valor do x
    }

    public Oop1() {
        this.x = 33;
    }
    public static void main(String[] args) {
        Oop1 myObj1 = new Oop1();
        Oop1 myObj2 = new Oop1(); 
       
        System.out.println(myObj1.getX()); // verficar o construtor

        myObj1.setX(13);
        myObj1.y=15;
        myObj2.y=35;

        myObj2.metodoPublico();
        metodoEstatico(); 
        System.out.println(myObj1.getX()); // verifica depois do set
    }
}