/* CLASSE DE CATEGORIA, QUE É USADA COMO PARÂMETRO NA CLASSE ARTIGO.
* EM VEZ DE CRIARMOS PARÂMETROS DENTRO DA CLASSE PAI, CRIAMOS CLASSES FILHO, COM OS SEUS PARÂMETROS PRÓPRIOS E DEPOIS USAMOS COMO PARÂMETROS NA CLASSE PAI
*/ 

public class Categoria {
    // ATRIBUTOS
     private String slugNome;
     private String nomeCategoria;
     private Categoria categoriaPai;

    // GETTER E SETTERS
    public String getSlugNome() {
        return slugNome;
    }
    public void setSlugNome(String slugNome) {
        this.slugNome = slugNome;
    }
    public String getNomeCategoria() {
        return nomeCategoria;
    }
    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }
    public Categoria getCategoriaPai() {
        return categoriaPai;
    }
    public void setCategoriaPai(Categoria categoriaPai) {
        this.categoriaPai = categoriaPai;
    }

    // CONSTRUTORES

    // Construtor completo
    public Categoria(String slugNome, String nomeCategoria, Categoria categoriaPai) {
        this.slugNome = slugNome;
        this.nomeCategoria = nomeCategoria;
        this.categoriaPai = categoriaPai;
    }
    
    // Construtor vazio ** para permitir a criação de categorias vazias
    public Categoria() {
        this.slugNome = "";
        this.nomeCategoria = "";
        this.categoriaPai = null;
    }

    @Override
    public String toString() {
        return "Categoria [slugNome=" + slugNome + ", nomeCategoria=" + nomeCategoria + ", categoriaPai=" + categoriaPai
                + "]";
    }
}
