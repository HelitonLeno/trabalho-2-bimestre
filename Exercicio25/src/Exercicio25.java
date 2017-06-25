import java.util.Scanner;

public class Exercicio25 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Quantos numeros de Pell deseja gerar?: ");
        int numero = in.nextInt();

        imprimirSequenciaPell(numero, 0);
    }

    private static void imprimirSequenciaPell(int numero, int count) {
        if (numero > count) {
            System.out.printf("Pell %d -> %d \n", count,gerarNumeroDePell(count));

            imprimirSequenciaPell(numero, ++count);
        }
    }

    private static int gerarNumeroDePell(int numero) {
        if (numero == 0 || numero == 1)
            return numero;
        else
            return 2 * gerarNumeroDePell(numero - 1) + gerarNumeroDePell(numero - 2);

    }
}
