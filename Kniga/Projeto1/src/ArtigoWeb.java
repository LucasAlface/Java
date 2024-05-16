/*CLASSE FILHO. CLASSE PAI É ARTIGO
* CRIAMOS UMA CLASSE FILHO PARA ADICIONAR MAIS PARÂMETROS DENTRO DA CLASSE "Artigo"
*/ 

import java.time.LocalDate;

public class ArtigoWeb extends Artigo {
    private String tipoArtigo;

    // GETTERS & SETTERS
    public String getTipoArtigo() {
        return tipoArtigo;
    }

    public void setTipoArtigo(String tipoArtigo) {
        this.tipoArtigo = tipoArtigo;
    }

    public ArtigoWeb(String titulo, Autor autor, LocalDate dataPublicacao, Categoria categoria) {
        super(titulo, autor, dataPublicacao, categoria); // pega nos elementos da classe pai e coloca no filho
        this.tipoArtigo = "ArtigoWeb"; // predefinição do elemento "tipoArtigo"
    }

    @Override
    public String toString() {
        return "ArtigoWeb [tipoArtigo=" + tipoArtigo + ", toString()=" + super.toString() + "]";
    }

    
}
