import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Quantos numeros triangulares deseja?: ");
        int qtd = in.nextInt();

        gerarNumerosTriangulares(qtd, 1, 2);
    }

    private static void gerarNumerosTriangulares(int qtd, int i, int soma) {
        System.out.println(i);

        if (qtd > 1) gerarNumerosTriangulares(--qtd, i += soma, ++soma);
    }
}