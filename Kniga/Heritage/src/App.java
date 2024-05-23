import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {

        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy/MM/dd"); // altera o padrao para escrever a data
        // Datas de nascimento
        String dataStr = "2008/02/08";
        String dataStr2 = "1979/07/17";
        String dataStr7 = "1975/10/10";
        String dataStr3 = "1949/07/24";
        String dataStr4 = "1945/05/08";
        String dataStr5 = "1943/05/25";
        String dataStr6 = "1944/10/17";

        /* ASCENDÊNCIAS
         * Criamos Pessoas da família por ordem descendente, e nos atributos de pai e mae, metemos Pessoas (objetos) ascendetes deles, os avos não têm ascendência, por isso são nulos (recursividade)
         * O .parse permite que depois o utilizador possa inserir as datas
         */
        Pessoa avomPai = new Pessoa("António", "Vilarinho", LocalDate.parse(dataStr3, formato), null, null);
        Pessoa avofPai = new Pessoa("Fernanda", "Vilarinho", LocalDate.parse(dataStr6, formato), null, null);
        Pessoa avomMae = new Pessoa("Manel", "Soares", LocalDate.parse(dataStr5, formato), null, null);
        Pessoa avofMae = new Pessoa("Maria", "Soares", LocalDate.parse(dataStr4, formato), null, null);
        Pessoa pai = new Pessoa("Pedro", "Vilarinho", LocalDate.parse(dataStr7, formato), avomPai, avofPai);
        Pessoa mae = new Pessoa("Filipa", "Soares", LocalDate.parse(dataStr2, formato), avomMae, avofMae);
        Pessoa filho = new Pessoa("Lucas", "Soares", LocalDate.parse(dataStr, formato), pai, mae);

        System.out.println(filho.mostraDescencia(0)); // envia o valor mais baixo da descência, por isso vai escrever a descendencia toda
       
        
    }
}