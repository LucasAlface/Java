/* CLASSE DE AUTOR, QUE É USADA COMO PARÂMETRO NA CLASSE ARTIGO.
* EM VEZ DE CRIARMOS PARÂMETROS DENTRO DA CLASSE PAI, CRIAMOS CLASSES FILHO, COM OS SEUS PARÂMETROS PRÓPRIOS E DEPOIS USAMOS COMO PARÂMETROS NA CLASSE PAI
*/ 


public class Autor { 
    private String nome;
    private String sobreNome;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobreNome() {
        return sobreNome;
    }
    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
    
    public Autor(String nome, String sobreNome) {
        this.nome = nome;
        this.sobreNome = sobreNome;
    }


    @Override 
    public String toString() {
        return "O Nome do Autor é: " + nome + " " + sobreNome + "";
    }
}
