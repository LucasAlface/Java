public class Main {

    public static void main (String[] args) {

        if (args.length>0) {
            System.out.println("Recebi os segintes argumentos: ");
            for (String i: args) {
                System.out.println(i);
            }
        }


        Alunos Aluno1 = new Alunos("Lucas Saores", "914330404", "Rebordoes", 14581);
        Aluno1.mostraInfo();
        Carro Carro1 = new Carro("Opel", "Astra 16GTI", "01-OP-82", 2014, 76852); // cria objeto dentro da classe
        Carro1.mostraInfo();
        Carro1.buzinar();
    }
    
}
