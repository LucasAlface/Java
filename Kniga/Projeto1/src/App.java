// ESTE FICHEIRO É A MAIN E EXECUTA AS FUNÇÕES

import java.time.LocalDate; // importa função para por datas
import java.util.*; // importa funções úteis

public class App {
    public static void main(String[] args) throws Exception { 
        
        List<Artigo> livros = new ArrayList<Artigo>(); // criar listas
        //Autor autor = new Autor("Lucas", "Soares");

        // Pedir informação ao utilizador
        Scanner txtEntrada = new Scanner(System.in);
        /*System.out.print("Escreva o seu nome: ");
        String nome = txtEntrada.nextLine();
        System.out.print("Qual a sua idade?: ");
        int idade = txtEntrada.nextInt();
        System.out.println("O seu nome e: " + nome + ", e tem " + idade + " anos.");
        */

        int op = 1;
        while (op != 0) {
            System.out.println("Quer inserir livro ? (0 - Nao / 1 - Sim) Re ");
            op = txtEntrada.nextInt();
            txtEntrada.nextLine();
        

            if (op != 0) {
                System.out.println("Nome do Livro: ");
                String nomeLivro = txtEntrada.nextLine();

                System.out.println("Nome do Autor: ");
                String autorNome = txtEntrada.nextLine(); 

                System.out.println("Sobrenome do Autor: ");
                String autorSobrenome = txtEntrada.nextLine(); 

                System.out.println("Data do livro: ");
                String dataLivro = txtEntrada.nextLine(); 

                livros.add(new Artigo(nomeLivro, new Autor(autorNome, autorSobrenome), LocalDate.parse(dataLivro), new Categoria()));
            }
        }

        Categoria acao = new Categoria("acao", "Accao", null); // elemento do parâmetro "Categoria"
        System.out.println(acao);
        Categoria animacao = new Categoria("acao", "Accao", acao); // elemento do parâmetro "Categoria"
        System.out.println(animacao);

        Artigo livroX = new Artigo("Abc Def", new Autor("Lucas", "Soares"), LocalDate.of(2024, 05, 07), animacao); // cria elemento

        livros.add(livroX); // adicionar elemento existente a lista
        livros.add(new Artigo("Preto", new Autor("Ermelinda", "Ferreira"), LocalDate.of(2022, 05, 17), new Categoria())); // criar elemento para a lista

        System.out.println(livroX.getAutor()); // seleciona parâmetro de um objeto
        //System.out.println(livroX); // escreve o objeto
        //System.out.println(autor);

        // mostrar todos os elementos da lista
        for (Artigo artigo : livros) {
            System.out.println("\n");
            System.out.println(artigo);
        } 

        ArtigoWeb livroWeb1 = new ArtigoWeb("Hello Biden", new Autor("Vlodimir", "Zelensky"), LocalDate.of(2022, 02, 12), animacao); // elemento classe inferior
        System.out.println(livroWeb1);
        
    }
}