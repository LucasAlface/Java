public class Main {

    public static void main (String[] args) {

        // ****** USAMOS A MESMA FUNÇÃO, MAS ORIENTADA A OBJETOS DIFERENTES ******
        
        Animal animal = new Animal(); // cria objeto da classe pai
        animal.animalSound(); // escreve o texto do objeto da classse pai

        Pig porco = new Pig(); // cria objeto na classe filho
        porco.animalSound(); // escreve o texto da classe filho

        Dog cao = new Dog(); // cria objeto na classe filho
        cao.animalSound(); // escreve o texto da classe filho

    }
}