// java -cp . Main
/*public class Main {
    public static void MainTeste(String[] args) {
        String name = "Luis";
        name = name.concat(" Santos"); // concatena Strings
        int pos = name.indexOf("San"); // caso encontre dado elemento na string, a variável inteira fica com o valor da posição em que se encontrou
        System.out.println(name); // print em java
        if (pos >= 0) { // verifica se encontrou dado elemento na string
            System.out.println("Encontrei na posicao " + pos);
        } else { // caso não encontre
            System.out.println("Nao encontrei nada" );
        }
        String[] alunos = {"Leonardo", "Rodrigo", "Vasco",}; // declaração de array
        for (String dados : alunos) { // for each
            System.out.println(dados);
        }
    }
} */

public class MainTeste {
    static int calculaNumerosBiDimensionais() {
        int[][] myNumbers = { {1, 2, 3, 4,}, {5, 6, 7,}};
        int somaTotal = 0;
        // SOMA
        for (int [] arrayNum : myNumbers) { // pega no valor do array
            for (int numero : arrayNum) { // usa o valor do array
                somaTotal += numero; // soma os valores
            }
    }
    return somaTotal; 
    }
    // FATORIAL
    public static int fatorial (int k) {
        if (k>1) {
            return (k * fatorial(k - 1));
        } else {
            return k;
        }
    }
    static void mostraSoma(int numero) { // recebe inteiro como parametro
        System.out.println("O resultado e: " + numero);  
    }
    static void mostraSoma(double numero) { // recebe double como parametro
        System.out.println("O resultado e: " + numero);  
    }
    
    public static void main(String[] args) {
        mostraSoma(calculaNumerosBiDimensionais());
        
        /*int[][] myNumbers = { {1, 2, 3, 4,}, {5, 6, 7,}};
        int myNumbers1 = 0, myNumbers2 = 0, total, somaTotal = 0;
        for (int numero : myNumbers[0]) {
            myNumbers1 += numero;
        }
        System.out.println(myNumbers1);

        for (int numero : myNumbers[1]) {
            myNumbers2 += numero;
        }
        System.out.println(myNumbers2);
        total = myNumbers1 + myNumbers2;
        System.out.println(total);*/
    }
}