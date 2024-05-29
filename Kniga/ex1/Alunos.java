public class Alunos {
    int numAluno;
    String nomeAluno;

    private String tlfAluno;
    private String moradaAluno;

    //set
    public void setnomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno; // o obj.x fica com o valor do numero enviado
    }

    //get
    public String getnomeAluno() {
        return this.nomeAluno ; // retorna valor do x
    }

    public void settlfAluno(String tlfAluno) {
        this.tlfAluno = tlfAluno; // o obj.x fica com o valor do numero enviado
    }

    public String gettlfAluno() {
        return this.tlfAluno; // retorna valor do x
    }

    public void setmoradaAluno(String moradaAluno) {
        this.moradaAluno = moradaAluno; // o obj.x fica com o valor do numero enviado
    }

    public String getmoradaAluno() {
        return this.moradaAluno ; // retorna valor do x
    }

    public void setnumAluno(int numAluno) {
        this.numAluno = numAluno; // o obj.x fica com o valor do numero enviado
    }

    public int getnumAluno() {
        return this.numAluno ; // retorna valor do x
    }


    public void mostraInfo() {
        System.out.println("\n\nNome do Aluno: " + this.getnomeAluno());
        System.out.println("Telefone do Aluno: " + this.gettlfAluno());
        System.out.println("Morada do Aluno: " + this.getmoradaAluno());
        System.out.println("Numero do aluno: " + this.getnumAluno());
    }


    public Alunos(String nomeAlunoX, String tlfAlunoX, String moradaAlunoX, int numAlunoX) {
        this.nomeAluno = nomeAlunoX;
        this.tlfAluno = tlfAlunoX;
        this.moradaAluno = moradaAlunoX;
        this.numAluno = numAlunoX;
    }
    
}
