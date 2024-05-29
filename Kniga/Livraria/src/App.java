public class App {
    public static void main(String[] args) throws Exception {
        Livraria oBogalho = new Livraria("O Bogalho", "", "", 221234567, "");
        //System.out.println(oBogalho);
        System.out.println("Nome da Livraria: " + oBogalho.getNome());

        Estante estante = new Estante("e 14 rt", "2");
        System.out.println(estante);

        Livro kniga = new Livro("Mein Kampf", "Adolf Hitler", 720);
        System.out.println(kniga.getInfoLivro());

        Leitores leitor1 = new Leitores("14581", "Lucas Soares", "Rebordoes", "914330404", "faca.e.porta@gmail.com", "");
        System.out.println(leitor1.getIniciais());
        
    }
}
