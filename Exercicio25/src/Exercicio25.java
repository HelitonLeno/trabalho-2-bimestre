import java.util.Scanner;

public class Exercicio25 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.println("Qual numero de Pell deseja?: ");
        int numero = in.nextInt();

        System.out.println(gerarNumeroDePell(numero));
    }

    static int gerarNumeroDePell(int numero) {
        if (numero == 0 || numero == 1)
            return numero;
        else
            return 2 * gerarNumeroDePell(numero - 1) + gerarNumeroDePell(numero -2);
    }
}
