public class App {
    public static void main(String[] args) throws Exception {
        // OBJETOS
        Professor prof1 = new Professor("15671", "Pedro", "Soares", 1983, "Programacao");
        Turma turma = new Turma("FX62514", "Programador de Informatica", 2023, 2026);
        Aluno aluno1 = new Aluno("14581", "Lucas", "Soares", 2008, turma);

        // CHAMAMENTO DAS FUNÇÕES
        System.out.println(prof1);
        System.out.println(turma);
        System.out.println(aluno1);
        System.out.println(turma.getInfoTurma());
        System.out.println(prof1.getNomeCompleto());
        System.out.println(aluno1.getNomeCompleto());
        System.out.println("Idade do aluno: " + aluno1.getIdade());

    }
}
