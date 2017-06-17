import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("posicao:   1  2  3  4  5  6   7   8   9   10   11   12   13   14   15   16    17");
        System.out.println("resultado: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, ...");
       
        System.out.println("\nQual posiçao deseja?: ");
        long posicao = in.nextInt();

        System.out.println( fibonnaci(posicao) );
    }

    private static int fibonnaci(long n) {
        if (n == 0 || n == 1) return 1;

        return fibonnaci(n - 1) + fibonnaci(n - 2);
    }
}
