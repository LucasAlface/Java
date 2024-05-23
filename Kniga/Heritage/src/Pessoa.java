import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nomeProprio;
    private String sobreNome;
    private LocalDate dataNasciemento;
    private Pessoa pai; // atributo que se chama a si mesmo, fazendo recursividade
    private Pessoa mae; // atributo que se chama a si mesmo, fazendo recursividade

    
    public String getNomeProprio() {
        return nomeProprio;
    }
    public void setNomeProprio(String nomeProprio) {
        this.nomeProprio = nomeProprio;
    }
    public String getSobreNome() {
        return sobreNome;
    }
    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
    public LocalDate getDataNasciemento() {
        return dataNasciemento;
    }
    public void setDataNasciemento(LocalDate dataNasciemento) {
        this.dataNasciemento = dataNasciemento;
    }
    public Pessoa getPai() {
        return pai;
    }
    public void setPai(Pessoa pai) {
        this.pai = pai;
    }
    public Pessoa getMae() {
        return mae;
    }
    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    public Pessoa(String nomeProprio, String sobreNome, LocalDate dataNasciemento, Pessoa pai, Pessoa mae) {
        this.nomeProprio = nomeProprio;
        this.sobreNome = sobreNome;
        this.dataNasciemento = dataNasciemento;
        this.pai = pai;
        this.mae = mae;
    }
    public Pessoa() {
        this.nomeProprio = "";
        this.sobreNome = "";
        this.dataNasciemento = null;
        this.pai = null;
        this.mae = null;        
    }

    // O to_string está formatado para organizar a informação como desejado
    @Override
    public String toString() {
        String aux = "";
        aux += "Nome Proprio= " + nomeProprio + "\n" + "Sobre Nome= " + sobreNome + "\n" + "Data de Nasciemento= "
        + dataNasciemento + "\n";
        aux += "\n";
        aux += "Pai: " + "\n" + pai + "\n" + "Mae: " + "\n" + mae + "\n";
        return aux;
    }

    public int getIdade() { // método que calcula a idade exata
        LocalDate dataAtual = LocalDate.now(); // pega data atual
        Period periodo = Period.between(dataNasciemento, dataAtual); // verifica o periodo de tempo entre as 2 datas
        return periodo.getYears(); // pega nos anos retirados do periodo de tempo
    }

    public String mostraDescencia(int nivel) { // método que organiza por tabs a gerações através de níveis (o nivel por predifinição é 0), através de um ciclo e recursividade
        String aux = "\n";
        for (int i=0; i<nivel; i++) aux += "\t "; // a cada vez que aumenta o nível, aumenta o i, que faz adicionar um tab para criar a profundidade
        aux += nomeProprio + " (" + this.getIdade() + ")"; // insere o nome e a idade do elemento atual
        if (pai != null) {
            aux += pai.mostraDescencia(nivel +1); // se o elemento tiver pai (atributo) (elementos sem pai são o início da descendencia), vai chamar a própria função (recursividade) 1 nivel acima do que se encontra atualmente.
        }
        if (mae != null) {
            aux += mae.mostraDescencia(nivel +1); // faz o mesmo para a mãe
        }
        return aux;
    }
}